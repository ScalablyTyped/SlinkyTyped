package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.distHostMod.SyncHostOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "SyncHost")
@js.native
class SyncHost ()
  extends typingsSlinky.grammarkdown.distHostMod.SyncHost {
  def this(hasReadFileSyncWriteFileSyncBaseOptions: SyncHostOptions) = this()
}

/* static members */
@JSImport("grammarkdown", "SyncHost")
@js.native
object SyncHost extends js.Object {
  def forFile(content: String): typingsSlinky.grammarkdown.distHostMod.SyncSingleFileHost = js.native
  def forFile(content: String, file: String): typingsSlinky.grammarkdown.distHostMod.SyncSingleFileHost = js.native
  def forFile(content: String, file: String, hostFallback: typingsSlinky.grammarkdown.distHostMod.SyncHost): typingsSlinky.grammarkdown.distHostMod.SyncSingleFileHost = js.native
}

