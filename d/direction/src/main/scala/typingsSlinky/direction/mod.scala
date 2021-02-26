package typingsSlinky.direction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Detect direction: left-to-right, right-to-left, or neutral.
    *
    * @example
    * ```
    * direction('anglais') // => 'ltr'
    * direction('بسيطة') // => 'rtl'
    * direction('?') // => 'neutral'
    * ```
    */
  @JSImport("direction", JSImport.Namespace)
  @js.native
  def apply(value: String): Direction = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.direction.directionStrings.ltr
    - typingsSlinky.direction.directionStrings.rtl
    - typingsSlinky.direction.directionStrings.neutral
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def ltr: typingsSlinky.direction.directionStrings.ltr = "ltr".asInstanceOf[typingsSlinky.direction.directionStrings.ltr]
    
    @scala.inline
    def neutral: typingsSlinky.direction.directionStrings.neutral = "neutral".asInstanceOf[typingsSlinky.direction.directionStrings.neutral]
    
    @scala.inline
    def rtl: typingsSlinky.direction.directionStrings.rtl = "rtl".asInstanceOf[typingsSlinky.direction.directionStrings.rtl]
  }
}
