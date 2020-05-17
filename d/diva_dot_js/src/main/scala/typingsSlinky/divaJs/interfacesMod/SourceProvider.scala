package typingsSlinky.divaJs.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceProvider extends js.Object {
  var cols: Double = js.native
  var rows: Double = js.native
  var titles: js.Array[typingsSlinky.divaJs.anon.Dimensions] = js.native
  var zoomLevel: Double = js.native
}

object SourceProvider {
  @scala.inline
  def apply(
    cols: Double,
    rows: Double,
    titles: js.Array[typingsSlinky.divaJs.anon.Dimensions],
    zoomLevel: Double
  ): SourceProvider = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any], zoomLevel = zoomLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceProvider]
  }
  @scala.inline
  implicit class SourceProviderOps[Self <: SourceProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitles(value: js.Array[typingsSlinky.divaJs.anon.Dimensions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

