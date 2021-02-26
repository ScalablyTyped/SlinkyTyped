package typingsSlinky.mobx

import typingsSlinky.mobx.computedvalueMod.IComputedValue
import typingsSlinky.mobx.internalMod.ObservableMap
import typingsSlinky.mobx.internalMod.ObservableSet
import typingsSlinky.mobx.observablearrayMod.IArrayChange
import typingsSlinky.mobx.observablearrayMod.IArraySplice
import typingsSlinky.mobx.observablearrayMod.IObservableArray
import typingsSlinky.mobx.observablemapMod.IMapDidChange
import typingsSlinky.mobx.observableobjectMod.IObjectDidChange
import typingsSlinky.mobx.observablesetMod.ISetDidChange
import typingsSlinky.mobx.observablevalueMod.IObservableValue
import typingsSlinky.mobx.observablevalueMod.IValueDidChange
import typingsSlinky.mobx.utilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observeMod {
  
  @JSImport("mobx/lib/api/observe", "observe")
  @js.native
  def observe(`object`: js.Object, listener: js.Function1[/* change */ IObjectDidChange[_], Unit]): Lambda = js.native
  @JSImport("mobx/lib/api/observe", "observe")
  @js.native
  def observe(
    `object`: js.Object,
    listener: js.Function1[/* change */ IObjectDidChange[_], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  @JSImport("mobx/lib/api/observe", "observe")
  @js.native
  def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit]
  ): Lambda = js.native
  @JSImport("mobx/lib/api/observe", "observe")
  @js.native
  def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  @JSImport("mobx/lib/api/observe", "observe")
  @js.native
  def observe[V](observableMap: ObservableSet[V], listener: js.Function1[/* change */ ISetDidChange[V], Unit]): Lambda = js.native
  @JSImport("mobx/lib/api/observe", "observe")
  @js.native
  def observe[V](
    observableMap: ObservableSet[V],
    listener: js.Function1[/* change */ ISetDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  @JSImport("mobx/lib/api/observe", "observe")
  @js.native
  def observe[T](value: IComputedValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
  @JSImport("mobx/lib/api/observe", "observe")
  @js.native
  def observe[T](
    value: IComputedValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  @JSImport("mobx/lib/api/observe", "observe")
  @js.native
  def observe[T](value: IObservableValue[T], listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
  @JSImport("mobx/lib/api/observe", "observe")
  @js.native
  def observe[T](
    value: IObservableValue[T],
    listener: js.Function1[/* change */ IValueDidChange[T], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  @JSImport("mobx/lib/api/observe", "observe")
  @js.native
  def observe[T, K /* <: /* keyof T */ String */](
    `object`: T,
    property: K,
    listener: js.Function1[
      /* change */ IValueDidChange[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      Unit
    ]
  ): Lambda = js.native
  @JSImport("mobx/lib/api/observe", "observe")
  @js.native
  def observe[T, K /* <: /* keyof T */ String */](
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
  @JSImport("mobx/lib/api/observe", "observe")
  @js.native
  def observe[K, V](observableMap: ObservableMap[K, V], listener: js.Function1[/* change */ IMapDidChange[K, V], Unit]): Lambda = js.native
  @JSImport("mobx/lib/api/observe", "observe")
  @js.native
  def observe[K, V](
    observableMap: ObservableMap[K, V],
    listener: js.Function1[/* change */ IMapDidChange[K, V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
  @JSImport("mobx/lib/api/observe", "observe")
  @js.native
  def observe[K, V](
    observableMap: ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit]
  ): Lambda = js.native
  @JSImport("mobx/lib/api/observe", "observe")
  @js.native
  def observe[K, V](
    observableMap: ObservableMap[K, V],
    property: K,
    listener: js.Function1[/* change */ IValueDidChange[V], Unit],
    fireImmediately: Boolean
  ): Lambda = js.native
}
