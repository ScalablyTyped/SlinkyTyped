package typingsSlinky.emotionDashTheming.emotionDashThemingMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.emotionDashTheming.emotionDashThemingStrings.theme
import typingsSlinky.emotionDashTheming.typesHelperMod.AddOptionalTo
import typingsSlinky.emotionDashTheming.typesHelperMod.PropsOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmotionTheming[Theme] extends js.Object {
  def ThemeProvider(props: ThemeProviderProps[Theme]): ReactElement
  def withTheme[C /* <: ReactComponentClass[_] */](component: C): ReactComponentClass[AddOptionalTo[PropsOf[C], theme]]
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
}

