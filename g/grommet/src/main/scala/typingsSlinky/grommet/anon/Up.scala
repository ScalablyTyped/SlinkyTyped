package typingsSlinky.grommet.anon

import slinky.core.facade.ReactElement
import typingsSlinky.grommet.utilsMod.ColorType
import typingsSlinky.grommet.utilsMod.MarginType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Up extends StObject {
  
  var color: js.UndefOr[ColorType] = js.native
  
  var down: js.UndefOr[ReactElement] = js.native
  
  var margin: js.UndefOr[MarginType] = js.native
  
  var up: js.UndefOr[ReactElement] = js.native
}
object Up {
  
  @scala.inline
  def apply(): Up = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Up]
  }
  
  @scala.inline
  implicit class UpMutableBuilder[Self <: Up] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDown(value: ReactElement): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownReactElement(value: ReactElement): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    @scala.inline
    def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setUp(value: ReactElement): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpReactElement(value: ReactElement): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
  }
}
