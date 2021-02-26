package typingsSlinky.playable.anon

import typingsSlinky.playable.themeTypesMod.IThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait After extends StObject {
  
  @JSName("&:after")
  var AmpersandColonafter: BackgroundColor = js.native
  
  def backgroundColor(data: IThemeConfig): String = js.native
}
object After {
  
  @scala.inline
  def apply(AmpersandColonafter: BackgroundColor, backgroundColor: IThemeConfig => String): After = {
    val __obj = js.Dynamic.literal(backgroundColor = js.Any.fromFunction1(backgroundColor))
    __obj.updateDynamic("&:after")(AmpersandColonafter.asInstanceOf[js.Any])
    __obj.asInstanceOf[After]
  }
  
  @scala.inline
  implicit class AfterMutableBuilder[Self <: After] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmpersandColonafter(value: BackgroundColor): Self = StObject.set(x, "&:after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: IThemeConfig => String): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction1(value))
  }
}
