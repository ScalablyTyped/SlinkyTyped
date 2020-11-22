package typingsSlinky.micromark.libSharedTypesMod

import typingsSlinky.micromark.constantTypesMod.Type
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.micromark.anon.EnterRecord
  - typingsSlinky.micromark.anon.ExitRecord
*/
trait HtmlExtension extends js.Object
object HtmlExtension {
  
  @scala.inline
  def EnterRecord(enter: Record[Type, js.Function0[Unit]]): HtmlExtension = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlExtension]
  }
  
  @scala.inline
  def ExitRecord(exit: Record[Type, js.Function0[Unit]]): HtmlExtension = {
    val __obj = js.Dynamic.literal(exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlExtension]
  }
}
