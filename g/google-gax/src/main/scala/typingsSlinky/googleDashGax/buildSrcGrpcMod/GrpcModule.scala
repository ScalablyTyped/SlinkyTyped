package typingsSlinky.googleDashGax.buildSrcGrpcMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Console
import typingsSlinky.atGrpcGrpcDashJs.buildSrcChannelDashCredentialsMod.ChannelCredentials
import typingsSlinky.atGrpcGrpcDashJs.buildSrcChannelDashOptionsMod.ChannelOptions
import typingsSlinky.atGrpcGrpcDashJs.buildSrcChannelMod.Channel
import typingsSlinky.atGrpcGrpcDashJs.buildSrcClientMod.Client
import typingsSlinky.atGrpcGrpcDashJs.buildSrcConstantsMod.LogVerbosity
import typingsSlinky.atGrpcGrpcDashJs.buildSrcMakeDashClientMod.GrpcObject
import typingsSlinky.atGrpcGrpcDashJs.buildSrcMakeDashClientMod.PackageDefinition
import typingsSlinky.atGrpcGrpcDashJs.buildSrcMakeDashClientMod.ServiceClientConstructor
import typingsSlinky.atGrpcGrpcDashJs.buildSrcMakeDashClientMod.ServiceDefinition
import typingsSlinky.googleDashGax.TypeofClassCallCredentials
import typingsSlinky.googleDashGax.TypeofClassChannelCredentials
import typingsSlinky.googleDashGax.TypeofClassMetadata
import typingsSlinky.googleDashGax.TypeofClassServerCredentials
import typingsSlinky.std.Date
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrpcModule extends js.Object {
  var CallCredentials: TypeofClassCallCredentials = js.native
  var Channel: Instantiable3[
    /* target */ String, 
    /* credentials */ ChannelCredentials, 
    /* options */ ChannelOptions, 
    typingsSlinky.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod.Channel
  ] = js.native
  var ChannelCredentials: TypeofClassChannelCredentials = js.native
  var Client: Instantiable2[
    /* address */ String, 
    /* credentials */ ChannelCredentials, 
    typingsSlinky.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod.Client
  ] = js.native
  var Metadata: TypeofClassMetadata = js.native
  var Server: Instantiable0[typingsSlinky.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod.Server] = js.native
  var ServerCredentials: TypeofClassServerCredentials = js.native
  var StatusBuilder: Instantiable0[typingsSlinky.atGrpcGrpcDashJs.atGrpcGrpcDashJsMod.StatusBuilder] = js.native
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
  def setLogger(logger: Partial[Console]): Unit = js.native
  def waitForClientReady(client: Client, deadline: Double, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  def waitForClientReady(client: Client, deadline: Date, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
}

