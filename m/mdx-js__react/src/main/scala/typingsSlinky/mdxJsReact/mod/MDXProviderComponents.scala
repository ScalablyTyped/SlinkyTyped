package typingsSlinky.mdxJsReact.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MDXProviderComponents extends /**
  * Any other components we wish to define
  */
/* key */ StringDictionary[ReactElement] {
  /**
    * Link    <https://mdxjs.com> or [MDX](https://mdxjs.com)
    */
  var a: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Blockquote    >
    */
  var blockquote: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Code    `\code```
    */
  var code: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Delete    ~~strikethrough~~
    */
  var delete: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Emphasis    _emphasis_
    */
  var em: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Heading 1    #
    */
  var h1: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Heading 2    ##
    */
  var h2: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Heading 3    ###
    */
  var h3: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Heading 4    ####
    */
  var h4: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Heading 5    #####
    */
  var h5: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Heading 6    ######
    */
  var h6: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Break    ---
    */
  var hr: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Image    ![alt](https://mdx-logo.now.sh)
    */
  var img: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * InlineCode    `inlineCode`
    */
  var inlineCode: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * List item
    */
  var li: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Ordered list    1.
    */
  var ol: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Paragraph
    */
  var p: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Pre
    */
  var pre: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Strong    **strong**
    */
  var strong: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Table
    */
  var table: js.UndefOr[ReactComponentClass[_]] = js.native
  var td: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Table Cell
    */
  var th: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Thematic break    ***
    */
  var thematicBreak: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * Table row
    */
  var tr: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * List    -
    */
  var ul: js.UndefOr[ReactComponentClass[_]] = js.native
  /**
    * The wrapper component can be used to set the layout for the MDX document.
    * It’s often used to set container width, borders, background colors, etc.
    * However, it’s also unique because it has access to the children passed to
    * it.
    *
    * This means that you can do powerful things with the MDX document
    * elements.
    */
  var wrapper: js.UndefOr[ReactComponentClass[_]] = js.native
}

object MDXProviderComponents {
  @scala.inline
  def apply(): MDXProviderComponents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MDXProviderComponents]
  }
  @scala.inline
  implicit class MDXProviderComponentsOps[Self <: MDXProviderComponents] (val x: Self) extends AnyVal {
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
    def setAFunctionComponent(value: ReactComponentClass[_]): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def setAComponentClass(value: ReactComponentClass[_]): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def setA(value: ReactComponentClass[_]): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteA: Self = this.set("a", js.undefined)
    @scala.inline
    def setBlockquoteFunctionComponent(value: ReactComponentClass[_]): Self = this.set("blockquote", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockquoteComponentClass(value: ReactComponentClass[_]): Self = this.set("blockquote", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockquote(value: ReactComponentClass[_]): Self = this.set("blockquote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockquote: Self = this.set("blockquote", js.undefined)
    @scala.inline
    def setCodeFunctionComponent(value: ReactComponentClass[_]): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodeComponentClass(value: ReactComponentClass[_]): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: ReactComponentClass[_]): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setDeleteFunctionComponent(value: ReactComponentClass[_]): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleteComponentClass(value: ReactComponentClass[_]): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: ReactComponentClass[_]): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    @scala.inline
    def setEmFunctionComponent(value: ReactComponentClass[_]): Self = this.set("em", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmComponentClass(value: ReactComponentClass[_]): Self = this.set("em", value.asInstanceOf[js.Any])
    @scala.inline
    def setEm(value: ReactComponentClass[_]): Self = this.set("em", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEm: Self = this.set("em", js.undefined)
    @scala.inline
    def setH1FunctionComponent(value: ReactComponentClass[_]): Self = this.set("h1", value.asInstanceOf[js.Any])
    @scala.inline
    def setH1ComponentClass(value: ReactComponentClass[_]): Self = this.set("h1", value.asInstanceOf[js.Any])
    @scala.inline
    def setH1(value: ReactComponentClass[_]): Self = this.set("h1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH1: Self = this.set("h1", js.undefined)
    @scala.inline
    def setH2FunctionComponent(value: ReactComponentClass[_]): Self = this.set("h2", value.asInstanceOf[js.Any])
    @scala.inline
    def setH2ComponentClass(value: ReactComponentClass[_]): Self = this.set("h2", value.asInstanceOf[js.Any])
    @scala.inline
    def setH2(value: ReactComponentClass[_]): Self = this.set("h2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH2: Self = this.set("h2", js.undefined)
    @scala.inline
    def setH3FunctionComponent(value: ReactComponentClass[_]): Self = this.set("h3", value.asInstanceOf[js.Any])
    @scala.inline
    def setH3ComponentClass(value: ReactComponentClass[_]): Self = this.set("h3", value.asInstanceOf[js.Any])
    @scala.inline
    def setH3(value: ReactComponentClass[_]): Self = this.set("h3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH3: Self = this.set("h3", js.undefined)
    @scala.inline
    def setH4FunctionComponent(value: ReactComponentClass[_]): Self = this.set("h4", value.asInstanceOf[js.Any])
    @scala.inline
    def setH4ComponentClass(value: ReactComponentClass[_]): Self = this.set("h4", value.asInstanceOf[js.Any])
    @scala.inline
    def setH4(value: ReactComponentClass[_]): Self = this.set("h4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH4: Self = this.set("h4", js.undefined)
    @scala.inline
    def setH5FunctionComponent(value: ReactComponentClass[_]): Self = this.set("h5", value.asInstanceOf[js.Any])
    @scala.inline
    def setH5ComponentClass(value: ReactComponentClass[_]): Self = this.set("h5", value.asInstanceOf[js.Any])
    @scala.inline
    def setH5(value: ReactComponentClass[_]): Self = this.set("h5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH5: Self = this.set("h5", js.undefined)
    @scala.inline
    def setH6FunctionComponent(value: ReactComponentClass[_]): Self = this.set("h6", value.asInstanceOf[js.Any])
    @scala.inline
    def setH6ComponentClass(value: ReactComponentClass[_]): Self = this.set("h6", value.asInstanceOf[js.Any])
    @scala.inline
    def setH6(value: ReactComponentClass[_]): Self = this.set("h6", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH6: Self = this.set("h6", js.undefined)
    @scala.inline
    def setHrFunctionComponent(value: ReactComponentClass[_]): Self = this.set("hr", value.asInstanceOf[js.Any])
    @scala.inline
    def setHrComponentClass(value: ReactComponentClass[_]): Self = this.set("hr", value.asInstanceOf[js.Any])
    @scala.inline
    def setHr(value: ReactComponentClass[_]): Self = this.set("hr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHr: Self = this.set("hr", js.undefined)
    @scala.inline
    def setImgFunctionComponent(value: ReactComponentClass[_]): Self = this.set("img", value.asInstanceOf[js.Any])
    @scala.inline
    def setImgComponentClass(value: ReactComponentClass[_]): Self = this.set("img", value.asInstanceOf[js.Any])
    @scala.inline
    def setImg(value: ReactComponentClass[_]): Self = this.set("img", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImg: Self = this.set("img", js.undefined)
    @scala.inline
    def setInlineCodeFunctionComponent(value: ReactComponentClass[_]): Self = this.set("inlineCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setInlineCodeComponentClass(value: ReactComponentClass[_]): Self = this.set("inlineCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setInlineCode(value: ReactComponentClass[_]): Self = this.set("inlineCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineCode: Self = this.set("inlineCode", js.undefined)
    @scala.inline
    def setLiFunctionComponent(value: ReactComponentClass[_]): Self = this.set("li", value.asInstanceOf[js.Any])
    @scala.inline
    def setLiComponentClass(value: ReactComponentClass[_]): Self = this.set("li", value.asInstanceOf[js.Any])
    @scala.inline
    def setLi(value: ReactComponentClass[_]): Self = this.set("li", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLi: Self = this.set("li", js.undefined)
    @scala.inline
    def setOlFunctionComponent(value: ReactComponentClass[_]): Self = this.set("ol", value.asInstanceOf[js.Any])
    @scala.inline
    def setOlComponentClass(value: ReactComponentClass[_]): Self = this.set("ol", value.asInstanceOf[js.Any])
    @scala.inline
    def setOl(value: ReactComponentClass[_]): Self = this.set("ol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOl: Self = this.set("ol", js.undefined)
    @scala.inline
    def setPFunctionComponent(value: ReactComponentClass[_]): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def setPComponentClass(value: ReactComponentClass[_]): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def setP(value: ReactComponentClass[_]): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
    @scala.inline
    def setPreFunctionComponent(value: ReactComponentClass[_]): Self = this.set("pre", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreComponentClass(value: ReactComponentClass[_]): Self = this.set("pre", value.asInstanceOf[js.Any])
    @scala.inline
    def setPre(value: ReactComponentClass[_]): Self = this.set("pre", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePre: Self = this.set("pre", js.undefined)
    @scala.inline
    def setStrongFunctionComponent(value: ReactComponentClass[_]): Self = this.set("strong", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrongComponentClass(value: ReactComponentClass[_]): Self = this.set("strong", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrong(value: ReactComponentClass[_]): Self = this.set("strong", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrong: Self = this.set("strong", js.undefined)
    @scala.inline
    def setTableFunctionComponent(value: ReactComponentClass[_]): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableComponentClass(value: ReactComponentClass[_]): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def setTable(value: ReactComponentClass[_]): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
    @scala.inline
    def setTdFunctionComponent(value: ReactComponentClass[_]): Self = this.set("td", value.asInstanceOf[js.Any])
    @scala.inline
    def setTdComponentClass(value: ReactComponentClass[_]): Self = this.set("td", value.asInstanceOf[js.Any])
    @scala.inline
    def setTd(value: ReactComponentClass[_]): Self = this.set("td", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTd: Self = this.set("td", js.undefined)
    @scala.inline
    def setThFunctionComponent(value: ReactComponentClass[_]): Self = this.set("th", value.asInstanceOf[js.Any])
    @scala.inline
    def setThComponentClass(value: ReactComponentClass[_]): Self = this.set("th", value.asInstanceOf[js.Any])
    @scala.inline
    def setTh(value: ReactComponentClass[_]): Self = this.set("th", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTh: Self = this.set("th", js.undefined)
    @scala.inline
    def setThematicBreakFunctionComponent(value: ReactComponentClass[_]): Self = this.set("thematicBreak", value.asInstanceOf[js.Any])
    @scala.inline
    def setThematicBreakComponentClass(value: ReactComponentClass[_]): Self = this.set("thematicBreak", value.asInstanceOf[js.Any])
    @scala.inline
    def setThematicBreak(value: ReactComponentClass[_]): Self = this.set("thematicBreak", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThematicBreak: Self = this.set("thematicBreak", js.undefined)
    @scala.inline
    def setTrFunctionComponent(value: ReactComponentClass[_]): Self = this.set("tr", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrComponentClass(value: ReactComponentClass[_]): Self = this.set("tr", value.asInstanceOf[js.Any])
    @scala.inline
    def setTr(value: ReactComponentClass[_]): Self = this.set("tr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTr: Self = this.set("tr", js.undefined)
    @scala.inline
    def setUlFunctionComponent(value: ReactComponentClass[_]): Self = this.set("ul", value.asInstanceOf[js.Any])
    @scala.inline
    def setUlComponentClass(value: ReactComponentClass[_]): Self = this.set("ul", value.asInstanceOf[js.Any])
    @scala.inline
    def setUl(value: ReactComponentClass[_]): Self = this.set("ul", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUl: Self = this.set("ul", js.undefined)
    @scala.inline
    def setWrapperFunctionComponent(value: ReactComponentClass[_]): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapperComponentClass(value: ReactComponentClass[_]): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapper(value: ReactComponentClass[_]): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
  
}

