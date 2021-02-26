package typingsSlinky.devtoolsProtocol.mod.Protocol.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeObject extends StObject {
  
  /**
    * Name of a type collected with type profiling.
    */
  var name: String = js.native
}
object TypeObject {
  
  @scala.inline
  def apply(name: String): TypeObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeObject]
  }
  
  @scala.inline
  implicit class TypeObjectMutableBuilder[Self <: TypeObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
