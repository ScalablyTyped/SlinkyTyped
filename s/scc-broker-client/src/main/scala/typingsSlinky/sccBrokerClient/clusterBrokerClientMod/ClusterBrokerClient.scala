package typingsSlinky.sccBrokerClient.clusterBrokerClientMod

import typingsSlinky.asyncStreamEmitter.mod.AsyncStreamEmitter
import typingsSlinky.jsonwebtoken.mod.Secret
import typingsSlinky.sccBrokerClient.anon.Error
import typingsSlinky.sccBrokerClient.anon.NoMatchingPublishTargetError
import typingsSlinky.sccBrokerClient.clientPoolMod.PublishData
import typingsSlinky.sccBrokerClient.clientPoolMod.PublishFailData
import typingsSlinky.sccBrokerClient.clientPoolMod.SubscribeData
import typingsSlinky.sccBrokerClient.clientPoolMod.SubscribeFailData
import typingsSlinky.sccBrokerClient.mod.MappingEngine
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.error
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.message
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.publish
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.publishFail
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.simple
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.skeletonRendezvous
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.subscribe
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.subscribeFail
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.updateBrokers
import typingsSlinky.sccBrokerClient.sccBrokerClientStrings.updateWorkers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterBrokerClient
  extends AsyncStreamEmitter[js.Any] {
  var authKey: js.UndefOr[Secret] = js.native
  var broker: typingsSlinky.scBroker.scbrokerMod.^ = js.native
  var clientPoolSize: Double = js.native
  var errors: NoMatchingPublishTargetError = js.native
  var isReady: Boolean = js.native
  var mapper: MappingEngine = js.native
  var mappingEngine: skeletonRendezvous | simple | MappingEngine = js.native
  var sccBrokerClientPools: js.Array[typingsSlinky.sccBrokerClient.clientPoolMod.^] = js.native
  var sccBrokerURIList: js.Array[String] = js.native
  @JSName("emit")
  def emit_error(eventName: error, data: Error): Unit = js.native
  @JSName("emit")
  def emit_message(eventName: message, data: MessageData): Unit = js.native
  @JSName("emit")
  def emit_publish(eventName: publish, data: PublishData): Unit = js.native
  @JSName("emit")
  def emit_publishFail(eventName: publishFail, data: PublishFailData): Unit = js.native
  @JSName("emit")
  def emit_subscribe(event: subscribe, data: SubscribeData): Unit = js.native
  @JSName("emit")
  def emit_subscribeFail(event: subscribeFail, data: SubscribeFailData): Unit = js.native
  @JSName("emit")
  def emit_updateBrokers(eventName: updateBrokers, data: UpdateBrokersData): Unit = js.native
  @JSName("emit")
  def emit_updateWorkers(eventName: updateWorkers, data: UpdateWorkersData): Unit = js.native
  def getAllSubscriptions(): js.Array[String] = js.native
  def invokePublish(channelName: String, data: js.Any): Unit = js.native
  @JSName("listener")
  def listener_error(eventName: error): typingsSlinky.consumableStream.mod.^[Error] = js.native
  @JSName("listener")
  def listener_message(eventName: message): typingsSlinky.consumableStream.mod.^[MessageData] = js.native
  @JSName("listener")
  def listener_publish(eventName: publish): typingsSlinky.consumableStream.mod.^[PublishData] = js.native
  @JSName("listener")
  def listener_publishFail(eventName: publishFail): typingsSlinky.consumableStream.mod.^[PublishFailData] = js.native
  @JSName("listener")
  def listener_subscribe(event: subscribe): typingsSlinky.consumableStream.mod.^[SubscribeData] = js.native
  @JSName("listener")
  def listener_subscribeFail(event: subscribeFail): typingsSlinky.consumableStream.mod.^[SubscribeFailData] = js.native
  @JSName("listener")
  def listener_updateBrokers(eventName: updateBrokers): typingsSlinky.consumableStream.mod.^[UpdateBrokersData] = js.native
  @JSName("listener")
  def listener_updateWorkers(eventName: updateWorkers): typingsSlinky.consumableStream.mod.^[UpdateWorkersData] = js.native
  def mapChannelNameToBrokerURI(channelName: String): String = js.native
  def setBrokers(sccBrokerURIList: js.Array[String]): Unit = js.native
  def subscribe(channelName: String): Unit = js.native
  def unsubscribe(channelName: String): Unit = js.native
}

