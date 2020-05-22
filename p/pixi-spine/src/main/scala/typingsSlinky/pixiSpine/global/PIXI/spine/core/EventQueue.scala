package typingsSlinky.pixiSpine.global.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.EventQueue")
@js.native
class EventQueue protected ()
  extends typingsSlinky.pixiSpine.PIXI.spine.core.EventQueue {
  def this(animState: typingsSlinky.pixiSpine.PIXI.spine.core.AnimationState) = this()
  /* CompleteClass */
  override var animState: typingsSlinky.pixiSpine.PIXI.spine.core.AnimationState = js.native
  /* CompleteClass */
  override var drainDisabled: Boolean = js.native
  /* CompleteClass */
  override var objects: js.Array[_] = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def complete(entry: typingsSlinky.pixiSpine.PIXI.spine.core.TrackEntry): Unit = js.native
  /* CompleteClass */
  override def deprecateStuff(): Boolean = js.native
  /* CompleteClass */
  override def dispose(entry: typingsSlinky.pixiSpine.PIXI.spine.core.TrackEntry): Unit = js.native
  /* CompleteClass */
  override def drain(): Unit = js.native
  /* CompleteClass */
  override def end(entry: typingsSlinky.pixiSpine.PIXI.spine.core.TrackEntry): Unit = js.native
  /* CompleteClass */
  override def event(
    entry: typingsSlinky.pixiSpine.PIXI.spine.core.TrackEntry,
    event: typingsSlinky.pixiSpine.PIXI.spine.core.Event
  ): Unit = js.native
  /* CompleteClass */
  override def interrupt(entry: typingsSlinky.pixiSpine.PIXI.spine.core.TrackEntry): Unit = js.native
  /* CompleteClass */
  override def start(entry: typingsSlinky.pixiSpine.PIXI.spine.core.TrackEntry): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.EventQueue")
@js.native
object EventQueue extends js.Object {
  var deprecatedWarning1: js.Any = js.native
}

