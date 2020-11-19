package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tile
  extends /* key */ StringDictionary[js.Any] {
  
  var index: Double = js.native
  
  var tile: org.scalajs.dom.raw.Element = js.native
}
object Tile {
  
  @scala.inline
  def apply(index: Double, tile: org.scalajs.dom.raw.Element): Tile = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tile]
  }
  
  @scala.inline
  implicit class TileOps[Self <: Tile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTile(value: org.scalajs.dom.raw.Element): Self = this.set("tile", value.asInstanceOf[js.Any])
  }
}
