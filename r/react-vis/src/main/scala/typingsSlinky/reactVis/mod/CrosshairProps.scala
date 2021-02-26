package typingsSlinky.reactVis.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactVis.anon.Box
import typingsSlinky.reactVis.anon.Title
import typingsSlinky.reactVis.reactVisStrings.left
import typingsSlinky.reactVis.reactVisStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrosshairProps extends StObject {
  
  var className: js.UndefOr[String] = js.native
  
  var innerHeight: js.UndefOr[Double] = js.native
  
  var innerWidth: js.UndefOr[Double] = js.native
  
  var itemsFormat: js.UndefOr[js.Function1[/* x */ js.Any, js.Array[Title]]] = js.native
  
  var marginLeft: js.UndefOr[Double] = js.native
  
  var marginTop: js.UndefOr[Double] = js.native
  
  var orientation: js.UndefOr[left | right] = js.native
  
  var series: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var style: js.UndefOr[Box] = js.native
  
  var titleFormat: js.UndefOr[js.Function1[/* x */ js.Any, Title]] = js.native
  
  var values: js.UndefOr[js.Array[_]] = js.native
}
object CrosshairProps {
  
  @scala.inline
  def apply(): CrosshairProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrosshairProps]
  }
  
  @scala.inline
  implicit class CrosshairPropsMutableBuilder[Self <: CrosshairProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setInnerHeight(value: Double): Self = StObject.set(x, "innerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerHeightUndefined: Self = StObject.set(x, "innerHeight", js.undefined)
    
    @scala.inline
    def setInnerWidth(value: Double): Self = StObject.set(x, "innerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerWidthUndefined: Self = StObject.set(x, "innerWidth", js.undefined)
    
    @scala.inline
    def setItemsFormat(value: /* x */ js.Any => js.Array[Title]): Self = StObject.set(x, "itemsFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemsFormatUndefined: Self = StObject.set(x, "itemsFormat", js.undefined)
    
    @scala.inline
    def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    @scala.inline
    def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    @scala.inline
    def setOrientation(value: left | right): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setSeries(value: StringDictionary[js.Any]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setStyle(value: Box): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTitleFormat(value: /* x */ js.Any => Title): Self = StObject.set(x, "titleFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitleFormatUndefined: Self = StObject.set(x, "titleFormat", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
