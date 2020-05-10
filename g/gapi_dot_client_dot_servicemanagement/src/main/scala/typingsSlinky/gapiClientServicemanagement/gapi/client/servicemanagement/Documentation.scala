package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Documentation extends js.Object {
  /** The URL to the root of documentation. */
  var documentationRootUrl: js.UndefOr[String] = js.native
  /**
    * Declares a single overview page. For example:
    * <pre><code>documentation:
    * summary: ...
    * overview: &#40;== include overview.md ==&#41;
    * </code></pre>
    * This is a shortcut for the following declaration (using pages style):
    * <pre><code>documentation:
    * summary: ...
    * pages:
    * - name: Overview
    * content: &#40;== include overview.md ==&#41;
    * </code></pre>
    * Note: you cannot specify both `overview` field and `pages` field.
    */
  var overview: js.UndefOr[String] = js.native
  /** The top level pages for the documentation set. */
  var pages: js.UndefOr[js.Array[Page]] = js.native
  /**
    * A list of documentation rules that apply to individual API elements.
    *
    * &#42;&#42;NOTE:&#42;&#42; All service configuration rules follow "last one wins" order.
    */
  var rules: js.UndefOr[js.Array[DocumentationRule]] = js.native
  /**
    * A short summary of what the service does. Can only be provided by
    * plain text.
    */
  var summary: js.UndefOr[String] = js.native
}

object Documentation {
  @scala.inline
  def apply(): Documentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Documentation]
  }
  @scala.inline
  implicit class DocumentationOps[Self <: Documentation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentationRootUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentationRootUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentationRootUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentationRootUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withOverview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(js.undefined)
        ret
    }
    @scala.inline
    def withPages(value: js.Array[Page]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: js.Array[DocumentationRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
  }
  
}

