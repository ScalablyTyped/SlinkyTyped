package typingsSlinky.browserfs.overlayFSMod

import typingsSlinky.browserfs.anon.Readable
import typingsSlinky.browserfs.fileSystemMod.BFSOneArgCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayFS
  extends typingsSlinky.browserfs.lockedFsMod.default[UnlockedOverlayFS] {
  def getOverlayedFileSystems(): Readable = js.native
  def initialize(cb: BFSOneArgCallback, deprecateMsg: Boolean): Unit = js.native
  def unwrap(): UnlockedOverlayFS = js.native
}

