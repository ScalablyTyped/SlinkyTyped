package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Page/Section in the Guide
  */
@js.native
trait ImplementationGuidePage extends BackboneElement {
  /**
    * Contains extended information for property 'format'.
    */
  var _format: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'kind'.
    */
  var _kind: js.UndefOr[Element] = js.native
  /**
    * Name of package to include
    */
  @JSName("package")
  var _package: js.UndefOr[js.Array[Element | String]] = js.native
  /**
    * Contains extended information for property 'source'.
    */
  var _source: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Format of the page (e.g. html, markdown, etc.)
    */
  var format: js.UndefOr[code] = js.native
  /**
    * page | example | list | include | directory | dictionary | toc | resource
    */
  var kind: code = js.native
  /**
    * Nested Pages / Sections
    */
  var page: js.UndefOr[js.Array[ImplementationGuidePage]] = js.native
  /**
    * Where to find that page
    */
  var source: uri = js.native
  /**
    * Short title shown for navigational assistance
    */
  var title: String = js.native
  /**
    * Kind of resource to include in the list
    */
  var `type`: js.UndefOr[js.Array[code]] = js.native
}

object ImplementationGuidePage {
  @scala.inline
  def apply(kind: code, source: uri, title: String): ImplementationGuidePage = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuidePage]
  }
  @scala.inline
  implicit class ImplementationGuidePageOps[Self <: ImplementationGuidePage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_format(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_format: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_format")(js.undefined)
        ret
    }
    @scala.inline
    def with_kind(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_kind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_kind")(js.undefined)
        ret
    }
    @scala.inline
    def with_package(value: js.Array[Element | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_package: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("package")(js.undefined)
        ret
    }
    @scala.inline
    def with_source(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_source: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_source")(js.undefined)
        ret
    }
    @scala.inline
    def with_title(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_title: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_title")(js.undefined)
        ret
    }
    @scala.inline
    def with_type(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: js.Array[ImplementationGuidePage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: js.Array[code]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

