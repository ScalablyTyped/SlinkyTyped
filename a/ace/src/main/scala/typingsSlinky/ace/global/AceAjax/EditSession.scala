package typingsSlinky.ace.global.AceAjax

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.ace.AceAjax.IEditSession
import typingsSlinky.ace.AceAjax.TextMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AceAjax.EditSession")
@js.native
class EditSession protected () extends IEditSession {
  /**
    * Sets up a new `EditSession` and associates it with the given `Document` and `TextMode`.
    * @param text [If `text` is a `Document`, it associates the `EditSession` with it. Otherwise, a new `Document` is created, with the initial text]{: #textParam}
    * @param mode [The inital language mode to use for the document]{: #modeParam}
    **/
  def this(text: String) = this()
  def this(text: js.Array[String]) = this()
  def this(content: String, mode: String) = this()
  def this(text: String, mode: TextMode) = this()
  def this(text: js.Array[String], mode: String) = this()
}
@JSGlobal("AceAjax.EditSession")
@js.native
object EditSession
  extends /**
  * Sets up a new `EditSession` and associates it with the given `Document` and `TextMode`.
  * @param text [If `text` is a `Document`, it associates the `EditSession` with it. Otherwise, a new `Document` is created, with the initial text]{: #textParam}
  * @param mode [The inital language mode to use for the document]{: #modeParam}
  **/
Instantiable1[(/* text */ js.Array[String]) | (/* text */ String), IEditSession]
     with Instantiable2[
      (/* text */ js.Array[String]) | (/* content */ String), 
      (/* mode */ String) | (/* mode */ TextMode), 
      IEditSession
    ]
