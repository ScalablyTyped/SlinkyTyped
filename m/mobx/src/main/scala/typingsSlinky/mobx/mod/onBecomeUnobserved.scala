package typingsSlinky.mobx.mod

import typingsSlinky.mobx.computedvalueMod.IComputedValue
import typingsSlinky.mobx.coreObservableMod.IObservable
import typingsSlinky.mobx.observablearrayMod.IObservableArray
import typingsSlinky.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "onBecomeUnobserved")
@js.native
object onBecomeUnobserved extends js.Object {
  def apply(value: IComputedValue[_], listener: Lambda): Lambda = js.native
  def apply(value: IObservable, listener: Lambda): Lambda = js.native
  def apply(value: typingsSlinky.mobx.internalMod.ObservableMap[_, _], listener: Lambda): Lambda = js.native
  def apply(value: typingsSlinky.mobx.internalMod.ObservableSet[_], listener: Lambda): Lambda = js.native
  def apply(value: IObservableArray[_], listener: Lambda): Lambda = js.native
  def apply[K, V](value: js.Object, property: K, listener: Lambda): Lambda = js.native
  def apply[K, V](value: typingsSlinky.mobx.internalMod.ObservableMap[K, V], property: K, listener: Lambda): Lambda = js.native
}

