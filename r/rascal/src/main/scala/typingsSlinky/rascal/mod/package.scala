package typingsSlinky.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AckOrNack = js.Function2[
    /* err */ js.UndefOr[js.Error], 
    /* recovery */ js.UndefOr[typingsSlinky.rascal.mod.Recovery | js.Array[typingsSlinky.rascal.mod.Recovery]], 
    scala.Unit
  ]
  
  type Cb[E, A] = js.Function1[/* x */ js.Tuple2[E | scala.Null, A | scala.Nothing], scala.Unit]
  
  type ConnectCb = js.Function1[
    /* x */ js.Tuple2[js.Error | scala.Null, typingsSlinky.amqplib.mod.Connection | scala.Null], 
    scala.Unit
  ]
  
  type CreateCb = js.Function1[
    /* x */ js.Tuple2[js.Error | scala.Null, typingsSlinky.rascal.mod.Broker], 
    scala.Unit
  ]
  
  type ErrorCb = js.Function1[/* x */ js.Error | scala.Null, scala.Unit]
}
