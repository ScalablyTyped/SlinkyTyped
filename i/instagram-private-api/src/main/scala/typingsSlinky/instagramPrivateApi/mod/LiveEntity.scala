package typingsSlinky.instagramPrivateApi.mod

import typingsSlinky.instagramPrivateApi.anon.Broadcastid
import typingsSlinky.instagramPrivateApi.liveObsSettingsMod.LiveRtmpSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api", "LiveEntity")
@js.native
class LiveEntity protected ()
  extends typingsSlinky.instagramPrivateApi.entitiesMod.LiveEntity {
  def this(client: typingsSlinky.instagramPrivateApi.clientMod.IgApiClient) = this()
}
/* static members */
object LiveEntity {
  
  @JSImport("instagram-private-api", "LiveEntity.getUrlAndKey")
  @js.native
  def getUrlAndKey(info: Broadcastid): LiveRtmpSettings = js.native
}
