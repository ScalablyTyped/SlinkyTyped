package typingsSlinky.formik.components

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.formik.typesMod.FormikActions
import typingsSlinky.formik.typesMod.FormikConfig
import typingsSlinky.formik.typesMod.FormikErrors
import typingsSlinky.formik.typesMod.FormikProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Formik {
  @JSImport("formik", "Formik")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[Values] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.formik.mod.Formik[js.Any]] {
    @scala.inline
    def componentReactElement(value: ReactElement): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def componentFunctionComponent(value: ReactComponentClass[FormikProps[Values]]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def componentComponentClass(value: ReactComponentClass[FormikProps[Values]]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def component(value: ReactComponentClass[FormikProps[Values]] | TagMod[Any]): this.type = set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def enableReinitialize(value: Boolean): this.type = set("enableReinitialize", value.asInstanceOf[js.Any])
    @scala.inline
    def initialStatus(value: js.Any): this.type = set("initialStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def isInitialValidFunction1(value: js.Object => Boolean): this.type = set("isInitialValid", js.Any.fromFunction1(value))
    @scala.inline
    def isInitialValid(value: Boolean | (js.Function1[js.Object, Boolean])): this.type = set("isInitialValid", value.asInstanceOf[js.Any])
    @scala.inline
    def onReset(value: (Values, /* formikActions */ FormikActions[Values]) => Unit): this.type = set("onReset", js.Any.fromFunction2(value))
    @scala.inline
    def render(value: /* props */ FormikProps[Values] => TagMod[Any]): this.type = set("render", js.Any.fromFunction1(value))
    @scala.inline
    def validate(value: Values => Unit | js.Object | js.Promise[FormikErrors[Values]]): this.type = set("validate", js.Any.fromFunction1(value))
    @scala.inline
    def validateOnBlur(value: Boolean): this.type = set("validateOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def validateOnChange(value: Boolean): this.type = set("validateOnChange", value.asInstanceOf[js.Any])
    @scala.inline
    def validationSchemaFunction0(value: () => _): this.type = set("validationSchema", js.Any.fromFunction0(value))
    @scala.inline
    def validationSchema(value: js.Any | js.Function0[_]): this.type = set("validationSchema", value.asInstanceOf[js.Any])
  }
  
  def withProps[Values](p: FormikConfig[Values]): Builder[Values] = new Builder[Values](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[Values](initialValues: Values, onSubmit: (Values, FormikActions[Values]) => Unit): Builder[Values] = {
    val __props = js.Dynamic.literal(initialValues = initialValues.asInstanceOf[js.Any], onSubmit = js.Any.fromFunction2(onSubmit))
    new Builder[Values](js.Array(this.component, __props.asInstanceOf[FormikConfig[Values]]))
  }
}

