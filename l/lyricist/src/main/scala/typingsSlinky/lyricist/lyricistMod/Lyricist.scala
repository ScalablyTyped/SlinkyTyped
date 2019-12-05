package typingsSlinky.lyricist.lyricistMod

import typingsSlinky.lyricist.Anon_Asc
import typingsSlinky.lyricist.Anon_FetchLyrics
import typingsSlinky.lyricist.Anon_FetchTracklist
import typingsSlinky.lyricist.Anon_TextFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lyricist extends js.Object {
  def album(id: Double): js.Promise[Album] = js.native
  def album(id: Double, opts: Anon_FetchTracklist): js.Promise[Album] = js.native
  def artist(id: Double, opts: Anon_TextFormat): js.Promise[Artist] = js.native
  def artistByName(name: String, opts: Anon_TextFormat): js.Promise[Artist] = js.native
  def search(query: String): js.Promise[js.Array[SearchResult]] = js.native
  def song(id: Double): js.Promise[Song] = js.native
  def song(id: Double, opts: Anon_FetchLyrics): js.Promise[Song] = js.native
  def songsByArtist(id: Double): js.Promise[js.Array[SongByArtist]] = js.native
  def songsByArtist(id: Double, opts: Anon_Asc): js.Promise[js.Array[SongByArtist]] = js.native
}

