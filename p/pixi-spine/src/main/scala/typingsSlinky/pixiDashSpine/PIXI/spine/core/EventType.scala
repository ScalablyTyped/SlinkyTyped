package typingsSlinky.pixiDashSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSGlobal("PIXI.spine.core.EventType")
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
  
  /* 4 */ val complete: typingsSlinky.pixiDashSpine.PIXI.spine.core.EventType.complete with Double = js.native
  /* 3 */ val dispose: typingsSlinky.pixiDashSpine.PIXI.spine.core.EventType.dispose with Double = js.native
  /* 2 */ val end: typingsSlinky.pixiDashSpine.PIXI.spine.core.EventType.end with Double = js.native
  /* 5 */ val event: typingsSlinky.pixiDashSpine.PIXI.spine.core.EventType.event with Double = js.native
  /* 1 */ val interrupt: typingsSlinky.pixiDashSpine.PIXI.spine.core.EventType.interrupt with Double = js.native
  /* 0 */ val start: typingsSlinky.pixiDashSpine.PIXI.spine.core.EventType.start with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventType with Double] = js.native
}

