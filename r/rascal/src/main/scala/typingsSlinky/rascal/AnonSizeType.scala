package typingsSlinky.rascal

import typingsSlinky.rascal.rascalStrings.inMemory
import typingsSlinky.rascal.rascalStrings.inMemoryCluster
import typingsSlinky.rascal.rascalStrings.stub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSizeType extends js.Object {
  var size: js.UndefOr[Double] = js.native
  var `type`: stub | inMemory | inMemoryCluster = js.native
}

object AnonSizeType {
  @scala.inline
  def apply(`type`: stub | inMemory | inMemoryCluster): AnonSizeType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSizeType]
  }
  @scala.inline
  implicit class AnonSizeTypeOps[Self <: AnonSizeType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: stub | inMemory | inMemoryCluster): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

