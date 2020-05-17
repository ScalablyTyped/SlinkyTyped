package typingsSlinky.activexExcel.anon

import typingsSlinky.activexExcel.Excel.XmlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelMap extends js.Object {
  var Cancel: Boolean = js.native
  val Map: XmlMap = js.native
  val Url: String = js.native
}

object CancelMap {
  @scala.inline
  def apply(Cancel: Boolean, Map: XmlMap, Url: String): CancelMap = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelMap]
  }
  @scala.inline
  implicit class CancelMapOps[Self <: CancelMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: XmlMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

