package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An axis of the chart. A chart may not have more than one axis per axis
  * position.
  */
@js.native
trait SchemaBasicChartAxis extends js.Object {
  /**
    * The format of the title. Only valid if the axis is not associated with
    * the domain.
    */
  var format: js.UndefOr[SchemaTextFormat] = js.native
  /**
    * The position of this axis.
    */
  var position: js.UndefOr[String] = js.native
  /**
    * The title of this axis. If set, this overrides any title inferred from
    * headers of the data.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The axis title text position.
    */
  var titleTextPosition: js.UndefOr[SchemaTextPosition] = js.native
}

object SchemaBasicChartAxis {
  @scala.inline
  def apply(): SchemaBasicChartAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicChartAxis]
  }
  @scala.inline
  implicit class SchemaBasicChartAxisOps[Self <: SchemaBasicChartAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: SchemaTextFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleTextPosition(value: SchemaTextPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleTextPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleTextPosition")(js.undefined)
        ret
    }
  }
  
}

