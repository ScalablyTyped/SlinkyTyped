package typingsSlinky.ariClient.anon

import typingsSlinky.ariClient.mod.Containers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Body extends StObject {
  
  var body: js.UndefOr[String] = js.native
  
  var from: String = js.native
  
  var to: String = js.native
  
  var variables: js.UndefOr[Containers] = js.native
}
object Body {
  
  @scala.inline
  def apply(from: String, to: String): Body = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: Containers): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
  }
}
