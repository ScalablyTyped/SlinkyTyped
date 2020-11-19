package typingsSlinky.nyaapi.mod.si

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nyaapi", "si.searchByUser")
@js.native
object searchByUser extends js.Object {
  
  def apply(user: String, term: String, n: Double): js.Promise[js.Array[Torrent]] = js.native
  def apply(user: String, term: String, n: Double, opts: SearchOptions): js.Promise[js.Array[Torrent]] = js.native
  def apply(user: SearchOptionsTerm, term: String, n: Double): js.Promise[js.Array[Torrent]] = js.native
  def apply(user: SearchOptionsTerm, term: String, n: Double, opts: SearchOptions): js.Promise[js.Array[Torrent]] = js.native
}
