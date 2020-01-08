package typingsSlinky.fundamentalDashReact.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.fundamentalDashReact.libDatePickerDatePickerMod.DatePickerProps
import typingsSlinky.fundamentalDashReact.libDatePickerDatePickerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(fundamentalDashReact), Name(libDatePickerDatePickerMod), Name(DatePickerProps))) was not a @ScalaJSDefined trait */
object DatePicker
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("fundamental-react/lib/DatePicker/DatePicker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = DatePickerProps
}

