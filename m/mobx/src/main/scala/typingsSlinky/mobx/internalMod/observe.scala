package typingsSlinky.mobx.internalMod

import typingsSlinky.mobx.computedvalueMod.IComputedValue
import typingsSlinky.mobx.observablearrayMod.IArrayChange
import typingsSlinky.mobx.observablearrayMod.IArraySplice
import typingsSlinky.mobx.observablearrayMod.IObservableArray
import typingsSlinky.mobx.observablemapMod.IMapDidChange
import typingsSlinky.mobx.observableobjectMod.IObjectDidChange
import typingsSlinky.mobx.observablesetMod.ISetDidChange
import typingsSlinky.mobx.observablevalueMod.IObservableValue
import typingsSlinky.mobx.observablevalueMod.IValueDidChange
import typingsSlinky.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "observe")
@js.native
object observe extends js.Object {
  def apply(`object`: js.Object, listener: js.Function1[/* change */ IObjectDidChange, Unit]): Lambda = js.native
  def apply(
    `object`: js.Object,
    listener: js.Function1[/* change */ IObjectDidChange, Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def apply[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit]
  ): Lambda = js.native
  def apply[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def apply[V](observableMap: ObservableSet[V], listener: js.Function1[/* change */ ISetDidChange[V], Unit]): Lambda = js.native
  def apply[V](
    observableMap: ObservableSet[V],
    listener: js.Function1[/* change */ ISetDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def apply[T](value: IComputedValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
  def apply[T](
    value: IComputedValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def apply[T](value: IObservableValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
  def apply[T](
    value: IObservableValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def apply[T, K /* <: String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ IValueDidChange[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      Unit
    ]
  ): Lambda = js.native
  def apply[T, K /* <: String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ IValueDidChange[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      Unit
    ],
    fireImmediately: Boolean
  ): Lambda = js.native
  def apply[K, V](observableMap: ObservableMap[K, V], listener: js.Function1[/* change */ IMapDidChange[K, V], Unit]): Lambda = js.native
  def apply[K, V](
    observableMap: ObservableMap[K, V],
    listener: js.Function1[/* change */ IMapDidChange[K, V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  def apply[K, V](
    observableMap: ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit]
  ): Lambda = js.native
  def apply[K, V](
    observableMap: ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
}

