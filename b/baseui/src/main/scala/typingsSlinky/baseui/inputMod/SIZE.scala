package typingsSlinky.baseui.inputMod

import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SIZE extends StObject {
  
  var default: default_ = js.native
  
  var compact: typingsSlinky.baseui.baseuiStrings.compact = js.native
  
  var large: large_ = js.native
  
  var mini: typingsSlinky.baseui.baseuiStrings.mini = js.native
}
object SIZE {
  
  @JSImport("baseui/input", "SIZE")
  @js.native
  val ^ : SIZE = js.native
  
  @scala.inline
  implicit class SIZEMutableBuilder[Self <: SIZE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompact(value: compact): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLarge(value: large_): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMini(value: mini): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
  }
}
