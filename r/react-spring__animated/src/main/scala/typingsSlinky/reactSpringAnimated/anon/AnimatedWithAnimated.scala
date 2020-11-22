package typingsSlinky.reactSpringAnimated.anon

import typingsSlinky.reactSpringAnimated.mod.WithAnimated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimatedWithAnimated extends js.Object {
  
  var animated: WithAnimated = js.native
}
object AnimatedWithAnimated {
  
  @scala.inline
  def apply(animated: WithAnimated): AnimatedWithAnimated = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedWithAnimated]
  }
  
  @scala.inline
  implicit class AnimatedWithAnimatedOps[Self <: AnimatedWithAnimated] (val x: Self) extends AnyVal {
    
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
    def setAnimated(value: WithAnimated): Self = this.set("animated", value.asInstanceOf[js.Any])
  }
}
