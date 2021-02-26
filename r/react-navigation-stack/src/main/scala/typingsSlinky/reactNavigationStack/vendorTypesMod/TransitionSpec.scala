package typingsSlinky.reactNavigationStack.vendorTypesMod

import typingsSlinky.reactNavigationStack.anon.OmitSpringAnimationConfig
import typingsSlinky.reactNavigationStack.anon.OmitTimingAnimationConfig
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.spring
import typingsSlinky.reactNavigationStack.reactNavigationStackStrings.timing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactNavigationStack.anon.Animation
  - typingsSlinky.reactNavigationStack.anon.Config
*/
trait TransitionSpec extends StObject
object TransitionSpec {
  
  @scala.inline
  def Animation(animation: spring, config: OmitSpringAnimationConfig): typingsSlinky.reactNavigationStack.anon.Animation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigationStack.anon.Animation]
  }
  
  @scala.inline
  def Config(animation: timing, config: OmitTimingAnimationConfig): typingsSlinky.reactNavigationStack.anon.Config = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactNavigationStack.anon.Config]
  }
}
