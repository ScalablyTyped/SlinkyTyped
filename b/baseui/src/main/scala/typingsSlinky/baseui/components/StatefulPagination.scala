package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.AnonEventAny
import typingsSlinky.baseui.AnonNextPage
import typingsSlinky.baseui.baseuiStrings.change_
import typingsSlinky.baseui.paginationMod.Labels
import typingsSlinky.baseui.paginationMod.PaginationOverrides
import typingsSlinky.baseui.paginationMod.State
import typingsSlinky.baseui.paginationMod.StatefulPaginationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulPagination {
  @JSImport("baseui/pagination", "StatefulPagination")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def initialState(value: State): this.type = set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def labels(value: Labels): this.type = set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def onNextClick(value: /* args */ AnonEventAny => _): this.type = set("onNextClick", js.Any.fromFunction1(value))
    @scala.inline
    def onPageChange(value: /* args */ AnonNextPage => _): this.type = set("onPageChange", js.Any.fromFunction1(value))
    @scala.inline
    def onPrevClick(value: /* args */ AnonEventAny => _): this.type = set("onPrevClick", js.Any.fromFunction1(value))
    @scala.inline
    def overrides(value: PaginationOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def stateReducer(value: (change_, /* changes */ State, /* currentState */ State) => State): this.type = set("stateReducer", js.Any.fromFunction3(value))
  }
  
  def withProps(p: StatefulPaginationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(numPages: Double): Builder = {
    val __props = js.Dynamic.literal(numPages = numPages.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StatefulPaginationProps]))
  }
}

