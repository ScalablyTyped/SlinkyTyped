package typingsSlinky.instagramDashPrivateDashApi

import typingsSlinky.instagramDashPrivateDashApi.distResponsesMediaDotEntityDotOembedDotResponseMod.MediaEntityOembedResponse
import typingsSlinky.instagramDashPrivateDashApi.distTypesLiveDotObsDashSettingsMod.LiveRtmpSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/entities", JSImport.Namespace)
@js.native
object distEntitiesMod extends js.Object {
  @js.native
  class DirectThreadEntity ()
    extends typingsSlinky.instagramDashPrivateDashApi.distEntitiesDirectDashThreadDotEntityMod.DirectThreadEntity
  
  @js.native
  class LiveEntity ()
    extends typingsSlinky.instagramDashPrivateDashApi.distEntitiesLiveDotEntityMod.LiveEntity
  
  @js.native
  class MediaEntity ()
    extends typingsSlinky.instagramDashPrivateDashApi.distEntitiesMediaDotEntityMod.MediaEntity
  
  @js.native
  class ProfileEntity ()
    extends typingsSlinky.instagramDashPrivateDashApi.distEntitiesProfileDotEntityMod.ProfileEntity
  
  /* static members */
  @js.native
  object LiveEntity extends js.Object {
    def getUrlAndKey(info: Anon_Broadcastid): LiveRtmpSettings = js.native
  }
  
  /* static members */
  @js.native
  object MediaEntity extends js.Object {
    def oembed(url: String): js.Promise[MediaEntityOembedResponse] = js.native
  }
  
}

