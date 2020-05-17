package typingsSlinky.makeDir.anon

import typingsSlinky.makeDir.makeDirStrings.buffer
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.anon.Encoding
import typingsSlinky.node.anon.`2`
import typingsSlinky.node.anon.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofmkdtemp extends js.Object {
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
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(
    prefix: String,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
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
  def __promisify__(prefix: String): js.Promise[String] = js.native
  def __promisify__(prefix: String, options: String): js.Promise[String | Buffer] = js.native
  def __promisify__(prefix: String, options: BufferEncoding): js.Promise[String] = js.native
  def __promisify__(prefix: String, options: Encoding): js.Promise[String] = js.native
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def __promisify__(prefix: String, options: `2`): js.Promise[Buffer] = js.native
  def __promisify__(prefix: String, options: `3`): js.Promise[String | Buffer] = js.native
  @JSName("__promisify__")
  def __promisify___buffer(prefix: String, options: buffer): js.Promise[Buffer] = js.native
}

