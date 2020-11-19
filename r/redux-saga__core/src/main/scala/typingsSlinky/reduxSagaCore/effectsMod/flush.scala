package typingsSlinky.reduxSagaCore.effectsMod

import typingsSlinky.reduxSagaCore.typesMod.FlushableChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@redux-saga/core/types/effects", "flush")
@js.native
object flush extends js.Object {
  
  def apply[T](channel: FlushableChannel[T]): FlushEffect[T] = js.native
}
