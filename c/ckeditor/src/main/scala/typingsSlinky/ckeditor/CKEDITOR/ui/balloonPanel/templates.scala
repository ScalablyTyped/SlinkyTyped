package typingsSlinky.ckeditor.CKEDITOR.ui.balloonPanel

import typingsSlinky.ckeditor.CKEDITOR.template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait templates extends js.Object {
  var close: js.UndefOr[template] = js.native
  var content: js.UndefOr[template] = js.native
  var panel: js.UndefOr[template] = js.native
  var title: js.UndefOr[template] = js.native
  var triangle: js.UndefOr[template] = js.native
  var triangleInner: js.UndefOr[template] = js.native
  var triangleOuter: js.UndefOr[template] = js.native
}

object templates {
  @scala.inline
  def apply(): templates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[templates]
  }
  @scala.inline
  implicit class templatesOps[Self <: templates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: template): Self = {
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
    def withContent(value: template): Self = {
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
    def withPanel(value: template): Self = {
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
    def withTitle(value: template): Self = {
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
    def withTriangle(value: template): Self = {
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
    def withTriangleInner(value: template): Self = {
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
    def withTriangleOuter(value: template): Self = {
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

