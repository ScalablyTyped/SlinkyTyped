package typingsSlinky.emotionTheming.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.emotionTheming.emotionThemingStrings.theme
import typingsSlinky.emotionTheming.helperMod.AddOptionalTo
import typingsSlinky.emotionTheming.helperMod.PropsOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class EmotionThemingOps[Self <: EmotionTheming[_], Theme] (val x: Self with EmotionTheming[Theme]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setThemeProvider(value: ThemeProviderProps[Theme] => ReactElement): Self = this.set("ThemeProvider", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithTheme(value: js.Any => ReactComponentClass[AddOptionalTo[PropsOf[js.Any], theme]]): Self = this.set("withTheme", js.Any.fromFunction1(value))
  }
}
