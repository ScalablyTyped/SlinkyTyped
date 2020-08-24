package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.hostMod.SyncHostOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "SyncHost")
@js.native
class SyncHost ()
  extends typingsSlinky.grammarkdown.hostMod.SyncHost {
  def this(hasReadFileSyncWriteFileSyncBaseOptions: SyncHostOptions) = this()
}

/* static members */
@JSImport("grammarkdown", "SyncHost")
@js.native
object SyncHost extends js.Object {
  def forFile(content: String): typingsSlinky.grammarkdown.hostMod.SyncSingleFileHost = js.native
  def forFile(
    content: String,
    file: js.UndefOr[scala.Nothing],
    hostFallback: typingsSlinky.grammarkdown.hostMod.SyncHost
  ): typingsSlinky.grammarkdown.hostMod.SyncSingleFileHost = js.native
  def forFile(content: String, file: String): typingsSlinky.grammarkdown.hostMod.SyncSingleFileHost = js.native
  def forFile(content: String, file: String, hostFallback: typingsSlinky.grammarkdown.hostMod.SyncHost): typingsSlinky.grammarkdown.hostMod.SyncSingleFileHost = js.native
}

