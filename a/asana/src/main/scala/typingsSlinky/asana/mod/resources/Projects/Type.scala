package typingsSlinky.asana.mod.resources.Projects

import typingsSlinky.asana.mod.resources.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends Resource {
  
  var archived: Boolean = js.native
  
  var color: String = js.native
  
  var created_at: String = js.native
  
  var current_status: Status = js.native
  
  var due_date: String = js.native
  
  var followers: js.Array[Resource] = js.native
  
  var members: js.Array[Resource] = js.native
  
  var modified_at: String = js.native
  
  var notes: String = js.native
  
  var public: Boolean = js.native
  
  var team: Resource = js.native
  
  var workspace: Resource = js.native
}
