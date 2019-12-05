package typingsSlinky.mobservable

import typingsSlinky.mobservable.libCoreMod.ValueMode
import typingsSlinky.mobservable.libCoreMod.ValueType
import typingsSlinky.mobservable.libInterfacesMod.IArrayChange
import typingsSlinky.mobservable.libInterfacesMod.IArraySplice
import typingsSlinky.mobservable.libInterfacesMod.IContextInfoStruct
import typingsSlinky.mobservable.libInterfacesMod.IObjectChange
import typingsSlinky.mobservable.libInterfacesMod.IObservableArray
import typingsSlinky.mobservable.libInterfacesMod.IObservableValue
import typingsSlinky.mobservable.libInterfacesMod.Lambda
import typingsSlinky.mobservable.libObservablemapMod.KeyValueMap
import typingsSlinky.mobservable.libObservablemapMod.ObservableMap
import typingsSlinky.mobservable.libObservablevalueMod.ObservableValue
import typingsSlinky.mobservable.libObservableviewMod.ObservableView
import typingsSlinky.std.Date
import typingsSlinky.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable/lib/core", JSImport.Namespace)
@js.native
object libCoreMod extends js.Object {
  @js.native
  class AsFlat protected () extends js.Object {
    def this(value: js.Any) = this()
    var value: js.Any = js.native
  }
  
  @js.native
  class AsReference protected () extends js.Object {
    def this(value: js.Any) = this()
    var value: js.Any = js.native
  }
  
  @js.native
  class AsStructure protected () extends js.Object {
    def this(value: js.Any) = this()
    var value: js.Any = js.native
  }
  
  @js.native
  sealed trait ValueMode extends js.Object
  
  @js.native
  sealed trait ValueType extends js.Object
  
  def asFlat[T](value: T): T = js.native
  def asReference[T](value: T): T = js.native
  def asStructure[T](value: T): T = js.native
  def assertUnwrapped(value: js.Any, message: js.Any): Unit = js.native
  def autorun(view: Lambda): Lambda = js.native
  def autorun(view: Lambda, scope: js.Any): Lambda = js.native
  def autorunAsync(func: Lambda): Lambda = js.native
  def autorunAsync(func: Lambda, delay: Double): Lambda = js.native
  def autorunAsync(func: Lambda, delay: Double, scope: js.Any): Lambda = js.native
  def autorunAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit]): Lambda = js.native
  def autorunAsync[T](view: js.Function0[T], effect: js.Function1[/* latestValue */ T, Unit], delay: Double): Lambda = js.native
  def autorunAsync[T](
    view: js.Function0[T],
    effect: js.Function1[/* latestValue */ T, Unit],
    delay: Double,
    scope: js.Any
  ): Lambda = js.native
  def autorunUntil(predicate: js.Function0[Boolean], effect: Lambda): Lambda = js.native
  def autorunUntil(predicate: js.Function0[Boolean], effect: Lambda, scope: js.Any): Lambda = js.native
  def expr[T](expr: js.Function0[T]): T = js.native
  def expr[T](expr: js.Function0[T], scope: js.Any): T = js.native
  def extendObservable[A /* <: js.Object */, B /* <: js.Object */](target: A, properties: B*): A with B = js.native
  def extendObservableHelper(target: js.Any, properties: js.Any, mode: ValueMode, context: IContextInfoStruct): js.Object = js.native
  def fastArray[V](): IObservableArray[V] = js.native
  def fastArray[V](initialValues: js.Array[V]): IObservableArray[V] = js.native
  def getStrict(): Boolean = js.native
  def getTypeOfValue(value: js.Any): ValueType = js.native
  def getValueModeFromModifierFunc(): ValueMode = js.native
  def getValueModeFromModifierFunc(func: js.Function): ValueMode = js.native
  def getValueModeFromValue(value: js.Any, defaultMode: ValueMode): js.Tuple2[ValueMode, _] = js.native
  def isObservable(value: js.Any): Boolean = js.native
  def isObservable(value: js.Any, property: String): Boolean = js.native
  def isObservableArray(thing: js.Any): Boolean = js.native
  def isObservableMap(thing: js.Any): Boolean = js.native
  def isObservableObject(thing: js.Any): Boolean = js.native
  def makeChildObservable(value: js.Any, parentMode: ValueMode, context: js.Any): js.Any = js.native
  def map[V](): ObservableMap[V] = js.native
  def map[V](initialValues: KeyValueMap[V]): ObservableMap[V] = js.native
  def map[V](initialValues: KeyValueMap[V], valueModifier: js.Function): ObservableMap[V] = js.native
  def observable(target: js.Object, key: String): js.Any = js.native
  def observable(target: js.Object, key: String, baseDescriptor: js.PropertyDescriptor): js.Any = js.native
  def observable(value: String): IObservableValue[String] = js.native
  def observable(value: js.Function): IObservableValue[js.Function] = js.native
  def observable(value: Boolean): IObservableValue[Boolean] = js.native
  def observable(value: Double): IObservableValue[Double] = js.native
  def observable(value: Unit): IObservableValue[Unit] = js.native
  def observable(value: Date): IObservableValue[js.Date] = js.native
  def observable(value: RegExp): IObservableValue[js.RegExp] = js.native
  def observable[T /* <: js.Object */](value: T): T = js.native
  def observable[T](value: js.Array[T]): IObservableArray[T] = js.native
  def observable[T, S /* <: js.Object */](value: js.Function0[T]): IObservableValue[T] = js.native
  def observable[T, S /* <: js.Object */](value: js.Function0[T], thisArg: S): IObservableValue[T] = js.native
  def observe(func: js.Function0[Unit]): Lambda = js.native
  def observe[T /* <: js.Object */](`object`: T, listener: js.Function1[/* change */ IObjectChange[_, T], Unit]): Lambda = js.native
  def observe[T](
    observableArray: IObservableArray[T],
    listener: js.Function1[/* change */ IArrayChange[T] | IArraySplice[T], Unit]
  ): Lambda = js.native
  def observe[T](
    observableMap: ObservableMap[T],
    listener: js.Function1[/* change */ IObjectChange[T, ObservableMap[T]], Unit]
  ): Lambda = js.native
  def observe[T /* <: js.Object */, Y](
    `object`: T,
    prop: String,
    listener: js.Function2[/* newValue */ Y, /* oldValue */ js.UndefOr[Y], Unit]
  ): Lambda = js.native
  def toGetterSetterFunction[T](observable: ObservableValue[T]): IObservableValue[T] = js.native
  def toGetterSetterFunction[T](observable: ObservableView[T]): IObservableValue[T] = js.native
  def toJSON(source: js.Any): js.Any = js.native
  def toJSON(source: js.Any, detectCycles: Boolean): js.Any = js.native
  def toJSON(source: js.Any, detectCycles: Boolean, __alreadySeen: js.Array[js.Tuple2[_, _]]): js.Any = js.native
  def withStrict(newStrict: Boolean, func: Lambda): Unit = js.native
  @js.native
  object ValueMode extends js.Object {
    @js.native
    sealed trait Flat extends ValueMode
    
    @js.native
    sealed trait Recursive extends ValueMode
    
    @js.native
    sealed trait Reference extends ValueMode
    
    @js.native
    sealed trait Structure extends ValueMode
    
    /* 3 */ val Flat: typingsSlinky.mobservable.libCoreMod.ValueMode.Flat with Double = js.native
    /* 0 */ val Recursive: typingsSlinky.mobservable.libCoreMod.ValueMode.Recursive with Double = js.native
    /* 1 */ val Reference: typingsSlinky.mobservable.libCoreMod.ValueMode.Reference with Double = js.native
    /* 2 */ val Structure: typingsSlinky.mobservable.libCoreMod.ValueMode.Structure with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ValueMode with Double] = js.native
  }
  
  @js.native
  object ValueType extends js.Object {
    @js.native
    sealed trait Array extends ValueType
    
    @js.native
    sealed trait ComplexFunction extends ValueType
    
    @js.native
    sealed trait ComplexObject extends ValueType
    
    @js.native
    sealed trait PlainObject extends ValueType
    
    @js.native
    sealed trait Reference extends ValueType
    
    @js.native
    sealed trait ViewFunction extends ValueType
    
    /* 3 */ val Array: typingsSlinky.mobservable.libCoreMod.ValueType.Array with Double = js.native
    /* 5 */ val ComplexFunction: typingsSlinky.mobservable.libCoreMod.ValueType.ComplexFunction with Double = js.native
    /* 2 */ val ComplexObject: typingsSlinky.mobservable.libCoreMod.ValueType.ComplexObject with Double = js.native
    /* 1 */ val PlainObject: typingsSlinky.mobservable.libCoreMod.ValueType.PlainObject with Double = js.native
    /* 0 */ val Reference: typingsSlinky.mobservable.libCoreMod.ValueType.Reference with Double = js.native
    /* 4 */ val ViewFunction: typingsSlinky.mobservable.libCoreMod.ValueType.ViewFunction with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ValueType with Double] = js.native
  }
  
}

