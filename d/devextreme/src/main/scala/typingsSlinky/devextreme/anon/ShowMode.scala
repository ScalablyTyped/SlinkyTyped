package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.always
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.onHover
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.mod.DevExpress.ui.format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowMode extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.ui.format] = js.native
  
  var position: js.UndefOr[bottom | top] = js.native
  
  var showMode: js.UndefOr[always | onHover] = js.native
}
object ShowMode {
  
  @scala.inline
  def apply(): ShowMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowMode]
  }
  
  @scala.inline
  implicit class ShowModeMutableBuilder[Self <: ShowMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFormat(value: format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatFunction1(value: /* value */ Double | js.Date => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setPosition(value: bottom | top): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShowMode(value: always | onHover): Self = StObject.set(x, "showMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowModeUndefined: Self = StObject.set(x, "showMode", js.undefined)
  }
}
