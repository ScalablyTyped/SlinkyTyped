package typingsSlinky.rxjs.rxMod

import typingsSlinky.rxjs.typesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Rx", "ReplaySubject")
@js.native
class ReplaySubject[T] ()
  extends typingsSlinky.rxjs.replaySubjectMod.ReplaySubject[T] {
  def this(bufferSize: Double) = this()
  def this(bufferSize: Double, windowTime: Double) = this()
  def this(bufferSize: Double, windowTime: Double, scheduler: SchedulerLike) = this()
}

