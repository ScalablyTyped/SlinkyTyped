package typingsSlinky.angularCompiler.compileMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompileTypeSummary extends js.Object {
  var summaryKind: CompileSummaryKind | Null = js.native
  var `type`: CompileTypeMetadata = js.native
}

object CompileTypeSummary {
  @scala.inline
  def apply(`type`: CompileTypeMetadata): CompileTypeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileTypeSummary]
  }
  @scala.inline
  implicit class CompileTypeSummaryOps[Self <: CompileTypeSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: CompileTypeMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummaryKind(value: CompileSummaryKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummaryKindNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryKind")(null)
        ret
    }
  }
  
}

