package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.anon.Broadcastid
import typingsSlinky.instagramPrivateApi.liveObsSettingsMod.LiveRtmpSettings
import typingsSlinky.instagramPrivateApi.mediaEntityOembedResponseMod.MediaEntityOembedResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/entities", JSImport.Namespace)
@js.native
object entitiesMod extends js.Object {
  
  @js.native
  class DirectThreadEntity ()
    extends typingsSlinky.instagramPrivateApi.directThreadEntityMod.DirectThreadEntity
  
  @js.native
  class LiveEntity ()
    extends typingsSlinky.instagramPrivateApi.liveEntityMod.LiveEntity
  /* static members */
  @js.native
  object LiveEntity extends js.Object {
    
    def getUrlAndKey(info: Broadcastid): LiveRtmpSettings = js.native
  }
  
  @js.native
  class MediaEntity ()
    extends typingsSlinky.instagramPrivateApi.mediaEntityMod.MediaEntity
  /* static members */
  @js.native
  object MediaEntity extends js.Object {
    
    def oembed(url: String): js.Promise[MediaEntityOembedResponse] = js.native
  }
  
  @js.native
  class ProfileEntity ()
    extends typingsSlinky.instagramPrivateApi.profileEntityMod.ProfileEntity
}
