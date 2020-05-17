package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreviousSizeStyleClass
  extends /* key */ StringDictionary[js.Any] {
  var previousSizeStyleClass: String = js.native
  var sizeStyleClass: String = js.native
  var tile: org.scalajs.dom.raw.Element = js.native
}

object PreviousSizeStyleClass {
  @scala.inline
  def apply(previousSizeStyleClass: String, sizeStyleClass: String, tile: org.scalajs.dom.raw.Element): PreviousSizeStyleClass = {
    val __obj = js.Dynamic.literal(previousSizeStyleClass = previousSizeStyleClass.asInstanceOf[js.Any], sizeStyleClass = sizeStyleClass.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousSizeStyleClass]
  }
  @scala.inline
  implicit class PreviousSizeStyleClassOps[Self <: PreviousSizeStyleClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreviousSizeStyleClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousSizeStyleClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeStyleClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeStyleClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTile(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

