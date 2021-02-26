package typingsSlinky.joi

import typingsSlinky.joi.joiBooleans.`false`
import typingsSlinky.joi.mod.AlternativesSchema
import typingsSlinky.joi.mod.AnySchema
import typingsSlinky.joi.mod.ArraySchema
import typingsSlinky.joi.mod.BinarySchema
import typingsSlinky.joi.mod.BooleanSchema
import typingsSlinky.joi.mod.CustomHelpers
import typingsSlinky.joi.mod.DateSchema
import typingsSlinky.joi.mod.ExtensionBoundSchema
import typingsSlinky.joi.mod.FunctionSchema
import typingsSlinky.joi.mod.LinkSchema
import typingsSlinky.joi.mod.NumberSchema
import typingsSlinky.joi.mod.ObjectSchema
import typingsSlinky.joi.mod.StringSchema
import typingsSlinky.joi.mod.SymbolSchema
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Alternatives extends StObject {
    
    var alternatives: AlternativesSchema = js.native
    
    var any: AnySchema = js.native
    
    var array: ArraySchema = js.native
    
    var binary: BinarySchema = js.native
    
    var boolean: BooleanSchema = js.native
    
    var date: DateSchema = js.native
    
    var function: FunctionSchema = js.native
    
    var link: LinkSchema = js.native
    
    var number: NumberSchema = js.native
    
    var `object`: ObjectSchema[_] = js.native
    
    var string: StringSchema = js.native
    
    var symbol: SymbolSchema = js.native
  }
  object Alternatives {
    
    @scala.inline
    def apply(
      alternatives: AlternativesSchema,
      any: AnySchema,
      array: ArraySchema,
      binary: BinarySchema,
      boolean: BooleanSchema,
      date: DateSchema,
      function: FunctionSchema,
      link: LinkSchema,
      number: NumberSchema,
      `object`: ObjectSchema[_],
      string: StringSchema,
      symbol: SymbolSchema
    ): Alternatives = {
      val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alternatives]
    }
    
    @scala.inline
    implicit class AlternativesMutableBuilder[Self <: Alternatives] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlternatives(value: AlternativesSchema): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAny(value: AnySchema): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArray(value: ArraySchema): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinary(value: BinarySchema): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoolean(value: BooleanSchema): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: DateSchema): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunction(value: FunctionSchema): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: LinkSchema): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: NumberSchema): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: ObjectSchema[_]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString(value: StringSchema): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbol(value: SymbolSchema): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Array extends StObject {
    
    /**
      * the characters used around array avlues. Defaults to `'[]'`
      *
      * @default '[]'
      */
    var array: js.UndefOr[String | `false`] = js.native
    
    /**
      * the characters used around `{#label}` references. Defaults to `'"'`.
      *
      * @default '"'
      */
    var label: js.UndefOr[String | `false`] = js.native
  }
  object Array {
    
    @scala.inline
    def apply(): Array = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Array]
    }
    
    @scala.inline
    implicit class ArrayMutableBuilder[Self <: Array] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArray(value: String | `false`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
      
      @scala.inline
      def setLabel(value: String | `false`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  @js.native
  trait Arrays extends StObject {
    
    var arrays: js.UndefOr[Boolean] = js.native
    
    var objects: js.UndefOr[Boolean] = js.native
  }
  object Arrays {
    
    @scala.inline
    def apply(): Arrays = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Arrays]
    }
    
    @scala.inline
    implicit class ArraysMutableBuilder[Self <: Arrays] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrays(value: Boolean): Self = StObject.set(x, "arrays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArraysUndefined: Self = StObject.set(x, "arrays", js.undefined)
      
      @scala.inline
      def setObjects(value: Boolean): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    }
  }
  
  @js.native
  trait Build extends StObject {
    
    var build: js.UndefOr[js.Function2[/* obj */ ExtensionBoundSchema, /* desc */ Record[String, _], _]] = js.native
  }
  object Build {
    
    @scala.inline
    def apply(): Build = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Build]
    }
    
    @scala.inline
    implicit class BuildMutableBuilder[Self <: Build] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuild(value: (/* obj */ ExtensionBoundSchema, /* desc */ Record[String, _]) => _): Self = StObject.set(x, "build", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    }
  }
  
  @js.native
  trait From extends StObject {
    
    var from: String = js.native
    
    var to: String = js.native
  }
  object From {
    
    @scala.inline
    def apply(from: String, to: String): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit class FromMutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Global extends StObject {
    
    /**
      * references to the globally provided context preference.
      *
      * @default '$'
      */
    var global: js.UndefOr[String] = js.native
    
    /**
      * references to error-specific or rule specific context.
      *
      * @default '#'
      */
    var local: js.UndefOr[String] = js.native
    
    /**
      * references to the root value being validated.
      *
      * @default '/'
      */
    var root: js.UndefOr[String] = js.native
  }
  object Global {
    
    @scala.inline
    def apply(): Global = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Global]
    }
    
    @scala.inline
    implicit class GlobalMutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobal(value: String): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  @js.native
  trait Override extends StObject {
    
    var `override`: Boolean = js.native
  }
  object Override {
    
    @scala.inline
    def apply(`override`: Boolean): Override = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Override]
    }
    
    @scala.inline
    implicit class OverrideMutableBuilder[Self <: Override] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait To extends StObject {
    
    def from(value: js.Any): js.Any = js.native
    
    def to(value: js.Any, helpers: CustomHelpers[_]): js.Any = js.native
  }
  object To {
    
    @scala.inline
    def apply(from: js.Any => js.Any, to: (js.Any, CustomHelpers[_]) => js.Any): To = {
      val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from), to = js.Any.fromFunction2(to))
      __obj.asInstanceOf[To]
    }
    
    @scala.inline
    implicit class ToMutableBuilder[Self <: To] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: js.Any => js.Any): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTo(value: (js.Any, CustomHelpers[_]) => js.Any): Self = StObject.set(x, "to", js.Any.fromFunction2(value))
    }
  }
}
