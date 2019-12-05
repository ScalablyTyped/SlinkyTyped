package typingsSlinky.parseDashTorrent.parseDashTorrentMod

import typingsSlinky.node.Buffer
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseTorrent extends js.Object {
  @JSName("toMagnetURI")
  var toMagnetURI_Original: js.Function1[/* parsed */ typingsSlinky.magnetDashUri.magnetDashUriMod.Instance, String] = js.native
  @JSName("toTorrentFile")
  var toTorrentFile_Original: js.Function1[
    /* parsed */ typingsSlinky.parseDashTorrentDashFile.parseDashTorrentDashFileMod.Instance, 
    Buffer
  ] = js.native
  def apply(torrent: String): typingsSlinky.magnetDashUri.magnetDashUriMod.Instance = js.native
  def apply(torrent: typingsSlinky.magnetDashUri.magnetDashUriMod.Instance): Instance = js.native
  def apply(torrent: Buffer): typingsSlinky.magnetDashUri.magnetDashUriMod.Instance | typingsSlinky.parseDashTorrentDashFile.parseDashTorrentDashFileMod.Instance = js.native
  def apply(torrent: Instance): Instance = js.native
  def apply(torrent: typingsSlinky.parseDashTorrentDashFile.parseDashTorrentDashFileMod.Instance): Instance = js.native
  def remote(torrent: String): Unit = js.native
  def remote(torrent: String, cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
  def remote(torrent: typingsSlinky.magnetDashUri.magnetDashUriMod.Instance): Unit = js.native
  def remote(
    torrent: typingsSlinky.magnetDashUri.magnetDashUriMod.Instance,
    cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]
  ): Unit = js.native
  def remote(torrent: Buffer): Unit = js.native
  def remote(torrent: Buffer, cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
  def remote(torrent: Instance): Unit = js.native
  def remote(torrent: Instance, cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
  def remote(torrent: typingsSlinky.parseDashTorrentDashFile.parseDashTorrentDashFileMod.Instance): Unit = js.native
  def remote(
    torrent: typingsSlinky.parseDashTorrentDashFile.parseDashTorrentDashFileMod.Instance,
    cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]
  ): Unit = js.native
  def remote(torrent: Blob): Unit = js.native
  def remote(torrent: Blob, cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
  def toMagnetURI(parsed: typingsSlinky.magnetDashUri.magnetDashUriMod.Instance): String = js.native
  def toTorrentFile(parsed: typingsSlinky.parseDashTorrentDashFile.parseDashTorrentDashFileMod.Instance): Buffer = js.native
}

