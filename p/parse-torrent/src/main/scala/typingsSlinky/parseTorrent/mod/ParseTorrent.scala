package typingsSlinky.parseTorrent.mod

import org.scalajs.dom.raw.Blob
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseTorrent extends js.Object {
  @JSName("toMagnetURI")
  var toMagnetURI_Original: js.Function1[/* parsed */ typingsSlinky.magnetUri.mod.Instance, String] = js.native
  @JSName("toTorrentFile")
  var toTorrentFile_Original: js.Function1[/* parsed */ typingsSlinky.parseTorrentFile.mod.Instance, Buffer] = js.native
  def apply(torrent: String): typingsSlinky.magnetUri.mod.Instance = js.native
  def apply(torrent: typingsSlinky.magnetUri.mod.Instance): Instance = js.native
  def apply(torrent: Buffer): typingsSlinky.magnetUri.mod.Instance | typingsSlinky.parseTorrentFile.mod.Instance = js.native
  def apply(torrent: Instance): Instance = js.native
  def apply(torrent: typingsSlinky.parseTorrentFile.mod.Instance): Instance = js.native
  def remote(torrent: String): Unit = js.native
  def remote(torrent: String, cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
  def remote(torrent: typingsSlinky.magnetUri.mod.Instance): Unit = js.native
  def remote(
    torrent: typingsSlinky.magnetUri.mod.Instance,
    cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]
  ): Unit = js.native
  def remote(torrent: Buffer): Unit = js.native
  def remote(torrent: Buffer, cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
  def remote(torrent: Instance): Unit = js.native
  def remote(torrent: Instance, cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
  def remote(torrent: typingsSlinky.parseTorrentFile.mod.Instance): Unit = js.native
  def remote(
    torrent: typingsSlinky.parseTorrentFile.mod.Instance,
    cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]
  ): Unit = js.native
  def remote(torrent: Blob): Unit = js.native
  def remote(torrent: Blob, cb: js.Function2[/* err */ js.Error, /* torrent */ js.UndefOr[Instance], Unit]): Unit = js.native
  def toMagnetURI(parsed: typingsSlinky.magnetUri.mod.Instance): String = js.native
  def toTorrentFile(parsed: typingsSlinky.parseTorrentFile.mod.Instance): Buffer = js.native
}

