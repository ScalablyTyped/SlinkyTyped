package typingsSlinky.nyaapi.mod.si

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nyaapi", "si.searchAllByUser")
@js.native
object searchAllByUser extends js.Object {
  
  def apply(user: String, term: String): js.Promise[js.Array[Torrent]] = js.native
  def apply(user: String, term: String, opts: SearchOptions): js.Promise[js.Array[Torrent]] = js.native
  def apply(user: SearchOptionsTerm, term: String): js.Promise[js.Array[Torrent]] = js.native
  def apply(user: SearchOptionsTerm, term: String, opts: SearchOptions): js.Promise[js.Array[Torrent]] = js.native
}
