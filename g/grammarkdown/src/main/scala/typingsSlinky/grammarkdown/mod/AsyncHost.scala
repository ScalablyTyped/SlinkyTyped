package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.hostMod.AsyncHostOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "AsyncHost")
@js.native
class AsyncHost ()
  extends typingsSlinky.grammarkdown.hostMod.AsyncHost {
  def this(hasReadFileWriteFileBaseOptions: AsyncHostOptions) = this()
}

/* static members */
@JSImport("grammarkdown", "AsyncHost")
@js.native
object AsyncHost extends js.Object {
  def forFile(content: String): typingsSlinky.grammarkdown.hostMod.AsyncSingleFileHost = js.native
  def forFile(
    content: String,
    file: js.UndefOr[scala.Nothing],
    hostFallback: typingsSlinky.grammarkdown.hostMod.AsyncHost
  ): typingsSlinky.grammarkdown.hostMod.AsyncSingleFileHost = js.native
  def forFile(content: String, file: String): typingsSlinky.grammarkdown.hostMod.AsyncSingleFileHost = js.native
  def forFile(content: String, file: String, hostFallback: typingsSlinky.grammarkdown.hostMod.AsyncHost): typingsSlinky.grammarkdown.hostMod.AsyncSingleFileHost = js.native
}

