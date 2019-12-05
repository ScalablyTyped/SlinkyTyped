package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.distHostMod.AsyncHostOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "AsyncHost")
@js.native
class AsyncHost ()
  extends typingsSlinky.grammarkdown.distHostMod.AsyncHost {
  def this(hasReadFileWriteFileBaseOptions: AsyncHostOptions) = this()
}

/* static members */
@JSImport("grammarkdown", "AsyncHost")
@js.native
object AsyncHost extends js.Object {
  def forFile(content: String): typingsSlinky.grammarkdown.distHostMod.AsyncSingleFileHost = js.native
  def forFile(content: String, file: String): typingsSlinky.grammarkdown.distHostMod.AsyncSingleFileHost = js.native
  def forFile(content: String, file: String, hostFallback: typingsSlinky.grammarkdown.distHostMod.AsyncHost): typingsSlinky.grammarkdown.distHostMod.AsyncSingleFileHost = js.native
}

