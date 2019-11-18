package typingsSlinky.mobx

import typingsSlinky.mobx.libInternalMod.ObservableMap
import typingsSlinky.mobx.libInternalMod.ObservableSet
import typingsSlinky.mobx.libTypesInterceptDashUtilsMod.IInterceptor
import typingsSlinky.mobx.libTypesObservablearrayMod.IArrayWillChange
import typingsSlinky.mobx.libTypesObservablearrayMod.IArrayWillSplice
import typingsSlinky.mobx.libTypesObservablearrayMod.IObservableArray
import typingsSlinky.mobx.libTypesObservablemapMod.IMapWillChange
import typingsSlinky.mobx.libTypesObservableobjectMod.IObjectWillChange
import typingsSlinky.mobx.libTypesObservablesetMod.ISetWillChange
import typingsSlinky.mobx.libTypesObservablevalueMod.IObservableValue
import typingsSlinky.mobx.libTypesObservablevalueMod.IValueWillChange
import typingsSlinky.mobx.libUtilsUtilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/intercept", JSImport.Namespace)
@js.native
object libApiInterceptMod extends js.Object {
  def intercept(`object`: js.Object, handler: IInterceptor[IObjectWillChange]): Lambda = js.native
  def intercept[T](
    observableArray: IObservableArray[T],
    handler: IInterceptor[IArrayWillChange[T] | IArrayWillSplice[T]]
  ): Lambda = js.native
  def intercept[V](observableMap: ObservableSet[V], handler: IInterceptor[ISetWillChange[V]]): Lambda = js.native
  def intercept[T](value: IObservableValue[T], handler: IInterceptor[IValueWillChange[T]]): Lambda = js.native
  def intercept[T /* <: js.Object */, K /* <: String */](`object`: T, property: K, handler: IInterceptor[IValueWillChange[_]]): Lambda = js.native
  def intercept[K, V](observableMap: ObservableMap[K, V], handler: IInterceptor[IMapWillChange[K, V]]): Lambda = js.native
  def intercept[K, V](observableMap: ObservableMap[K, V], property: K, handler: IInterceptor[IValueWillChange[V]]): Lambda = js.native
}

