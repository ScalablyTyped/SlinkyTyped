package typingsSlinky.firebird.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents BLOB stream.
  *
  * @desc
  * Create BLOB stream using
  * @code var strm = new fb.Stream(FBblob);.
  *
  * You may pipe strm to/from NodeJS Stream objects (fs or socket).
  * You may also look at [NodeJS Streams reference](https://nodejs.org/api/stream.html).
  */
@JSImport("firebird", "Stream")
@js.native
class Stream protected ()
  extends typingsSlinky.node.streamMod.Stream {
  def this(blob: FBBlob) = this()
  
  def check_destroyed(): Unit = js.native
  
  def destroy(): Unit = js.native
  def destroy(error: js.Error): Unit = js.native
  
  def end(): Unit = js.native
  def end(buffer: Buffer): Unit = js.native
  def end(buffer: Buffer, cb: js.Function): Unit = js.native
  def end(str: String): Unit = js.native
  def end(str: String, cb: js.Function): Unit = js.native
  def end(str: String, encoding: js.UndefOr[scala.Nothing], cb: js.Function): Unit = js.native
  def end(str: String, encoding: String): Unit = js.native
  def end(str: String, encoding: String, cb: js.Function): Unit = js.native
  
  def pause(): this.type = js.native
  
  /* NodeJS.ReadStream */
  var readable: Boolean = js.native
  
  def resume(): this.type = js.native
  
  /* NodeJS.WriteStream */
  var writable: Boolean = js.native
  
  def write(buffer: String): Boolean = js.native
  def write(buffer: String, cb: js.Function): Boolean = js.native
  def write(buffer: Buffer): Boolean = js.native
  def write(buffer: Buffer, cb: js.Function): Boolean = js.native
  def write(str: String, encoding: js.UndefOr[scala.Nothing], cb: js.Function): Boolean = js.native
  def write(str: String, encoding: String): Boolean = js.native
  def write(str: String, encoding: String, cb: js.Function): Boolean = js.native
}
