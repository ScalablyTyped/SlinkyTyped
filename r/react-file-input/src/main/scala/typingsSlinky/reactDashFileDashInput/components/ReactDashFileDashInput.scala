package typingsSlinky.reactDashFileDashInput.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashFileDashInput.reactDashFileDashInputMod.FileInputProps
import typingsSlinky.reactDashFileDashInput.reactDashFileDashInputMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashFileDashInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-file-input", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    accept: String,
    className: String,
    name: String,
    onChange: SyntheticEvent[Event, _] => Unit,
    placeholder: String,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), placeholder = placeholder.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FileInputProps
}

