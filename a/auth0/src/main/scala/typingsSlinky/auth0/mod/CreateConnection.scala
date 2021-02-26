package typingsSlinky.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConnection extends UpdateConnection {
  
  /**
    * The name of the connection. Must start and end with an
    * alphanumeric character and can only contain alphanumeric
    * characters and '-'. Max length 128.
    */
  var name: String = js.native
  
  /**
    * The identity provider identifier for the connection.
    */
  var strategy: Strategy = js.native
}
object CreateConnection {
  
  @scala.inline
  def apply(name: String, strategy: Strategy): CreateConnection = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnection]
  }
  
  @scala.inline
  implicit class CreateConnectionMutableBuilder[Self <: CreateConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
