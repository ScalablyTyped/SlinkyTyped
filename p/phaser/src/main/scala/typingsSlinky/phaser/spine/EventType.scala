package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSGlobal("spine.EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait complete extends EventType
  
  @js.native
  sealed trait dispose extends EventType
  
  @js.native
  sealed trait end extends EventType
  
  @js.native
  sealed trait event extends EventType
  
  @js.native
  sealed trait interrupt extends EventType
  
  @js.native
  sealed trait start extends EventType
  
  /* 4 */ val complete: typingsSlinky.phaser.spine.EventType.complete with Double = js.native
  /* 3 */ val dispose: typingsSlinky.phaser.spine.EventType.dispose with Double = js.native
  /* 2 */ val end: typingsSlinky.phaser.spine.EventType.end with Double = js.native
  /* 5 */ val event: typingsSlinky.phaser.spine.EventType.event with Double = js.native
  /* 1 */ val interrupt: typingsSlinky.phaser.spine.EventType.interrupt with Double = js.native
  /* 0 */ val start: typingsSlinky.phaser.spine.EventType.start with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType with Double] = js.native
}

