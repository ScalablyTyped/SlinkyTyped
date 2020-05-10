package typingsSlinky.ckeditor.CKEDITOR.ui.balloonPanel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait templateDefinitions extends js.Object {
  var close: js.UndefOr[String] = js.native
  var content: js.UndefOr[String] = js.native
  var panel: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var triangle: js.UndefOr[String] = js.native
  var triangleInner: js.UndefOr[String] = js.native
  var triangleOuter: js.UndefOr[String] = js.native
}

object templateDefinitions {
  @scala.inline
  def apply(): templateDefinitions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[templateDefinitions]
  }
  @scala.inline
  implicit class templateDefinitionsOps[Self <: templateDefinitions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withPanel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(js.undefined)
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
    def withTriangle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangle")(js.undefined)
        ret
    }
    @scala.inline
    def withTriangleInner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleInner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriangleInner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleInner")(js.undefined)
        ret
    }
    @scala.inline
    def withTriangleOuter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleOuter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriangleOuter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triangleOuter")(js.undefined)
        ret
    }
  }
  
}

