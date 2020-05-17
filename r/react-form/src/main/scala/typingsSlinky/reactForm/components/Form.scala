package typingsSlinky.reactForm.components

import org.scalajs.dom.raw.Event
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactForm.anon.FormApi
import typingsSlinky.reactForm.anon.FormPropschildrenpropsFor
import typingsSlinky.reactForm.mod.FormErrors
import typingsSlinky.reactForm.mod.FormState
import typingsSlinky.reactForm.mod.FormValues
import typingsSlinky.reactForm.mod.RenderReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Form {
  @JSImport("react-form", "Form")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactForm.mod.Form] {
    @scala.inline
    def componentFunctionComponent(value: ReactComponentClass[FormApi]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def componentComponentClass(value: ReactComponentClass[FormApi]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def component(value: ReactComponentClass[FormApi]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValues(value: FormValues): this.type = set("defaultValues", value.asInstanceOf[js.Any])
    @scala.inline
    def dontPreventDefault(value: Boolean): this.type = set("dontPreventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def dontValidateOnMount(value: Boolean): this.type = set("dontValidateOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def formDidUpdate(value: /* formState */ FormState => Unit): this.type = set("formDidUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def getApi(value: /* formApi */ typingsSlinky.reactForm.mod.FormApi => Unit): this.type = set("getApi", js.Any.fromFunction1(value))
    @scala.inline
    def onSubmit(
      value: (/* values */ FormValues, /* submissionEvent */ SyntheticEvent[Event, _], /* formApi */ typingsSlinky.reactForm.mod.FormApi) => Unit
    ): this.type = set("onSubmit", js.Any.fromFunction3(value))
    @scala.inline
    def onSubmitFailure(value: (/* errors */ FormErrors, /* formApi */ typingsSlinky.reactForm.mod.FormApi) => Unit): this.type = set("onSubmitFailure", js.Any.fromFunction2(value))
    @scala.inline
    def preSubmit(value: (/* values */ FormValues, /* formApi */ typingsSlinky.reactForm.mod.FormApi) => FormValues): this.type = set("preSubmit", js.Any.fromFunction2(value))
    @scala.inline
    def preValidate(value: /* values */ FormValues => FormValues): this.type = set("preValidate", js.Any.fromFunction1(value))
    @scala.inline
    def render(value: /* formApi */ typingsSlinky.reactForm.mod.FormApi => RenderReturn): this.type = set("render", js.Any.fromFunction1(value))
    @scala.inline
    def validateError(value: /* values */ FormValues => FormErrors): this.type = set("validateError", js.Any.fromFunction1(value))
    @scala.inline
    def validateOnSubmit(value: Boolean): this.type = set("validateOnSubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def validateSuccess(value: (/* values */ FormValues, /* errors */ FormErrors) => FormErrors): this.type = set("validateSuccess", js.Any.fromFunction2(value))
    @scala.inline
    def validateWarning(value: /* values */ FormValues => FormErrors): this.type = set("validateWarning", js.Any.fromFunction1(value))
  }
  
  def withProps(p: FormPropschildrenpropsFor): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Form.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

