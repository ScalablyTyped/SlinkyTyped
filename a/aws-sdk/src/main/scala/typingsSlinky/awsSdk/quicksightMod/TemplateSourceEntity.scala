package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateSourceEntity extends js.Object {
  /**
    * The source analysis, if it is based on an analysis.
    */
  var SourceAnalysis: js.UndefOr[TemplateSourceAnalysis] = js.native
  /**
    * The source template, if it is based on an template.
    */
  var SourceTemplate: js.UndefOr[TemplateSourceTemplate] = js.native
}

object TemplateSourceEntity {
  @scala.inline
  def apply(): TemplateSourceEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateSourceEntity]
  }
  @scala.inline
  implicit class TemplateSourceEntityOps[Self <: TemplateSourceEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceAnalysis(value: TemplateSourceAnalysis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceAnalysis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAnalysis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceAnalysis")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceTemplate(value: TemplateSourceTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceTemplate")(js.undefined)
        ret
    }
  }
  
}

