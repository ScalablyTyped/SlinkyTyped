package typingsSlinky.mdxJsReact.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDXProviderComponents extends /**
  * Any other components we wish to define
  */
/* key */ StringDictionary[ReactNode] {
  /**
    * Link	<https://mdxjs.com> or [MDX](https://mdxjs.com)
    */
  var a: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * Blockquote	>
    */
  var blockquote: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * Code	`\code```
    */
  var code: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * Delete	~~strikethrough~~
    */
  var delete: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * Emphasis	_emphasis_
    */
  var em: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * Heading 1	#
    */
  var h1: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * Heading 2	##
    */
  var h2: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * Heading 3	###
    */
  var h3: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * Heading 4	####
    */
  var h4: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * Heading 5	#####
    */
  var h5: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * Heading 6	######
    */
  var h6: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * Break	---
    */
  var hr: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * Image	![alt](https://mdx-logo.now.sh)
    */
  var img: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * InlineCode	`inlineCode`
    */
  var inlineCode: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * List item
    */
  var li: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * Ordered list	1.
    */
  var ol: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * Paragraph
    */
  var p: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * Pre
    */
  var pre: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * Strong	**strong**
    */
  var strong: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * Table
    */
  var table: js.UndefOr[ReactComponentClass[_]] = js.undefined
  var td: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * Table Cell
    */
  var th: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * Thematic break	***
    */
  var thematicBreak: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * Table row
    */
  var tr: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * List	-
    */
  var ul: js.UndefOr[ReactComponentClass[_]] = js.undefined
  /**
    * The wrapper component can be used to set the layout for the MDX document.
    * It’s often used to set container width, borders, background colors, etc.
    * However, it’s also unique because it has access to the children passed to
    * it.
    *
    * This means that you can do powerful things with the MDX document
    * elements.
    */
  var wrapper: js.UndefOr[ReactComponentClass[_]] = js.undefined
}

object MDXProviderComponents {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Any other components we wish to define
    */
  /* key */ StringDictionary[TagMod[Any]] = null,
    a: ReactComponentClass[_] = null,
    blockquote: ReactComponentClass[_] = null,
    code: ReactComponentClass[_] = null,
    delete: ReactComponentClass[_] = null,
    em: ReactComponentClass[_] = null,
    h1: ReactComponentClass[_] = null,
    h2: ReactComponentClass[_] = null,
    h3: ReactComponentClass[_] = null,
    h4: ReactComponentClass[_] = null,
    h5: ReactComponentClass[_] = null,
    h6: ReactComponentClass[_] = null,
    hr: ReactComponentClass[_] = null,
    img: ReactComponentClass[_] = null,
    inlineCode: ReactComponentClass[_] = null,
    li: ReactComponentClass[_] = null,
    ol: ReactComponentClass[_] = null,
    p: ReactComponentClass[_] = null,
    pre: ReactComponentClass[_] = null,
    strong: ReactComponentClass[_] = null,
    table: ReactComponentClass[_] = null,
    td: ReactComponentClass[_] = null,
    th: ReactComponentClass[_] = null,
    thematicBreak: ReactComponentClass[_] = null,
    tr: ReactComponentClass[_] = null,
    ul: ReactComponentClass[_] = null,
    wrapper: ReactComponentClass[_] = null
  ): MDXProviderComponents = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    if (blockquote != null) __obj.updateDynamic("blockquote")(blockquote.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (em != null) __obj.updateDynamic("em")(em.asInstanceOf[js.Any])
    if (h1 != null) __obj.updateDynamic("h1")(h1.asInstanceOf[js.Any])
    if (h2 != null) __obj.updateDynamic("h2")(h2.asInstanceOf[js.Any])
    if (h3 != null) __obj.updateDynamic("h3")(h3.asInstanceOf[js.Any])
    if (h4 != null) __obj.updateDynamic("h4")(h4.asInstanceOf[js.Any])
    if (h5 != null) __obj.updateDynamic("h5")(h5.asInstanceOf[js.Any])
    if (h6 != null) __obj.updateDynamic("h6")(h6.asInstanceOf[js.Any])
    if (hr != null) __obj.updateDynamic("hr")(hr.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (inlineCode != null) __obj.updateDynamic("inlineCode")(inlineCode.asInstanceOf[js.Any])
    if (li != null) __obj.updateDynamic("li")(li.asInstanceOf[js.Any])
    if (ol != null) __obj.updateDynamic("ol")(ol.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (pre != null) __obj.updateDynamic("pre")(pre.asInstanceOf[js.Any])
    if (strong != null) __obj.updateDynamic("strong")(strong.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (td != null) __obj.updateDynamic("td")(td.asInstanceOf[js.Any])
    if (th != null) __obj.updateDynamic("th")(th.asInstanceOf[js.Any])
    if (thematicBreak != null) __obj.updateDynamic("thematicBreak")(thematicBreak.asInstanceOf[js.Any])
    if (tr != null) __obj.updateDynamic("tr")(tr.asInstanceOf[js.Any])
    if (ul != null) __obj.updateDynamic("ul")(ul.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDXProviderComponents]
  }
}

