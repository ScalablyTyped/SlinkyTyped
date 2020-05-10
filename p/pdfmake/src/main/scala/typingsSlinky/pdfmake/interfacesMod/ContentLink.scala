package typingsSlinky.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentLink extends js.Object {
  var link: js.UndefOr[String] = js.native
  var linkToDestination: js.UndefOr[String] = js.native
  var linkToPage: js.UndefOr[Double] = js.native
}

object ContentLink {
  @scala.inline
  def apply(): ContentLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentLink]
  }
  @scala.inline
  implicit class ContentLinkOps[Self <: ContentLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLink(value: String): Self = {
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
    def withLinkToDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkToDestination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkToDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkToDestination")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkToPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkToPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkToPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkToPage")(js.undefined)
        ret
    }
  }
  
}

