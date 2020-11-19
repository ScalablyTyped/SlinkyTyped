package typingsSlinky.gijgo.Types

import typingsSlinky.gijgo.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Editor extends JQuery {
  
  def content(): String | Editor = js.native
  def content(html: String): String | Editor = js.native
  
  def destroy(): Unit = js.native
}
