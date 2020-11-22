package typingsSlinky.babelParser.mod

import typingsSlinky.babelParser.babelParserStrings.fsharp
import typingsSlinky.babelParser.babelParserStrings.minimal
import typingsSlinky.babelParser.babelParserStrings.smart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipelineOperatorPluginOptions extends js.Object {
  
  var proposal: fsharp | minimal | smart = js.native
}
object PipelineOperatorPluginOptions {
  
  @scala.inline
  def apply(proposal: fsharp | minimal | smart): PipelineOperatorPluginOptions = {
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProposal(value: fsharp | minimal | smart): Self = this.set("proposal", value.asInstanceOf[js.Any])
  }
}
