package typingsSlinky.angularCompiler.srcSummaryResolverMod

import typingsSlinky.angularCompiler.compileMetadataMod.CompileTypeSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Summary[T] extends js.Object {
  var metadata: js.Any
  var symbol: T
  var `type`: js.UndefOr[CompileTypeSummary] = js.undefined
}

object Summary {
  @scala.inline
  def apply[T](metadata: js.Any, symbol: T): Summary[T] = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Summary[T]]
  }
  @scala.inline
  implicit class SummaryOps[Self <: Summary[_], T] (val x: Self with Summary[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbol(value: T): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: CompileTypeSummary): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

