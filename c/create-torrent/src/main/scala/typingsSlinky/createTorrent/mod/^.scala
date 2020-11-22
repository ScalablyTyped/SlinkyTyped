package typingsSlinky.createTorrent.mod

import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.FileList
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("create-torrent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(input: String, cb: js.Function2[/* err */ js.Error | Null, /* torrent */ Buffer, _]): Unit = js.native
  def apply(
    input: String,
    opts: CreateTorrentOptions,
    cb: js.Function2[/* err */ js.Error | Null, /* torrent */ Buffer, _]
  ): Unit = js.native
  def apply(
    input: js.Array[Buffer | File | ReadableStream | String],
    cb: js.Function2[js.Error | Null, /* torrent */ Buffer, _]
  ): Unit = js.native
  def apply(
    input: js.Array[Buffer | File | ReadableStream | String],
    opts: CreateTorrentOptions,
    cb: js.Function2[js.Error | Null, /* torrent */ Buffer, _]
  ): Unit = js.native
  def apply(input: Buffer, cb: js.Function2[/* err */ js.Error | Null, /* torrent */ Buffer, _]): Unit = js.native
  def apply(
    input: Buffer,
    opts: CreateTorrentOptions,
    cb: js.Function2[/* err */ js.Error | Null, /* torrent */ Buffer, _]
  ): Unit = js.native
  def apply(input: ReadableStream, cb: js.Function2[/* err */ js.Error | Null, /* torrent */ Buffer, _]): Unit = js.native
  def apply(
    input: ReadableStream,
    opts: CreateTorrentOptions,
    cb: js.Function2[/* err */ js.Error | Null, /* torrent */ Buffer, _]
  ): Unit = js.native
  def apply(input: FileList, cb: js.Function2[/* err */ js.Error | Null, /* torrent */ Buffer, _]): Unit = js.native
  def apply(
    input: FileList,
    opts: CreateTorrentOptions,
    cb: js.Function2[/* err */ js.Error | Null, /* torrent */ Buffer, _]
  ): Unit = js.native
  def apply(input: File, cb: js.Function2[/* err */ js.Error | Null, /* torrent */ Buffer, _]): Unit = js.native
  def apply(
    input: File,
    opts: CreateTorrentOptions,
    cb: js.Function2[/* err */ js.Error | Null, /* torrent */ Buffer, _]
  ): Unit = js.native
}
