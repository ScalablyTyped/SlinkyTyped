package typingsSlinky.grommet.themeContextMod

import slinky.core.ReactComponentClass
import typingsSlinky.grommet.AnonValueThemeValue
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeContextI extends Context[ThemeValue] {
  var Extend: ReactComponentClass[AnonValueThemeValue] = js.native
}

object ThemeContextI {
  @scala.inline
  def apply(
    Consumer: ReactComponentClass[ConsumerProps[ThemeValue]],
    Extend: ReactComponentClass[AnonValueThemeValue],
    Provider: ReactComponentClass[ProviderProps[ThemeValue]]
  ): ThemeContextI = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Extend = Extend.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeContextI]
  }
  @scala.inline
  implicit class ThemeContextIOps[Self <: ThemeContextI] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtend(value: ReactComponentClass[AnonValueThemeValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Extend")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

