package typingsSlinky.makeDir.anon

import typingsSlinky.makeDir.makeDirStrings.buffer
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.anon.`2`
import typingsSlinky.node.fsMod.BaseEncodingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofmkdtemp extends StObject {
  
  def apply(prefix: String, callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]): Unit = js.native
  def apply(
    prefix: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String | Buffer, Unit]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ String, Unit]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: `2`,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
  ): Unit = js.native
  def apply(
    prefix: String,
    options: BaseEncodingOptions,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ String), Unit]
  ): Unit = js.native
}
