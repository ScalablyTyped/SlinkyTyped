package typingsSlinky.ink

import typingsSlinky.ink.inkStrings.`truncate-end`
import typingsSlinky.ink.inkStrings.`truncate-middle`
import typingsSlinky.ink.inkStrings.`truncate-start`
import typingsSlinky.ink.inkStrings.end
import typingsSlinky.ink.inkStrings.middle
import typingsSlinky.ink.inkStrings.truncate
import typingsSlinky.ink.inkStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ink/build/wrap-text", JSImport.Namespace)
@js.native
object wrapTextMod extends js.Object {
  
  def default(text: String, maxWidth: Double): String = js.native
  @JSName("default")
  def default_end(text: String, maxWidth: Double, wrapType: end): String = js.native
  @JSName("default")
  def default_middle(text: String, maxWidth: Double, wrapType: middle): String = js.native
  @JSName("default")
  def default_truncate(text: String, maxWidth: Double, wrapType: truncate): String = js.native
  @JSName("default")
  def default_truncateend(text: String, maxWidth: Double, wrapType: `truncate-end`): String = js.native
  @JSName("default")
  def default_truncatemiddle(text: String, maxWidth: Double, wrapType: `truncate-middle`): String = js.native
  @JSName("default")
  def default_truncatestart(text: String, maxWidth: Double, wrapType: `truncate-start`): String = js.native
  @JSName("default")
  def default_wrap(text: String, maxWidth: Double, wrapType: wrap): String = js.native
}
