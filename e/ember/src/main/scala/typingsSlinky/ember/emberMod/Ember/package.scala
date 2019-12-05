package typingsSlinky.ember.emberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Ember {
  import typingsSlinky.ember.emberMod.EmberArray

  type Array[T] = EmberArray[T]
  type Enumerable[T] = typingsSlinky.atEmberArray.dashPrivateEnumerableMod.Enumerable[T]
  type MutableArray[T] = typingsSlinky.atEmberArray.mutableMod.MutableArray[T]
  type MutableEnumerable[T] = typingsSlinky.atEmberArray.dashPrivateMutableDashEnumerableMod.MutableEnumerable[T]
  type NativeArray[T] = typingsSlinky.atEmberArray.dashPrivateNativeDashArrayMod.NativeArray[T]
}
