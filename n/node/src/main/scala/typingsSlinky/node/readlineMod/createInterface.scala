package typingsSlinky.node.readlineMod

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("readline", "createInterface")
@js.native
object createInterface extends js.Object {
  
  def apply(input: ReadableStream): Interface = js.native
  def apply(
    input: ReadableStream,
    output: js.UndefOr[scala.Nothing],
    completer: js.UndefOr[scala.Nothing],
    terminal: Boolean
  ): Interface = js.native
  def apply(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: AsyncCompleter): Interface = js.native
  def apply(
    input: ReadableStream,
    output: js.UndefOr[scala.Nothing],
    completer: AsyncCompleter,
    terminal: Boolean
  ): Interface = js.native
  def apply(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: Completer): Interface = js.native
  def apply(input: ReadableStream, output: js.UndefOr[scala.Nothing], completer: Completer, terminal: Boolean): Interface = js.native
  def apply(input: ReadableStream, output: WritableStream): Interface = js.native
  def apply(
    input: ReadableStream,
    output: WritableStream,
    completer: js.UndefOr[scala.Nothing],
    terminal: Boolean
  ): Interface = js.native
  def apply(input: ReadableStream, output: WritableStream, completer: AsyncCompleter): Interface = js.native
  def apply(input: ReadableStream, output: WritableStream, completer: AsyncCompleter, terminal: Boolean): Interface = js.native
  def apply(input: ReadableStream, output: WritableStream, completer: Completer): Interface = js.native
  def apply(input: ReadableStream, output: WritableStream, completer: Completer, terminal: Boolean): Interface = js.native
  def apply(options: ReadLineOptions): Interface = js.native
}
