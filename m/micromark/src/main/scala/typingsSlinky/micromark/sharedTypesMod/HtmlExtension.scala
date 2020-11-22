package typingsSlinky.micromark.sharedTypesMod

import typingsSlinky.micromark.typesMod.Type
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.micromark.anon.Enter
  - typingsSlinky.micromark.anon.Exit
*/
trait HtmlExtension extends js.Object
object HtmlExtension {
  
  @scala.inline
  def Enter(enter: Record[Type, js.Function0[Unit]]): HtmlExtension = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlExtension]
  }
  
  @scala.inline
  def Exit(exit: Record[Type, js.Function0[Unit]]): HtmlExtension = {
    val __obj = js.Dynamic.literal(exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlExtension]
  }
}
