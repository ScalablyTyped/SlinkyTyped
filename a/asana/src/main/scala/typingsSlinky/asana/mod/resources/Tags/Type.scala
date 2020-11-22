package typingsSlinky.asana.mod.resources.Tags

import typingsSlinky.asana.mod.resources.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends Resource {
  
  var color: String = js.native
  
  var created_at: String = js.native
  
  var followers: js.Array[Resource] = js.native
  
  var notes: String = js.native
  
  var workspace: Resource = js.native
}
