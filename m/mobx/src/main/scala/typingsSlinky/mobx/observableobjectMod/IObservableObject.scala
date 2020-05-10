package typingsSlinky.mobx.observableobjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableObject extends js.Object {
  var `observable-object`: IObservableObject = js.native
}

object IObservableObject {
  @scala.inline
  def apply(`observable-object`: IObservableObject): IObservableObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("observable-object")(`observable-object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObservableObject]
  }
  @scala.inline
  implicit class IObservableObjectOps[Self <: IObservableObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withObservable-object`(value: IObservableObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observable-object")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

