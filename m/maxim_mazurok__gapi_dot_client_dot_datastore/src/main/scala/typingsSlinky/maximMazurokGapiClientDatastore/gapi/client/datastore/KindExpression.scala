package typingsSlinky.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KindExpression extends StObject {
  
  /** The name of the kind. */
  var name: js.UndefOr[String] = js.native
}
object KindExpression {
  
  @scala.inline
  def apply(): KindExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KindExpression]
  }
  
  @scala.inline
  implicit class KindExpressionMutableBuilder[Self <: KindExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
