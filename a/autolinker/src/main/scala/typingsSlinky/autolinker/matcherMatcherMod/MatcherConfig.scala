package typingsSlinky.autolinker.matcherMatcherMod

import typingsSlinky.autolinker.anchorTagBuilderMod.AnchorTagBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatcherConfig extends js.Object {
  
  var tagBuilder: AnchorTagBuilder = js.native
}
object MatcherConfig {
  
  @scala.inline
  def apply(tagBuilder: AnchorTagBuilder): MatcherConfig = {
    val __obj = js.Dynamic.literal(tagBuilder = tagBuilder.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatcherConfig]
  }
  
  @scala.inline
  implicit class MatcherConfigOps[Self <: MatcherConfig] (val x: Self) extends AnyVal {
    
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
    def setTagBuilder(value: AnchorTagBuilder): Self = this.set("tagBuilder", value.asInstanceOf[js.Any])
  }
}
