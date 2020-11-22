package typingsSlinky.instagramPrivateApi.mod

import typingsSlinky.instagramPrivateApi.mediaEntityOembedResponseMod.MediaEntityOembedResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api", "MediaEntity")
@js.native
class MediaEntity ()
  extends typingsSlinky.instagramPrivateApi.entitiesMod.MediaEntity
/* static members */
@JSImport("instagram-private-api", "MediaEntity")
@js.native
object MediaEntity extends js.Object {
  
  def oembed(url: String): js.Promise[MediaEntityOembedResponse] = js.native
}
