package typingsSlinky.grommet.themeContextMod

import slinky.core.ReactComponentClass
import typingsSlinky.grommet.anon.ValueThemeValue
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeContextI extends Context[ThemeValue] {
  var Extend: ReactComponentClass[ValueThemeValue]
}

object ThemeContextI {
  @scala.inline
  def apply(
    Consumer: ReactComponentClass[ConsumerProps[ThemeValue]],
    Extend: ReactComponentClass[ValueThemeValue],
    Provider: ReactComponentClass[ProviderProps[ThemeValue]],
    displayName: String = null
  ): ThemeContextI = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Extend = Extend.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeContextI]
  }
}

