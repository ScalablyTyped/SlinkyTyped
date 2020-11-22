package typingsSlinky.asana.mod.resources.Webhooks

import typingsSlinky.asana.mod.resources.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends Resource {
  
  var active: Boolean = js.native
  
  var created_at: String = js.native
  
  var filters: js.Array[Filter] = js.native
  
  var last_failure_at: String = js.native
  
  var last_failure_content: String = js.native
  
  var last_success_at: String = js.native
  
  var resource: Resource = js.native
  
  var target: String = js.native
}
