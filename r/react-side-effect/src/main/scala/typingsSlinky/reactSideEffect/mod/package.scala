package typingsSlinky.reactSideEffect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ClassDecorator[TProp, TPeek, TRewind] = js.Function1[
    /* component */ slinky.core.ReactComponentClass[TProp], 
    slinky.core.ReactComponentClass[TProp] with (typingsSlinky.reactSideEffect.anon.Peek[TPeek, TRewind])
  ]
}
