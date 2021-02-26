package typingsSlinky.reactHotkeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _KeySequence extends StObject
object _KeySequence {
  
  @scala.inline
  def ExtendedKeyMapOptions(
    action: KeyEventName,
    sequence: MouseTrapKeySequence,
    sequences: js.Array[KeyMapOptions | MouseTrapKeySequence]
  ): typingsSlinky.reactHotkeys.mod.ExtendedKeyMapOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], sequences = sequences.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactHotkeys.mod.ExtendedKeyMapOptions]
  }
  
  @scala.inline
  def KeyMapOptions(action: KeyEventName, sequence: MouseTrapKeySequence): typingsSlinky.reactHotkeys.mod.KeyMapOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.reactHotkeys.mod.KeyMapOptions]
  }
}
