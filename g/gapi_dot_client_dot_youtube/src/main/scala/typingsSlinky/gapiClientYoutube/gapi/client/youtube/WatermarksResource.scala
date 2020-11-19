package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientYoutube.anon.ChannelIdFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatermarksResource extends js.Object {
  
  /** Uploads a watermark image to YouTube and sets it for a channel. */
  def set(request: ChannelIdFields): Request[Unit] = js.native
  
  /** Deletes a channel's watermark image. */
  def unset(request: ChannelIdFields): Request[Unit] = js.native
}
object WatermarksResource {
  
  @scala.inline
  def apply(set: ChannelIdFields => Request[Unit], unset: ChannelIdFields => Request[Unit]): WatermarksResource = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set), unset = js.Any.fromFunction1(unset))
    __obj.asInstanceOf[WatermarksResource]
  }
  
  @scala.inline
  implicit class WatermarksResourceOps[Self <: WatermarksResource] (val x: Self) extends AnyVal {
    
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
    def setSet(value: ChannelIdFields => Request[Unit]): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnset(value: ChannelIdFields => Request[Unit]): Self = this.set("unset", js.Any.fromFunction1(value))
  }
}
