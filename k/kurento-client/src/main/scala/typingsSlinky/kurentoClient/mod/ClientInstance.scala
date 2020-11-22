package typingsSlinky.kurentoClient.mod

import typingsSlinky.kurentoClient.anon.NetworkCache
import typingsSlinky.kurentoClient.anon.UseDataChannels
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientInstance extends js.Object {
  
  def close(): Unit = js.native
  
  def create(`type`: String): js.Promise[MediaElement] = js.native
  def create(`type`: String, options: Record[String, _]): js.Promise[MediaElement] = js.native
  @JSName("create")
  def create_MediaPipeline(`type`: typingsSlinky.kurentoClient.kurentoClientStrings.MediaPipeline): js.Promise[MediaPipeline] = js.native
  @JSName("create")
  def create_PlayerEndpoint(`type`: typingsSlinky.kurentoClient.kurentoClientStrings.PlayerEndpoint): js.Promise[PlayerEndpoint] = js.native
  @JSName("create")
  def create_PlayerEndpoint(`type`: typingsSlinky.kurentoClient.kurentoClientStrings.PlayerEndpoint, options: NetworkCache): js.Promise[PlayerEndpoint] = js.native
  @JSName("create")
  def create_RecorderEndpoint(
    `type`: typingsSlinky.kurentoClient.kurentoClientStrings.RecorderEndpoint,
    options: RecorderEndpointOptions
  ): js.Promise[RecorderEndpoint] = js.native
  @JSName("create")
  def create_WebRtcEndpoint(`type`: typingsSlinky.kurentoClient.kurentoClientStrings.WebRtcEndpoint): js.Promise[WebRtcEndpoint] = js.native
  @JSName("create")
  def create_WebRtcEndpoint(`type`: typingsSlinky.kurentoClient.kurentoClientStrings.WebRtcEndpoint, options: UseDataChannels): js.Promise[WebRtcEndpoint] = js.native
  
  def getMediaobjectById(objectId: String): js.Promise[MediaPipeline | WebRtcEndpoint | RecorderEndpoint] = js.native
  
  def getServerManager(): js.Promise[ServerManager] = js.native
  def getServerManager(callback: Callback[ServerManager]): js.Promise[ServerManager] = js.native
}
