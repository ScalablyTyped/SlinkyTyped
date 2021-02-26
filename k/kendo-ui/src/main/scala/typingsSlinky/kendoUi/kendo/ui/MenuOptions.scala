package typingsSlinky.kendoUi.kendo.ui

import typingsSlinky.kendoUi.kendo.data.HierarchicalDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuOptions extends StObject {
  
  var activate: js.UndefOr[js.Function1[/* e */ MenuActivateEvent, Unit]] = js.native
  
  var animation: js.UndefOr[Boolean | MenuAnimation] = js.native
  
  var close: js.UndefOr[js.Function1[/* e */ MenuCloseEvent, Unit]] = js.native
  
  var closeOnClick: js.UndefOr[Boolean] = js.native
  
  var dataContentField: js.UndefOr[String] = js.native
  
  var dataImageUrlField: js.UndefOr[String] = js.native
  
  var dataSource: js.UndefOr[js.Any | HierarchicalDataSource] = js.native
  
  var dataSpriteCssClassField: js.UndefOr[String] = js.native
  
  var dataTextField: js.UndefOr[String] = js.native
  
  var dataUrlField: js.UndefOr[String] = js.native
  
  var deactivate: js.UndefOr[js.Function1[/* e */ MenuDeactivateEvent, Unit]] = js.native
  
  var direction: js.UndefOr[String] = js.native
  
  var hoverDelay: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var open: js.UndefOr[js.Function1[/* e */ MenuOpenEvent, Unit]] = js.native
  
  var openOnClick: js.UndefOr[Boolean | MenuOpenOnClick] = js.native
  
  var orientation: js.UndefOr[String] = js.native
  
  var popupCollision: js.UndefOr[String] = js.native
  
  var scrollable: js.UndefOr[Boolean | MenuScrollable] = js.native
  
  var select: js.UndefOr[js.Function1[/* e */ MenuSelectEvent, Unit]] = js.native
}
object MenuOptions {
  
  @scala.inline
  def apply(): MenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuOptions]
  }
  
  @scala.inline
  implicit class MenuOptionsMutableBuilder[Self <: MenuOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivate(value: /* e */ MenuActivateEvent => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean | MenuAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ MenuCloseEvent => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setDataContentField(value: String): Self = StObject.set(x, "dataContentField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataContentFieldUndefined: Self = StObject.set(x, "dataContentField", js.undefined)
    
    @scala.inline
    def setDataImageUrlField(value: String): Self = StObject.set(x, "dataImageUrlField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataImageUrlFieldUndefined: Self = StObject.set(x, "dataImageUrlField", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any | HierarchicalDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSpriteCssClassField(value: String): Self = StObject.set(x, "dataSpriteCssClassField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSpriteCssClassFieldUndefined: Self = StObject.set(x, "dataSpriteCssClassField", js.undefined)
    
    @scala.inline
    def setDataTextField(value: String): Self = StObject.set(x, "dataTextField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTextFieldUndefined: Self = StObject.set(x, "dataTextField", js.undefined)
    
    @scala.inline
    def setDataUrlField(value: String): Self = StObject.set(x, "dataUrlField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUrlFieldUndefined: Self = StObject.set(x, "dataUrlField", js.undefined)
    
    @scala.inline
    def setDeactivate(value: /* e */ MenuDeactivateEvent => Unit): Self = StObject.set(x, "deactivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeactivateUndefined: Self = StObject.set(x, "deactivate", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setHoverDelay(value: Double): Self = StObject.set(x, "hoverDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverDelayUndefined: Self = StObject.set(x, "hoverDelay", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ MenuOpenEvent => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpenOnClick(value: Boolean | MenuOpenOnClick): Self = StObject.set(x, "openOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenOnClickUndefined: Self = StObject.set(x, "openOnClick", js.undefined)
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPopupCollision(value: String): Self = StObject.set(x, "popupCollision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupCollisionUndefined: Self = StObject.set(x, "popupCollision", js.undefined)
    
    @scala.inline
    def setScrollable(value: Boolean | MenuScrollable): Self = StObject.set(x, "scrollable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollableUndefined: Self = StObject.set(x, "scrollable", js.undefined)
    
    @scala.inline
    def setSelect(value: /* e */ MenuSelectEvent => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
