package typingsSlinky.reduxDashForm.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reduxDashForm.libFormMod.FormProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reduxDashForm), Name(libFormMod), Name(FormProps))) was not a @ScalaJSDefined trait */
object Form
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reduxDashForm.libFormMod.Form[js.Any, js.Any, js.Any]] {
  @JSImport("redux-form/lib/Form", "Form")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = FormProps[js.Any, js.Any, js.Any]
}

