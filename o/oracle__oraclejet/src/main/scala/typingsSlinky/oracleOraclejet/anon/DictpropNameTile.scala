package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictpropNameTile
  extends /* key */ StringDictionary[js.Any] {
  
  var tile: org.scalajs.dom.raw.Element = js.native
}
object DictpropNameTile {
  
  @scala.inline
  def apply(tile: org.scalajs.dom.raw.Element): DictpropNameTile = {
    val __obj = js.Dynamic.literal(tile = tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameTile]
  }
  
  @scala.inline
  implicit class DictpropNameTileOps[Self <: DictpropNameTile] (val x: Self) extends AnyVal {
    
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
    def setTile(value: org.scalajs.dom.raw.Element): Self = this.set("tile", value.asInstanceOf[js.Any])
  }
}
