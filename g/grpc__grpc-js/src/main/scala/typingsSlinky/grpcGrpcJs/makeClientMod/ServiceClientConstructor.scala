package typingsSlinky.grpcGrpcJs.makeClientMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.grpcGrpcJs.anon.PartialChannelOptions
import typingsSlinky.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceClientConstructor
  extends Instantiable2[/* address */ String, /* credentials */ ChannelCredentials, ServiceClient]
     with Instantiable3[
      /* address */ String, 
      /* credentials */ ChannelCredentials, 
      /* options */ PartialChannelOptions, 
      ServiceClient
    ] {
  var service: ServiceDefinition = js.native
}

