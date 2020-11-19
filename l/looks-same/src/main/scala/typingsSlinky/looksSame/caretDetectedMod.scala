package typingsSlinky.looksSame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("looks-same/build/src/lib/ignore-caret-comparator/states/caret-detected", JSImport.Namespace)
@js.native
object caretDetectedMod extends js.Object {
  
  @js.native
  trait CaretDetectedState
    extends typingsSlinky.looksSame.stateMod.default {
    
    def _isInsideCaret(point: js.Any): Boolean = js.native
  }
  
  @js.native
  class default () extends CaretDetectedState
}
