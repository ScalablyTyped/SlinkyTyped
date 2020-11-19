package typingsSlinky.nyaapi.mod.pantsu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nyaapi", "pantsu.search")
@js.native
object search extends js.Object {
  
  def apply(term: String): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: String, n: js.UndefOr[scala.Nothing], opts: SearchOptions): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: String, n: Double): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: String, n: Double, opts: SearchOptions): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: SearchOptionsTerm): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: SearchOptionsTerm, n: js.UndefOr[scala.Nothing], opts: SearchOptions): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: SearchOptionsTerm, n: Double): js.Promise[js.Array[Torrent]] = js.native
  def apply(term: SearchOptionsTerm, n: Double, opts: SearchOptions): js.Promise[js.Array[Torrent]] = js.native
}
