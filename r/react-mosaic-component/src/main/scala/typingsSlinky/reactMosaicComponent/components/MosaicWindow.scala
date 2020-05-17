package typingsSlinky.reactMosaicComponent.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMosaicComponent.mosaicWindowMod.MosaicWindowProps
import typingsSlinky.reactMosaicComponent.reactMosaicComponentStrings.drop
import typingsSlinky.reactMosaicComponent.reactMosaicComponentStrings.reset_
import typingsSlinky.reactMosaicComponent.typesMod.MosaicBranch
import typingsSlinky.reactMosaicComponent.typesMod.MosaicKey
import typingsSlinky.reactMosaicComponent.typesMod.MosaicNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MosaicWindow {
  @JSImport("react-mosaic-component", "MosaicWindow")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[T <: MosaicKey] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMosaicComponent.mod.MosaicWindow[js.Any]] {
    @scala.inline
    def additionalControlButtonText(value: String): this.type = set("additionalControlButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def additionalControlsReactElement(value: ReactElement): this.type = set("additionalControls", value.asInstanceOf[js.Any])
    @scala.inline
    def additionalControls(value: TagMod[Any]): this.type = set("additionalControls", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def createNode(value: /* repeated */ js.Any => js.Promise[MosaicNode[T]] | MosaicNode[T]): this.type = set("createNode", js.Any.fromFunction1(value))
    @scala.inline
    def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def onDragEnd(value: /* type */ drop | reset_ => Unit): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def onDragStart(value: () => Unit): this.type = set("onDragStart", js.Any.fromFunction0(value))
    @scala.inline
    def renderPreview(value: /* props */ MosaicWindowProps[T] => ReactElement): this.type = set("renderPreview", js.Any.fromFunction1(value))
    @scala.inline
    def renderToolbar(value: (/* props */ MosaicWindowProps[T], /* draggable */ js.UndefOr[Boolean]) => ReactElement): this.type = set("renderToolbar", js.Any.fromFunction2(value))
    @scala.inline
    def renderToolbarNull: this.type = set("renderToolbar", null)
    @scala.inline
    def toolbarControlsReactElement(value: ReactElement): this.type = set("toolbarControls", value.asInstanceOf[js.Any])
    @scala.inline
    def toolbarControls(value: TagMod[Any]): this.type = set("toolbarControls", value.asInstanceOf[js.Any])
  }
  
  def withProps[T <: MosaicKey](p: MosaicWindowProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[T <: MosaicKey](path: js.Array[MosaicBranch], title: String): Builder[T] = {
    val __props = js.Dynamic.literal(path = path.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[MosaicWindowProps[T]]))
  }
}

