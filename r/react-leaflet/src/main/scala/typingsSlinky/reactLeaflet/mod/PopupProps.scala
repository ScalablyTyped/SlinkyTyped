package typingsSlinky.reactLeaflet.mod

import typingsSlinky.leaflet.mod.LatLngExpression
import typingsSlinky.leaflet.mod.PointExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.leaflet.mod.DivOverlayOptions because Already inherited
- typingsSlinky.leaflet.mod.PopupOptions because var conflicts: className, offset, pane, zoomAnimation. Inlined closeButton, keepInView, closeOnClick, maxWidth, autoPanPadding, closeOnEscapeKey, autoClose, minWidth, autoPanPaddingTopLeft, autoPanPaddingBottomRight, maxHeight, autoPan */ @js.native
trait PopupProps extends DivOverlayProps {
  
  var autoClose: js.UndefOr[Boolean] = js.native
  
  var autoPan: js.UndefOr[Boolean] = js.native
  
  var autoPanPadding: js.UndefOr[PointExpression] = js.native
  
  var autoPanPaddingBottomRight: js.UndefOr[PointExpression] = js.native
  
  var autoPanPaddingTopLeft: js.UndefOr[PointExpression] = js.native
  
  var closeButton: js.UndefOr[Boolean] = js.native
  
  var closeOnClick: js.UndefOr[Boolean] = js.native
  
  var closeOnEscapeKey: js.UndefOr[Boolean] = js.native
  
  var keepInView: js.UndefOr[Boolean] = js.native
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[LatLngExpression] = js.native
}
object PopupProps {
  
  @scala.inline
  def apply(): PopupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupProps]
  }
  
  @scala.inline
  implicit class PopupPropsMutableBuilder[Self <: PopupProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    @scala.inline
    def setAutoPan(value: Boolean): Self = StObject.set(x, "autoPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPanPadding(value: PointExpression): Self = StObject.set(x, "autoPanPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPanPaddingBottomRight(value: PointExpression): Self = StObject.set(x, "autoPanPaddingBottomRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPanPaddingBottomRightUndefined: Self = StObject.set(x, "autoPanPaddingBottomRight", js.undefined)
    
    @scala.inline
    def setAutoPanPaddingTopLeft(value: PointExpression): Self = StObject.set(x, "autoPanPaddingTopLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPanPaddingTopLeftUndefined: Self = StObject.set(x, "autoPanPaddingTopLeft", js.undefined)
    
    @scala.inline
    def setAutoPanPaddingUndefined: Self = StObject.set(x, "autoPanPadding", js.undefined)
    
    @scala.inline
    def setAutoPanUndefined: Self = StObject.set(x, "autoPan", js.undefined)
    
    @scala.inline
    def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    @scala.inline
    def setCloseOnEscapeKey(value: Boolean): Self = StObject.set(x, "closeOnEscapeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnEscapeKeyUndefined: Self = StObject.set(x, "closeOnEscapeKey", js.undefined)
    
    @scala.inline
    def setKeepInView(value: Boolean): Self = StObject.set(x, "keepInView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepInViewUndefined: Self = StObject.set(x, "keepInView", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setPosition(value: LatLngExpression): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
