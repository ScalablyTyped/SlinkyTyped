package typingsSlinky.reactDashScrollbarDashSize.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashScrollbarDashSize.reactDashScrollbarDashSizeMod.ScrollbarSizeProps
import typingsSlinky.reactDashScrollbarDashSize.reactDashScrollbarDashSizeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashScrollbarDashSize
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-scrollbar-size", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onChange, onLoad */
  def apply(_overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ScrollbarSizeProps
}

