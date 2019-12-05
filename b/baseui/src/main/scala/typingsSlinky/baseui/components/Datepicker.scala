package typingsSlinky.baseui.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.datepickerMod.DatepickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(baseui), Name(datepickerMod), Name(DatepickerProps))) was not a @ScalaJSDefined trait */
object Datepicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.datepickerMod.Datepicker] {
  @JSImport("baseui/datepicker", "Datepicker")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = DatepickerProps
}

