package typingsSlinky.jqueryDrawer

import typingsSlinky.jqueryDrawer.jqueryDrawerStrings.close
import typingsSlinky.jqueryDrawer.jqueryDrawerStrings.destroy
import typingsSlinky.jqueryDrawer.jqueryDrawerStrings.drawerDotclosed
import typingsSlinky.jqueryDrawer.jqueryDrawerStrings.drawerDotopened
import typingsSlinky.jqueryDrawer.jqueryDrawerStrings.open
import typingsSlinky.jqueryDrawer.jqueryDrawerStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends js.Object {
  
  def drawer(): JQuery = js.native
  def drawer(options: JQueryDrawerOptions): JQuery = js.native
  @JSName("drawer")
  def drawer_close(method: close): JQuery = js.native
  @JSName("drawer")
  def drawer_destroy(method: destroy): JQuery = js.native
  @JSName("drawer")
  def drawer_open(method: open): JQuery = js.native
  @JSName("drawer")
  def drawer_toggle(method: toggle): JQuery = js.native
  
  @JSName("on")
  def on_drawerclosed(event: drawerDotclosed, handler: js.Function0[Unit]): JQuery = js.native
  @JSName("on")
  def on_draweropened(event: drawerDotopened, handler: js.Function0[Unit]): JQuery = js.native
}
