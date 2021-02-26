package typingsSlinky.coreObject

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Exclude
import typingsSlinky.std.IArguments
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @js.native
  trait CallOrApply[This, Args, Return] extends StObject {
    
    @JSName("apply")
    def apply(thisArg: This, args: Args | IArguments | js.Array[_]): Return = js.native
    
    // TODO support this properly with `...args: Args` once we can restrict to 3.0+ on DT
    var call: (js.Function2[/* thisArg */ This, /* repeated */ js.Any, Return]) | (js.Function5[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, /* d */ js.Any, Return]) | (js.Function4[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, Return]) | (js.Function3[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, Return]) | (js.Function1[/* thisArg */ This, Return]) = js.native
  }
  object CallOrApply {
    
    @scala.inline
    def apply[This, Args, Return](
      apply: (This, Args | IArguments | js.Array[_]) => Return,
      call: (js.Function2[/* thisArg */ This, /* repeated */ js.Any, Return]) | (js.Function5[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, /* d */ js.Any, Return]) | (js.Function4[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, Return]) | (js.Function3[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, Return]) | (js.Function1[/* thisArg */ This, Return])
    ): CallOrApply[This, Args, Return] = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), call = call.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallOrApply[This, Args, Return]]
    }
    
    @scala.inline
    implicit class CallOrApplyMutableBuilder[Self <: CallOrApply[_, _, _], This, Args, Return] (val x: Self with (CallOrApply[This, Args, Return])) extends AnyVal {
      
      @scala.inline
      def setApply(value: (This, Args | IArguments | js.Array[_]) => Return): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCall(
        value: (js.Function2[/* thisArg */ This, /* repeated */ js.Any, Return]) | (js.Function5[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, /* d */ js.Any, Return]) | (js.Function4[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, Return]) | (js.Function3[/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, Return]) | (js.Function1[/* thisArg */ This, Return])
      ): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallFunction1(value: /* thisArg */ This => Return): Self = StObject.set(x, "call", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallFunction2(value: (/* thisArg */ This, /* repeated */ js.Any) => Return): Self = StObject.set(x, "call", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCallFunction3(value: (/* thisArg */ This, /* a */ js.Any, /* b */ js.Any) => Return): Self = StObject.set(x, "call", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCallFunction4(value: (/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any) => Return): Self = StObject.set(x, "call", js.Any.fromFunction4(value))
      
      @scala.inline
      def setCallFunction5(
        value: (/* thisArg */ This, /* a */ js.Any, /* b */ js.Any, /* c */ js.Any, /* d */ js.Any) => Return
      ): Self = StObject.set(x, "call", js.Any.fromFunction5(value))
    }
  }
  
  type Constructor[Instance] = Instantiable1[/* args (repeated) */ js.Any, Instance]
  
  type MethodNames[T] = Values[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends (args : ...any): any? K : never}
    */ typingsSlinky.coreObject.coreObjectStrings.MethodNames with TopLevel[T]
  ]
  
  type Mix[T, U] = U with (Pick[T, Exclude[/* keyof T */ String, /* keyof U */ String]])
  
  type Super[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in core-object.core-object/-private/utils.MethodNames<T> ]: T[K] extends (): infer Return? core-object.core-object/-private/utils.CallOrApply<T, undefined, any> : T[K] extends (a : infer A): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [any], any> : T[K] extends (a : infer A, b : infer B): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [any, any], any> : T[K] extends (a : infer A, b : infer B, c : infer C): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [any, any, any], any> : T[K] extends (a : infer A, b : infer B, c : infer C, d : infer D): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [any, any, any, any], any> : T[K] extends (args : ...any): infer Return? core-object.core-object/-private/utils.CallOrApply<T, std.Array<any>, any> : never}
    */ typingsSlinky.coreObject.coreObjectStrings.Super with TopLevel[js.Any]
  
  type Values[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
