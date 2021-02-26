package typingsSlinky.grommet.anon

import typingsSlinky.grommet.utilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorSideSize extends StObject {
  
  var color: js.UndefOr[ColorType] = js.native
  
  var side: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[String] = js.native
}
object ColorSideSize {
  
  @scala.inline
  def apply(): ColorSideSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorSideSize]
  }
  
  @scala.inline
  implicit class ColorSideSizeMutableBuilder[Self <: ColorSideSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setSide(value: String): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
