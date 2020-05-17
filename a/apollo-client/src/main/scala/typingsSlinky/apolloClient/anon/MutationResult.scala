package typingsSlinky.apolloClient.anon

import typingsSlinky.apolloLink.typesMod.FetchResult
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationResult[T] extends js.Object {
  var mutationResult: FetchResult[T, Record[String, _], Record[String, _]] = js.native
  var queryName: js.UndefOr[String] = js.native
  var queryVariables: Record[String, _] = js.native
}

object MutationResult {
  @scala.inline
  def apply[T](
    mutationResult: FetchResult[T, Record[String, _], Record[String, _]],
    queryVariables: Record[String, _]
  ): MutationResult[T] = {
    val __obj = js.Dynamic.literal(mutationResult = mutationResult.asInstanceOf[js.Any], queryVariables = queryVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult[T]]
  }
  @scala.inline
  implicit class MutationResultOps[Self[t] <: MutationResult[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withMutationResult(value: FetchResult[T, Record[String, _], Record[String, _]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mutationResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryVariables(value: Record[String, _]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryName")(js.undefined)
        ret
    }
  }
  
}

