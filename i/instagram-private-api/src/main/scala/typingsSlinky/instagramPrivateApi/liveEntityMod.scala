package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.anon.Broadcastid
import typingsSlinky.instagramPrivateApi.clientMod.IgApiClient
import typingsSlinky.instagramPrivateApi.entityMod.Entity
import typingsSlinky.instagramPrivateApi.liveObsSettingsMod.LiveRtmpSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object liveEntityMod {
  
  @JSImport("instagram-private-api/dist/entities/live.entity", "LiveEntity")
  @js.native
  class LiveEntity protected () extends Entity {
    def this(client: IgApiClient) = this()
  }
  /* static members */
  object LiveEntity {
    
    @JSImport("instagram-private-api/dist/entities/live.entity", "LiveEntity.getUrlAndKey")
    @js.native
    def getUrlAndKey(info: Broadcastid): LiveRtmpSettings = js.native
  }
}
