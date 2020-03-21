package typingsSlinky.msnodesql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorCallback = js.Function1[/* err */ js.Error, scala.Unit]
  type OpenCallback = js.Function2[
    /* err */ js.UndefOr[js.Error], 
    /* connection */ js.UndefOr[typingsSlinky.msnodesql.mod.Connection], 
    scala.Unit
  ]
  type QueryCallback[T] = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* results */ js.UndefOr[js.Array[T]], 
    /* more */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type QueryRawCallback = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* results */ js.UndefOr[typingsSlinky.msnodesql.mod.QueryRawResult], 
    /* more */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type StreamEvents = typingsSlinky.node.eventsMod.EventEmitter
}
