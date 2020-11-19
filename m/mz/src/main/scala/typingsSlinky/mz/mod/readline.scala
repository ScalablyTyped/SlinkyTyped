package typingsSlinky.mz.mod

import typingsSlinky.mz.readlineMod.Completer
import typingsSlinky.mz.readlineMod.ReadLineOptions
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.readlineMod.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz", "readline")
@js.native
object readline extends js.Object {
  
  /**
    * Clears the current line of this WriteStream in a direction identified by `dir`.
    */
  def clearLine(stream: WritableStream, dir: Direction): Boolean = js.native
  def clearLine(stream: WritableStream, dir: Direction, callback: js.Function0[Unit]): Boolean = js.native
  
  /**
    * Clears this `WriteStream` from the current cursor down.
    */
  def clearScreenDown(stream: WritableStream): Boolean = js.native
  def clearScreenDown(stream: WritableStream, callback: js.Function0[Unit]): Boolean = js.native
  
  def createInterface(input: ReadableStream): typingsSlinky.mz.readlineMod.Interface = js.native
  def createInterface(
    input: ReadableStream,
    output: js.UndefOr[scala.Nothing],
    completer: js.UndefOr[Completer],
    terminal: Boolean
  ): typingsSlinky.mz.readlineMod.Interface = js.native
  def createInterface(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: Completer): typingsSlinky.mz.readlineMod.Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream): typingsSlinky.mz.readlineMod.Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: js.UndefOr[Completer], terminal: Boolean): typingsSlinky.mz.readlineMod.Interface = js.native
  def createInterface(input: ReadableStream, output: WritableStream, completer: Completer): typingsSlinky.mz.readlineMod.Interface = js.native
  def createInterface(options: ReadLineOptions): typingsSlinky.mz.readlineMod.Interface = js.native
  
  /**
    * Moves this WriteStream's cursor to the specified position.
    */
  def cursorTo(stream: WritableStream, x: Double): Boolean = js.native
  def cursorTo(stream: WritableStream, x: Double, y: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Boolean = js.native
  def cursorTo(stream: WritableStream, x: Double, y: Double): Boolean = js.native
  def cursorTo(stream: WritableStream, x: Double, y: Double, callback: js.Function0[Unit]): Boolean = js.native
  
  def emitKeypressEvents(stream: ReadableStream): Unit = js.native
  def emitKeypressEvents(stream: ReadableStream, readlineInterface: typingsSlinky.node.readlineMod.Interface): Unit = js.native
  
  /**
    * Moves this WriteStream's cursor relative to its current position.
    */
  def moveCursor(stream: WritableStream, dx: Double, dy: Double): Boolean = js.native
  def moveCursor(stream: WritableStream, dx: Double, dy: Double, callback: js.Function0[Unit]): Boolean = js.native
  
  @js.native
  class Interface ()
    extends typingsSlinky.mz.readlineMod.Interface
}
