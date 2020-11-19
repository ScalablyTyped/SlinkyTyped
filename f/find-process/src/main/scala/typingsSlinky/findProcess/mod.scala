package typingsSlinky.findProcess

import typingsSlinky.findProcess.anon.Cmd
import typingsSlinky.findProcess.findProcessStrings.name
import typingsSlinky.findProcess.findProcessStrings.pid
import typingsSlinky.findProcess.findProcessStrings.port
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("find-process", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(`type`: name, value: String): js.Promise[js.Array[Cmd]] = js.native
  def apply(`type`: name, value: String, strict: Boolean): js.Promise[js.Array[Cmd]] = js.native
  def apply(`type`: name, value: Double): js.Promise[js.Array[Cmd]] = js.native
  def apply(`type`: name, value: Double, strict: Boolean): js.Promise[js.Array[Cmd]] = js.native
  def apply(`type`: name, value: js.RegExp): js.Promise[js.Array[Cmd]] = js.native
  def apply(`type`: name, value: js.RegExp, strict: Boolean): js.Promise[js.Array[Cmd]] = js.native
  def apply(`type`: pid, value: String): js.Promise[js.Array[Cmd]] = js.native
  def apply(`type`: pid, value: String, strict: Boolean): js.Promise[js.Array[Cmd]] = js.native
  def apply(`type`: pid, value: Double): js.Promise[js.Array[Cmd]] = js.native
  def apply(`type`: pid, value: Double, strict: Boolean): js.Promise[js.Array[Cmd]] = js.native
  def apply(`type`: pid, value: js.RegExp): js.Promise[js.Array[Cmd]] = js.native
  def apply(`type`: pid, value: js.RegExp, strict: Boolean): js.Promise[js.Array[Cmd]] = js.native
  def apply(`type`: port, value: String): js.Promise[js.Array[Cmd]] = js.native
  def apply(`type`: port, value: String, strict: Boolean): js.Promise[js.Array[Cmd]] = js.native
  def apply(`type`: port, value: Double): js.Promise[js.Array[Cmd]] = js.native
  def apply(`type`: port, value: Double, strict: Boolean): js.Promise[js.Array[Cmd]] = js.native
  def apply(`type`: port, value: js.RegExp): js.Promise[js.Array[Cmd]] = js.native
  def apply(`type`: port, value: js.RegExp, strict: Boolean): js.Promise[js.Array[Cmd]] = js.native
}
