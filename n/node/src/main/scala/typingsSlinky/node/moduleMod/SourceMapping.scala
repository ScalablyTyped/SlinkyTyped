package typingsSlinky.node.moduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMapping extends js.Object {
  var generatedColumn: Double = js.native
  var generatedLine: Double = js.native
  var originalColumn: Double = js.native
  var originalLine: Double = js.native
  var originalSource: String = js.native
}

object SourceMapping {
  @scala.inline
  def apply(
    generatedColumn: Double,
    generatedLine: Double,
    originalColumn: Double,
    originalLine: Double,
    originalSource: String
  ): SourceMapping = {
    val __obj = js.Dynamic.literal(generatedColumn = generatedColumn.asInstanceOf[js.Any], generatedLine = generatedLine.asInstanceOf[js.Any], originalColumn = originalColumn.asInstanceOf[js.Any], originalLine = originalLine.asInstanceOf[js.Any], originalSource = originalSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapping]
  }
  @scala.inline
  implicit class SourceMappingOps[Self <: SourceMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeneratedColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatedColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeneratedLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generatedLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalSource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

