package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyExpr extends StObject {
  
  var dataSource: js.UndefOr[
    js.Array[_] | typingsSlinky.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions
  ] = js.native
  
  var keyExpr: js.UndefOr[String | js.Function] = js.native
  
  var predecessorIdExpr: js.UndefOr[String | js.Function] = js.native
  
  var successorIdExpr: js.UndefOr[String | js.Function] = js.native
  
  var typeExpr: js.UndefOr[String | js.Function] = js.native
}
object KeyExpr {
  
  @scala.inline
  def apply(): KeyExpr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyExpr]
  }
  
  @scala.inline
  implicit class KeyExprMutableBuilder[Self <: KeyExpr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSource(value: js.Array[_] | typingsSlinky.devextreme.mod.DevExpress.data.DataSource | DataSourceOptions): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    @scala.inline
    def setKeyExpr(value: String | js.Function): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    @scala.inline
    def setPredecessorIdExpr(value: String | js.Function): Self = StObject.set(x, "predecessorIdExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredecessorIdExprUndefined: Self = StObject.set(x, "predecessorIdExpr", js.undefined)
    
    @scala.inline
    def setSuccessorIdExpr(value: String | js.Function): Self = StObject.set(x, "successorIdExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessorIdExprUndefined: Self = StObject.set(x, "successorIdExpr", js.undefined)
    
    @scala.inline
    def setTypeExpr(value: String | js.Function): Self = StObject.set(x, "typeExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeExprUndefined: Self = StObject.set(x, "typeExpr", js.undefined)
  }
}
