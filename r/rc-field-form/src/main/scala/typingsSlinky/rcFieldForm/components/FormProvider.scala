package typingsSlinky.rcFieldForm.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcFieldForm.formContextMod.FormChangeInfo
import typingsSlinky.rcFieldForm.formContextMod.FormFinishInfo
import typingsSlinky.rcFieldForm.formContextMod.FormProviderProps
import typingsSlinky.rcFieldForm.interfaceMod.ValidateMessages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FormProvider {
  @JSImport("rc-field-form/lib", "FormProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def onFormChange(value: (/* name */ String, /* info */ FormChangeInfo) => Unit): this.type = set("onFormChange", js.Any.fromFunction2(value))
    @scala.inline
    def onFormFinish(value: (/* name */ String, /* info */ FormFinishInfo) => Unit): this.type = set("onFormFinish", js.Any.fromFunction2(value))
    @scala.inline
    def validateMessages(value: ValidateMessages): this.type = set("validateMessages", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FormProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FormProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

