package typingsSlinky.grommet.contextsThemeContextMod

import slinky.core.ReactComponentClass
import typingsSlinky.grommet.Anon_Value
import typingsSlinky.react.reactMod.ConsumerProps
import typingsSlinky.react.reactMod.Context
import typingsSlinky.react.reactMod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeContextI extends Context[ThemeValue] {
  var Extend: ReactComponentClass[Anon_Value]
}

object ThemeContextI {
  @scala.inline
  def apply(
    Consumer: ReactComponentClass[ConsumerProps[ThemeValue]],
    Extend: ReactComponentClass[Anon_Value],
    Provider: ReactComponentClass[ProviderProps[ThemeValue]],
    displayName: String = null
  ): ThemeContextI = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Extend = Extend.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeContextI]
  }
}

