package typingsSlinky.reactVirtualized.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVirtualized.esCollectionMod.CollectionCellGroupRendererParams
import typingsSlinky.reactVirtualized.esCollectionMod.CollectionCellRendererParams
import typingsSlinky.reactVirtualized.esCollectionMod.CollectionCellSizeAndPosition
import typingsSlinky.reactVirtualized.esCollectionMod.CollectionProps
import typingsSlinky.reactVirtualized.esGridMod.ScrollParams
import typingsSlinky.reactVirtualized.esGridMod.SectionRenderedParams
import typingsSlinky.reactVirtualized.mod.Alignment
import typingsSlinky.reactVirtualized.mod.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Collection {
  @JSImport("react-virtualized", "Collection")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactVirtualized.mod.Collection] {
    @scala.inline
    def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def autoHeight(value: Boolean): this.type = set("autoHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def cellGroupRenderer(value: /* params */ CollectionCellGroupRendererParams => js.Array[TagMod[Any]]): this.type = set("cellGroupRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def horizontalOverscanSize(value: Double): this.type = set("horizontalOverscanSize", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def noContentRenderer(value: () => ReactElement): this.type = set("noContentRenderer", js.Any.fromFunction0(value))
    @scala.inline
    def onScroll(value: /* params */ ScrollParams => _): this.type = set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def onSectionRendered(value: /* params */ SectionRenderedParams => _): this.type = set("onSectionRendered", js.Any.fromFunction1(value))
    @scala.inline
    def scrollLeft(value: Double): this.type = set("scrollLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollToAlignment(value: Alignment): this.type = set("scrollToAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollToCell(value: Double): this.type = set("scrollToCell", value.asInstanceOf[js.Any])
    @scala.inline
    def scrollTop(value: Double): this.type = set("scrollTop", value.asInstanceOf[js.Any])
    @scala.inline
    def sectionSize(value: Double): this.type = set("sectionSize", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def verticalOverscanSize(value: Double): this.type = set("verticalOverscanSize", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CollectionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    cellCount: Double,
    cellRenderer: /* params */ CollectionCellRendererParams => TagMod[Any],
    cellSizeAndPositionGetter: /* params */ Index => CollectionCellSizeAndPosition,
    height: Double,
    width: Double
  ): Builder = {
    val __props = js.Dynamic.literal(cellCount = cellCount.asInstanceOf[js.Any], cellRenderer = js.Any.fromFunction1(cellRenderer), cellSizeAndPositionGetter = js.Any.fromFunction1(cellSizeAndPositionGetter), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CollectionProps]))
  }
}

