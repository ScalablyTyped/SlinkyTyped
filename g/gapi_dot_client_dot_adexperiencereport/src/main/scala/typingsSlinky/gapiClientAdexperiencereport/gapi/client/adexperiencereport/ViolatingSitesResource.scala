package typingsSlinky.gapiClientAdexperiencereport.gapi.client.adexperiencereport

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAdexperiencereport.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViolatingSitesResource extends js.Object {
  
  /** Lists sites with Ad Experience Report statuses of "Failing" or "Warning". */
  def list(request: Alt): Request[ViolatingSitesResponse] = js.native
}
object ViolatingSitesResource {
  
  @scala.inline
  def apply(list: Alt => Request[ViolatingSitesResponse]): ViolatingSitesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ViolatingSitesResource]
  }
  
  @scala.inline
  implicit class ViolatingSitesResourceOps[Self <: ViolatingSitesResource] (val x: Self) extends AnyVal {
    
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
    def setList(value: Alt => Request[ViolatingSitesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
