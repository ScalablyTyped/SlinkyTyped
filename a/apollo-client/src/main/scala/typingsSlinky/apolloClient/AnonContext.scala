package typingsSlinky.apolloClient

import typingsSlinky.graphql.astMod.DocumentNode
import typingsSlinky.graphql.executeMod.ExecutionResult
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContext[TData] extends js.Object {
  var context: js.UndefOr[Record[String, _]] = js.native
  var document: DocumentNode | Null = js.native
  var onlyRunForcedResolvers: js.UndefOr[Boolean] = js.native
  var remoteResult: ExecutionResult[TData] = js.native
  var variables: js.UndefOr[Record[String, _]] = js.native
}

object AnonContext {
  @scala.inline
  def apply[TData](remoteResult: ExecutionResult[TData]): AnonContext[TData] = {
    val __obj = js.Dynamic.literal(remoteResult = remoteResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext[TData]]
  }
  @scala.inline
  implicit class AnonContextOps[Self[tdata] <: AnonContext[tdata], TData] (val x: Self[TData]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TData] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TData]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TData] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TData] with Other]
    @scala.inline
    def withRemoteResult(value: ExecutionResult[TData]): Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: Record[String, _]): Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDocument(value: DocumentNode): Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentNull: Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("document")(null)
        ret
    }
    @scala.inline
    def withOnlyRunForcedResolvers(value: Boolean): Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyRunForcedResolvers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyRunForcedResolvers: Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyRunForcedResolvers")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: Record[String, _]): Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self[TData] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

