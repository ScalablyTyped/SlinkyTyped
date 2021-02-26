package typingsSlinky.grommet.anon

import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.strong
import typingsSlinky.grommet.grommetStrings.weak
import typingsSlinky.grommet.utilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Opacity extends StObject {
  
  var color: js.UndefOr[ColorType] = js.native
  
  var opacity: js.UndefOr[weak | medium | strong | Boolean | Double] = js.native
}
object Opacity {
  
  @scala.inline
  def apply(): Opacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opacity]
  }
  
  @scala.inline
  implicit class OpacityMutableBuilder[Self <: Opacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOpacity(value: weak | medium | strong | Boolean | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
  }
}
