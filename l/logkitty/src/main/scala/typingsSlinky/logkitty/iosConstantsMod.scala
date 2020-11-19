package typingsSlinky.logkitty

import typingsSlinky.logkitty.logkittyStrings.DEBUG
import typingsSlinky.logkitty.logkittyStrings.DEFAULT
import typingsSlinky.logkitty.logkittyStrings.ERROR
import typingsSlinky.logkitty.logkittyStrings.INFO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("logkitty/build/ios/constants", JSImport.Namespace)
@js.native
object iosConstantsMod extends js.Object {
  
  @js.native
  object Priority extends js.Object {
    
    var DEBUG: Double = js.native
    
    var DEFAULT: Double = js.native
    
    var ERROR: Double = js.native
    
    var INFO: Double = js.native
    
    def fromLetter(letter: String): Double = js.native
    
    @JSName("fromName")
    def fromName_DEBUG(name: DEBUG): Double = js.native
    @JSName("fromName")
    def fromName_DEFAULT(name: DEFAULT): Double = js.native
    @JSName("fromName")
    def fromName_ERROR(name: ERROR): Double = js.native
    @JSName("fromName")
    def fromName_INFO(name: INFO): Double = js.native
    
    def toLetter(code: Double): String = js.native
    
    def toName(code: Double): DEBUG | INFO | ERROR | DEFAULT = js.native
  }
  
  /* keyof logkitty.anon.DEFAULT */ /* Rewritten from type alias, can be one of: 
    - typingsSlinky.logkitty.logkittyStrings.DEBUG
    - typingsSlinky.logkitty.logkittyStrings.DEFAULT
    - typingsSlinky.logkitty.logkittyStrings.INFO
    - typingsSlinky.logkitty.logkittyStrings.ERROR
  */
  trait PriorityNames extends js.Object
}
