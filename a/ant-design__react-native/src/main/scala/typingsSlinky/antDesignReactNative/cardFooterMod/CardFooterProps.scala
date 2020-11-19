package typingsSlinky.antDesignReactNative.cardFooterMod

import typingsSlinky.antDesignReactNative.anon.PickCardStylefooterConten
import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardFooterProps
  extends CardFooterPropsType
     with WithThemeStyles[PickCardStylefooterConten] {
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object CardFooterProps {
  
  @scala.inline
  def apply(): CardFooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardFooterProps]
  }
  
  @scala.inline
  implicit class CardFooterPropsOps[Self <: CardFooterProps] (val x: Self) extends AnyVal {
    
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
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
}
