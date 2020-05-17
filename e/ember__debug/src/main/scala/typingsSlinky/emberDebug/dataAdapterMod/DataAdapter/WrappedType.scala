package typingsSlinky.emberDebug.dataAdapterMod.DataAdapter

import typingsSlinky.emberDebug.anon.Columns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedType extends js.Object {
  var `type`: Columns = js.native
  def release(): Unit = js.native
}

object WrappedType {
  @scala.inline
  def apply(release: () => Unit, `type`: Columns): WrappedType = {
    val __obj = js.Dynamic.literal(release = js.Any.fromFunction0(release))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedType]
  }
  @scala.inline
  implicit class WrappedTypeOps[Self <: WrappedType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelease(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: Columns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

