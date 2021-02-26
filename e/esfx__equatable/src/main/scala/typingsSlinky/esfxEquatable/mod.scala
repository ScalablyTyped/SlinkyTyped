package typingsSlinky.esfxEquatable

import typingsSlinky.esfxEquatable.distMod.Comparison
import typingsSlinky.esfxEquatable.distMod.EqualityComparison
import typingsSlinky.esfxEquatable.distMod.HashGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Comparable {
    
    /**
      * A well-known symbol used to define a relational comparison method on a value.
      */
    @JSImport("@esfx/equatable", "Comparable.compareTo")
    @js.native
    val compareTo: js.Symbol = js.native
    
    /**
      * Determines whether a value is Comparable.
      */
    @JSImport("@esfx/equatable", "Comparable.hasInstance")
    @js.native
    def hasInstance(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.Comparable */ Boolean = js.native
    
    /**
      * Determines whether a value is Comparable.
      * @deprecated Use `Comparable.hasInstance` instead.
      */
    @JSImport("@esfx/equatable", "Comparable.isComparable")
    @js.native
    def isComparable(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.Comparable */ Boolean = js.native
    
    @JSImport("@esfx/equatable", "Comparable.name")
    @js.native
    val name: /* "Comparable" */ String = js.native
  }
  
  object Comparer {
    
    /**
      * Creates a `Comparer` from a comparison function.
      */
    @JSImport("@esfx/equatable", "Comparer.create")
    @js.native
    def create[T](comparison: Comparison[T]): typingsSlinky.esfxEquatable.distMod.Comparer[T] = js.native
    
    /**
      * The default `Comparer`.
      */
    @JSImport("@esfx/equatable", "Comparer.defaultComparer")
    @js.native
    val defaultComparer: typingsSlinky.esfxEquatable.distMod.Comparer[js.Any] = js.native
    
    /**
      * A default `Comparer` that supports `StructuralComparable` values.
      */
    @JSImport("@esfx/equatable", "Comparer.structuralComparer")
    @js.native
    val structuralComparer: typingsSlinky.esfxEquatable.distMod.Comparer[js.Any] = js.native
    
    /**
      * A default `Comparer` that compares array values rather than the arrays themselves.
      */
    @JSImport("@esfx/equatable", "Comparer.tupleComparer")
    @js.native
    val tupleComparer: typingsSlinky.esfxEquatable.distMod.Comparer[js.Array[js.Any]] = js.native
    
    /**
      * A default `Comparer` that compares array values that may be `StructuralComparable` rather than the arrays themselves.
      */
    @JSImport("@esfx/equatable", "Comparer.tupleStructuralComparer")
    @js.native
    val tupleStructuralComparer: typingsSlinky.esfxEquatable.distMod.Comparer[js.Array[js.Any]] = js.native
  }
  
  object Equaler {
    
    /**
      * Creates an `Equaler` from a comparison function and an optional hash generator.
      */
    @JSImport("@esfx/equatable", "Equaler.create")
    @js.native
    def create[T](equalityComparison: EqualityComparison[T]): typingsSlinky.esfxEquatable.distMod.Equaler[T] = js.native
    @JSImport("@esfx/equatable", "Equaler.create")
    @js.native
    def create[T](equalityComparison: EqualityComparison[T], hashGenerator: HashGenerator[T]): typingsSlinky.esfxEquatable.distMod.Equaler[T] = js.native
    
    /**
      * Gets the default `Equaler`.
      */
    @JSImport("@esfx/equatable", "Equaler.defaultEqualer")
    @js.native
    val defaultEqualer: typingsSlinky.esfxEquatable.distMod.Equaler[js.Any] = js.native
    
    /**
      * Gets a default `Equaler` that supports `StructuralEquatable` values.
      */
    @JSImport("@esfx/equatable", "Equaler.structuralEqualer")
    @js.native
    val structuralEqualer: typingsSlinky.esfxEquatable.distMod.Equaler[js.Any] = js.native
    
    /**
      * An `Equaler` that compares array values rather than the arrays themselves.
      */
    @JSImport("@esfx/equatable", "Equaler.tupleEqualer")
    @js.native
    val tupleEqualer: typingsSlinky.esfxEquatable.distMod.Equaler[js.Array[js.Any]] = js.native
    
    /**
      * An `Equaler` that compares array values that may be `StructuralEquatable` rather than the arrays themselves.
      */
    @JSImport("@esfx/equatable", "Equaler.tupleStructuralEqualer")
    @js.native
    val tupleStructuralEqualer: typingsSlinky.esfxEquatable.distMod.Equaler[js.Array[js.Any]] = js.native
  }
  
  object Equatable {
    
    /**
      * A well-known symbol used to define an equality test method on a value.
      */
    @JSImport("@esfx/equatable", "Equatable.equals")
    @js.native
    val equals_ : js.Symbol = js.native
    
    /**
      * Determines whether a value is Equatable.
      */
    @JSImport("@esfx/equatable", "Equatable.hasInstance")
    @js.native
    def hasInstance(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.Equatable */ Boolean = js.native
    
    /**
      * A well-known symbol used to define a hashing method on a value.
      */
    @JSImport("@esfx/equatable", "Equatable.hash")
    @js.native
    val hash: js.Symbol = js.native
    
    /**
      * Determines whether a value is Equatable.
      * @deprecated Use `Equatable.hasInstance` instead.
      */
    @JSImport("@esfx/equatable", "Equatable.isEquatable")
    @js.native
    def isEquatable(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.Equatable */ Boolean = js.native
    
    @JSImport("@esfx/equatable", "Equatable.name")
    @js.native
    val name: /* "Equatable" */ String = js.native
  }
  
  object StructuralComparable {
    
    /**
      * Determines whether a value is StructuralComparable.
      */
    @JSImport("@esfx/equatable", "StructuralComparable.hasInstance")
    @js.native
    def hasInstance(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.StructuralComparable */ Boolean = js.native
    
    /**
      * Determines whether a value is StructuralComparable.
      * @deprecated Use `StructuralComparable.hasInstance` instead.
      */
    @JSImport("@esfx/equatable", "StructuralComparable.isStructuralComparable")
    @js.native
    def isStructuralComparable(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.StructuralComparable */ Boolean = js.native
    
    @JSImport("@esfx/equatable", "StructuralComparable.name")
    @js.native
    val name: /* "StructuralComparable" */ String = js.native
    
    /**
      * A well-known symbol used to define a structural comparison method on a value.
      */
    @JSImport("@esfx/equatable", "StructuralComparable.structuralCompareTo")
    @js.native
    val structuralCompareTo: js.Symbol = js.native
  }
  
  object StructuralEquatable {
    
    /**
      * Determines whether a value is StructuralEquatable.
      */
    @JSImport("@esfx/equatable", "StructuralEquatable.hasInstance")
    @js.native
    def hasInstance(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.StructuralEquatable */ Boolean = js.native
    
    /**
      * Determines whether a value is StructuralEquatable.
      * @deprecated Use `StructuralEquatable.hasInstance` instead.
      */
    @JSImport("@esfx/equatable", "StructuralEquatable.isStructuralEquatable")
    @js.native
    def isStructuralEquatable(value: js.Any): /* is @esfx/equatable.@esfx/equatable/dist.StructuralEquatable */ Boolean = js.native
    
    @JSImport("@esfx/equatable", "StructuralEquatable.name")
    @js.native
    val name: /* "StructuralEquatable" */ String = js.native
    
    /**
      * A well-known symbol used to define a structural equality test method on a value.
      */
    @JSImport("@esfx/equatable", "StructuralEquatable.structuralEquals")
    @js.native
    val structuralEquals: js.Symbol = js.native
    
    /**
      * A well-known symbol used to define a structural hashing method on a value.
      */
    @JSImport("@esfx/equatable", "StructuralEquatable.structuralHash")
    @js.native
    val structuralHash: js.Symbol = js.native
  }
}
