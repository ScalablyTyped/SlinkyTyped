package typingsSlinky.browserify.mod

import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Browserify accepts a filename, an input stream for file inputs, or a FileOptions configuration
// for each file in a bundle.
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.NodeJS.ReadableStream
  - typingsSlinky.browserify.mod.FileOptions
*/
trait InputFile extends js.Object

object InputFile {
  @scala.inline
  implicit def apply(value: FileOptions): InputFile = value.asInstanceOf[InputFile]
  @scala.inline
  implicit def apply(value: ReadableStream): InputFile = value.asInstanceOf[InputFile]
  @scala.inline
  implicit def apply(value: String): InputFile = value.asInstanceOf[InputFile]
}

