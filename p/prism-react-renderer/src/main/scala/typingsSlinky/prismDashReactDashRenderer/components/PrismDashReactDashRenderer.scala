package typingsSlinky.prismDashReactDashRenderer.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererMod.HighlightProps
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererMod.Language
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererMod.PrismLib
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererMod.PrismTheme
import typingsSlinky.prismDashReactDashRenderer.prismDashReactDashRendererMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PrismDashReactDashRenderer
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("prism-react-renderer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    Prism: PrismLib,
    code: String,
    language: Language,
    theme: PrismTheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(Prism = Prism.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = HighlightProps
}

