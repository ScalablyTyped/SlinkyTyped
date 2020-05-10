package typingsSlinky.angularCompiler.providerAnalyzerMod

import typingsSlinky.angularCompiler.compileMetadataMod.CompileQueryMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryWithId extends js.Object {
  var meta: CompileQueryMetadata = js.native
  var queryId: Double = js.native
}

object QueryWithId {
  @scala.inline
  def apply(meta: CompileQueryMetadata, queryId: Double): QueryWithId = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], queryId = queryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryWithId]
  }
  @scala.inline
  implicit class QueryWithIdOps[Self <: QueryWithId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeta(value: CompileQueryMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

