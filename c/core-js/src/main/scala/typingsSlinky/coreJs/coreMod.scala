package typingsSlinky.coreJs

import typingsSlinky.coreJs.anon.FnCall
import typingsSlinky.coreJs.anon.Typeofcore
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

object coreMod {
  
  object Array {
    
    @JSImport("core-js/core", "Array.concat")
    @js.native
    def concat[T](array: ArrayLike[T], items: (typingsSlinky.coreJs.Array[T] | T)*): typingsSlinky.coreJs.Array[T] = js.native
    
    @JSImport("core-js/core", "Array.copyWithin")
    @js.native
    def copyWithin[T](array: ArrayLike[T], target: Double, start: Double): typingsSlinky.coreJs.Array[T] = js.native
    @JSImport("core-js/core", "Array.copyWithin")
    @js.native
    def copyWithin[T](array: ArrayLike[T], target: Double, start: Double, end: Double): typingsSlinky.coreJs.Array[T] = js.native
    
    @JSImport("core-js/core", "Array.entries")
    @js.native
    def entries[T](array: ArrayLike[T]): IterableIterator[js.Tuple2[Double, T]] = js.native
    
    @JSImport("core-js/core", "Array.every")
    @js.native
    def every[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsSlinky.coreJs.Array[T], Boolean]
    ): Boolean = js.native
    @JSImport("core-js/core", "Array.every")
    @js.native
    def every[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsSlinky.coreJs.Array[T], Boolean],
      thisArg: js.Any
    ): Boolean = js.native
    
    @JSImport("core-js/core", "Array.fill")
    @js.native
    def fill[T](array: ArrayLike[T], value: T): typingsSlinky.coreJs.Array[T] = js.native
    @JSImport("core-js/core", "Array.fill")
    @js.native
    def fill[T](array: ArrayLike[T], value: T, start: js.UndefOr[scala.Nothing], end: Double): typingsSlinky.coreJs.Array[T] = js.native
    @JSImport("core-js/core", "Array.fill")
    @js.native
    def fill[T](array: ArrayLike[T], value: T, start: Double): typingsSlinky.coreJs.Array[T] = js.native
    @JSImport("core-js/core", "Array.fill")
    @js.native
    def fill[T](array: ArrayLike[T], value: T, start: Double, end: Double): typingsSlinky.coreJs.Array[T] = js.native
    
    @JSImport("core-js/core", "Array.filter")
    @js.native
    def filter[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsSlinky.coreJs.Array[T], Boolean]
    ): typingsSlinky.coreJs.Array[T] = js.native
    @JSImport("core-js/core", "Array.filter")
    @js.native
    def filter[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsSlinky.coreJs.Array[T], Boolean],
      thisArg: js.Any
    ): typingsSlinky.coreJs.Array[T] = js.native
    
    @JSImport("core-js/core", "Array.find")
    @js.native
    def find[T](
      array: ArrayLike[T],
      predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ typingsSlinky.coreJs.Array[T], Boolean]
    ): T = js.native
    @JSImport("core-js/core", "Array.find")
    @js.native
    def find[T](
      array: ArrayLike[T],
      predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ typingsSlinky.coreJs.Array[T], Boolean],
      thisArg: js.Any
    ): T = js.native
    
    @JSImport("core-js/core", "Array.findIndex")
    @js.native
    def findIndex[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean]): Double = js.native
    @JSImport("core-js/core", "Array.findIndex")
    @js.native
    def findIndex[T](array: ArrayLike[T], predicate: js.Function1[/* value */ T, Boolean], thisArg: js.Any): Double = js.native
    
    @JSImport("core-js/core", "Array.forEach")
    @js.native
    def forEach[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsSlinky.coreJs.Array[T], Unit]
    ): Unit = js.native
    @JSImport("core-js/core", "Array.forEach")
    @js.native
    def forEach[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsSlinky.coreJs.Array[T], Unit],
      thisArg: js.Any
    ): Unit = js.native
    
    @JSImport("core-js/core", "Array.from")
    @js.native
    def from[T](arrayLike: js.Iterable[T]): typingsSlinky.coreJs.Array[T] = js.native
    @JSImport("core-js/core", "Array.from")
    @js.native
    def from[T](arrayLike: ArrayLike[T]): typingsSlinky.coreJs.Array[T] = js.native
    @JSImport("core-js/core", "Array.from")
    @js.native
    def from[T, U](arrayLike: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): typingsSlinky.coreJs.Array[U] = js.native
    @JSImport("core-js/core", "Array.from")
    @js.native
    def from[T, U](arrayLike: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): typingsSlinky.coreJs.Array[U] = js.native
    @JSImport("core-js/core", "Array.from")
    @js.native
    def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U]): typingsSlinky.coreJs.Array[U] = js.native
    @JSImport("core-js/core", "Array.from")
    @js.native
    def from[T, U](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, U], thisArg: js.Any): typingsSlinky.coreJs.Array[U] = js.native
    
    @JSImport("core-js/core", "Array.includes")
    @js.native
    def includes[T](array: ArrayLike[T], value: T): Boolean = js.native
    @JSImport("core-js/core", "Array.includes")
    @js.native
    def includes[T](array: ArrayLike[T], value: T, fromIndex: Double): Boolean = js.native
    
    @JSImport("core-js/core", "Array.indexOf")
    @js.native
    def indexOf[T](array: ArrayLike[T], searchElement: T): Double = js.native
    @JSImport("core-js/core", "Array.indexOf")
    @js.native
    def indexOf[T](array: ArrayLike[T], searchElement: T, fromIndex: Double): Double = js.native
    
    @JSImport("core-js/core", "Array.isArray")
    @js.native
    def isArray(arg: js.Any): /* is core-js.Array<any> */ Boolean = js.native
    
    @JSImport("core-js/core", "Array.join")
    @js.native
    def join[T](array: ArrayLike[T]): java.lang.String = js.native
    @JSImport("core-js/core", "Array.join")
    @js.native
    def join[T](array: ArrayLike[T], separator: java.lang.String): java.lang.String = js.native
    
    @JSImport("core-js/core", "Array.keys")
    @js.native
    def keys[T](array: ArrayLike[T]): IterableIterator[Double] = js.native
    
    @JSImport("core-js/core", "Array.lastIndexOf")
    @js.native
    def lastIndexOf[T](array: ArrayLike[T], earchElement: T): Double = js.native
    @JSImport("core-js/core", "Array.lastIndexOf")
    @js.native
    def lastIndexOf[T](array: ArrayLike[T], earchElement: T, fromIndex: Double): Double = js.native
    
    @JSImport("core-js/core", "Array.map")
    @js.native
    def map[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsSlinky.coreJs.Array[T], U]
    ): typingsSlinky.coreJs.Array[U] = js.native
    @JSImport("core-js/core", "Array.map")
    @js.native
    def map[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsSlinky.coreJs.Array[T], U],
      thisArg: js.Any
    ): typingsSlinky.coreJs.Array[U] = js.native
    
    @JSImport("core-js/core", "Array.of")
    @js.native
    def of[T](items: T*): typingsSlinky.coreJs.Array[T] = js.native
    
    @JSImport("core-js/core", "Array.pop")
    @js.native
    def pop[T](array: ArrayLike[T]): T = js.native
    
    @JSImport("core-js/core", "Array.push")
    @js.native
    def push[T](array: ArrayLike[T], items: T*): Double = js.native
    
    @JSImport("core-js/core", "Array.reduce")
    @js.native
    def reduce[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typingsSlinky.coreJs.Array[T], 
          T
        ]
    ): T = js.native
    @JSImport("core-js/core", "Array.reduce")
    @js.native
    def reduce[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typingsSlinky.coreJs.Array[T], 
          T
        ],
      initialValue: T
    ): T = js.native
    
    @JSImport("core-js/core", "Array.reduceRight")
    @js.native
    def reduceRight[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typingsSlinky.coreJs.Array[T], 
          T
        ]
    ): T = js.native
    @JSImport("core-js/core", "Array.reduceRight")
    @js.native
    def reduceRight[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ T, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typingsSlinky.coreJs.Array[T], 
          T
        ],
      initialValue: T
    ): T = js.native
    @JSImport("core-js/core", "Array.reduceRight")
    @js.native
    def reduceRight_TU_U[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typingsSlinky.coreJs.Array[T], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    @JSImport("core-js/core", "Array.reduce")
    @js.native
    def reduce_TU_U[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ T, 
          /* currentIndex */ Double, 
          /* array */ typingsSlinky.coreJs.Array[T], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    @JSImport("core-js/core", "Array.reverse")
    @js.native
    def reverse[T](array: ArrayLike[T]): typingsSlinky.coreJs.Array[T] = js.native
    
    @JSImport("core-js/core", "Array.shift")
    @js.native
    def shift[T](array: ArrayLike[T]): T = js.native
    
    @JSImport("core-js/core", "Array.slice")
    @js.native
    def slice[T](array: ArrayLike[T]): typingsSlinky.coreJs.Array[T] = js.native
    @JSImport("core-js/core", "Array.slice")
    @js.native
    def slice[T](array: ArrayLike[T], start: js.UndefOr[scala.Nothing], end: Double): typingsSlinky.coreJs.Array[T] = js.native
    @JSImport("core-js/core", "Array.slice")
    @js.native
    def slice[T](array: ArrayLike[T], start: Double): typingsSlinky.coreJs.Array[T] = js.native
    @JSImport("core-js/core", "Array.slice")
    @js.native
    def slice[T](array: ArrayLike[T], start: Double, end: Double): typingsSlinky.coreJs.Array[T] = js.native
    
    @JSImport("core-js/core", "Array.some")
    @js.native
    def some[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsSlinky.coreJs.Array[T], Boolean]
    ): Boolean = js.native
    @JSImport("core-js/core", "Array.some")
    @js.native
    def some[T](
      array: ArrayLike[T],
      callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ typingsSlinky.coreJs.Array[T], Boolean],
      thisArg: js.Any
    ): Boolean = js.native
    
    @JSImport("core-js/core", "Array.sort")
    @js.native
    def sort[T](array: ArrayLike[T]): typingsSlinky.coreJs.Array[T] = js.native
    @JSImport("core-js/core", "Array.sort")
    @js.native
    def sort[T](array: ArrayLike[T], compareFn: js.Function2[/* a */ T, /* b */ T, Double]): typingsSlinky.coreJs.Array[T] = js.native
    
    @JSImport("core-js/core", "Array.splice")
    @js.native
    def splice[T](array: ArrayLike[T], start: Double, deleteCount: js.UndefOr[scala.Nothing], items: T*): typingsSlinky.coreJs.Array[T] = js.native
    @JSImport("core-js/core", "Array.splice")
    @js.native
    def splice[T](array: ArrayLike[T], start: Double, deleteCount: Double, items: T*): typingsSlinky.coreJs.Array[T] = js.native
    
    @JSImport("core-js/core", "Array.turn")
    @js.native
    def turn[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* memo */ typingsSlinky.coreJs.Array[T], 
          /* value */ T, 
          /* index */ Double, 
          /* array */ typingsSlinky.coreJs.Array[T], 
          Unit
        ]
    ): typingsSlinky.coreJs.Array[T] = js.native
    @JSImport("core-js/core", "Array.turn")
    @js.native
    def turn[T](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* memo */ typingsSlinky.coreJs.Array[T], 
          /* value */ T, 
          /* index */ Double, 
          /* array */ typingsSlinky.coreJs.Array[T], 
          Unit
        ],
      memo: typingsSlinky.coreJs.Array[T]
    ): typingsSlinky.coreJs.Array[T] = js.native
    @JSImport("core-js/core", "Array.turn")
    @js.native
    def turn[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* memo */ U, 
          /* value */ T, 
          /* index */ Double, 
          /* array */ typingsSlinky.coreJs.Array[T], 
          Unit
        ],
      memo: U
    ): U = js.native
    @JSImport("core-js/core", "Array.turn")
    @js.native
    def turn_TU_U[T, U](
      array: ArrayLike[T],
      callbackfn: js.Function4[
          /* memo */ U, 
          /* value */ T, 
          /* index */ Double, 
          /* array */ typingsSlinky.coreJs.Array[T], 
          Unit
        ]
    ): U = js.native
    
    @JSImport("core-js/core", "Array.unshift")
    @js.native
    def unshift[T](array: ArrayLike[T], items: T*): Double = js.native
    
    @JSImport("core-js/core", "Array.values")
    @js.native
    def values[T](array: ArrayLike[T]): IterableIterator[T] = js.native
  }
  
  object Date {
    
    @JSImport("core-js/core", "Date.format")
    @js.native
    def format(date: typingsSlinky.coreJs.Date, template: java.lang.String): java.lang.String = js.native
    @JSImport("core-js/core", "Date.format")
    @js.native
    def format(date: typingsSlinky.coreJs.Date, template: java.lang.String, locale: java.lang.String): java.lang.String = js.native
    
    @JSImport("core-js/core", "Date.formatUTC")
    @js.native
    def formatUTC(date: typingsSlinky.coreJs.Date, template: java.lang.String): java.lang.String = js.native
    @JSImport("core-js/core", "Date.formatUTC")
    @js.native
    def formatUTC(date: typingsSlinky.coreJs.Date, template: java.lang.String, locale: java.lang.String): java.lang.String = js.native
    
    @JSImport("core-js/core", "Date.now")
    @js.native
    def now(): Double = js.native
    
    @JSImport("core-js/core", "Date.toISOString")
    @js.native
    def toISOString(date: typingsSlinky.coreJs.Date): java.lang.String = js.native
  }
  
  @JSImport("core-js/core", "Dict")
  @js.native
  val Dict: DictConstructor = js.native
  
  object Function {
    
    @JSImport("core-js/core", "Function.bind")
    @js.native
    def bind(target: typingsSlinky.coreJs.Function, thisArg: js.Any, argArray: js.Any*): js.Any = js.native
    
    @JSImport("core-js/core", "Function.part")
    @js.native
    def part(target: typingsSlinky.coreJs.Function, args: js.Any*): js.Any = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/core", "Map")
  @js.native
  class Map[K, V] ()
    extends typingsSlinky.std.Map[K, V] {
    def this(entries: js.Array[js.Tuple2[K, V]]) = this()
    def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
  }
  @JSImport("core-js/core", "Map")
  @js.native
  val Map: MapConstructor = js.native
  
  object Math {
    
    @JSImport("core-js/core", "Math.acosh")
    @js.native
    def acosh(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Math.asinh")
    @js.native
    def asinh(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Math.atanh")
    @js.native
    def atanh(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Math.cbrt")
    @js.native
    def cbrt(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Math.clz32")
    @js.native
    def clz32(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Math.cosh")
    @js.native
    def cosh(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Math.expm1")
    @js.native
    def expm1(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Math.fround")
    @js.native
    def fround(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Math.hypot")
    @js.native
    def hypot(values: Double*): Double = js.native
    
    @JSImport("core-js/core", "Math.imul")
    @js.native
    def imul(x: Double, y: Double): Double = js.native
    
    @JSImport("core-js/core", "Math.log10")
    @js.native
    def log10(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Math.log1p")
    @js.native
    def log1p(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Math.log2")
    @js.native
    def log2(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Math.sign")
    @js.native
    def sign(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Math.sinh")
    @js.native
    def sinh(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Math.tanh")
    @js.native
    def tanh(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Math.trunc")
    @js.native
    def trunc(x: Double): Double = js.native
  }
  
  object Number {
    
    @JSImport("core-js/core", "Number")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("core-js/core", "Number.EPSILON")
    @js.native
    def EPSILON: Double = js.native
    @scala.inline
    def EPSILON_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPSILON")(x.asInstanceOf[js.Any])
    
    @JSImport("core-js/core", "Number.MAX_SAFE_INTEGER")
    @js.native
    def MAX_SAFE_INTEGER: Double = js.native
    @scala.inline
    def MAX_SAFE_INTEGER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SAFE_INTEGER")(x.asInstanceOf[js.Any])
    
    @JSImport("core-js/core", "Number.MIN_SAFE_INTEGER")
    @js.native
    def MIN_SAFE_INTEGER: Double = js.native
    @scala.inline
    def MIN_SAFE_INTEGER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_SAFE_INTEGER")(x.asInstanceOf[js.Any])
    
    @JSImport("core-js/core", "Number.acosh")
    @js.native
    def acosh(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Number.asinh")
    @js.native
    def asinh(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Number.atanh")
    @js.native
    def atanh(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Number.cbrt")
    @js.native
    def cbrt(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Number.clz32")
    @js.native
    def clz32(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Number.cosh")
    @js.native
    def cosh(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Number.expm1")
    @js.native
    def expm1(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Number.fround")
    @js.native
    def fround(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Number.hypot")
    @js.native
    def hypot(values: Double*): Double = js.native
    
    @JSImport("core-js/core", "Number.imul")
    @js.native
    def imul(x: Double, y: Double): Double = js.native
    
    @JSImport("core-js/core", "Number.isFinite")
    @js.native
    def isFinite(number: Double): Boolean = js.native
    
    @JSImport("core-js/core", "Number.isInteger")
    @js.native
    def isInteger(number: Double): Boolean = js.native
    
    @JSImport("core-js/core", "Number.isNaN")
    @js.native
    def isNaN(number: Double): Boolean = js.native
    
    @JSImport("core-js/core", "Number.isSafeInteger")
    @js.native
    def isSafeInteger(number: Double): Boolean = js.native
    
    @JSImport("core-js/core", "Number.log10")
    @js.native
    def log10(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Number.log1p")
    @js.native
    def log1p(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Number.log2")
    @js.native
    def log2(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Number.parseFloat")
    @js.native
    def parseFloat(string: java.lang.String): Double = js.native
    
    @JSImport("core-js/core", "Number.parseInt")
    @js.native
    def parseInt(string: java.lang.String): Double = js.native
    @JSImport("core-js/core", "Number.parseInt")
    @js.native
    def parseInt(string: java.lang.String, radix: Double): Double = js.native
    
    @JSImport("core-js/core", "Number.random")
    @js.native
    def random(): Double = js.native
    @JSImport("core-js/core", "Number.random")
    @js.native
    def random(lim: Double): Double = js.native
    
    @JSImport("core-js/core", "Number.sign")
    @js.native
    def sign(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Number.sinh")
    @js.native
    def sinh(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Number.tanh")
    @js.native
    def tanh(x: Double): Double = js.native
    
    @JSImport("core-js/core", "Number.trunc")
    @js.native
    def trunc(x: Double): Double = js.native
  }
  
  object Object {
    
    @JSImport("core-js/core", "Object.assign")
    @js.native
    def assign(target: js.Any, sources: js.Any*): js.Any = js.native
    
    @JSImport("core-js/core", "Object.classof")
    @js.native
    def classof(value: js.Any): java.lang.String = js.native
    
    @JSImport("core-js/core", "Object.create")
    @js.native
    def create(o: js.Any): js.Any = js.native
    @JSImport("core-js/core", "Object.create")
    @js.native
    def create(o: js.Any, properties: PropertyDescriptorMap): js.Any = js.native
    
    @JSImport("core-js/core", "Object.define")
    @js.native
    def define[T](target: T, mixin: js.Any): T = js.native
    
    @JSImport("core-js/core", "Object.defineProperties")
    @js.native
    def defineProperties(o: js.Any, properties: PropertyDescriptorMap): js.Any = js.native
    
    @JSImport("core-js/core", "Object.defineProperty")
    @js.native
    def defineProperty(o: js.Any, propertyKey: PropertyKey, attributes: js.PropertyDescriptor): js.Any = js.native
    
    @JSImport("core-js/core", "Object.entries")
    @js.native
    def entries(`object`: js.Any): Array[_] = js.native
    
    @JSImport("core-js/core", "Object.freeze")
    @js.native
    def freeze[T](o: T): T = js.native
    
    @JSImport("core-js/core", "Object.getOwnPropertyDescriptor")
    @js.native
    def getOwnPropertyDescriptor(o: js.Any, propertyKey: PropertyKey): js.PropertyDescriptor = js.native
    
    @JSImport("core-js/core", "Object.getOwnPropertyDescriptors")
    @js.native
    def getOwnPropertyDescriptors(`object`: js.Any): PropertyDescriptorMap = js.native
    
    @JSImport("core-js/core", "Object.getOwnPropertyNames")
    @js.native
    def getOwnPropertyNames(o: js.Any): Array[java.lang.String] = js.native
    
    @JSImport("core-js/core", "Object.getOwnPropertySymbols")
    @js.native
    def getOwnPropertySymbols(o: js.Any): Array[js.Symbol] = js.native
    
    @JSImport("core-js/core", "Object.getPrototypeOf")
    @js.native
    def getPrototypeOf(o: js.Any): js.Any = js.native
    
    @JSImport("core-js/core", "Object.is")
    @js.native
    def is(value1: js.Any, value2: js.Any): Boolean = js.native
    
    @JSImport("core-js/core", "Object.isExtensible")
    @js.native
    def isExtensible(o: js.Any): Boolean = js.native
    
    @JSImport("core-js/core", "Object.isFrozen")
    @js.native
    def isFrozen(o: js.Any): Boolean = js.native
    
    @JSImport("core-js/core", "Object.isObject")
    @js.native
    def isObject(value: js.Any): Boolean = js.native
    
    @JSImport("core-js/core", "Object.isSealed")
    @js.native
    def isSealed(o: js.Any): Boolean = js.native
    
    @JSImport("core-js/core", "Object.keys")
    @js.native
    def keys(o: js.Any): Array[java.lang.String] = js.native
    
    @JSImport("core-js/core", "Object.make")
    @js.native
    def make[T](proto: T): T = js.native
    @JSImport("core-js/core", "Object.make")
    @js.native
    def make[T](proto: T, mixin: js.Any): T = js.native
    
    @JSImport("core-js/core", "Object.preventExtensions")
    @js.native
    def preventExtensions[T](o: T): T = js.native
    
    @JSImport("core-js/core", "Object.seal")
    @js.native
    def seal[T](o: T): T = js.native
    
    @JSImport("core-js/core", "Object.setPrototypeOf")
    @js.native
    def setPrototypeOf(o: js.Any, proto: js.Any): js.Any = js.native
    
    @JSImport("core-js/core", "Object.values")
    @js.native
    def values(`object`: js.Any): Array[_] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/core", "Promise")
  @js.native
  class Promise[T] protected ()
    extends typingsSlinky.std.Promise[T] {
    /**
      * Creates a new Promise.
      * @param executor A callback used to initialize the promise. This callback is passed two arguments:
      * a resolve callback used to resolve the promise with a value or the result of another promise,
      * and a reject callback used to reject the promise with a provided reason or error.
      */
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ T | js.Thenable[T], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ]) = this()
  }
  @JSImport("core-js/core", "Promise")
  @js.native
  val Promise: PromiseConstructor = js.native
  
  object Reflect {
    
    @JSImport("core-js/core", "Reflect.apply")
    @js.native
    def apply(target: Function, thisArgument: js.Any, argumentsList: ArrayLike[_]): js.Any = js.native
    
    @JSImport("core-js/core", "Reflect.construct")
    @js.native
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
    @JSImport("core-js/core", "Reflect.defineMetadata")
    @js.native
    def defineMetadata(metadataKey: js.Any, metadataValue: js.Any, target: Object): Unit = js.native
    @JSImport("core-js/core", "Reflect.defineMetadata")
    @js.native
    def defineMetadata(metadataKey: js.Any, metadataValue: js.Any, target: Object, targetKey: java.lang.String): Unit = js.native
    @JSImport("core-js/core", "Reflect.defineMetadata")
    @js.native
    def defineMetadata(metadataKey: js.Any, metadataValue: js.Any, target: Object, targetKey: js.Symbol): Unit = js.native
    
    @JSImport("core-js/core", "Reflect.defineProperty")
    @js.native
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
    @JSImport("core-js/core", "Reflect.deleteMetadata")
    @js.native
    def deleteMetadata(metadataKey: js.Any, target: Object): Boolean = js.native
    @JSImport("core-js/core", "Reflect.deleteMetadata")
    @js.native
    def deleteMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): Boolean = js.native
    @JSImport("core-js/core", "Reflect.deleteMetadata")
    @js.native
    def deleteMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): Boolean = js.native
    
    @JSImport("core-js/core", "Reflect.deleteProperty")
    @js.native
    def deleteProperty(target: js.Any, propertyKey: PropertyKey): Boolean = js.native
    
    @JSImport("core-js/core", "Reflect.get")
    @js.native
    def get(target: js.Any, propertyKey: PropertyKey): js.Any = js.native
    @JSImport("core-js/core", "Reflect.get")
    @js.native
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
    @JSImport("core-js/core", "Reflect.getMetadata")
    @js.native
    def getMetadata(metadataKey: js.Any, target: Object): js.Any = js.native
    @JSImport("core-js/core", "Reflect.getMetadata")
    @js.native
    def getMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): js.Any = js.native
    @JSImport("core-js/core", "Reflect.getMetadata")
    @js.native
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
    @JSImport("core-js/core", "Reflect.getMetadataKeys")
    @js.native
    def getMetadataKeys(target: Object): Array[_] = js.native
    @JSImport("core-js/core", "Reflect.getMetadataKeys")
    @js.native
    def getMetadataKeys(target: Object, targetKey: java.lang.String): Array[_] = js.native
    @JSImport("core-js/core", "Reflect.getMetadataKeys")
    @js.native
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
    @JSImport("core-js/core", "Reflect.getOwnMetadata")
    @js.native
    def getOwnMetadata(metadataKey: js.Any, target: Object): js.Any = js.native
    @JSImport("core-js/core", "Reflect.getOwnMetadata")
    @js.native
    def getOwnMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): js.Any = js.native
    @JSImport("core-js/core", "Reflect.getOwnMetadata")
    @js.native
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
    @JSImport("core-js/core", "Reflect.getOwnMetadataKeys")
    @js.native
    def getOwnMetadataKeys(target: Object): Array[_] = js.native
    @JSImport("core-js/core", "Reflect.getOwnMetadataKeys")
    @js.native
    def getOwnMetadataKeys(target: Object, targetKey: java.lang.String): Array[_] = js.native
    @JSImport("core-js/core", "Reflect.getOwnMetadataKeys")
    @js.native
    def getOwnMetadataKeys(target: Object, targetKey: js.Symbol): Array[_] = js.native
    
    @JSImport("core-js/core", "Reflect.getOwnPropertyDescriptor")
    @js.native
    def getOwnPropertyDescriptor(target: js.Any, propertyKey: PropertyKey): js.PropertyDescriptor = js.native
    
    @JSImport("core-js/core", "Reflect.getPrototypeOf")
    @js.native
    def getPrototypeOf(target: js.Any): js.Any = js.native
    
    @JSImport("core-js/core", "Reflect.has")
    @js.native
    def has(target: js.Any, propertyKey: java.lang.String): Boolean = js.native
    @JSImport("core-js/core", "Reflect.has")
    @js.native
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
    @JSImport("core-js/core", "Reflect.hasMetadata")
    @js.native
    def hasMetadata(metadataKey: js.Any, target: Object): Boolean = js.native
    @JSImport("core-js/core", "Reflect.hasMetadata")
    @js.native
    def hasMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): Boolean = js.native
    @JSImport("core-js/core", "Reflect.hasMetadata")
    @js.native
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
    @JSImport("core-js/core", "Reflect.hasOwnMetadata")
    @js.native
    def hasOwnMetadata(metadataKey: js.Any, target: Object): Boolean = js.native
    @JSImport("core-js/core", "Reflect.hasOwnMetadata")
    @js.native
    def hasOwnMetadata(metadataKey: js.Any, target: Object, targetKey: java.lang.String): Boolean = js.native
    @JSImport("core-js/core", "Reflect.hasOwnMetadata")
    @js.native
    def hasOwnMetadata(metadataKey: js.Any, target: Object, targetKey: js.Symbol): Boolean = js.native
    
    @JSImport("core-js/core", "Reflect.isExtensible")
    @js.native
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
    @JSImport("core-js/core", "Reflect.metadata")
    @js.native
    def metadata(metadataKey: js.Any, metadataValue: js.Any): FnCall = js.native
    
    @JSImport("core-js/core", "Reflect.ownKeys")
    @js.native
    def ownKeys(target: js.Any): Array[PropertyKey] = js.native
    
    @JSImport("core-js/core", "Reflect.preventExtensions")
    @js.native
    def preventExtensions(target: js.Any): Boolean = js.native
    
    @JSImport("core-js/core", "Reflect.set")
    @js.native
    def set(target: js.Any, propertyKey: PropertyKey, value: js.Any): Boolean = js.native
    @JSImport("core-js/core", "Reflect.set")
    @js.native
    def set(target: js.Any, propertyKey: PropertyKey, value: js.Any, receiver: js.Any): Boolean = js.native
    
    @JSImport("core-js/core", "Reflect.setPrototypeOf")
    @js.native
    def setPrototypeOf(target: js.Any, proto: js.Any): Boolean = js.native
  }
  
  object RegExp {
    
    @JSImport("core-js/core", "RegExp.escape")
    @js.native
    def escape(str: java.lang.String): java.lang.String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/core", "Set")
  @js.native
  class Set[T] ()
    extends typingsSlinky.std.Set[T] {
    def this(values: js.Array[T]) = this()
  }
  @JSImport("core-js/core", "Set")
  @js.native
  val Set: SetConstructor = js.native
  
  object String {
    
    @JSImport("core-js/core", "String.at")
    @js.native
    def at(text: java.lang.String, index: Double): java.lang.String = js.native
    
    @JSImport("core-js/core", "String.codePointAt")
    @js.native
    def codePointAt(text: java.lang.String, pos: Double): Double = js.native
    
    @JSImport("core-js/core", "String.endsWith")
    @js.native
    def endsWith(text: java.lang.String, searchString: java.lang.String): Boolean = js.native
    @JSImport("core-js/core", "String.endsWith")
    @js.native
    def endsWith(text: java.lang.String, searchString: java.lang.String, endPosition: Double): Boolean = js.native
    
    @JSImport("core-js/core", "String.escapeHTML")
    @js.native
    def escapeHTML(text: java.lang.String): java.lang.String = js.native
    
    @JSImport("core-js/core", "String.fromCodePoint")
    @js.native
    def fromCodePoint(codePoints: Double*): java.lang.String = js.native
    
    @JSImport("core-js/core", "String.includes")
    @js.native
    def includes(text: java.lang.String, searchString: java.lang.String): Boolean = js.native
    @JSImport("core-js/core", "String.includes")
    @js.native
    def includes(text: java.lang.String, searchString: java.lang.String, position: Double): Boolean = js.native
    
    @JSImport("core-js/core", "String.padEnd")
    @js.native
    def padEnd(text: java.lang.String, length: Double): java.lang.String = js.native
    @JSImport("core-js/core", "String.padEnd")
    @js.native
    def padEnd(text: java.lang.String, length: Double, fillStr: java.lang.String): java.lang.String = js.native
    
    @JSImport("core-js/core", "String.padStart")
    @js.native
    def padStart(text: java.lang.String, length: Double): java.lang.String = js.native
    @JSImport("core-js/core", "String.padStart")
    @js.native
    def padStart(text: java.lang.String, length: Double, fillStr: java.lang.String): java.lang.String = js.native
    
    @JSImport("core-js/core", "String.raw")
    @js.native
    def raw(template: TemplateStringsArray, substitutions: js.Any*): java.lang.String = js.native
    
    @JSImport("core-js/core", "String.repeat")
    @js.native
    def repeat(text: java.lang.String, count: Double): java.lang.String = js.native
    
    @JSImport("core-js/core", "String.startsWith")
    @js.native
    def startsWith(text: java.lang.String, searchString: java.lang.String): Boolean = js.native
    @JSImport("core-js/core", "String.startsWith")
    @js.native
    def startsWith(text: java.lang.String, searchString: java.lang.String, position: Double): Boolean = js.native
    
    @JSImport("core-js/core", "String.unescapeHTML")
    @js.native
    def unescapeHTML(text: java.lang.String): java.lang.String = js.native
  }
  
  @JSImport("core-js/core", "Symbol")
  @js.native
  val Symbol: SymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/core", "WeakMap")
  @js.native
  class WeakMap[K /* <: js.Object */, V] ()
    extends typingsSlinky.std.WeakMap[K, V] {
    def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  }
  @JSImport("core-js/core", "WeakMap")
  @js.native
  val WeakMap: WeakMapConstructor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/core", "WeakSet")
  @js.native
  class WeakSet[T /* <: js.Object */] ()
    extends typingsSlinky.std.WeakSet[T] {
    def this(iterable: js.Iterable[T]) = this()
    def this(values: js.Array[T]) = this()
  }
  @JSImport("core-js/core", "WeakSet")
  @js.native
  val WeakSet: WeakSetConstructor = js.native
  
  @JSImport("core-js/core", "_")
  @js.native
  val _underscore: Boolean = js.native
  
  @JSImport("core-js/core", "addLocale")
  @js.native
  def addLocale(lang: java.lang.String, locale: Locale): Typeofcore = js.native
  
  @JSImport("core-js/core", "clearImmediate")
  @js.native
  def clearImmediate(handle: Double): Unit = js.native
  
  @JSImport("core-js/core", "delay")
  @js.native
  def delay(msec: Double): js.Promise[Unit] = js.native
  
  @JSImport("core-js/core", "getIterator")
  @js.native
  def getIterator[T](iterable: js.Iterable[T]): js.Iterator[T] = js.native
  
  @JSImport("core-js/core", "global")
  @js.native
  val global: js.Any = js.native
  
  @JSImport("core-js/core", "isIterable")
  @js.native
  def isIterable(value: js.Any): Boolean = js.native
  
  @JSImport("core-js/core", "locale")
  @js.native
  def locale(): java.lang.String = js.native
  @JSImport("core-js/core", "locale")
  @js.native
  def locale(lang: java.lang.String): java.lang.String = js.native
  
  @JSImport("core-js/core", "setImmediate")
  @js.native
  def setImmediate(expression: js.Any, args: js.Any*): Double = js.native
  
  @JSImport("core-js/core", "setInterval")
  @js.native
  def setInterval(handler: js.Any, timeout: js.UndefOr[scala.Nothing], args: js.Any*): Double = js.native
  @JSImport("core-js/core", "setInterval")
  @js.native
  def setInterval(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
  
  @JSImport("core-js/core", "setTimeout")
  @js.native
  def setTimeout(handler: js.Any, timeout: js.UndefOr[scala.Nothing], args: js.Any*): Double = js.native
  @JSImport("core-js/core", "setTimeout")
  @js.native
  def setTimeout(handler: js.Any, timeout: js.Any, args: js.Any*): Double = js.native
  
  @JSImport("core-js/core", "version")
  @js.native
  val version: java.lang.String = js.native
  
  @JSImport("core-js/core", "$for")
  @js.native
  def `for`[T](iterable: js.Iterable[T]): typingsSlinky.coreJs.`for`[T] = js.native
}
