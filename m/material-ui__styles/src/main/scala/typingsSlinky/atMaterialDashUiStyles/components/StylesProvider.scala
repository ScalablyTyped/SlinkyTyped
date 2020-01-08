package typingsSlinky.atMaterialDashUiStyles.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atMaterialDashUiStyles.stylesProviderMod.default
import typingsSlinky.atMaterialDashUiStyles.stylesProviderStylesProviderMod.StylesProviderProps
import typingsSlinky.jss.jssMod.Jss
import typingsSlinky.jss.jssMod.Rule
import typingsSlinky.jss.jssMod.StyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StylesProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@material-ui/styles/StylesProvider", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    disableGeneration: js.UndefOr[Boolean] = js.undefined,
    generateClassName: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String = null,
    injectFirst: js.UndefOr[Boolean] = js.undefined,
    jss: Jss = null,
    sheetsCache: js.Object = null,
    sheetsManager: js.Object = null,
    sheetsRegistry: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableGeneration)) __obj.updateDynamic("disableGeneration")(disableGeneration.asInstanceOf[js.Any])
    if (generateClassName != null) __obj.updateDynamic("generateClassName")(js.Any.fromFunction2(generateClassName))
    if (!js.isUndefined(injectFirst)) __obj.updateDynamic("injectFirst")(injectFirst.asInstanceOf[js.Any])
    if (jss != null) __obj.updateDynamic("jss")(jss.asInstanceOf[js.Any])
    if (sheetsCache != null) __obj.updateDynamic("sheetsCache")(sheetsCache.asInstanceOf[js.Any])
    if (sheetsManager != null) __obj.updateDynamic("sheetsManager")(sheetsManager.asInstanceOf[js.Any])
    if (sheetsRegistry != null) __obj.updateDynamic("sheetsRegistry")(sheetsRegistry.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atMaterialDashUiStyles.stylesProviderMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = StylesProviderProps
}

