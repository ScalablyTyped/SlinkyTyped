package typingsSlinky.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a documentation page. A page can contain subpages to represent
  * nested documentation set structure.
  */
@js.native
trait SchemaPage extends js.Object {
  /**
    * The Markdown content of the page. You can use &lt;code&gt;&amp;#40;==
    * include {path} ==&amp;#41;&lt;/code&gt; to include content from a
    * Markdown file.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * The name of the page. It will be used as an identity of the page to
    * generate URI of the page, text of the link to this page in navigation,
    * etc. The full page name (start from the root page name to this page
    * concatenated with `.`) can be used as reference to the page in your
    * documentation. For example: &lt;pre&gt;&lt;code&gt;pages: - name:
    * Tutorial   content: &amp;#40;== include tutorial.md ==&amp;#41; subpages:
    * - name: Java     content: &amp;#40;== include tutorial_java.md
    * ==&amp;#41; &lt;/code&gt;&lt;/pre&gt; You can reference `Java` page using
    * Markdown reference link syntax: `Java`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Subpages of this page. The order of subpages specified here will be
    * honored in the generated docset.
    */
  var subpages: js.UndefOr[js.Array[SchemaPage]] = js.native
}

object SchemaPage {
  @scala.inline
  def apply(): SchemaPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPage]
  }
  @scala.inline
  implicit class SchemaPageOps[Self <: SchemaPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSubpages(value: js.Array[SchemaPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subpages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubpages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subpages")(js.undefined)
        ret
    }
  }
  
}

