package typingsSlinky.mobx.mod

import typingsSlinky.mobx.modifiersMod.IEnhancer
import typingsSlinky.mobx.observablemapMod.IObservableMapInitialValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx", "ObservableMap")
@js.native
class ObservableMap[K, V] ()
  extends typingsSlinky.mobx.internalMod.ObservableMap[K, V] {
  def this(initialData: IObservableMapInitialValues[K, V]) = this()
  def this(initialData: js.UndefOr[IObservableMapInitialValues[K, V]], enhancer: IEnhancer[V]) = this()
  def this(
    initialData: js.UndefOr[IObservableMapInitialValues[K, V]],
    enhancer: js.UndefOr[scala.Nothing],
    name: String
  ) = this()
  def this(initialData: js.UndefOr[IObservableMapInitialValues[K, V]], enhancer: IEnhancer[V], name: String) = this()
}
