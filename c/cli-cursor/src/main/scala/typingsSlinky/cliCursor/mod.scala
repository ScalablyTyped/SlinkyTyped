package typingsSlinky.cliCursor

import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cli-cursor", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def hide(): Unit = js.native
  def hide(stream: WritableStream): Unit = js.native
  
  def show(): Unit = js.native
  def show(stream: WritableStream): Unit = js.native
  
  def toggle(): Unit = js.native
  def toggle(force: js.UndefOr[scala.Nothing], stream: WritableStream): Unit = js.native
  def toggle(force: Boolean): Unit = js.native
  def toggle(force: Boolean, stream: WritableStream): Unit = js.native
}
