package typingsSlinky.reactOnsenui.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSource[T] extends StObject {
  
  var dataSource: js.UndefOr[js.Array[T]] = js.native
  
  var modifier: js.UndefOr[String] = js.native
  
  var renderFooter: js.UndefOr[js.Function0[js.UndefOr[ReactElement]]] = js.native
  
  var renderHeader: js.UndefOr[js.Function0[js.UndefOr[ReactElement]]] = js.native
  
  var renderRow: js.UndefOr[
    js.Function2[/* row */ T, /* index */ js.UndefOr[Double], js.UndefOr[ReactElement]]
  ] = js.native
}
object DataSource {
  
  @scala.inline
  def apply[T](): DataSource[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSource[T]]
  }
  
  @scala.inline
  implicit class DataSourceMutableBuilder[Self <: DataSource[_], T] (val x: Self with DataSource[T]) extends AnyVal {
    
    @scala.inline
    def setDataSource(value: js.Array[T]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: T*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    @scala.inline
    def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setRenderFooter(value: () => js.UndefOr[ReactElement]): Self = StObject.set(x, "renderFooter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
    
    @scala.inline
    def setRenderHeader(value: () => js.UndefOr[ReactElement]): Self = StObject.set(x, "renderHeader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
    
    @scala.inline
    def setRenderRow(value: (/* row */ T, /* index */ js.UndefOr[Double]) => js.UndefOr[ReactElement]): Self = StObject.set(x, "renderRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderRowUndefined: Self = StObject.set(x, "renderRow", js.undefined)
  }
}
