package typingsSlinky.rxjs

import typingsSlinky.rxjs.internalTypesMod.MonoTypeOperatorFunction
import typingsSlinky.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/defaultIfEmpty", JSImport.Namespace)
@js.native
object internalOperatorsDefaultIfEmptyMod extends js.Object {
  def defaultIfEmpty[T](): MonoTypeOperatorFunction[T] = js.native
  def defaultIfEmpty[T](defaultValue: T): MonoTypeOperatorFunction[T] = js.native
  @JSName("defaultIfEmpty")
  def defaultIfEmpty_TR_OperatorFunction[T, R](): OperatorFunction[T, T | R] = js.native
  @JSName("defaultIfEmpty")
  def defaultIfEmpty_TR_OperatorFunction[T, R](defaultValue: R): OperatorFunction[T, T | R] = js.native
}

