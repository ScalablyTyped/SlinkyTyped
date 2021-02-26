package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.`left bottom`
import typingsSlinky.devextreme.devextremeStrings.`left top`
import typingsSlinky.devextreme.devextremeStrings.`right bottom`
import typingsSlinky.devextreme.devextremeStrings.`right top`
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.down
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.devextremeStrings.up
import typingsSlinky.devextreme.mod.DevExpress.positionConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseIcon extends StObject {
  
  var closeIcon: js.UndefOr[String] = js.native
  
  var direction: js.UndefOr[auto | up | down] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var maxSpeedDialActionCount: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[
    bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | positionConfig | js.Function
  ] = js.native
  
  var shading: js.UndefOr[Boolean] = js.native
}
object CloseIcon {
  
  @scala.inline
  def apply(): CloseIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseIcon]
  }
  
  @scala.inline
  implicit class CloseIconMutableBuilder[Self <: CloseIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseIcon(value: String): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
    
    @scala.inline
    def setDirection(value: auto | up | down): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMaxSpeedDialActionCount(value: Double): Self = StObject.set(x, "maxSpeedDialActionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSpeedDialActionCountUndefined: Self = StObject.set(x, "maxSpeedDialActionCount", js.undefined)
    
    @scala.inline
    def setPosition(
      value: bottom | center | left | (`left bottom`) | (`left top`) | right | (`right bottom`) | (`right top`) | top | positionConfig | js.Function
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShading(value: Boolean): Self = StObject.set(x, "shading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadingUndefined: Self = StObject.set(x, "shading", js.undefined)
  }
}
