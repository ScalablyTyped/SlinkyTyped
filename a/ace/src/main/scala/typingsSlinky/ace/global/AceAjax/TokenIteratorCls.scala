package typingsSlinky.ace.global.AceAjax

import typingsSlinky.ace.AceAjax.IEditSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AceAjax.TokenIterator")
@js.native
class TokenIteratorCls protected ()
  extends typingsSlinky.ace.AceAjax.TokenIterator {
  /**
    * Creates a new token iterator object. The inital token index is set to the provided row and column coordinates.
    * @param session The session to associate with
    * @param initialRow The row to start the tokenizing at
    * @param initialColumn The column to start the tokenizing at
    **/
  def this(session: IEditSession, initialRow: Double, initialColumn: Double) = this()
}
