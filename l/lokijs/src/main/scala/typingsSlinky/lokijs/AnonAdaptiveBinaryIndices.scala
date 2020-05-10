package typingsSlinky.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdaptiveBinaryIndices extends js.Object {
  var adaptiveBinaryIndices: js.UndefOr[Boolean] = js.native
}

object AnonAdaptiveBinaryIndices {
  @scala.inline
  def apply(): AnonAdaptiveBinaryIndices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAdaptiveBinaryIndices]
  }
  @scala.inline
  implicit class AnonAdaptiveBinaryIndicesOps[Self <: AnonAdaptiveBinaryIndices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdaptiveBinaryIndices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveBinaryIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptiveBinaryIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptiveBinaryIndices")(js.undefined)
        ret
    }
  }
  
}

