package typingsSlinky.immer

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.immer.anon.AutoFreeze
import typingsSlinky.immer.immerStrings.add
import typingsSlinky.immer.immerStrings.remove
import typingsSlinky.immer.immerStrings.replace
import typingsSlinky.std.Array
import typingsSlinky.std.Exclude
import typingsSlinky.std.Map
import typingsSlinky.std.Number
import typingsSlinky.std.Set
import typingsSlinky.std.WeakMap
import typingsSlinky.std.WeakSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("immer", JSImport.Default)
  @js.native
  val default: IProduce = js.native
  
  @JSImport("immer", "Immer")
  @js.native
  class Immer protected () extends StObject {
    def this(config: AutoFreeze) = this()
    
    /**
      * When true, `produce` will freeze the copies it creates.
      */
    val autoFreeze: Boolean = js.native
    
    /**
      * The `produce` function takes a value and a "recipe function" (whose
      * return value often depends on the base state). The recipe function is
      * free to mutate its first argument however it wants. All mutations are
      * only ever applied to a __copy__ of the base state.
      *
      * Pass only a function to create a "curried producer" which relieves you
      * from passing the recipe function every time.
      *
      * Only plain objects and arrays are made mutable. All other objects are
      * considered uncopyable.
      *
      * Note: This function is __bound__ to its `Immer` instance.
      *
      * @param {any} base - the initial state
      * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
      * @param {Function} patchListener - optional function that will be called with all the patches produced here
      * @returns {any} a new state, or the initial state if nothing was modified
      */
    /**
      * The `produce` function takes a value and a "recipe function" (whose
      * return value often depends on the base state). The recipe function is
      * free to mutate its first argument however it wants. All mutations are
      * only ever applied to a __copy__ of the base state.
      *
      * Pass only a function to create a "curried producer" which relieves you
      * from passing the recipe function every time.
      *
      * Only plain objects and arrays are made mutable. All other objects are
      * considered uncopyable.
      *
      * Note: This function is __bound__ to its `Immer` instance.
      *
      * @param {any} base - the initial state
      * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
      * @param {Function} patchListener - optional function that will be called with all the patches produced here
      * @returns {any} a new state, or the initial state if nothing was modified
      */
    def produce[Base, Proxy, Return](base: Base, recipe: js.ThisFunction1[/* this */ Proxy, /* draft */ Proxy, Return]): Produced[Base, Return] = js.native
    def produce[Base, Proxy, Return](
      base: Base,
      recipe: js.ThisFunction1[/* this */ Proxy, /* draft */ Proxy, Return],
      listener: PatchListener
    ): Produced[Base, Return] = js.native
    /** Curried producer */
    /**
      * The `produce` function takes a value and a "recipe function" (whose
      * return value often depends on the base state). The recipe function is
      * free to mutate its first argument however it wants. All mutations are
      * only ever applied to a __copy__ of the base state.
      *
      * Pass only a function to create a "curried producer" which relieves you
      * from passing the recipe function every time.
      *
      * Only plain objects and arrays are made mutable. All other objects are
      * considered uncopyable.
      *
      * Note: This function is __bound__ to its `Immer` instance.
      *
      * @param {any} base - the initial state
      * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
      * @param {Function} patchListener - optional function that will be called with all the patches produced here
      * @returns {any} a new state, or the initial state if nothing was modified
      */
    def produce[Default, Base, Rest /* <: js.Array[_] */, Return](recipe: js.ThisFunction2[/* this */ Draft[Base], /* draft */ Draft[Base], /* rest */ Rest, Return]): js.Function2[/* base */ js.UndefOr[Base], /* rest */ Rest, Produced[Base, Return]] = js.native
    def produce[Default, Base, Rest /* <: js.Array[_] */, Return](
      recipe: js.ThisFunction2[/* this */ Draft[Base], /* draft */ Draft[Base], /* rest */ Rest, Return],
      defaultBase: Default
    ): js.Function2[/* base */ js.UndefOr[Base], /* rest */ Rest, Produced[Base, Return]] = js.native
    /**
      * The `produce` function takes a value and a "recipe function" (whose
      * return value often depends on the base state). The recipe function is
      * free to mutate its first argument however it wants. All mutations are
      * only ever applied to a __copy__ of the base state.
      *
      * Pass only a function to create a "curried producer" which relieves you
      * from passing the recipe function every time.
      *
      * Only plain objects and arrays are made mutable. All other objects are
      * considered uncopyable.
      *
      * Note: This function is __bound__ to its `Immer` instance.
      *
      * @param {any} base - the initial state
      * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
      * @param {Function} patchListener - optional function that will be called with all the patches produced here
      * @returns {any} a new state, or the initial state if nothing was modified
      */
    @JSName("produce")
    var produce_Original: IProduce = js.native
    
    /**
      * Pass true to automatically freeze all copies created by Immer.
      *
      * By default, auto-freezing is disabled in production.
      */
    def setAutoFreeze(autoFreeze: Boolean): Unit = js.native
    
    /**
      * Pass true to use the ES2015 `Proxy` class when creating drafts, which is
      * always faster than using ES5 proxies.
      *
      * By default, feature detection is used, so calling this is rarely necessary.
      */
    def setUseProxies(useProxies: Boolean): Unit = js.native
    
    /**
      * When true, drafts are ES2015 proxies.
      */
    val useProxies: Boolean = js.native
  }
  
  @JSImport("immer", "applyPatches")
  @js.native
  def applyPatches[S](base: S, patches: js.Array[Patch]): S = js.native
  
  @JSImport("immer", "isDraft")
  @js.native
  def isDraft(value: js.Any): Boolean = js.native
  
  @JSImport("immer", "nothing")
  @js.native
  val nothing: Nothing_ = js.native
  
  @JSImport("immer", "original")
  @js.native
  def original[T](value: T): T | Unit = js.native
  
  @JSImport("immer", "produce")
  @js.native
  val produce: IProduce = js.native
  
  @JSImport("immer", "setAutoFreeze")
  @js.native
  def setAutoFreeze(autoFreeze: Boolean): Unit = js.native
  
  @JSImport("immer", "setUseProxies")
  @js.native
  def setUseProxies(useProxies: Boolean): Unit = js.native
  
  type ArrayMethod = Exclude[/* keyof [] */ String, Double]
  
  type AtomicObject = js.Function | (Map[js.Any, js.Any]) | (WeakMap[js.Any, js.Any]) | Set[js.Any] | WeakSet[js.Any] | js.Promise[js.Any] | js.Date | js.RegExp | Boolean | Number | String
  
  type Draft[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias immer.immer.Draft<T[P]> * / object}
    */ typingsSlinky.immer.immerStrings.Draft with TopLevel[js.Any]) | DraftTuple[T] | DraftArray[T]
  
  @js.native
  trait DraftArray[T /* <: js.Array[_] */]
    extends Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ P in immer.immer.Indices<T> ]: immer.immer.Draft<T[P]>}[immer.immer.Indices<T>] */ js.Any
        ]
  
  type DraftTuple[T /* <: js.Array[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: P extends immer.immer.Indices<T>? immer.immer.Draft<T[P]> : never}
    */ typingsSlinky.immer.immerStrings.DraftTuple with TopLevel[T]
  
  /** Converts `nothing` into `undefined` */
  type FromNothing[T] = js.UndefOr[T | (Exclude[T, Nothing_])]
  
  /** Includes 1 when `void` or `undefined` exists in type `T` */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.immer.immerNumbers.`0`
    - typingsSlinky.immer.immerNumbers.`1`
  */
  trait HasVoidLike[T] extends StObject
  
  @js.native
  trait IProduce extends StObject {
    
    /**
      * The `produce` function takes a value and a "recipe function" (whose
      * return value often depends on the base state). The recipe function is
      * free to mutate its first argument however it wants. All mutations are
      * only ever applied to a __copy__ of the base state.
      *
      * Pass only a function to create a "curried producer" which relieves you
      * from passing the recipe function every time.
      *
      * Only plain objects and arrays are made mutable. All other objects are
      * considered uncopyable.
      *
      * Note: This function is __bound__ to its `Immer` instance.
      *
      * @param {any} base - the initial state
      * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
      * @param {Function} patchListener - optional function that will be called with all the patches produced here
      * @returns {any} a new state, or the initial state if nothing was modified
      */
    def apply[Base, Proxy, Return](base: Base, recipe: js.ThisFunction1[/* this */ Proxy, /* draft */ Proxy, Return]): Produced[Base, Return] = js.native
    def apply[Base, Proxy, Return](
      base: Base,
      recipe: js.ThisFunction1[/* this */ Proxy, /* draft */ Proxy, Return],
      listener: PatchListener
    ): Produced[Base, Return] = js.native
    /** Curried producer */
    def apply[Default, Base, Rest /* <: js.Array[_] */, Return](recipe: js.ThisFunction2[/* this */ Draft[Base], /* draft */ Draft[Base], /* rest */ Rest, Return]): js.Function2[/* base */ js.UndefOr[Base], /* rest */ Rest, Produced[Base, Return]] = js.native
    def apply[Default, Base, Rest /* <: js.Array[_] */, Return](
      recipe: js.ThisFunction2[/* this */ Draft[Base], /* draft */ Draft[Base], /* rest */ Rest, Return],
      defaultBase: Default
    ): js.Function2[/* base */ js.UndefOr[Base], /* rest */ Rest, Produced[Base, Return]] = js.native
  }
  
  @js.native
  trait ImmerState[T] extends StObject {
    
    var assigned: StringDictionary[Boolean] = js.native
    
    var base: T = js.native
    
    var copy: T = js.native
    
    var parent: js.UndefOr[ImmerState[_]] = js.native
  }
  object ImmerState {
    
    @scala.inline
    def apply[T](assigned: StringDictionary[Boolean], base: T, copy: T): ImmerState[T] = {
      val __obj = js.Dynamic.literal(assigned = assigned.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImmerState[T]]
    }
    
    @scala.inline
    implicit class ImmerStateMutableBuilder[Self <: ImmerState[_], T] (val x: Self with ImmerState[T]) extends AnyVal {
      
      @scala.inline
      def setAssigned(value: StringDictionary[Boolean]): Self = StObject.set(x, "assigned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase(value: T): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopy(value: T): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: ImmerState[_]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    }
  }
  
  type Indices[T] = Exclude[/* keyof T */ String, ArrayMethod]
  
  /** Includes 1 when type `T` is `void` or `undefined` (or both) */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.immer.immerNumbers.`0`
    - typingsSlinky.immer.immerNumbers.`1`
  */
  trait IsVoidLike[T] extends StObject
  
  /** Use a class type for `nothing` so its type is unique */
  @js.native
  trait Nothing_ extends StObject {
    
    // This lets us do `Exclude<T, Nothing>`
    @JSName("_")
    var _underscore: js.Any = js.native
  }
  object Nothing_ {
    
    @scala.inline
    def apply(_underscore: js.Any): Nothing_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[Nothing_]
    }
    
    @scala.inline
    implicit class Nothing_MutableBuilder[Self <: Nothing_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_underscore(value: js.Any): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Patch extends StObject {
    
    var op: replace | remove | add = js.native
    
    var path: js.Array[String | Double] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object Patch {
    
    @scala.inline
    def apply(op: replace | remove | add, path: js.Array[String | Double]): Patch = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Patch]
    }
    
    @scala.inline
    implicit class PatchMutableBuilder[Self <: Patch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOp(value: replace | remove | add): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type PatchListener = js.Function2[/* patches */ js.Array[Patch], /* inversePatches */ js.Array[Patch], Unit]
  
  /** The inferred return type of `produce` */
  type Produced[Base, Return] = (FromNothing[(Exclude[Return, Unit]) | Return]) | Base
  
  type _To = IProduce
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: IProduce = default
}
