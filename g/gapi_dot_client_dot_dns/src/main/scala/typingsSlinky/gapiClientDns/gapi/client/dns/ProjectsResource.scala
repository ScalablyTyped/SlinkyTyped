package typingsSlinky.gapiClientDns.gapi.client.dns

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDns.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends js.Object {
  
  /** Fetch the representation of an existing Project. */
  def get(request: Key): Request[Project] = js.native
}
object ProjectsResource {
  
  @scala.inline
  def apply(get: Key => Request[Project]): ProjectsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit class ProjectsResourceOps[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
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
    def setGet(value: Key => Request[Project]): Self = this.set("get", js.Any.fromFunction1(value))
  }
}
