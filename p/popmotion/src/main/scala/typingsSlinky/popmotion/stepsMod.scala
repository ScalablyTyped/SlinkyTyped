package typingsSlinky.popmotion

import typingsSlinky.popmotion.easingTypesMod.Easing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepsMod {
  
  @JSImport("popmotion/lib/easing/steps", "steps")
  @js.native
  def steps(steps: Double): Easing = js.native
  @JSImport("popmotion/lib/easing/steps", "steps")
  @js.native
  def steps(steps: Double, direction: Direction): Easing = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.popmotion.popmotionStrings.start
    - typingsSlinky.popmotion.popmotionStrings.end
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def end: typingsSlinky.popmotion.popmotionStrings.end = "end".asInstanceOf[typingsSlinky.popmotion.popmotionStrings.end]
    
    @scala.inline
    def start: typingsSlinky.popmotion.popmotionStrings.start = "start".asInstanceOf[typingsSlinky.popmotion.popmotionStrings.start]
  }
}
