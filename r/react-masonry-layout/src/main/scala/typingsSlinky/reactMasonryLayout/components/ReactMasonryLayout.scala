package typingsSlinky.reactMasonryLayout.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactMasonryLayout.mod.ReactMasonryLayoutExport.MasonryLayoutProps
import typingsSlinky.reactMasonryLayout.mod.ReactMasonryLayoutExport.MasonryLayoutSizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMasonryLayout {
  @JSImport("react-masonry-layout", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def infiniteScroll(value: () => Unit): this.type = set("infiniteScroll", js.Any.fromFunction0(value))
    @scala.inline
    def infiniteScrollContainer(value: String): this.type = set("infiniteScrollContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def infiniteScrollDisabled(value: Boolean): this.type = set("infiniteScrollDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def infiniteScrollDistance(value: Double): this.type = set("infiniteScrollDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def infiniteScrollEnd(value: Boolean): this.type = set("infiniteScrollEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def infiniteScrollEndIndicatorReactElement(value: ReactElement): this.type = set("infiniteScrollEndIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def infiniteScrollEndIndicator(value: ReactElement): this.type = set("infiniteScrollEndIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def infiniteScrollLoading(value: Boolean): this.type = set("infiniteScrollLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def infiniteScrollSpinnerReactElement(value: ReactElement): this.type = set("infiniteScrollSpinner", value.asInstanceOf[js.Any])
    @scala.inline
    def infiniteScrollSpinner(value: ReactElement): this.type = set("infiniteScrollSpinner", value.asInstanceOf[js.Any])
    @scala.inline
    def packed(value: String): this.type = set("packed", value.asInstanceOf[js.Any])
    @scala.inline
    def position(value: Boolean): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def sizesVarargs(value: MasonryLayoutSizes*): this.type = set("sizes", js.Array(value :_*))
    @scala.inline
    def sizes(value: js.Array[MasonryLayoutSizes]): this.type = set("sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MasonryLayoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MasonryLayoutProps]))
  }
}

