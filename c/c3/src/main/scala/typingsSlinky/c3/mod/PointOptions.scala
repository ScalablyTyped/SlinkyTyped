package typingsSlinky.c3.mod

import typingsSlinky.c3.anon.ExpandEnabled
import typingsSlinky.c3.anon.R
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointOptions extends StObject {
  
  var focus: js.UndefOr[ExpandEnabled] = js.native
  
  /**
    * The radius size of each point.
    * Defaults to `2.5`. If it's a function, will call for each point.
    */
  var r: js.UndefOr[Double | (js.ThisFunction1[/* this */ ChartInternal, /* d */ DataPoint, Double])] = js.native
  
  var select: js.UndefOr[R] = js.native
  
  /**
    * How sensitive is each point to mouse cursor hover.
    * Defaults to `10`.
    */
  var sensitivity: js.UndefOr[Double] = js.native
  
  /**
    * Whether to show each point in line.
    * Defaults to `true`.
    */
  var show: js.UndefOr[Boolean] = js.native
}
object PointOptions {
  
  @scala.inline
  def apply(): PointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointOptions]
  }
  
  @scala.inline
  implicit class PointOptionsMutableBuilder[Self <: PointOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFocus(value: ExpandEnabled): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setR(value: Double | (js.ThisFunction1[/* this */ ChartInternal, /* d */ DataPoint, Double])): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    @scala.inline
    def setSelect(value: R): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSensitivity(value: Double): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
