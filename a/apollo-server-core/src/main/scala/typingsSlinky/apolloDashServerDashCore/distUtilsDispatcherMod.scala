package typingsSlinky.apolloDashServerDashCore

import typingsSlinky.apolloDashServerDashCore.distUtilsDispatcherMod.AnyFunction
import typingsSlinky.apolloDashServerDashCore.distUtilsDispatcherMod.Args
import typingsSlinky.apolloDashServerDashCore.distUtilsDispatcherMod.AsFunction
import typingsSlinky.apolloDashServerDashCore.distUtilsDispatcherMod.DidEndHook
import typingsSlinky.apolloDashServerDashCore.distUtilsDispatcherMod.FunctionPropertyNames
import typingsSlinky.apolloDashServerDashCore.distUtilsDispatcherMod.UnwrapPromise
import typingsSlinky.std.Required
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-core/dist/utils/dispatcher", JSImport.Namespace)
@js.native
object distUtilsDispatcherMod extends js.Object {
  @js.native
  class Dispatcher[T] protected () extends js.Object {
    def this(targets: js.Array[T]) = this()
    var targets: js.Array[T] = js.native
    def invokeDidStartHook[TMethodName /* <: FunctionPropertyNames[Required[T], js.Function1[/* repeated */ _, AnyFunction | Unit]] */, TEndHookArgs /* <: Args[
        ReturnType[
          AsFunction[
            /* import warning: importer.ImportType#apply Failed type conversion: T[TMethodName] */ js.Any
          ]
        ]
      ] */](
      methodName: TMethodName,
      /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Args<T[TMethodName]> is not an array type */ args: Args[
          /* import warning: importer.ImportType#apply Failed type conversion: T[TMethodName] */ js.Any
        ]
    ): DidEndHook[TEndHookArgs] = js.native
    def invokeHookAsync[TMethodName /* <: FunctionPropertyNames[Required[T], AnyFunction] */](
      methodName: TMethodName,
      /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Args<T[TMethodName]> is not an array type */ args: Args[
          /* import warning: importer.ImportType#apply Failed type conversion: T[TMethodName] */ js.Any
        ]
    ): js.Promise[
        js.Array[
          UnwrapPromise[
            ReturnType[
              AsFunction[
                /* import warning: importer.ImportType#apply Failed type conversion: T[TMethodName] */ js.Any
              ]
            ]
          ]
        ]
      ] = js.native
    def invokeHooksUntilNonNull[TMethodName /* <: FunctionPropertyNames[Required[T], AnyFunction] */](
      methodName: TMethodName,
      /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Args<T[TMethodName]> is not an array type */ args: Args[
          /* import warning: importer.ImportType#apply Failed type conversion: T[TMethodName] */ js.Any
        ]
    ): js.Promise[
        (UnwrapPromise[
          ReturnType[
            AsFunction[
              /* import warning: importer.ImportType#apply Failed type conversion: T[TMethodName] */ js.Any
            ]
          ]
        ]) | Null
      ] = js.native
  }
  
  type AnyFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type Args[F] = js.Any
  type AsFunction[F] = F
  type DidEndHook[TArgs /* <: js.Array[_] */] = js.Function1[/* args */ TArgs, Unit]
  type FunctionPropertyNames[T, F /* <: AnyFunction */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends F? K : never}[keyof T] */ js.Any
  type UnwrapPromise[T] = T
}

