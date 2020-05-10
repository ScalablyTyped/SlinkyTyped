package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNewDimensions
  extends /* key */ StringDictionary[js.Any] {
  var header: String | Double = js.native
  var newDimensions: AnonHeightWidth = js.native
  var oldDimensions: AnonHeightWidth = js.native
}

object AnonNewDimensions {
  @scala.inline
  def apply(header: String | Double, newDimensions: AnonHeightWidth, oldDimensions: AnonHeightWidth): AnonNewDimensions = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], newDimensions = newDimensions.asInstanceOf[js.Any], oldDimensions = oldDimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNewDimensions]
  }
  @scala.inline
  implicit class AnonNewDimensionsOps[Self <: AnonNewDimensions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeader(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewDimensions(value: AnonHeightWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldDimensions(value: AnonHeightWidth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldDimensions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

