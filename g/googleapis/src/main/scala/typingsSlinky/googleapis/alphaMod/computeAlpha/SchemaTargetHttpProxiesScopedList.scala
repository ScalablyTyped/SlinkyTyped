package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTargetHttpProxiesScopedList extends StObject {
  
  /**
    * A list of TargetHttpProxies contained in this scope.
    */
  var targetHttpProxies: js.UndefOr[js.Array[SchemaTargetHttpProxy]] = js.native
  
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}
object SchemaTargetHttpProxiesScopedList {
  
  @scala.inline
  def apply(): SchemaTargetHttpProxiesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetHttpProxiesScopedList]
  }
  
  @scala.inline
  implicit class SchemaTargetHttpProxiesScopedListMutableBuilder[Self <: SchemaTargetHttpProxiesScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetHttpProxies(value: js.Array[SchemaTargetHttpProxy]): Self = StObject.set(x, "targetHttpProxies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetHttpProxiesUndefined: Self = StObject.set(x, "targetHttpProxies", js.undefined)
    
    @scala.inline
    def setTargetHttpProxiesVarargs(value: SchemaTargetHttpProxy*): Self = StObject.set(x, "targetHttpProxies", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
