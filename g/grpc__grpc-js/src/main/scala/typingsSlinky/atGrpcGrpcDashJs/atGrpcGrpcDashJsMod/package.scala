package typingsSlinky.atGrpcGrpcDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atGrpcGrpcDashJsMod {
  import typingsSlinky.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.StatusObject
  import typingsSlinky.atGrpcGrpcDashJs.buildSrcCallMod.ClientDuplexStream
  import typingsSlinky.atGrpcGrpcDashJs.buildSrcCallMod.ClientReadableStream
  import typingsSlinky.atGrpcGrpcDashJs.buildSrcCallMod.ClientUnaryCall
  import typingsSlinky.atGrpcGrpcDashJs.buildSrcCallMod.ClientWritableStream

  type Call = ClientUnaryCall | ClientReadableStream[js.Any] | ClientWritableStream[js.Any] | (ClientDuplexStream[js.Any, js.Any])
  type MessageListener = js.Function2[/* message */ js.Any, /* next */ js.Function, Unit]
  type MetadataListener = js.Function2[
    /* metadata */ typingsSlinky.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata, 
    /* next */ js.Function, 
    Unit
  ]
  type StatusListener = js.Function2[/* status */ StatusObject, /* next */ js.Function, Unit]
}
