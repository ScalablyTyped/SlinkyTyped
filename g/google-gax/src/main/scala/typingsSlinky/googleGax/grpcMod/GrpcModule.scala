package typingsSlinky.googleGax.grpcMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleGax.anon.TypeofCallCredentials
import typingsSlinky.googleGax.anon.TypeofChannelCredentials
import typingsSlinky.googleGax.anon.TypeofMetadata
import typingsSlinky.googleGax.anon.TypeofServerCredentials
import typingsSlinky.grpcGrpcJs.anon.PartialConsole
import typingsSlinky.grpcGrpcJs.callStreamMod.Deadline
import typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typingsSlinky.grpcGrpcJs.channelMod.Channel
import typingsSlinky.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typingsSlinky.grpcGrpcJs.clientMod.Client
import typingsSlinky.grpcGrpcJs.constantsMod.LogVerbosity
import typingsSlinky.grpcGrpcJs.makeClientMod.GrpcObject
import typingsSlinky.grpcGrpcJs.makeClientMod.PackageDefinition
import typingsSlinky.grpcGrpcJs.makeClientMod.ServiceClientConstructor
import typingsSlinky.grpcGrpcJs.makeClientMod.ServiceDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrpcModule extends js.Object {
  var CallCredentials: TypeofCallCredentials = js.native
  var Channel: Instantiable3[
    /* target */ String, 
    /* credentials */ ChannelCredentials, 
    /* options */ ChannelOptions, 
    typingsSlinky.grpcGrpcJs.mod.Channel
  ] = js.native
  var ChannelCredentials: TypeofChannelCredentials = js.native
  var Client: Instantiable2[
    /* address */ String, 
    /* credentials */ ChannelCredentials, 
    typingsSlinky.grpcGrpcJs.mod.Client
  ] = js.native
  var Metadata: TypeofMetadata = js.native
  var Server: Instantiable0[typingsSlinky.grpcGrpcJs.mod.Server] = js.native
  var ServerCredentials: TypeofServerCredentials = js.native
  var StatusBuilder: Instantiable0[typingsSlinky.grpcGrpcJs.mod.StatusBuilder] = js.native
  val credentials: StringDictionary[js.Function] = js.native
  def InterceptingCall(): scala.Nothing = js.native
  def InterceptorBuilder(): scala.Nothing = js.native
  def ListenerBuilder(): scala.Nothing = js.native
  def closeClient(client: Client): Unit = js.native
  def getClientChannel(client: Client): Channel = js.native
  def load(filename: js.Any, format: js.Any, options: js.Any): scala.Nothing = js.native
  def loadObject(value: js.Any, options: js.Any): scala.Nothing = js.native
  def loadPackageDefinition(packageDef: PackageDefinition): GrpcObject = js.native
  def makeClientConstructor(methods: ServiceDefinition, serviceName: String): ServiceClientConstructor = js.native
  def makeClientConstructor(methods: ServiceDefinition, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
  def makeGenericClientConstructor(methods: ServiceDefinition, serviceName: String): ServiceClientConstructor = js.native
  def makeGenericClientConstructor(methods: ServiceDefinition, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
  def setLogVerbosity(verbosity: LogVerbosity): Unit = js.native
  def setLogger(logger: PartialConsole): Unit = js.native
  def waitForClientReady(client: Client, deadline: Deadline, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
}

