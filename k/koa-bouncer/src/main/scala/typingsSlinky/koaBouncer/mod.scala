package typingsSlinky.koaBouncer

import typingsSlinky.koa.mod.Context
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.koaBouncer.anon.Ctx
import typingsSlinky.koaBouncer.anon.Key
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-bouncer", "ValidationError")
  @js.native
  class ValidationError protected () extends Error {
    def this(key: String, message: String) = this()
    
    var bouncer: Key = js.native
  }
  
  @JSImport("koa-bouncer", "Validator")
  @js.native
  class Validator protected () extends StObject {
    def this(props: Ctx) = this()
    
    def check(result: js.Any): Validator = js.native
    def check(result: js.Any, tip: String): Validator = js.native
    
    def checkNot(result: js.Any): Validator = js.native
    def checkNot(result: js.Any, tip: String): Validator = js.native
    
    def checkNotPred(pred: js.Any): Validator = js.native
    def checkNotPred(pred: js.Any, tip: String): Validator = js.native
    
    def checkPred(pred: js.Any): Validator = js.native
    def checkPred(pred: js.Any, tip: String): Validator = js.native
    
    def clamp(min: Double, max: Double): Validator = js.native
    
    def defaultTo(valueOrFunction: js.Any): Validator = js.native
    
    def encodeBase64(): Validator = js.native
    def encodeBase64(tip: String): Validator = js.native
    
    def eq(otherVal: String): Validator = js.native
    def eq(otherVal: String, tip: String): Validator = js.native
    
    def fromJson(): Validator = js.native
    def fromJson(tip: String): Validator = js.native
    
    def gt(otherVal: Double): Validator = js.native
    def gt(otherVal: Double, tip: String): Validator = js.native
    
    def gte(otherVal: Double): Validator = js.native
    def gte(otherVal: Double, tip: String): Validator = js.native
    
    def isAlpha(): Validator = js.native
    def isAlpha(tip: String): Validator = js.native
    
    def isAlphanumeric(): Validator = js.native
    def isAlphanumeric(tip: String): Validator = js.native
    
    def isArray(): Validator = js.native
    def isArray(tip: String): Validator = js.native
    
    def isAscii(): Validator = js.native
    def isAscii(tip: String): Validator = js.native
    
    def isBase64(): Validator = js.native
    def isBase64(tip: String): Validator = js.native
    
    def isEmail(): Validator = js.native
    def isEmail(tip: String): Validator = js.native
    
    def isFiniteNumber(): Validator = js.native
    def isFiniteNumber(tip: String): Validator = js.native
    
    def isHexColor(): Validator = js.native
    def isHexColor(tip: String): Validator = js.native
    
    def isIn(arr: js.Array[_]): Validator = js.native
    def isIn(arr: js.Array[_], tip: String): Validator = js.native
    
    def isInt(): Validator = js.native
    def isInt(tip: String): Validator = js.native
    
    def isJson(): Validator = js.native
    def isJson(tip: String): Validator = js.native
    
    def isLength(min: Double, max: Double): Validator = js.native
    def isLength(min: Double, max: Double, tip: String): Validator = js.native
    
    def isNotIn(arr: js.Array[_]): Validator = js.native
    def isNotIn(arr: js.Array[_], tip: String): Validator = js.native
    
    def isNumeric(): Validator = js.native
    def isNumeric(tip: String): Validator = js.native
    
    def isString(): Validator = js.native
    def isString(tip: String): Validator = js.native
    
    def isUuid(): Validator = js.native
    def isUuid(tip: String): Validator = js.native
    
    def lt(otherVal: Double): Validator = js.native
    def lt(otherVal: Double, tip: String): Validator = js.native
    
    def lte(otherVal: Double): Validator = js.native
    def lte(otherVal: Double, tip: String): Validator = js.native
    
    def `match`(regexp: js.RegExp): Validator = js.native
    def `match`(regexp: js.RegExp, tip: String): Validator = js.native
    
    def notMatch(regexp: js.RegExp): Validator = js.native
    def notMatch(regexp: js.RegExp, tip: String): Validator = js.native
    
    def optional(): Validator = js.native
    
    def required(): Validator = js.native
    def required(tip: String): Validator = js.native
    
    def tap(f: js.Function1[/* arg */ js.Any, _]): Validator = js.native
    def tap(f: js.Function1[/* arg */ js.Any, _], tip: String): Validator = js.native
    
    def toArray(): Validator = js.native
    
    def toBoolean(): Validator = js.native
    
    def toDecimal(): Validator = js.native
    def toDecimal(tip: String): Validator = js.native
    
    def toFiniteFloat(): Validator = js.native
    
    def toFloat(): Validator = js.native
    def toFloat(tip: String): Validator = js.native
    
    def toInt(): Validator = js.native
    def toInt(tip: String): Validator = js.native
    
    def toInts(): Validator = js.native
    def toInts(tip: String): Validator = js.native
    
    def trim(): Validator = js.native
    
    def uniq(): Validator = js.native
  }
  /* static members */
  object Validator {
    
    @JSImport("koa-bouncer", "Validator.addMethod")
    @js.native
    def addMethod(name: String, fn: js.Function): Unit = js.native
  }
  
  @JSImport("koa-bouncer", "isSafeInteger")
  @js.native
  def isSafeInteger(n: Double): Boolean = js.native
  
  @JSImport("koa-bouncer", "middleware")
  @js.native
  def middleware(): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-bouncer", "middleware")
  @js.native
  def middleware(opts: MiddlewareOption): Middleware[DefaultState, DefaultContext] = js.native
  
  @js.native
  trait MiddlewareOption extends StObject {
    
    var getBody: js.UndefOr[js.Function1[/* ctx */ Context, _]] = js.native
    
    var getParams: js.UndefOr[js.Function1[/* ctx */ Context, _]] = js.native
    
    var getQuery: js.UndefOr[js.Function1[/* ctx */ Context, _]] = js.native
  }
  object MiddlewareOption {
    
    @scala.inline
    def apply(): MiddlewareOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MiddlewareOption]
    }
    
    @scala.inline
    implicit class MiddlewareOptionMutableBuilder[Self <: MiddlewareOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetBody(value: /* ctx */ Context => _): Self = StObject.set(x, "getBody", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetBodyUndefined: Self = StObject.set(x, "getBody", js.undefined)
      
      @scala.inline
      def setGetParams(value: /* ctx */ Context => _): Self = StObject.set(x, "getParams", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetParamsUndefined: Self = StObject.set(x, "getParams", js.undefined)
      
      @scala.inline
      def setGetQuery(value: /* ctx */ Context => _): Self = StObject.set(x, "getQuery", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetQueryUndefined: Self = StObject.set(x, "getQuery", js.undefined)
    }
  }
  
  /* augmented module */
  object koaAugmentingMod {
    
    @js.native
    trait Context extends StObject {
      
      def check(result: js.Any): Unit = js.native
      def check(result: js.Any, tip: String): Unit = js.native
      
      def checkNot(result: js.Any): Validator = js.native
      def checkNot(result: js.Any, tip: String): Validator = js.native
      
      def validateBody(key: String): Validator = js.native
      
      def validateParam(key: String): Validator = js.native
      
      def validateQuery(key: String): Validator = js.native
      
      var vals: js.Any = js.native
    }
  }
}
