package typingsSlinky.coreJs

import typingsSlinky.coreJs.core.Locale
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.IterableIterator
import typingsSlinky.std.MapConstructor
import typingsSlinky.std.PromiseConstructor
import typingsSlinky.std.PropertyDescriptorMap
import typingsSlinky.std.PropertyKey
import typingsSlinky.std.SetConstructor
import typingsSlinky.std.TemplateStringsArray
import typingsSlinky.std.WeakMapConstructor
import typingsSlinky.std.WeakSetConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Acosh extends StObject {
    
    var EPSILON: Double = js.native
    
    var MAX_SAFE_INTEGER: Double = js.native
    
    var MIN_SAFE_INTEGER: Double = js.native
    
    def acosh(x: Double): Double = js.native
    
    def asinh(x: Double): Double = js.native
    
    def atanh(x: Double): Double = js.native
    
    def cbrt(x: Double): Double = js.native
    
    def clz32(x: Double): Double = js.native
    
    def cosh(x: Double): Double = js.native
    
    def expm1(x: Double): Double = js.native
    
    def fround(x: Double): Double = js.native
    
    def hypot(values: Double*): Double = js.native
    
    def imul(x: Double, y: Double): Double = js.native
    
    def isFinite(number: Double): Boolean = js.native
    
    def isInteger(number: Double): Boolean = js.native
    
    def isNaN(number: Double): Boolean = js.native
    
    def isSafeInteger(number: Double): Boolean = js.native
    
    def log10(x: Double): Double = js.native
    
    def log1p(x: Double): Double = js.native
    
    def log2(x: Double): Double = js.native
    
    def parseFloat(string: java.lang.String): Double = js.native
    
    def parseInt(string: java.lang.String): Double = js.native
    def parseInt(string: java.lang.String, radix: Double): Double = js.native
    
    def random(): Double = js.native
    def random(lim: Double): Double = js.native
    
    def sign(x: Double): Double = js.native
    
    def sinh(x: Double): Double = js.native
    
    def tanh(x: Double): Double = js.native
    
    def trunc(x: Double): Double = js.native
  }
  
  @js.native
  trait Asinh extends StObject {
    
    def acosh(x: Double): Double = js.native
    
    def asinh(x: Double): Double = js.native
    
    def atanh(x: Double): Double = js.native
    
    def cbrt(x: Double): Double = js.native
    
    def clz32(x: Double): Double = js.native
    
    def cosh(x: Double): Double = js.native
    
    def expm1(x: Double): Double = js.native
    
    def fround(x: Double): Double = js.native
    
    def hypot(values: Double*): Double = js.native
    
    def imul(x: Double, y: Double): Double = js.native
    
    def log10(x: Double): Double = js.native
    
    def log1p(x: Double): Double = js.native
    
    def log2(x: Double): Double = js.native
    
    def sign(x: Double): Double = js.native
    
    def sinh(x: Double): Double = js.native
    
    def tanh(x: Double): Double = js.native
    
    def trunc(x: Double): Double = js.native
  }
  object Asinh {
    
    @scala.inline
    def apply(
      acosh: Double => Double,
      asinh: Double => Double,
      atanh: Double => Double,
      cbrt: Double => Double,
      clz32: Double => Double,
      cosh: Double => Double,
      expm1: Double => Double,
      fround: Double => Double,
      hypot: /* repeated */ Double => Double,
      imul: (Double, Double) => Double,
      log10: Double => Double,
      log1p: Double => Double,
      log2: Double => Double,
      sign: Double => Double,
      sinh: Double => Double,
      tanh: Double => Double,
      trunc: Double => Double
    ): Asinh = {
      val __obj = js.Dynamic.literal(acosh = js.Any.fromFunction1(acosh), asinh = js.Any.fromFunction1(asinh), atanh = js.Any.fromFunction1(atanh), cbrt = js.Any.fromFunction1(cbrt), clz32 = js.Any.fromFunction1(clz32), cosh = js.Any.fromFunction1(cosh), expm1 = js.Any.fromFunction1(expm1), fround = js.Any.fromFunction1(fround), hypot = js.Any.fromFunction1(hypot), imul = js.Any.fromFunction2(imul), log10 = js.Any.fromFunction1(log10), log1p = js.Any.fromFunction1(log1p), log2 = js.Any.fromFunction1(log2), sign = js.Any.fromFunction1(sign), sinh = js.Any.fromFunction1(sinh), tanh = js.Any.fromFunction1(tanh), trunc = js.Any.fromFunction1(trunc))
      __obj.asInstanceOf[Asinh]
    }
    
    @scala.inline
    implicit class AsinhMutableBuilder[Self <: Asinh] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcosh(value: Double => Double): Self = StObject.set(x, "acosh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAsinh(value: Double => Double): Self = StObject.set(x, "asinh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAtanh(value: Double => Double): Self = StObject.set(x, "atanh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCbrt(value: Double => Double): Self = StObject.set(x, "cbrt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClz32(value: Double => Double): Self = StObject.set(x, "clz32", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCosh(value: Double => Double): Self = StObject.set(x, "cosh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpm1(value: Double => Double): Self = StObject.set(x, "expm1", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFround(value: Double => Double): Self = StObject.set(x, "fround", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHypot(value: /* repeated */ Double => Double): Self = StObject.set(x, "hypot", js.Any.fromFunction1(value))
      
      @scala.inline
      def setImul(value: (Double, Double) => Double): Self = StObject.set(x, "imul", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLog10(value: Double => Double): Self = StObject.set(x, "log10", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLog1p(value: Double => Double): Self = StObject.set(x, "log1p", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLog2(value: Double => Double): Self = StObject.set(x, "log2", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSign(value: Double => Double): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSinh(value: Double => Double): Self = StObject.set(x, "sinh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTanh(value: Double => Double): Self = StObject.set(x, "tanh", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTrunc(value: Double => Double): Self = StObject.set(x, "trunc", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Assign extends StObject {
    
    def assign(target: js.Any, sources: js.Any*): js.Any = js.native
    
    def classof(value: js.Any): java.lang.String = js.native
    
    def create(o: js.Any): js.Any = js.native
    def create(o: js.Any, properties: PropertyDescriptorMap): js.Any = js.native
    
    def define[T](target: T, mixin: js.Any): T = js.native
    
    def defineProperties(o: js.Any, properties: PropertyDescriptorMap): js.Any = js.native
    
    def defineProperty(o: js.Any, propertyKey: PropertyKey, attributes: js.PropertyDescriptor): js.Any = js.native
    
    def entries(`object`: js.Any): Array[_] = js.native
    
    def freeze[T](o: T): T = js.native
    
    def getOwnPropertyDescriptor(o: js.Any, propertyKey: PropertyKey): js.PropertyDescriptor = js.native
    
    def getOwnPropertyDescriptors(`object`: js.Any): PropertyDescriptorMap = js.native
    
    def getOwnPropertyNames(o: js.Any): Array[java.lang.String] = js.native
    
    def getOwnPropertySymbols(o: js.Any): Array[js.Symbol] = js.native
    
    def getPrototypeOf(o: js.Any): js.Any = js.native
    
    def is(value1: js.Any, value2: js.Any): Boolean = js.native
    
    def isExtensible(o: js.Any): Boolean = js.native
    
    def isFrozen(o: js.Any): Boolean = js.native
    
    def isObject(value: js.Any): Boolean = js.native
    
    def isSealed(o: js.Any): Boolean = js.native
    
    def keys(o: js.Any): Array[java.lang.String] = js.native
    
    def make[T](proto: T): T = js.native
    def make[T](proto: T, mixin: js.Any): T = js.native
    
    def preventExtensions[T](o: T): T = js.native
    
    def seal[T](o: T): T = js.native
    
    def setPrototypeOf(o: js.Any, proto: js.Any): js.Any = js.native
    
    def values(`object`: js.Any): Array[_] = js.native
  }
  
  @js.native
  trait At extends StObject {
    
    def at(text: java.lang.String, index: Double): java.lang.String = js.native
    
    def codePointAt(text: java.lang.String, pos: Double): Double = js.native
    
    def endsWith(text: java.lang.String, searchString: java.lang.String): Boolean = js.native
    def endsWith(text: java.lang.String, searchString: java.lang.String, endPosition: Double): Boolean = js.native
    
    def escapeHTML(text: java.lang.String): java.lang.String = js.native
    
    def fromCodePoint(codePoints: Double*): java.lang.String = js.native
    
    def includes(text: java.lang.String, searchString: java.lang.String): Boolean = js.native
    def includes(text: java.lang.String, searchString: java.lang.String, position: Double): Boolean = js.native
    
    def padEnd(text: java.lang.String, length: Double): java.lang.String = js.native
    def padEnd(text: java.lang.String, length: Double, fillStr: java.lang.String): java.lang.String = js.native
    
    def padStart(text: java.lang.String, length: Double): java.lang.String = js.native
    def padStart(text: java.lang.String, length: Double, fillStr: java.lang.String): java.lang.String = js.native
    
    def raw(template: TemplateStringsArray, substitutions: js.Any*): java.lang.String = js.native
    
    def repeat(text: java.lang.String, count: Double): java.lang.String = js.native
    
    def startsWith(text: java.lang.String, searchString: java.lang.String): Boolean = js.native
    def startsWith(text: java.lang.String, searchString: java.lang.String, position: Double): Boolean = js.native
    
    def unescapeHTML(text: java.lang.String): java.lang.String = js.native
  }
  
  @js.native
  trait Bind extends StObject {
    
    def bind(target: Function, thisArg: js.Any, argArray: js.Any*): js.Any = js.native
    
    def part(target: Function, args: js.Any*): js.Any = js.native
  }
  object Bind {
    
    @scala.inline
    def apply(
      bind: (Function, js.Any, /* repeated */ js.Any) => js.Any,
      part: (Function, /* repeated */ js.Any) => js.Any
    ): Bind = {
      val __obj = js.Dynamic.literal(bind = js.Any.fromFunction3(bind), part = js.Any.fromFunction2(part))
      __obj.asInstanceOf[Bind]
    }
    
    @scala.inline
    implicit class BindMutableBuilder[Self <: Bind] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBind(value: (Function, js.Any, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "bind", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPart(value: (Function, /* repeated */ js.Any) => js.Any): Self = StObject.set(x, "part", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Concat extends StObject {
    
    def concat[T](array: ArrayLike[T], items: (Array[T] | T)*): Array[T] = js.native
    
    def copyWithin[T](array: ArrayLike[T], target: Double, start: Double): Array[T] = js.native
    def copyWithin[T](array: ArrayLike[T], target: Double, start: Double, end: Double): Array[T] = js.native
    
    def entries[T](array: ArrayLike[T]): IterableIterator[js.Tuple2[Double, T]] = js.native
    
    def every[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean]
    ): Boolean = js.native
    def every[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean],
      thisArg: js.Any
    ): Boolean = js.native
    
    def fill[T](array: ArrayLike[T], value: T): Array[T] = js.native
    def fill[T](array: ArrayLike[T], value: T, start: js.UndefOr[scala.Nothing], end: Double): Array[T] = js.native
    def fill[T](array: ArrayLike[T], value: T, start: Double): Array[T] = js.native
    def fill[T](array: ArrayLike[T], value: T, start: Double, end: Double): Array[T] = js.native
    
    def filter[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean]
    ): Array[T] = js.native
    def filter[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean],
      thisArg: js.Any
    ): Array[T] = js.native
    
    def find[T](
      array: ArrayLike[T],
      predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ Array[T], Boolean]
    ): T = js.native
    def find[T](
      array: ArrayLike[T],
      predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ Array[T], Boolean],
      thisArg: js.Any
    ): T = js.native
    
    def findIndex[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean]): Double = js.native
    def findIndex[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean], thisArg: js.Any): Double = js.native
    
    def forEach[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Unit]
    ): Unit = js.native
    def forEach[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    def from[T](arrayLike: js.Iterable[T]): Array[T] = js.native
    def from[T](arrayLike: ArrayLike[T]): Array[T] = js.native
    def from[T, U](arrayLike: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): Array[U] = js.native
    def from[T, U](arrayLike: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): Array[U] = js.native
    def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): Array[U] = js.native
    def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): Array[U] = js.native
    
    def includes[T](array: ArrayLike[T], value: T): Boolean = js.native
    def includes[T](array: ArrayLike[T], value: T, fromIndex: Double): Boolean = js.native
    
    def indexOf[T](array: ArrayLike[T], searchElement: T): Double = js.native
    def indexOf[T](array: ArrayLike[T], searchElement: T, fromIndex: Double): Double = js.native
    
    def isArray(arg: js.Any): /* is core-js.Array<any> */ Boolean = js.native
    
    def join[T](array: ArrayLike[T]): java.lang.String = js.native
    def join[T](array: ArrayLike[T], separator: java.lang.String): java.lang.String = js.native
    
    def keys[T](array: ArrayLike[T]): IterableIterator[Double] = js.native
    
    def lastIndexOf[T](array: ArrayLike[T], earchElement: T): Double = js.native
    def lastIndexOf[T](array: ArrayLike[T], earchElement: T, fromIndex: Double): Double = js.native
    
    def map[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], U]
    ): Array[U] = js.native
    def map[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], U],
      thisArg: js.Any
    ): Array[U] = js.native
    
    def of[T](items: T*): Array[T] = js.native
    
    def pop[T](array: ArrayLike[T]): T = js.native
    
    def push[T](array: ArrayLike[T], items: T*): Double = js.native
    
    def reduce[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ Array[T], 
          T
        ]
    ): T = js.native
    def reduce[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ Array[T], 
          T
        ],
      initialValue: T
    ): T = js.native
    
    def reduceRight[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ Array[T], 
          T
        ]
    ): T = js.native
    def reduceRight[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ Array[T], 
          T
        ],
      initialValue: T
    ): T = js.native
    @JSName("reduceRight")
    def reduceRight_TU_U[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ Array[T], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    @JSName("reduce")
    def reduce_TU_U[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ Array[T], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    def reverse[T](array: ArrayLike[T]): Array[T] = js.native
    
    def shift[T](array: ArrayLike[T]): T = js.native
    
    def slice[T](array: ArrayLike[T]): Array[T] = js.native
    def slice[T](array: ArrayLike[T], start: js.UndefOr[scala.Nothing], end: Double): Array[T] = js.native
    def slice[T](array: ArrayLike[T], start: Double): Array[T] = js.native
    def slice[T](array: ArrayLike[T], start: Double, end: Double): Array[T] = js.native
    
    def some[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean]
    ): Boolean = js.native
    def some[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean],
      thisArg: js.Any
    ): Boolean = js.native
    
    def sort[T](array: ArrayLike[T]): Array[T] = js.native
    def sort[T](array: ArrayLike[T], compareFn: js.Function2[/* a */ T, /* b */ T, Double]): Array[T] = js.native
    
    def splice[T](array: ArrayLike[T], start: Double, deleteCount: js.UndefOr[scala.Nothing], items: T*): Array[T] = js.native
    def splice[T](array: ArrayLike[T], start: Double, deleteCount: Double, items: T*): Array[T] = js.native
    
    def turn[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[/* memo */ Array[T], /* value */ T, /* index */ Double, /* array */ Array[T], Unit]
    ): Array[T] = js.native
    def turn[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[/* memo */ Array[T], /* value */ T, /* index */ Double, /* array */ Array[T], Unit],
      memo: Array[T]
    ): Array[T] = js.native
    def turn[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function4[/* memo */ U, /* value */ T, /* index */ Double, /* array */ Array[T], Unit],
      memo: U
    ): U = js.native
    @JSName("turn")
    def turn_TU_U[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function4[/* memo */ U, /* value */ T, /* index */ Double, /* array */ Array[T], Unit]
    ): U = js.native
    
    def unshift[T](array: ArrayLike[T], items: T*): Double = js.native
    
    def values[T](array: ArrayLike[T]): IterableIterator[T] = js.native
  }
  
  @js.native
  trait Escape extends StObject {
    
    def escape(str: java.lang.String): java.lang.String = js.native
  }
  object Escape {
    
    @scala.inline
    def apply(escape: java.lang.String => java.lang.String): Escape = {
      val __obj = js.Dynamic.literal(escape = js.Any.fromFunction1(escape))
      __obj.asInstanceOf[Escape]
    }
    
    @scala.inline
    implicit class EscapeMutableBuilder[Self <: Escape] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEscape(value: java.lang.String => java.lang.String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(target: Function): Unit = js.native
    def apply(target: Object, targetKey: java.lang.String): Unit = js.native
    def apply(target: Object, targetKey: js.Symbol): Unit = js.native
  }
  
  @js.native
  trait Format extends StObject {
    
    def format(date: Date, template: java.lang.String): java.lang.String = js.native
    def format(date: Date, template: java.lang.String, locale: java.lang.String): java.lang.String = js.native
    
    def formatUTC(date: Date, template: java.lang.String): java.lang.String = js.native
    def formatUTC(date: Date, template: java.lang.String, locale: java.lang.String): java.lang.String = js.native
    
    def now(): Double = js.native
    
    def toISOString(date: Date): java.lang.String = js.native
  }
  
  @js.native
  trait TypeofReflect extends StObject {
    
    @JSName("apply")
    def apply(target: Function, thisArgument: js.Any, argumentsList: ArrayLike[_]): js.Any = js.native
    
    def construct(target: Function, argumentsList: ArrayLike[_]): js.Any = js.native
    
    /**
      * Define a unique metadata entry on the target.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param metadataValue A value that contains attached metadata.
      * @param target The target object on which to define metadata.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  Reflect.defineMetadata("custom:annotation", options, Example);
      *
      *  // decorator factory as metadata-producing annotation.
      *  function MyAnnotation(options): ClassDecorator {
      *      return target => Reflect.defineMetadata("custom:annotation", options, target);
      *  }
      * ```
      */
    def defineMetadata(metadataKey: js.Any, metadataValue: js.Any, target: Object): Unit = js.native
    def defineMetadata(metadataKey: js.Any, metadataValue: js.Any, target: Object, targetKey: java.lang.String): Unit = js.native
    def defineMetadata(metadataKey: js.Any, metadataValue: js.Any, target: Object, targetKey: js.Symbol): Unit = js.native
    
    def defineProperty(target: js.Any, propertyKey: PropertyKey, attributes: js.PropertyDescriptor): Boolean = js.native
    
    /**
      * Deletes the metadata entry from the target object with the provided key.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @returns `true` if the metadata entry was found and deleted; otherwise, false.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.deleteMetadata("custom:annotation", Example);
      * ```
      */
    def deleteMetadata(metadataKey: js.Any, target: Object): Boolean = js.native
    def deleteMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): Boolean = js.native
    def deleteMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): Boolean = js.native
    
    def deleteProperty(target: js.Any, propertyKey: PropertyKey): Boolean = js.native
    
    def get(target: js.Any, propertyKey: PropertyKey): js.Any = js.native
    def get(target: js.Any, propertyKey: PropertyKey, receiver: js.Any): js.Any = js.native
    
    /**
      * Gets the metadata value for the provided metadata key on the target object or its prototype chain.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @returns The metadata value for the metadata key if found; otherwise, `undefined`.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.getMetadata("custom:annotation", Example);
      * ```
      */
    def getMetadata(metadataKey: js.Any, target: Object): js.Any = js.native
    def getMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): js.Any = js.native
    def getMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): js.Any = js.native
    
    /**
      * Gets the metadata keys defined on the target object or its prototype chain.
      * @param target The target object on which the metadata is defined.
      * @returns An array of unique metadata keys.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.getMetadataKeys(Example);
      * ```
      */
    def getMetadataKeys(target: Object): Array[_] = js.native
    def getMetadataKeys(target: Object, targetKey: java.lang.String): Array[_] = js.native
    def getMetadataKeys(target: Object, targetKey: js.Symbol): Array[_] = js.native
    
    /**
      * Gets the metadata value for the provided metadata key on the target object.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @returns The metadata value for the metadata key if found; otherwise, `undefined`.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.getOwnMetadata("custom:annotation", Example);
      * ```
      */
    def getOwnMetadata(metadataKey: js.Any, target: Object): js.Any = js.native
    def getOwnMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): js.Any = js.native
    def getOwnMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): js.Any = js.native
    
    /**
      * Gets the unique metadata keys defined on the target object.
      * @param target The target object on which the metadata is defined.
      * @returns An array of unique metadata keys.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.getOwnMetadataKeys(Example);
      * ```
      */
    def getOwnMetadataKeys(target: Object): Array[_] = js.native
    def getOwnMetadataKeys(target: Object, targetKey: java.lang.String): Array[_] = js.native
    def getOwnMetadataKeys(target: Object, targetKey: js.Symbol): Array[_] = js.native
    
    def getOwnPropertyDescriptor(target: js.Any, propertyKey: PropertyKey): js.PropertyDescriptor = js.native
    
    def getPrototypeOf(target: js.Any): js.Any = js.native
    
    def has(target: js.Any, propertyKey: java.lang.String): Boolean = js.native
    def has(target: js.Any, propertyKey: js.Symbol): Boolean = js.native
    
    /**
      * Gets a value indicating whether the target object or its prototype chain has the provided metadata key defined.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @returns `true` if the metadata key was defined on the target object or its prototype chain; otherwise, `false`.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.hasMetadata("custom:annotation", Example);
      * ```
      */
    def hasMetadata(metadataKey: js.Any, target: Object): Boolean = js.native
    def hasMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): Boolean = js.native
    def hasMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): Boolean = js.native
    
    /**
      * Gets a value indicating whether the target object has the provided metadata key defined.
      * @param metadataKey A key used to store and retrieve metadata.
      * @param target The target object on which the metadata is defined.
      * @returns `true` if the metadata key was defined on the target object; otherwise, `false`.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *
      *  class Example {
      *  }
      *
      *  // constructor
      *  result = Reflect.hasOwnMetadata("custom:annotation", Example);
      * ```
      */
    def hasOwnMetadata(metadataKey: js.Any, target: Object): Boolean = js.native
    def hasOwnMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): Boolean = js.native
    def hasOwnMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): Boolean = js.native
    
    def isExtensible(target: js.Any): Boolean = js.native
    
    /**
      * A default metadata decorator factory that can be used on a class, class member, or parameter.
      * @param metadataKey The key for the metadata entry.
      * @param metadataValue The value for the metadata entry.
      * @returns A decorator function.
      * @remarks
      * If `metadataKey` is already defined for the target and target key, the
      * metadataValue for that key will be overwritten.
      * @example
      *
      * ### Example
      *
      * ```typescript
      *  // constructor
      *  @Reflect.metadata(key, value)
      *  class Example {
      *  }
      *
      *  // property (on constructor, TypeScript only)
      *  class Example {
      *      @Reflect.metadata(key, value)
      *      static staticProperty;
      *  }
      *
      *  // property (on prototype, TypeScript only)
      *  class Example {
      *      @Reflect.metadata(key, value)
      *      property;
      *  }
      *
      *  // method (on constructor)
      *  class Example {
      *      @Reflect.metadata(key, value)
      *      static staticMethod() { }
      *  }
      *
      *  // method (on prototype)
      *  class Example {
      *      @Reflect.metadata(key, value)
      *      method() { }
      *  }
      * ```
      */
    def metadata(metadataKey: js.Any, metadataValue: js.Any): FnCall = js.native
    
    def ownKeys(target: js.Any): Array[PropertyKey] = js.native
    
    def preventExtensions(target: js.Any): Boolean = js.native
    
    def set(target: js.Any, propertyKey: PropertyKey, value: js.Any): Boolean = js.native
    def set(target: js.Any, propertyKey: PropertyKey, value: js.Any, receiver: js.Any): Boolean = js.native
    
    def setPrototypeOf(target: js.Any, proto: js.Any): Boolean = js.native
  }
  
  @js.native
  trait Typeofcore extends StObject {
    
    @JSName("$for")
    def $for[T](iterable: js.Iterable[T]): `for`[T] = js.native
    
    val Array: Concat = js.native
    
    val Date: Format = js.native
    
    def Dict(): typingsSlinky.coreJs.Dict[_] = js.native
    def Dict(value: js.Any): typingsSlinky.coreJs.Dict[_] = js.native
    def Dict[T](value: typingsSlinky.coreJs.Dict[T]): typingsSlinky.coreJs.Dict[T] = js.native
    @JSName("Dict")
    val Dict_Original: DictConstructor = js.native
    @JSName("Dict")
    def Dict_T[T](): Dict[T] = js.native
    
    val Function: Bind = js.native
    
    val Map: MapConstructor = js.native
    
    val Math: Asinh = js.native
    
    val Number: Acosh = js.native
    
    val Object: Assign = js.native
    
    val Promise: PromiseConstructor = js.native
    
    val Reflect: TypeofReflect = js.native
    
    val RegExp: Escape = js.native
    
    val Set: SetConstructor = js.native
    
    val String: At = js.native
    
    val Symbol: SymbolConstructor = js.native
    
    val WeakMap: WeakMapConstructor = js.native
    
    val WeakSet: WeakSetConstructor = js.native
    
    @JSName("_")
    val _underscore: Boolean = js.native
    
    def addLocale(lang: java.lang.String, locale: Locale): /* import warning: importer.ImportType#apply Failed type conversion: typeof core */ js.Any = js.native
    
    def clearImmediate(handle: Double): Unit = js.native
    
    def delay(msec: Double): js.Promise[Unit] = js.native
    
    def getIterator[T](iterable: js.Iterable[T]): js.Iterator[T] = js.native
    
    val global: js.Any = js.native
    
    def isIterable(value: js.Any): Boolean = js.native
    
    def locale(): java.lang.String = js.native
    def locale(lang: java.lang.String): java.lang.String = js.native
    
    def setImmediate(expression: js.Any, args: js.Any*): Double = js.native
    
    def setInterval(handler: js.Any, timeout: js.UndefOr[scala.Nothing], args: js.Any*): Double = js.native
    def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
    
    def setTimeout(handler: js.Any, timeout: js.UndefOr[scala.Nothing], args: js.Any*): Double = js.native
    def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
    
    val version: java.lang.String = js.native
  }
}
