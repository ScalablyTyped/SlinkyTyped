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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEm(value: em): Self = this.set("em", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmbed(value: embed): Self = this.set("embed", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeading1(value: heading1): Self = this.set("heading1", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeading2(value: heading2): Self = this.set("heading2", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeading3(value: heading3): Self = this.set("heading3", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeading4(value: heading4): Self = this.set("heading4", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeading5(value: heading5): Self = this.set("heading5", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeading6(value: heading6): Self = this.set("heading6", value.asInstanceOf[js.Any])
    @scala.inline
    def setHyperlink(value: hyperlink): Self = this.set("hyperlink", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: image): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: label): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setList(value: `group-list-item`): Self = this.set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def setListItem(value: `list-item`): Self = this.set("listItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setOList(value: `group-o-list-item`): Self = this.set("oList", value.asInstanceOf[js.Any])
    @scala.inline
    def setOListItem(value: `o-list-item`): Self = this.set("oListItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setParagraph(value: paragraph): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreformatted(value: preformatted): Self = this.set("preformatted", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpan(value: span): Self = this.set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrong(value: strong): Self = this.set("strong", value.asInstanceOf[js.Any])
  }
  
}

