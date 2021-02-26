package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.close
import typingsSlinky.devextreme.devextremeStrings.high
import typingsSlinky.devextreme.devextremeStrings.low
import typingsSlinky.devextreme.devextremeStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorLevel extends StObject {
  
  var color: js.UndefOr[String] = js.native
  
  var level: js.UndefOr[close | high | low | open] = js.native
}
object ColorLevel {
  
  @scala.inline
  def apply(): ColorLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorLevel]
  }
  
  @scala.inline
  implicit class ColorLevelMutableBuilder[Self <: ColorLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setLevel(value: close | high | low | open): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
