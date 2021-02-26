package typingsSlinky.jqueryui.JQueryUI

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Dialog //////////////////////////////////////////////////
@js.native
trait DialogOptions extends DialogEvents {
  
  var appendTo: js.UndefOr[String] = js.native
  
  var autoOpen: js.UndefOr[Boolean] = js.native
  
  var buttons: js.UndefOr[
    (StringDictionary[js.Function1[/* event */ js.UndefOr[Event], Unit]]) | js.Array[DialogButtonOptions]
  ] = js.native
  
  var classes: js.UndefOr[DialogClasses] = js.native
  
  var closeOnEscape: js.UndefOr[Boolean] = js.native
  
  var closeText: js.UndefOr[String] = js.native
  
  var dialogClass: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var draggable: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var hide: js.UndefOr[Boolean | Double | String | DialogShowHideOptions] = js.native
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var minHeight: js.UndefOr[Double] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var modal: js.UndefOr[Boolean] = js.native
  
  var position: js.UndefOr[js.Any] = js.native
  
  // object, string or []
  var resizable: js.UndefOr[Boolean] = js.native
  
  var show: js.UndefOr[Boolean | Double | String | DialogShowHideOptions] = js.native
  
  var stack: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[js.Any] = js.native
  
  // number or string
  var zIndex: js.UndefOr[Double] = js.native
}
object DialogOptions {
  
  @scala.inline
  def apply(): DialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogOptions]
  }
  
  @scala.inline
  implicit class DialogOptionsMutableBuilder[Self <: DialogOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendTo(value: String): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    @scala.inline
    def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
    
    @scala.inline
    def setButtons(
      value: (StringDictionary[js.Function1[/* event */ js.UndefOr[Event], Unit]]) | js.Array[DialogButtonOptions]
    ): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: DialogButtonOptions*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setClasses(value: DialogClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setCloseOnEscape(value: Boolean): Self = StObject.set(x, "closeOnEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnEscapeUndefined: Self = StObject.set(x, "closeOnEscape", js.undefined)
    
    @scala.inline
    def setCloseText(value: String): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
    
    @scala.inline
    def setDialogClass(value: String): Self = StObject.set(x, "dialogClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogClassUndefined: Self = StObject.set(x, "dialogClass", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHide(value: Boolean | Double | String | DialogShowHideOptions): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean | Double | String | DialogShowHideOptions): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setStack(value: Boolean): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWidth(value: js.Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
