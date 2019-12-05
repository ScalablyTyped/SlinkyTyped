package typingsSlinky.reactDashHighlightDotJs.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashHighlightDotJs.reactDashHighlightDotJsMod.HighlightProps
import typingsSlinky.reactDashHighlightDotJs.reactDashHighlightDotJsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashHighlightDotJs
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-highlight.js", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(language: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = HighlightProps
}

