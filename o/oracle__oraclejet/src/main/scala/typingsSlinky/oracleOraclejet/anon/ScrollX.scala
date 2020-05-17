package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollX
  extends /* key */ StringDictionary[js.Any] {
  var scrollX: Double = js.native
  var scrollY: Double = js.native
}

object ScrollX {
  @scala.inline
  def apply(scrollX: Double, scrollY: Double): ScrollX = {
    val __obj = js.Dynamic.literal(scrollX = scrollX.asInstanceOf[js.Any], scrollY = scrollY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollX]
  }
  @scala.inline
  implicit class ScrollXOps[Self <: ScrollX] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScrollX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

