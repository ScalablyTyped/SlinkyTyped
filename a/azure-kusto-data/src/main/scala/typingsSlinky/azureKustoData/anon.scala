package typingsSlinky.azureKustoData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Mgmt extends StObject {
    
    var mgmt: String = js.native
    
    var query: String = js.native
  }
  object Mgmt {
    
    @scala.inline
    def apply(mgmt: String, query: String): Mgmt = {
      val __obj = js.Dynamic.literal(mgmt = mgmt.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mgmt]
    }
    
    @scala.inline
    implicit class MgmtMutableBuilder[Self <: Mgmt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMgmt(value: String): Self = StObject.set(x, "mgmt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
}
