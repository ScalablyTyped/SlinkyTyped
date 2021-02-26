package typingsSlinky.prismicDom

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("prismic-dom", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("prismic-dom", "default.Link")
    @js.native
    def Link: typingsSlinky.prismicDom.mod.Link = js.native
    @scala.inline
    def Link_=(x: typingsSlinky.prismicDom.mod.Link): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Link")(x.asInstanceOf[js.Any])
    
    @JSImport("prismic-dom", "default.RichText")
    @js.native
    def RichText: typingsSlinky.prismicDom.mod.RichText = js.native
    @scala.inline
    def RichText_=(x: typingsSlinky.prismicDom.mod.RichText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RichText")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("prismic-dom", "HTMLSerializer")
  @js.native
  val HTMLSerializer: typingsSlinky.prismicDom.mod.HTMLSerializer[String] = js.native
  type HTMLSerializer[T] = js.Function5[
    /* type */ ElementType, 
    /* element */ js.Any, 
    /* text */ String | Null, 
    /* children */ js.Array[T], 
    /* index */ Double, 
    T
  ]
  
  @js.native
  trait Link extends StObject {
    
    def url(link: js.Any): String = js.native
    def url(link: js.Any, linkResolver: js.Function1[/* doc */ js.Any, String]): String = js.native
  }
  @JSImport("prismic-dom", "Link")
  @js.native
  val Link: typingsSlinky.prismicDom.mod.Link = js.native
  
  @js.native
  trait RichText extends StObject {
    
    var Elements: typingsSlinky.prismicDom.mod.Elements = js.native
    
    def asHtml(richText: js.Any): String = js.native
    def asHtml(
      richText: js.Any,
      linkResolver: js.UndefOr[scala.Nothing],
      serializer: typingsSlinky.prismicDom.mod.HTMLSerializer[String]
    ): String = js.native
    def asHtml(richText: js.Any, linkResolver: js.Function1[/* doc */ js.Any, String]): String = js.native
    def asHtml(
      richText: js.Any,
      linkResolver: js.Function1[/* doc */ js.Any, String],
      serializer: typingsSlinky.prismicDom.mod.HTMLSerializer[String]
    ): String = js.native
    
    def asText(richText: js.Any): String = js.native
    def asText(richText: js.Any, joinString: String): String = js.native
  }
  @JSImport("prismic-dom", "RichText")
  @js.native
  val RichText: typingsSlinky.prismicDom.mod.RichText = js.native
  
  /* Inlined prismic-dom.prismic-dom.Elements[keyof prismic-dom.prismic-dom.Elements] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.prismicDom.prismicDomStrings.`list-item`
    - typingsSlinky.prismicDom.prismicDomStrings.`group-list-item`
    - typingsSlinky.prismicDom.prismicDomStrings.heading6
    - typingsSlinky.prismicDom.prismicDomStrings.`o-list-item`
    - typingsSlinky.prismicDom.prismicDomStrings.heading2
    - typingsSlinky.prismicDom.prismicDomStrings.hyperlink
    - typingsSlinky.prismicDom.prismicDomStrings.image
    - typingsSlinky.prismicDom.prismicDomStrings.heading5
    - typingsSlinky.prismicDom.prismicDomStrings.paragraph
    - typingsSlinky.prismicDom.prismicDomStrings.preformatted
    - typingsSlinky.prismicDom.prismicDomStrings.strong
    - typingsSlinky.prismicDom.prismicDomStrings.span
    - typingsSlinky.prismicDom.prismicDomStrings.heading3
    - typingsSlinky.prismicDom.prismicDomStrings.em
    - typingsSlinky.prismicDom.prismicDomStrings.heading4
    - typingsSlinky.prismicDom.prismicDomStrings.label
    - typingsSlinky.prismicDom.prismicDomStrings.`group-o-list-item`
    - typingsSlinky.prismicDom.prismicDomStrings.embed
    - typingsSlinky.prismicDom.prismicDomStrings.heading1
  */
  trait ElementType extends StObject
  object ElementType {
    
    @scala.inline
    def em: typingsSlinky.prismicDom.prismicDomStrings.em = "em".asInstanceOf[typingsSlinky.prismicDom.prismicDomStrings.em]
    
    @scala.inline
    def embed: typingsSlinky.prismicDom.prismicDomStrings.embed = "embed".asInstanceOf[typingsSlinky.prismicDom.prismicDomStrings.embed]
    
    @scala.inline
    def `group-list-item`: typingsSlinky.prismicDom.prismicDomStrings.`group-list-item` = "group-list-item".asInstanceOf[typingsSlinky.prismicDom.prismicDomStrings.`group-list-item`]
    
    @scala.inline
    def `group-o-list-item`: typingsSlinky.prismicDom.prismicDomStrings.`group-o-list-item` = "group-o-list-item".asInstanceOf[typingsSlinky.prismicDom.prismicDomStrings.`group-o-list-item`]
    
    @scala.inline
    def heading1: typingsSlinky.prismicDom.prismicDomStrings.heading1 = "heading1".asInstanceOf[typingsSlinky.prismicDom.prismicDomStrings.heading1]
    
    @scala.inline
    def heading2: typingsSlinky.prismicDom.prismicDomStrings.heading2 = "heading2".asInstanceOf[typingsSlinky.prismicDom.prismicDomStrings.heading2]
    
    @scala.inline
    def heading3: typingsSlinky.prismicDom.prismicDomStrings.heading3 = "heading3".asInstanceOf[typingsSlinky.prismicDom.prismicDomStrings.heading3]
    
    @scala.inline
    def heading4: typingsSlinky.prismicDom.prismicDomStrings.heading4 = "heading4".asInstanceOf[typingsSlinky.prismicDom.prismicDomStrings.heading4]
    
    @scala.inline
    def heading5: typingsSlinky.prismicDom.prismicDomStrings.heading5 = "heading5".asInstanceOf[typingsSlinky.prismicDom.prismicDomStrings.heading5]
    
    @scala.inline
    def heading6: typingsSlinky.prismicDom.prismicDomStrings.heading6 = "heading6".asInstanceOf[typingsSlinky.prismicDom.prismicDomStrings.heading6]
    
    @scala.inline
    def hyperlink: typingsSlinky.prismicDom.prismicDomStrings.hyperlink = "hyperlink".asInstanceOf[typingsSlinky.prismicDom.prismicDomStrings.hyperlink]
    
    @scala.inline
    def image: typingsSlinky.prismicDom.prismicDomStrings.image = "image".asInstanceOf[typingsSlinky.prismicDom.prismicDomStrings.image]
    
    @scala.inline
    def label: typingsSlinky.prismicDom.prismicDomStrings.label = "label".asInstanceOf[typingsSlinky.prismicDom.prismicDomStrings.label]
    
    @scala.inline
    def `list-item`: typingsSlinky.prismicDom.prismicDomStrings.`list-item` = "list-item".asInstanceOf[typingsSlinky.prismicDom.prismicDomStrings.`list-item`]
    
    @scala.inline
    def `o-list-item`: typingsSlinky.prismicDom.prismicDomStrings.`o-list-item` = "o-list-item".asInstanceOf[typingsSlinky.prismicDom.prismicDomStrings.`o-list-item`]
    
    @scala.inline
    def paragraph: typingsSlinky.prismicDom.prismicDomStrings.paragraph = "paragraph".asInstanceOf[typingsSlinky.prismicDom.prismicDomStrings.paragraph]
    
    @scala.inline
    def preformatted: typingsSlinky.prismicDom.prismicDomStrings.preformatted = "preformatted".asInstanceOf[typingsSlinky.prismicDom.prismicDomStrings.preformatted]
    
    @scala.inline
    def span: typingsSlinky.prismicDom.prismicDomStrings.span = "span".asInstanceOf[typingsSlinky.prismicDom.prismicDomStrings.span]
    
    @scala.inline
    def strong: typingsSlinky.prismicDom.prismicDomStrings.strong = "strong".asInstanceOf[typingsSlinky.prismicDom.prismicDomStrings.strong]
  }
  
  @js.native
  trait Elements extends StObject {
    
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
    implicit class ElementsMutableBuilder[Self <: Elements] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEm(value: em): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmbed(value: embed): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeading1(value: heading1): Self = StObject.set(x, "heading1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeading2(value: heading2): Self = StObject.set(x, "heading2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeading3(value: heading3): Self = StObject.set(x, "heading3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeading4(value: heading4): Self = StObject.set(x, "heading4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeading5(value: heading5): Self = StObject.set(x, "heading5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeading6(value: heading6): Self = StObject.set(x, "heading6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHyperlink(value: hyperlink): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setList(value: `group-list-item`): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItem(value: `list-item`): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOList(value: `group-o-list-item`): Self = StObject.set(x, "oList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOListItem(value: `o-list-item`): Self = StObject.set(x, "oListItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraph(value: paragraph): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreformatted(value: preformatted): Self = StObject.set(x, "preformatted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpan(value: span): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrong(value: strong): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
    }
  }
}
