package typingsSlinky.graphqlRequest.typesMod

import typingsSlinky.graphqlRequest.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLError extends js.Object {
  
  var locations: js.Array[Column] = js.native
  
  var message: String = js.native
  
  var path: js.Array[String] = js.native
}
object GraphQLError {
  
  @scala.inline
  def apply(locations: js.Array[Column], message: String, path: js.Array[String]): GraphQLError = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLError]
  }
  
  @scala.inline
  implicit class GraphQLErrorOps[Self <: GraphQLError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLocationsVarargs(value: Column*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[Column]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: String*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[String]): Self = this.set("path", value.asInstanceOf[js.Any])
  }
}
