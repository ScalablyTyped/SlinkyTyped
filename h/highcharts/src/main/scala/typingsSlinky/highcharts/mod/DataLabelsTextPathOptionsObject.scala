package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLabelsTextPathOptionsObject extends js.Object {
  /**
    * Presentation attributes for the text path.
    */
  var attributes: js.UndefOr[SVGAttributes] = js.native
  /**
    * Enable or disable `textPath` option for link's or marker's data labels.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object DataLabelsTextPathOptionsObject {
  @scala.inline
  def apply(): DataLabelsTextPathOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLabelsTextPathOptionsObject]
  }
  @scala.inline
  implicit class DataLabelsTextPathOptionsObjectOps[Self <: DataLabelsTextPathOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: SVGAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
  }
  
}

