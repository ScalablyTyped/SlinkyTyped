package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom plot`
import typingsSlinky.plotlyJs.plotlyJsStrings.`bottom to top`
import typingsSlinky.plotlyJs.plotlyJsStrings.`left plot`
import typingsSlinky.plotlyJs.plotlyJsStrings.`right plot`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top plot`
import typingsSlinky.plotlyJs.plotlyJsStrings.`top to bottom`
import typingsSlinky.plotlyJs.plotlyJsStrings.bottom
import typingsSlinky.plotlyJs.plotlyJsStrings.coupled
import typingsSlinky.plotlyJs.plotlyJsStrings.independent
import typingsSlinky.plotlyJs.plotlyJsStrings.left
import typingsSlinky.plotlyJs.plotlyJsStrings.right
import typingsSlinky.plotlyJs.plotlyJsStrings.top
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  rows :number,   roworder :'top to bottom' | 'bottom to top',   columns :number,   subplots :std.Array<string>,   xaxes :std.Array<string>,   yaxes :std.Array<string>,   pattern :'independent' | 'coupled',   xgap :number,   ygap :number,   domain :std.Partial<{  x :std.Array<number>,   y :std.Array<number>}>,   xside :'bottom' | 'bottom plot' | 'top plot' | 'top',   yside :'left' | 'left plot' | 'right plot' | 'right'}> */
@js.native
trait PartialrowsnumberroworderColumns extends StObject {
  
  var columns: js.UndefOr[Double] = js.native
  
  var domain: js.UndefOr[Partial[X]] = js.native
  
  var pattern: js.UndefOr[independent | coupled] = js.native
  
  var roworder: js.UndefOr[(`top to bottom`) | (`bottom to top`)] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  var subplots: js.UndefOr[js.Array[String]] = js.native
  
  var xaxes: js.UndefOr[js.Array[String]] = js.native
  
  var xgap: js.UndefOr[Double] = js.native
  
  var xside: js.UndefOr[bottom | (`bottom plot`) | (`top plot`) | top] = js.native
  
  var yaxes: js.UndefOr[js.Array[String]] = js.native
  
  var ygap: js.UndefOr[Double] = js.native
  
  var yside: js.UndefOr[left | (`left plot`) | (`right plot`) | right] = js.native
}
object PartialrowsnumberroworderColumns {
  
  @scala.inline
  def apply(): PartialrowsnumberroworderColumns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialrowsnumberroworderColumns]
  }
  
  @scala.inline
  implicit class PartialrowsnumberroworderColumnsMutableBuilder[Self <: PartialrowsnumberroworderColumns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setDomain(value: Partial[X]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setPattern(value: independent | coupled): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    @scala.inline
    def setRoworder(value: (`top to bottom`) | (`bottom to top`)): Self = StObject.set(x, "roworder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoworderUndefined: Self = StObject.set(x, "roworder", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setSubplots(value: js.Array[String]): Self = StObject.set(x, "subplots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubplotsUndefined: Self = StObject.set(x, "subplots", js.undefined)
    
    @scala.inline
    def setSubplotsVarargs(value: String*): Self = StObject.set(x, "subplots", js.Array(value :_*))
    
    @scala.inline
    def setXaxes(value: js.Array[String]): Self = StObject.set(x, "xaxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXaxesUndefined: Self = StObject.set(x, "xaxes", js.undefined)
    
    @scala.inline
    def setXaxesVarargs(value: String*): Self = StObject.set(x, "xaxes", js.Array(value :_*))
    
    @scala.inline
    def setXgap(value: Double): Self = StObject.set(x, "xgap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXgapUndefined: Self = StObject.set(x, "xgap", js.undefined)
    
    @scala.inline
    def setXside(value: bottom | (`bottom plot`) | (`top plot`) | top): Self = StObject.set(x, "xside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXsideUndefined: Self = StObject.set(x, "xside", js.undefined)
    
    @scala.inline
    def setYaxes(value: js.Array[String]): Self = StObject.set(x, "yaxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYaxesUndefined: Self = StObject.set(x, "yaxes", js.undefined)
    
    @scala.inline
    def setYaxesVarargs(value: String*): Self = StObject.set(x, "yaxes", js.Array(value :_*))
    
    @scala.inline
    def setYgap(value: Double): Self = StObject.set(x, "ygap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYgapUndefined: Self = StObject.set(x, "ygap", js.undefined)
    
    @scala.inline
    def setYside(value: left | (`left plot`) | (`right plot`) | right): Self = StObject.set(x, "yside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYsideUndefined: Self = StObject.set(x, "yside", js.undefined)
  }
}
