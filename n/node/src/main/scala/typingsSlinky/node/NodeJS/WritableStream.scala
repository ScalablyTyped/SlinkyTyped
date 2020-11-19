package typingsSlinky.node.NodeJS

import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WritableStream extends EventEmitter {
  
  def end(): Unit = js.native
  def end(cb: js.Function0[Unit]): Unit = js.native
  def end(data: String): Unit = js.native
  def end(data: String, cb: js.Function0[Unit]): Unit = js.native
  def end(data: js.typedarray.Uint8Array): Unit = js.native
  def end(data: js.typedarray.Uint8Array, cb: js.Function0[Unit]): Unit = js.native
  def end(str: String, encoding: js.UndefOr[scala.Nothing], cb: js.Function0[Unit]): Unit = js.native
  def end(str: String, encoding: BufferEncoding): Unit = js.native
  def end(str: String, encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
  
  var writable: Boolean = js.native
  
  def write(buffer: String): Boolean = js.native
  def write(buffer: String, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
  def write(buffer: js.typedarray.Uint8Array): Boolean = js.native
  def write(buffer: js.typedarray.Uint8Array, cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Boolean = js.native
  def write(
    str: String,
    encoding: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
  ): Boolean = js.native
  def write(str: String, encoding: BufferEncoding): Boolean = js.native
  def write(
    str: String,
    encoding: BufferEncoding,
    cb: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
  ): Boolean = js.native
}
