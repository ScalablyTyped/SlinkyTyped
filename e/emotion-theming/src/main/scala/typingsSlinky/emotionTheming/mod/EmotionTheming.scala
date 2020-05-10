package typingsSlinky.emotionTheming.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.emotionTheming.emotionThemingStrings.theme
import typingsSlinky.emotionTheming.helperMod.AddOptionalTo
import typingsSlinky.emotionTheming.helperMod.PropsOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmotionTheming[Theme] extends js.Object {
  def ThemeProvider(props: ThemeProviderProps[Theme]): ReactElement = js.native
  def withTheme[C /* <: ReactComponentClass[_] */](component: C): ReactComponentClass[AddOptionalTo[PropsOf[C], theme]] = js.native
}

object EmotionTheming {
  @scala.inline
  def apply[Theme](
    ThemeProvider: ThemeProviderProps[Theme] => ReactElement,
    withTheme: js.Any => ReactComponentClass[AddOptionalTo[PropsOf[js.Any], theme]]
  ): EmotionTheming[Theme] = {
    val __obj = js.Dynamic.literal(ThemeProvider = js.Any.fromFunction1(ThemeProvider), withTheme = js.Any.fromFunction1(withTheme))
    __obj.asInstanceOf[EmotionTheming[Theme]]
  }
  @scala.inline
  implicit class EmotionThemingOps[Self[theme] <: EmotionTheming[theme], Theme] (val x: Self[Theme]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Theme] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Theme]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Theme] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Theme] with Other]
    @scala.inline
    def withThemeProvider(value: ThemeProviderProps[Theme] => ReactElement): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThemeProvider")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithTheme(value: js.Any => ReactComponentClass[AddOptionalTo[PropsOf[js.Any], theme]]): Self[Theme] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withTheme")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

