package typingsSlinky.reactDashSideDashEffect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashSideDashEffectMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.reactDashSideDashEffect.Anon_Peek

  type ClassDecorator[TProp, TPeek, TRewind] = js.Function1[
    /* component */ ReactComponentClass[TProp], 
    ReactComponentClass[TProp] with (Anon_Peek[TPeek, TRewind])
  ]
}
