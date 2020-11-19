package typingsSlinky.mobx.internalMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.mobx.modifiersMod.IEnhancer
import typingsSlinky.mobx.observableMod.CreateObservableOptions
import typingsSlinky.mobx.observablearrayMod.IObservableArray
import typingsSlinky.mobx.observabledecoratorMod.IObservableDecorator
import typingsSlinky.mobx.observablemapMod.IObservableMapInitialValues
import typingsSlinky.mobx.observableobjectMod.IObservableObject
import typingsSlinky.mobx.observablesetMod.IObservableSetInitialValues
import typingsSlinky.mobx.observablevalueMod.IObservableValue
import typingsSlinky.std.Map
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/internal", "observable")
@js.native
object observable extends js.Object {
  
  def apply(): scala.Nothing = js.native
  def apply(target: js.Object, key: String): js.Any = js.native
  def apply(target: js.Object, key: String, baseDescriptor: js.PropertyDescriptor): js.Any = js.native
  def apply(target: js.Object, key: js.Symbol): js.Any = js.native
  def apply(target: js.Object, key: js.Symbol, baseDescriptor: js.PropertyDescriptor): js.Any = js.native
  def apply(value: String): scala.Nothing = js.native
  def apply(value: Boolean): scala.Nothing = js.native
  def apply(value: Double): scala.Nothing = js.native
  def apply[T /* <: js.Object */](value: T): T with IObservableObject = js.native
  def apply[T /* <: js.Object */](
    value: T,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? std.Function}
    */ typingsSlinky.mobx.mobxStrings.observable with TopLevel[js.Any]
  ): T with IObservableObject = js.native
  def apply[T /* <: js.Object */](
    value: T,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? std.Function}
    */ typingsSlinky.mobx.mobxStrings.observable with TopLevel[js.Any],
    options: CreateObservableOptions
  ): T with IObservableObject = js.native
  def apply[T /* <: js.Object */](value: T, decorators: js.UndefOr[scala.Nothing], options: CreateObservableOptions): T with IObservableObject = js.native
  def apply[T](value: js.Array[T]): IObservableArray[T] = js.native
  def apply[T](value: js.Array[T], options: CreateObservableOptions): IObservableArray[T] = js.native
  def apply[T](value: Set[T]): ObservableSet[T] = js.native
  def apply[T](value: Set[T], options: CreateObservableOptions): ObservableSet[T] = js.native
  def apply[K, V](value: Map[K, V]): ObservableMap[K, V] = js.native
  def apply[K, V](value: Map[K, V], options: CreateObservableOptions): ObservableMap[K, V] = js.native
  
  def array[T](): IObservableArray[T] = js.native
  def array[T](initialValues: js.UndefOr[scala.Nothing], options: CreateObservableOptions): IObservableArray[T] = js.native
  def array[T](initialValues: js.Array[T]): IObservableArray[T] = js.native
  def array[T](initialValues: js.Array[T], options: CreateObservableOptions): IObservableArray[T] = js.native
  
  def box[T](): IObservableValue[T] = js.native
  def box[T](value: T): IObservableValue[T] = js.native
  def box[T](value: T, options: CreateObservableOptions): IObservableValue[T] = js.native
  def box[T](value: js.UndefOr[scala.Nothing], options: CreateObservableOptions): IObservableValue[T] = js.native
  
  def deep(target: js.Object, property: String): Unit = js.native
  def deep(target: js.Object, property: String, descriptor: js.PropertyDescriptor): Unit = js.native
  def deep(target: js.Object, property: js.Symbol): Unit = js.native
  def deep(target: js.Object, property: js.Symbol, descriptor: js.PropertyDescriptor): Unit = js.native
  @JSName("deep")
  var deep_Original: IObservableDecorator = js.native
  
  def enhancer(newValue: js.Any, oldValue: js.UndefOr[scala.Nothing], name: String): js.Any = js.native
  def enhancer(newValue: js.Any, oldValue: js.Any, name: String): js.Any = js.native
  @JSName("enhancer")
  var enhancer_Original: IEnhancer[_] = js.native
  
  def map[K, V](): ObservableMap[K, V] = js.native
  def map[K, V](initialValues: js.UndefOr[IObservableMapInitialValues[K, V]], options: CreateObservableOptions): ObservableMap[K, V] = js.native
  def map[K, V](initialValues: IObservableMapInitialValues[K, V]): ObservableMap[K, V] = js.native
  
  def `object`[T](props: T): T with IObservableObject = js.native
  def `object`[T](
    props: T,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? std.Function}
    */ typingsSlinky.mobx.mobxStrings.observable with TopLevel[js.Any]
  ): T with IObservableObject = js.native
  def `object`[T](
    props: T,
    decorators: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? std.Function}
    */ typingsSlinky.mobx.mobxStrings.observable with TopLevel[js.Any],
    options: CreateObservableOptions
  ): T with IObservableObject = js.native
  def `object`[T](props: T, decorators: js.UndefOr[scala.Nothing], options: CreateObservableOptions): T with IObservableObject = js.native
  
  /**
    * Decorator that creates an observable that only observes the references, but doesn't try to turn the assigned value into an observable.ts.
    */
  def ref(target: js.Object, property: String): Unit = js.native
  def ref(target: js.Object, property: String, descriptor: js.PropertyDescriptor): Unit = js.native
  def ref(target: js.Object, property: js.Symbol): Unit = js.native
  def ref(target: js.Object, property: js.Symbol, descriptor: js.PropertyDescriptor): Unit = js.native
  /**
    * Decorator that creates an observable that only observes the references, but doesn't try to turn the assigned value into an observable.ts.
    */
  @JSName("ref")
  var ref_Original: IObservableDecorator = js.native
  
  def set[T](): ObservableSet[T] = js.native
  def set[T](initialValues: js.UndefOr[IObservableSetInitialValues[T]], options: CreateObservableOptions): ObservableSet[T] = js.native
  def set[T](initialValues: IObservableSetInitialValues[T]): ObservableSet[T] = js.native
  
  /**
    * Decorator that creates an observable converts its value (objects, maps or arrays) into a shallow observable structure
    */
  def shallow(target: js.Object, property: String): Unit = js.native
  def shallow(target: js.Object, property: String, descriptor: js.PropertyDescriptor): Unit = js.native
  def shallow(target: js.Object, property: js.Symbol): Unit = js.native
  def shallow(target: js.Object, property: js.Symbol, descriptor: js.PropertyDescriptor): Unit = js.native
  /**
    * Decorator that creates an observable converts its value (objects, maps or arrays) into a shallow observable structure
    */
  @JSName("shallow")
  var shallow_Original: IObservableDecorator = js.native
  
  def struct(target: js.Object, property: String): Unit = js.native
  def struct(target: js.Object, property: String, descriptor: js.PropertyDescriptor): Unit = js.native
  def struct(target: js.Object, property: js.Symbol): Unit = js.native
  def struct(target: js.Object, property: js.Symbol, descriptor: js.PropertyDescriptor): Unit = js.native
  @JSName("struct")
  var struct_Original: IObservableDecorator = js.native
}
