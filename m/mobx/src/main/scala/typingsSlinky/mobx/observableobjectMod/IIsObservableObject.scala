package typingsSlinky.mobx.observableobjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIsObservableObject extends js.Object {
  @JSName("$mobx")
  var $mobx: ObservableObjectAdministration = js.native
}

object IIsObservableObject {
  @scala.inline
  def apply($mobx: ObservableObjectAdministration): IIsObservableObject = {
    val __obj = js.Dynamic.literal($mobx = $mobx.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIsObservableObject]
  }
  @scala.inline
  implicit class IIsObservableObjectOps[Self <: IIsObservableObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$mobx(value: ObservableObjectAdministration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$mobx")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

