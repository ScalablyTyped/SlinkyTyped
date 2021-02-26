package typingsSlinky.ow

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.ow.basePredicateMod.BasePredicate
import typingsSlinky.ow.modifiersMod.Modifiers
import typingsSlinky.ow.predicateMod.PredicateOptions
import typingsSlinky.ow.predicatesMod.Predicates
import typingsSlinky.std.ArrayBufferLike
import typingsSlinky.typeFest.basicMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("ow", JSImport.Default)
  @js.native
  val default: Ow = js.native
  
  @JSImport("ow", "AnyPredicate")
  @js.native
  class AnyPredicate[T] protected ()
    extends typingsSlinky.ow.anyMod.AnyPredicate[T] {
    def this(predicates: js.Array[BasePredicate[_]]) = this()
    def this(predicates: js.Array[BasePredicate[_]], options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "ArgumentError")
  @js.native
  class ArgumentError protected ()
    extends typingsSlinky.ow.argumentErrorMod.ArgumentError {
    def this(message: String, context: js.Function) = this()
  }
  
  @JSImport("ow", "ArrayBufferPredicate")
  @js.native
  class ArrayBufferPredicate[T /* <: ArrayBufferLike */] protected ()
    extends typingsSlinky.ow.arrayBufferMod.ArrayBufferPredicate[T] {
    def this(`type`: String) = this()
    def this(`type`: String, options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "ArrayPredicate")
  @js.native
  /**
    @hidden
    */
  class ArrayPredicate[T] ()
    extends typingsSlinky.ow.arrayMod.ArrayPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "BooleanPredicate")
  @js.native
  /**
    @hidden
    */
  class BooleanPredicate ()
    extends typingsSlinky.ow.booleanMod.BooleanPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "DataViewPredicate")
  @js.native
  /**
    @hidden
    */
  class DataViewPredicate ()
    extends typingsSlinky.ow.dataViewMod.DataViewPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "DatePredicate")
  @js.native
  /**
    @hidden
    */
  class DatePredicate ()
    extends typingsSlinky.ow.dateMod.DatePredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "ErrorPredicate")
  @js.native
  /**
    @hidden
    */
  class ErrorPredicate ()
    extends typingsSlinky.ow.errorMod.ErrorPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "MapPredicate")
  @js.native
  /**
    @hidden
    */
  class MapPredicate[T1, T2] ()
    extends typingsSlinky.ow.mapMod.MapPredicate[T1, T2] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "NumberPredicate")
  @js.native
  /**
    @hidden
    */
  class NumberPredicate ()
    extends typingsSlinky.ow.numberMod.NumberPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "ObjectPredicate")
  @js.native
  /**
    @hidden
    */
  class ObjectPredicate ()
    extends typingsSlinky.ow.objectMod.ObjectPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "Predicate")
  @js.native
  class Predicate[T] protected ()
    extends typingsSlinky.ow.predicateMod.Predicate[T] {
    def this(`type`: String) = this()
    def this(`type`: String, options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "SetPredicate")
  @js.native
  /**
    @hidden
    */
  class SetPredicate[T] ()
    extends typingsSlinky.ow.setMod.SetPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "StringPredicate")
  @js.native
  /**
    @hidden
    */
  class StringPredicate ()
    extends typingsSlinky.ow.stringMod.StringPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "TypedArrayPredicate")
  @js.native
  class TypedArrayPredicate[T /* <: TypedArray */] protected ()
    extends typingsSlinky.ow.typedArrayMod.TypedArrayPredicate[T] {
    def this(`type`: String) = this()
    def this(`type`: String, options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "WeakMapPredicate")
  @js.native
  /**
    @hidden
    */
  class WeakMapPredicate[KeyType /* <: js.Object */] ()
    extends typingsSlinky.ow.weakMapMod.WeakMapPredicate[KeyType] {
    def this(options: PredicateOptions) = this()
  }
  
  @JSImport("ow", "WeakSetPredicate")
  @js.native
  /**
    @hidden
    */
  class WeakSetPredicate[T /* <: js.Object */] ()
    extends typingsSlinky.ow.weakSetMod.WeakSetPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  type Main = js.Function3[
    /* value */ js.Any, 
    /* label */ String | js.Function, 
    /* predicate */ BasePredicate[js.Any], 
    Unit
  ]
  
  @js.native
  trait Ow
    extends Modifiers
       with Predicates {
    
    /**
      Test if `value` matches the provided `predicate`. Throws an `ArgumentError` with the specified `label` if the test fails.
      @param value - Value to test.
      @param label - Label which should be used in error messages.
      @param predicate - Predicate to test against.
      */
    def apply[T](value: T, label: String, predicate: BasePredicate[T]): Unit = js.native
    /**
      Test if the value matches the predicate. Throws an `ArgumentError` if the test fails.
      @param value - Value to test.
      @param predicate - Predicate to test against.
      */
    def apply[T](value: T, predicate: BasePredicate[T]): Unit = js.native
    
    /**
      Create a reusable validator.
      @param label - Label which should be used in error messages.
      @param predicate - Predicate used in the validator function.
      */
    def create[T](label: String, predicate: BasePredicate[T]): ReusableValidator[T] = js.native
    /**
      Create a reusable validator.
      @param predicate - Predicate used in the validator function.
      */
    def create[T](predicate: BasePredicate[T]): ReusableValidator[T] = js.native
    
    /**
      Returns `true` if the value matches the predicate, otherwise returns `false`.
      @param value - Value to test.
      @param predicate - Predicate to test against.
      */
    def isValid[T](value: T, predicate: BasePredicate[T]): /* is T */ Boolean = js.native
  }
  
  type ReusableValidator[T] = js.Function2[/* value */ T, /* label */ js.UndefOr[String], Unit]
  
  type _To = Ow
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Ow = default
}
