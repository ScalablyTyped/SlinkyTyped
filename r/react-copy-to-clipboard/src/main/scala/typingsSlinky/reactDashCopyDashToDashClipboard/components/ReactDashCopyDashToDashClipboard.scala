package typingsSlinky.reactDashCopyDashToDashClipboard.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashCopyDashToDashClipboard.reactDashCopyDashToDashClipboardMod.Options
import typingsSlinky.reactDashCopyDashToDashClipboard.reactDashCopyDashToDashClipboardMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashCopyDashToDashClipboard
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-copy-to-clipboard", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    text: String,
    onCopy: (/* text */ String, /* result */ Boolean) => Unit = null,
    options: Options = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction2(onCopy))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.reactDashCopyDashToDashClipboard.reactDashCopyDashToDashClipboardMod.Props
}

