package typingsSlinky.graphqlTools.mod

import typingsSlinky.dataloader.mod.Options
import typingsSlinky.graphqlToolsBatchDelegate.typesMod.BatchDelegateFn
import typingsSlinky.graphqlToolsBatchDelegate.typesMod.BatchDelegateOptionsFn
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "createBatchDelegateFn")
@js.native
object createBatchDelegateFn extends js.Object {
  def apply[K, V, C](
    argFn: js.Function1[/* args */ js.Array[K], Record[String, _]],
    batchDelegateOptionsFn: BatchDelegateOptionsFn[Record[String, _], _]
  ): BatchDelegateFn[K, _] = js.native
  def apply[K, V, C](
    argFn: js.Function1[/* args */ js.Array[K], Record[String, _]],
    batchDelegateOptionsFn: BatchDelegateOptionsFn[Record[String, _], _],
    dataLoaderOptions: Options[K, V, C]
  ): BatchDelegateFn[K, _] = js.native
}

