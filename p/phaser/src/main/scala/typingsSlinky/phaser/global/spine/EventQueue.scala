package typingsSlinky.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.EventQueue")
@js.native
class EventQueue protected ()
  extends typingsSlinky.phaser.spine.EventQueue {
  def this(animState: typingsSlinky.phaser.spine.AnimationState) = this()
  /* CompleteClass */
  override var animState: typingsSlinky.phaser.spine.AnimationState = js.native
  /* CompleteClass */
  override var drainDisabled: Boolean = js.native
  /* CompleteClass */
  override var objects: js.Array[_] = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def complete(entry: typingsSlinky.phaser.spine.TrackEntry): Unit = js.native
  /* CompleteClass */
  override def dispose(entry: typingsSlinky.phaser.spine.TrackEntry): Unit = js.native
  /* CompleteClass */
  override def drain(): Unit = js.native
  /* CompleteClass */
  override def end(entry: typingsSlinky.phaser.spine.TrackEntry): Unit = js.native
  /* CompleteClass */
  override def event(entry: typingsSlinky.phaser.spine.TrackEntry, event: typingsSlinky.phaser.spine.Event): Unit = js.native
  /* CompleteClass */
  override def interrupt(entry: typingsSlinky.phaser.spine.TrackEntry): Unit = js.native
  /* CompleteClass */
  override def start(entry: typingsSlinky.phaser.spine.TrackEntry): Unit = js.native
}

