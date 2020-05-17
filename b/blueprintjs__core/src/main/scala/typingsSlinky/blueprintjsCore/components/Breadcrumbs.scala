package typingsSlinky.blueprintjsCore.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.anon.PartialIOverflowListProps
import typingsSlinky.blueprintjsCore.boundaryMod.Boundary
import typingsSlinky.blueprintjsCore.breadcrumbMod.IBreadcrumbProps
import typingsSlinky.blueprintjsCore.breadcrumbsMod.IBreadcrumbsProps
import typingsSlinky.blueprintjsCore.popoverMod.IPopoverProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Breadcrumbs {
  @JSImport("@blueprintjs/core", "Breadcrumbs")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.Breadcrumbs] {
    @scala.inline
    def breadcrumbRenderer(value: /* props */ IBreadcrumbProps => ReactElement): this.type = set("breadcrumbRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def collapseFrom(value: Boundary): this.type = set("collapseFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def currentBreadcrumbRenderer(value: /* props */ IBreadcrumbProps => ReactElement): this.type = set("currentBreadcrumbRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def minVisibleItems(value: Double): this.type = set("minVisibleItems", value.asInstanceOf[js.Any])
    @scala.inline
    def overflowListProps(value: PartialIOverflowListProps): this.type = set("overflowListProps", value.asInstanceOf[js.Any])
    @scala.inline
    def popoverProps(value: IPopoverProps): this.type = set("popoverProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IBreadcrumbsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(items: js.Array[IBreadcrumbProps]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IBreadcrumbsProps]))
  }
}

