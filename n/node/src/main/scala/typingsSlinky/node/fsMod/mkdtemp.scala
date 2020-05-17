package typingsSlinky.node.fsMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.anon.Encoding
import typingsSlinky.node.anon.`2`
import typingsSlinky.node.anon.`3`
import typingsSlinky.node.nodeStrings.buffer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs", "mkdtemp")
@js.native
object mkdtemp extends js.Object {
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    */
  def apply(prefix: String, callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]): Unit = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    prefix: String,
    options: js.UndefOr[`3` | BufferEncoding | Encoding | Null | String],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: `2`,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    prefix: String,
    options: buffer_,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
  ): Unit = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("__promisify__")
  def promisify(prefix: String): js.Promise[String] = js.native
  @JSName("__promisify__")
  def promisify(prefix: String, options: String): js.Promise[String | Buffer] = js.native
  @JSName("__promisify__")
  def promisify(prefix: String, options: BufferEncoding): js.Promise[String] = js.native
  @JSName("__promisify__")
  def promisify(prefix: String, options: Encoding): js.Promise[String] = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @JSName("__promisify__")
  def promisify(prefix: String, options: `2`): js.Promise[Buffer] = js.native
  @JSName("__promisify__")
  def promisify(prefix: String, options: `3`): js.Promise[String | Buffer] = js.native
  @JSName("__promisify__")
  def promisify_buffer(prefix: String, options: buffer_): js.Promise[Buffer] = js.native
}

