package typingsSlinky.reactMosaicComponent.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMosaicComponent.typesMod.MosaicKey
import typingsSlinky.reactMosaicComponent.typesMod.MosaicNode
import typingsSlinky.reactMosaicComponent.typesMod.ResizeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_MosaicProps_1629175897[R <: js.Object, T <: MosaicKey] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def onRelease(value: /* newNode */ MosaicNode[T] | Null => Unit): this.type = set("onRelease", js.Any.fromFunction1(value))
  @scala.inline
  def resize(value: ResizeOptions): this.type = set("resize", value.asInstanceOf[js.Any])
  @scala.inline
  def value(value: MosaicNode[T]): this.type = set("value", value.asInstanceOf[js.Any])
  @scala.inline
  def valueNull: this.type = set("value", null)
  @scala.inline
  def zeroStateView(value: ReactElement): this.type = set("zeroStateView", value.asInstanceOf[js.Any])
}

