package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.anon.Broadcastid
import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.liveObsSettingsMod.LiveRtmpSettings
import typingsSlinky.instagramPrivateApi.mediaEntityOembedResponseMod.MediaEntityOembedResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entitiesMod {
  
  @JSImport("instagram-private-api/dist/entities", "DirectThreadEntity")
  @js.native
  class DirectThreadEntity protected ()
    extends typingsSlinky.instagramPrivateApi.directThreadEntityMod.DirectThreadEntity {
    def this(client: IgApiClient) = this()
  }
  
  @JSImport("instagram-private-api/dist/entities", "LiveEntity")
  @js.native
  class LiveEntity protected ()
    extends typingsSlinky.instagramPrivateApi.liveEntityMod.LiveEntity {
    def this(client: IgApiClient) = this()
  }
  /* static members */
  object LiveEntity {
    
    @JSImport("instagram-private-api/dist/entities", "LiveEntity.getUrlAndKey")
    @js.native
    def getUrlAndKey(info: Broadcastid): LiveRtmpSettings = js.native
  }
  
  @JSImport("instagram-private-api/dist/entities", "MediaEntity")
  @js.native
  class MediaEntity protected ()
    extends typingsSlinky.instagramPrivateApi.mediaEntityMod.MediaEntity {
    def this(client: IgApiClient) = this()
  }
  /* static members */
  object MediaEntity {
    
    @JSImport("instagram-private-api/dist/entities", "MediaEntity.oembed")
    @js.native
    def oembed(url: String): js.Promise[MediaEntityOembedResponse] = js.native
  }
  
  @JSImport("instagram-private-api/dist/entities", "ProfileEntity")
  @js.native
  class ProfileEntity protected ()
    extends typingsSlinky.instagramPrivateApi.profileEntityMod.ProfileEntity {
    def this(client: IgApiClient) = this()
  }
}
