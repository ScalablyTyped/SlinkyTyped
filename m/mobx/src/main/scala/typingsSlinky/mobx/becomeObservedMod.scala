package typingsSlinky.mobx

import typingsSlinky.mobx.computedvalueMod.IComputedValue
import typingsSlinky.mobx.coreObservableMod.IObservable
import typingsSlinky.mobx.internalMod.ObservableMap
import typingsSlinky.mobx.internalMod.ObservableSet
import typingsSlinky.mobx.observablearrayMod.IObservableArray
import typingsSlinky.mobx.utilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object becomeObservedMod {
  
  @JSImport("mobx/lib/api/become-observed", "onBecomeObserved")
  @js.native
  def onBecomeObserved(value: IComputedValue[_], listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/api/become-observed", "onBecomeObserved")
  @js.native
  def onBecomeObserved(value: IObservable, listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/api/become-observed", "onBecomeObserved")
  @js.native
  def onBecomeObserved(value: ObservableMap[_, _], listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/api/become-observed", "onBecomeObserved")
  @js.native
  def onBecomeObserved(value: ObservableSet[_], listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/api/become-observed", "onBecomeObserved")
  @js.native
  def onBecomeObserved(value: IObservableArray[_], listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/api/become-observed", "onBecomeObserved")
  @js.native
  def onBecomeObserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/api/become-observed", "onBecomeObserved")
  @js.native
  def onBecomeObserved[K, V](value: ObservableMap[K, V], property: K, listener: Lambda): Lambda = js.native
  
  @JSImport("mobx/lib/api/become-observed", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved(value: IComputedValue[_], listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/api/become-observed", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved(value: IObservable, listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/api/become-observed", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved(value: ObservableMap[_, _], listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/api/become-observed", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved(value: ObservableSet[_], listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/api/become-observed", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved(value: IObservableArray[_], listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/api/become-observed", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved[K, V](value: js.Object, property: K, listener: Lambda): Lambda = js.native
  @JSImport("mobx/lib/api/become-observed", "onBecomeUnobserved")
  @js.native
  def onBecomeUnobserved[K, V](value: ObservableMap[K, V], property: K, listener: Lambda): Lambda = js.native
}
