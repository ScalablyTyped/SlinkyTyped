package typingsSlinky.materialUiStyles.stylesProviderStylesProviderMod

import slinky.core.TagMod
import typingsSlinky.jss.mod.Jss
import typingsSlinky.jss.mod.Rule
import typingsSlinky.jss.mod.StyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylesProviderProps extends StylesOptions {
  var children: TagMod[Any]
}

object StylesProviderProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    disableGeneration: js.UndefOr[Boolean] = js.undefined,
    generateClassName: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String = null,
    injectFirst: js.UndefOr[Boolean] = js.undefined,
    jss: Jss = null,
    sheetsCache: js.Object = null,
    sheetsManager: js.Object = null,
    sheetsRegistry: js.Object = null
  ): StylesProviderProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(disableGeneration)) __obj.updateDynamic("disableGeneration")(disableGeneration.asInstanceOf[js.Any])
    if (generateClassName != null) __obj.updateDynamic("generateClassName")(js.Any.fromFunction2(generateClassName))
    if (!js.isUndefined(injectFirst)) __obj.updateDynamic("injectFirst")(injectFirst.asInstanceOf[js.Any])
    if (jss != null) __obj.updateDynamic("jss")(jss.asInstanceOf[js.Any])
    if (sheetsCache != null) __obj.updateDynamic("sheetsCache")(sheetsCache.asInstanceOf[js.Any])
    if (sheetsManager != null) __obj.updateDynamic("sheetsManager")(sheetsManager.asInstanceOf[js.Any])
    if (sheetsRegistry != null) __obj.updateDynamic("sheetsRegistry")(sheetsRegistry.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylesProviderProps]
  }
}

