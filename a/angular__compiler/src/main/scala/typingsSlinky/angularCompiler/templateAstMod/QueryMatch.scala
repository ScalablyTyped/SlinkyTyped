package typingsSlinky.angularCompiler.templateAstMod

import typingsSlinky.angularCompiler.compileMetadataMod.CompileTokenMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryMatch extends js.Object {
  var queryId: Double = js.native
  var value: CompileTokenMetadata = js.native
}

object QueryMatch {
  @scala.inline
  def apply(queryId: Double, value: CompileTokenMetadata): QueryMatch = {
    val __obj = js.Dynamic.literal(queryId = queryId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryMatch]
  }
  @scala.inline
  implicit class QueryMatchOps[Self <: QueryMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: CompileTokenMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

