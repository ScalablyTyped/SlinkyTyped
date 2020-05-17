package typingsSlinky.indefiniteObservable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Connect[T] = js.Function1[
    /* observer */ typingsSlinky.indefiniteObservable.typesMod.Observer[T], 
    typingsSlinky.indefiniteObservable.typesMod.Disconnect
  ]
  type Disconnect = js.Function0[scala.Unit]
  type NextChannel[T] = js.Function1[/* value */ T, scala.Unit]
  type Unsubscribe = js.Function0[scala.Unit]
}
