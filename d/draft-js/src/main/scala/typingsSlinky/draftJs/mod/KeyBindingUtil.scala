package typingsSlinky.draftJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("draft-js", "KeyBindingUtil")
@js.native
class KeyBindingUtil ()
  extends typingsSlinky.draftJs.mod.Draft.Component.Utils.KeyBindingUtil
/* static members */
@JSImport("draft-js", "KeyBindingUtil")
@js.native
object KeyBindingUtil extends js.Object {
  
  def hasCommandModifier(e: slinky.web.SyntheticKeyboardEvent[js.Object]): Boolean = js.native
  
  /**
    * Check whether the ctrlKey modifier is *not* being used in conjunction with
    * the altKey modifier. If they are combined, the result is an `altGraph`
    * key modifier, which should not be handled by this set of key bindings.
    */
  def isCtrlKeyCommand(e: slinky.web.SyntheticKeyboardEvent[js.Object]): Boolean = js.native
  
  def isOptionKeyCommand(e: slinky.web.SyntheticKeyboardEvent[js.Object]): Boolean = js.native
  
  def isSoftNewlineEvent(e: slinky.web.SyntheticKeyboardEvent[js.Object]): Boolean = js.native
  
  /**
    * Check whether heuristics that only apply to macOS are used
    * internally, for example when determining the key combination
    * used as command modifier.
    */
  def usesMacOSHeuristics(): Boolean = js.native
}
