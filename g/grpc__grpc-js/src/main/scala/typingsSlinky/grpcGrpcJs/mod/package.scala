package typingsSlinky.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MessageListener = js.Function2[/* message */ js.Any, /* next */ js.Function, scala.Unit]
  type MetadataListener = js.Function2[
    /* metadata */ typingsSlinky.grpcGrpcJs.metadataMod.Metadata, 
    /* next */ js.Function, 
    scala.Unit
  ]
  type StatusListener = js.Function2[
    /* status */ typingsSlinky.grpcGrpcJs.callStreamMod.StatusObject, 
    /* next */ js.Function, 
    scala.Unit
  ]
}
