package typingsSlinky.reactFileReaderInput.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.SyntheticEvent
import slinky.web.html.`*`.tag
import typingsSlinky.reactFileReaderInput.mod.Format
import typingsSlinky.reactFileReaderInput.mod.Result
import typingsSlinky.reactFileReaderInput.mod.^
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactFileReaderInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-file-reader-input", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onChange: (SyntheticEvent[Event_, _], js.Array[Result]) => Unit,
    as: Format = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange))
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactFileReaderInput.mod.Props
}

