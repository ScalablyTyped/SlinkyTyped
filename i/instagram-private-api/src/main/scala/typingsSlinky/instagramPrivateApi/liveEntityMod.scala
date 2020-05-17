package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.anon.Broadcastid
import typingsSlinky.instagramPrivateApi.liveObsSettingsMod.LiveRtmpSettings
import typingsSlinky.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/entities/live.entity", JSImport.Namespace)
@js.native
object liveEntityMod extends js.Object {
  @js.native
  class LiveEntity () extends Repository
  
  /* static members */
  @js.native
  object LiveEntity extends js.Object {
    def getUrlAndKey(info: Broadcastid): LiveRtmpSettings = js.native
  }
  
}

