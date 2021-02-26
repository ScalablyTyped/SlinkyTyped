package typingsSlinky.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinearGaugeOptions extends StObject {
  
  var gaugeArea: js.UndefOr[LinearGaugeGaugeArea] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var pointer: js.UndefOr[js.Array[LinearGaugePointerItem]] = js.native
  
  var renderAs: js.UndefOr[String] = js.native
  
  var scale: js.UndefOr[LinearGaugeScale] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var transitions: js.UndefOr[Boolean] = js.native
}
object LinearGaugeOptions {
  
  @scala.inline
  def apply(): LinearGaugeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinearGaugeOptions]
  }
  
  @scala.inline
  implicit class LinearGaugeOptionsMutableBuilder[Self <: LinearGaugeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGaugeArea(value: LinearGaugeGaugeArea): Self = StObject.set(x, "gaugeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGaugeAreaUndefined: Self = StObject.set(x, "gaugeArea", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPointer(value: js.Array[LinearGaugePointerItem]): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerUndefined: Self = StObject.set(x, "pointer", js.undefined)
    
    @scala.inline
    def setPointerVarargs(value: LinearGaugePointerItem*): Self = StObject.set(x, "pointer", js.Array(value :_*))
    
    @scala.inline
    def setRenderAs(value: String): Self = StObject.set(x, "renderAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderAsUndefined: Self = StObject.set(x, "renderAs", js.undefined)
    
    @scala.inline
    def setScale(value: LinearGaugeScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    @scala.inline
    def setTransitions(value: Boolean): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
  }
}
