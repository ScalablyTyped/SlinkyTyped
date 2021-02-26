package typingsSlinky.baseui.inputMod

import typingsSlinky.baseui.baseuiStrings.both
import typingsSlinky.baseui.baseuiStrings.left
import typingsSlinky.baseui.baseuiStrings.none
import typingsSlinky.baseui.baseuiStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ADJOINED extends StObject {
  
  var both: typingsSlinky.baseui.baseuiStrings.both = js.native
  
  var left: typingsSlinky.baseui.baseuiStrings.left = js.native
  
  var none: typingsSlinky.baseui.baseuiStrings.none = js.native
  
  var right: typingsSlinky.baseui.baseuiStrings.right = js.native
}
object ADJOINED {
  
  @JSImport("baseui/input", "ADJOINED")
  @js.native
  val ^ : ADJOINED = js.native
  
  @scala.inline
  implicit class ADJOINEDMutableBuilder[Self <: ADJOINED] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoth(value: both): Self = StObject.set(x, "both", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: none): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
