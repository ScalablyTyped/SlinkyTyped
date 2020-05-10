package typingsSlinky.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Theme extends js.Object {
  var body: String = js.native
  var bodyBorder: String = js.native
  var bodyContent: String = js.native
  var bodyContentBorder: String = js.native
  var header: String = js.native
  var headerBorder: String = js.native
  var label: String = js.native
}

object Theme {
  @scala.inline
  def apply(
    body: String,
    bodyBorder: String,
    bodyContent: String,
    bodyContentBorder: String,
    header: String,
    headerBorder: String,
    label: String
  ): Theme = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], bodyBorder = bodyBorder.asInstanceOf[js.Any], bodyContent = bodyContent.asInstanceOf[js.Any], bodyContentBorder = bodyContentBorder.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerBorder = headerBorder.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
  @scala.inline
  implicit class ThemeOps[Self <: Theme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodyContentBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyContentBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaderBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerBorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

