package typingsSlinky.prismicDom.mod

import typingsSlinky.prismicDom.prismicDomStrings.`group-list-item`
import typingsSlinky.prismicDom.prismicDomStrings.`group-o-list-item`
import typingsSlinky.prismicDom.prismicDomStrings.`list-item`
import typingsSlinky.prismicDom.prismicDomStrings.`o-list-item`
import typingsSlinky.prismicDom.prismicDomStrings.em
import typingsSlinky.prismicDom.prismicDomStrings.embed
import typingsSlinky.prismicDom.prismicDomStrings.heading1
import typingsSlinky.prismicDom.prismicDomStrings.heading2
import typingsSlinky.prismicDom.prismicDomStrings.heading3
import typingsSlinky.prismicDom.prismicDomStrings.heading4
import typingsSlinky.prismicDom.prismicDomStrings.heading5
import typingsSlinky.prismicDom.prismicDomStrings.heading6
import typingsSlinky.prismicDom.prismicDomStrings.hyperlink
import typingsSlinky.prismicDom.prismicDomStrings.image
import typingsSlinky.prismicDom.prismicDomStrings.label
import typingsSlinky.prismicDom.prismicDomStrings.paragraph
import typingsSlinky.prismicDom.prismicDomStrings.preformatted
import typingsSlinky.prismicDom.prismicDomStrings.span
import typingsSlinky.prismicDom.prismicDomStrings.strong
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Elements extends js.Object {
  var em: typingsSlinky.prismicDom.prismicDomStrings.em = js.native
  var embed: typingsSlinky.prismicDom.prismicDomStrings.embed = js.native
  var heading1: typingsSlinky.prismicDom.prismicDomStrings.heading1 = js.native
  var heading2: typingsSlinky.prismicDom.prismicDomStrings.heading2 = js.native
  var heading3: typingsSlinky.prismicDom.prismicDomStrings.heading3 = js.native
  var heading4: typingsSlinky.prismicDom.prismicDomStrings.heading4 = js.native
  var heading5: typingsSlinky.prismicDom.prismicDomStrings.heading5 = js.native
  var heading6: typingsSlinky.prismicDom.prismicDomStrings.heading6 = js.native
  var hyperlink: typingsSlinky.prismicDom.prismicDomStrings.hyperlink = js.native
  var image: typingsSlinky.prismicDom.prismicDomStrings.image = js.native
  var label: typingsSlinky.prismicDom.prismicDomStrings.label = js.native
  var list: `group-list-item` = js.native
  var listItem: `list-item` = js.native
  var oList: `group-o-list-item` = js.native
  var oListItem: `o-list-item` = js.native
  var paragraph: typingsSlinky.prismicDom.prismicDomStrings.paragraph = js.native
  var preformatted: typingsSlinky.prismicDom.prismicDomStrings.preformatted = js.native
  var span: typingsSlinky.prismicDom.prismicDomStrings.span = js.native
  var strong: typingsSlinky.prismicDom.prismicDomStrings.strong = js.native
}

object Elements {
  @scala.inline
  def apply(
    em: em,
    embed: embed,
    heading1: heading1,
    heading2: heading2,
    heading3: heading3,
    heading4: heading4,
    heading5: heading5,
    heading6: heading6,
    hyperlink: hyperlink,
    image: image,
    label: label,
    list: `group-list-item`,
    listItem: `list-item`,
    oList: `group-o-list-item`,
    oListItem: `o-list-item`,
    paragraph: paragraph,
    preformatted: preformatted,
    span: span,
    strong: strong
  ): Elements = {
    val __obj = js.Dynamic.literal(em = em.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], heading1 = heading1.asInstanceOf[js.Any], heading2 = heading2.asInstanceOf[js.Any], heading3 = heading3.asInstanceOf[js.Any], heading4 = heading4.asInstanceOf[js.Any], heading5 = heading5.asInstanceOf[js.Any], heading6 = heading6.asInstanceOf[js.Any], hyperlink = hyperlink.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listItem = listItem.asInstanceOf[js.Any], oList = oList.asInstanceOf[js.Any], oListItem = oListItem.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], preformatted = preformatted.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elements]
  }
  @scala.inline
  implicit class ElementsOps[Self <: Elements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEm(value: em): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("em")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmbed(value: embed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeading1(value: heading1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeading2(value: heading2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeading3(value: heading3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeading4(value: heading4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeading5(value: heading5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeading6(value: heading6): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading6")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyperlink(value: hyperlink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: label): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: `group-list-item`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListItem(value: `list-item`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOList(value: `group-o-list-item`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOListItem(value: `o-list-item`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oListItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParagraph(value: paragraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreformatted(value: preformatted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preformatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpan(value: span): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrong(value: strong): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strong")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

