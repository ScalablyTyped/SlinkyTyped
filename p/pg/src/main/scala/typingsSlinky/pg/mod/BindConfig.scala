package typingsSlinky.pg.mod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindConfig extends StObject {
  
  var binary: js.UndefOr[String] = js.native
  
  var portal: js.UndefOr[String] = js.native
  
  var statement: js.UndefOr[String] = js.native
  
  var values: js.UndefOr[js.Array[js.UndefOr[Buffer | Null | String]]] = js.native
}
object BindConfig {
  
  @scala.inline
  def apply(): BindConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindConfig]
  }
  
  @scala.inline
  implicit class BindConfigMutableBuilder[Self <: BindConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinary(value: String): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    @scala.inline
    def setPortal(value: String): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    
    @scala.inline
    def setStatement(value: String): Self = StObject.set(x, "statement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementUndefined: Self = StObject.set(x, "statement", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[js.UndefOr[Buffer | Null | String]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: (js.UndefOr[Buffer | Null | String])*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
