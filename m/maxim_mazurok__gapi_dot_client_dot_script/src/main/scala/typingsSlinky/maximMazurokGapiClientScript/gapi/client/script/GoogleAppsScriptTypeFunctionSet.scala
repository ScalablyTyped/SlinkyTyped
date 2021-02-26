package typingsSlinky.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsScriptTypeFunctionSet extends StObject {
  
  /** A list of functions composing the set. */
  var values: js.UndefOr[js.Array[GoogleAppsScriptTypeFunction]] = js.native
}
object GoogleAppsScriptTypeFunctionSet {
  
  @scala.inline
  def apply(): GoogleAppsScriptTypeFunctionSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsScriptTypeFunctionSet]
  }
  
  @scala.inline
  implicit class GoogleAppsScriptTypeFunctionSetMutableBuilder[Self <: GoogleAppsScriptTypeFunctionSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[GoogleAppsScriptTypeFunction]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: GoogleAppsScriptTypeFunction*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
