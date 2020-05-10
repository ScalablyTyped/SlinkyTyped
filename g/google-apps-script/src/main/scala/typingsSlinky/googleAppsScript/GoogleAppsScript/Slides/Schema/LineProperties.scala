package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineProperties extends js.Object {
  var dashStyle: js.UndefOr[String] = js.native
  var endArrow: js.UndefOr[String] = js.native
  var endConnection: js.UndefOr[LineConnection] = js.native
  var lineFill: js.UndefOr[LineFill] = js.native
  var link: js.UndefOr[Link] = js.native
  var startArrow: js.UndefOr[String] = js.native
  var startConnection: js.UndefOr[LineConnection] = js.native
  var weight: js.UndefOr[Dimension] = js.native
}

object LineProperties {
  @scala.inline
  def apply(): LineProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineProperties]
  }
  @scala.inline
  implicit class LinePropertiesOps[Self <: LineProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDashStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDashStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withEndArrow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withEndConnection(value: LineConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endConnection")(js.undefined)
        ret
    }
    @scala.inline
    def withLineFill(value: LineFill): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineFill")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: Link): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withStartArrow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withStartConnection(value: LineConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startConnection")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: Dimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

