package typingsSlinky.muibox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dialog extends js.Object {
  
  def alert(options: String): js.Promise[Unit] = js.native
  def alert(options: AlertOptions): js.Promise[Unit] = js.native
  
  def confirm(options: String): js.Promise[Unit] = js.native
  def confirm(options: ConfirmOptions): js.Promise[Unit] = js.native
  
  def prompt(options: String): js.Promise[String] = js.native
  def prompt(options: PromptOptions): js.Promise[String] = js.native
}
