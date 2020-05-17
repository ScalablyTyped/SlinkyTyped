package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.EventAny
import typingsSlinky.baseui.anon.NextPage
import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.paginationMod.Labels
import typingsSlinky.baseui.paginationMod.PaginationOverrides
import typingsSlinky.baseui.paginationMod.PaginationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pagination {
  @JSImport("baseui/pagination", "Pagination")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.paginationMod.Pagination] {
    @scala.inline
    def labels(value: Labels): this.type = set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def onNextClick(value: /* args */ EventAny => _): this.type = set("onNextClick", js.Any.fromFunction1(value))
    @scala.inline
    def onPageChange(value: /* args */ NextPage => _): this.type = set("onPageChange", js.Any.fromFunction1(value))
    @scala.inline
    def onPrevClick(value: /* args */ EventAny => _): this.type = set("onPrevClick", js.Any.fromFunction1(value))
    @scala.inline
    def overrides(value: PaginationOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: mini | default_ | compact | large_): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PaginationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(currentPage: Double, numPages: Double): Builder = {
    val __props = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PaginationProps]))
  }
}

