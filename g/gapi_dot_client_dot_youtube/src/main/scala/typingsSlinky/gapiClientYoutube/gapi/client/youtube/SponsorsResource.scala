package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientYoutube.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SponsorsResource extends js.Object {
  
  /** Lists sponsors for a channel. */
  def list(request: Filter): Request[SponsorListResponse] = js.native
}
object SponsorsResource {
  
  @scala.inline
  def apply(list: Filter => Request[SponsorListResponse]): SponsorsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[SponsorsResource]
  }
  
  @scala.inline
  implicit class SponsorsResourceOps[Self <: SponsorsResource] (val x: Self) extends AnyVal {
    
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
    def setList(value: Filter => Request[SponsorListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
