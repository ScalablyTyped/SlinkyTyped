package typingsSlinky.mithrilGlobal

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.mithril.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Call extends js.Object {
    
    def apply[T](): Stream[T] = js.native
    def apply[T](value: T): Stream[T] = js.native
    
    val SKIP: js.Symbol = js.native
    
    def combine[T](combiner: js.Function1[/* repeated */ js.Any, T], streams: js.Array[Stream[_]]): Stream[T] = js.native
    
    def lift[S /* <: js.Array[_] */, T](
      fn: js.Function1[/* values */ S, T],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param streams because its type {[ I in keyof S ]: Stream<S[I]>} is not an array type */ streams: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ I in keyof S ]: mithril.mithril/stream.Stream<S[I]>}
      */ typingsSlinky.mithrilGlobal.mithrilGlobalStrings.Call with TopLevel[S]
    ): Stream[T] = js.native
    
    def merge[S /* <: js.Array[_] */](
      streams: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ I in keyof S ]: mithril.mithril/stream.Stream<S[I]>}
      */ typingsSlinky.mithrilGlobal.mithrilGlobalStrings.Call with TopLevel[S]
    ): Stream[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ I in keyof S ]: S[I]}
      */ typingsSlinky.mithrilGlobal.mithrilGlobalStrings.Call with TopLevel[S]
      ] = js.native
    
    def scan[T, U](fn: js.Function2[/* acc */ U, /* value */ T, U], acc: U, stream: Stream[T]): Stream[U] = js.native
    
    def scanMerge[U](pairs: js.Array[js.Tuple2[Stream[_], js.Function2[/* acc */ U, /* value */ _, U]]], acc: U): Stream[U] = js.native
    @JSName("scanMerge")
    def scanMerge_TU[T, U](pairs: js.Array[js.Tuple2[Stream[T], js.Function2[/* acc */ U, /* value */ T, U]]], acc: U): Stream[U] = js.native
  }
}
