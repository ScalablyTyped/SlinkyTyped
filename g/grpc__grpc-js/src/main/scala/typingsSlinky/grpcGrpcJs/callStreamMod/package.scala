package typingsSlinky.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object callStreamMod {
  type Deadline = js.Date | scala.Double
  type MessageListener = js.Function2[
    /* message */ js.Any, 
    /* next */ js.Function1[/* message */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type MetadataListener = js.Function2[
    /* metadata */ typingsSlinky.grpcGrpcJs.metadataMod.Metadata, 
    /* next */ js.Function1[/* metadata */ typingsSlinky.grpcGrpcJs.metadataMod.Metadata, scala.Unit], 
    scala.Unit
  ]
  type StatusListener = js.Function2[
    /* status */ typingsSlinky.grpcGrpcJs.callStreamMod.StatusObject, 
    /* next */ js.Function1[/* status */ typingsSlinky.grpcGrpcJs.callStreamMod.StatusObject, scala.Unit], 
    scala.Unit
  ]
  type WriteCallback = js.Function1[/* error */ js.UndefOr[js.Error | scala.Null], scala.Unit]
}
