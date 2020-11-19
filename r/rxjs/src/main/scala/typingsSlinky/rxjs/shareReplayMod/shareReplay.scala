package typingsSlinky.rxjs.shareReplayMod

import typingsSlinky.rxjs.typesMod.MonoTypeOperatorFunction
import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/operators/shareReplay", "shareReplay")
@js.native
object shareReplay extends js.Object {
  
  def apply[T](): MonoTypeOperatorFunction[T] = js.native
  def apply[T](
    bufferSize: js.UndefOr[scala.Nothing],
    windowTime: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): MonoTypeOperatorFunction[T] = js.native
  def apply[T](bufferSize: js.UndefOr[scala.Nothing], windowTime: Double): MonoTypeOperatorFunction[T] = js.native
  def apply[T](bufferSize: js.UndefOr[scala.Nothing], windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def apply[T](bufferSize: Double): MonoTypeOperatorFunction[T] = js.native
  def apply[T](bufferSize: Double, windowTime: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def apply[T](bufferSize: Double, windowTime: Double): MonoTypeOperatorFunction[T] = js.native
  def apply[T](bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  def apply[T](config: ShareReplayConfig): MonoTypeOperatorFunction[T] = js.native
}
