package typingsSlinky.reduxForm.formSectionMod

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormSectionProps[P] extends js.Object {
  var component: js.UndefOr[ReactComponentClass[P]] = js.native
  var name: String = js.native
}

object FormSectionProps {
  @scala.inline
  def apply[P](name: String): FormSectionProps[P] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSectionProps[P]]
  }
  @scala.inline
  implicit class FormSectionPropsOps[Self <: FormSectionProps[_], P] (val x: Self with FormSectionProps[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentFunctionComponent(value: ReactComponentClass[P]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponentComponentClass(value: ReactComponentClass[P]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponent(value: ReactComponentClass[P]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
  }
  
}

