package typingsSlinky.phaser.Phaser.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Tweens {
  import typingsSlinky.phaser.Phaser.Tweens.Timeline
  import typingsSlinky.phaser.Phaser.Tweens.Tween
  import typingsSlinky.phaser.integer

  /**
    * A Tween Event.
    */
  type Event = String
  type GetActiveCallback = js.Function6[
    /* target */ js.Any, 
    /* key */ String, 
    /* value */ Double, 
    /* targetIndex */ integer, 
    /* totalTargets */ integer, 
    /* tween */ Tween, 
    Unit
  ]
  type GetEndCallback = js.Function6[
    /* target */ js.Any, 
    /* key */ String, 
    /* value */ Double, 
    /* targetIndex */ integer, 
    /* totalTargets */ integer, 
    /* tween */ Tween, 
    Unit
  ]
  type GetStartCallback = js.Function6[
    /* target */ js.Any, 
    /* key */ String, 
    /* value */ Double, 
    /* targetIndex */ integer, 
    /* totalTargets */ integer, 
    /* tween */ Tween, 
    Unit
  ]
  type TimelineOnCompleteCallback = js.Function2[/* timeline */ Timeline, /* repeated */ js.Any, Unit]
  type TimelineOnLoopCallback = js.Function2[/* timeline */ Timeline, /* repeated */ js.Any, Unit]
  type TimelineOnStartCallback = js.Function2[/* timeline */ Timeline, /* repeated */ js.Any, Unit]
  type TimelineOnUpdateCallback = js.Function2[/* timeline */ Timeline, /* repeated */ js.Any, Unit]
  type TimelineOnYoyoCallback = js.Function2[/* timeline */ Timeline, /* repeated */ js.Any, Unit]
  type TweenOnActiveCallback = js.Function3[/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any, Unit]
  type TweenOnCompleteCallback = js.Function3[/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any, Unit]
  type TweenOnLoopCallback = js.Function3[/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any, Unit]
  type TweenOnRepeatCallback = js.Function3[/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any, Unit]
  type TweenOnStartCallback = js.Function3[/* tween */ Tween, /* targets */ js.Array[js.Any], /* repeated */ js.Any, Unit]
  type TweenOnUpdateCallback = js.Function3[/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any, Unit]
  type TweenOnYoyoCallback = js.Function3[/* tween */ Tween, /* target */ js.Any, /* repeated */ js.Any, Unit]
}
