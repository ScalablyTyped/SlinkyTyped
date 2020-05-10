package typingsSlinky.babelParser.mod

import typingsSlinky.babelParser.babelParserStrings.minimal
import typingsSlinky.babelParser.babelParserStrings.smart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipelineOperatorPluginOptions extends js.Object {
  var proposal: minimal | smart = js.native
}

object PipelineOperatorPluginOptions {
  @scala.inline
  def apply(proposal: minimal | smart): PipelineOperatorPluginOptions = {
    val __obj = js.Dynamic.literal(proposal = proposal.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineOperatorPluginOptions]
  }
  @scala.inline
  implicit class PipelineOperatorPluginOptionsOps[Self <: PipelineOperatorPluginOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProposal(value: minimal | smart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

