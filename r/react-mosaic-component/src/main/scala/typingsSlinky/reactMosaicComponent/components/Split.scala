package typingsSlinky.reactMosaicComponent.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMosaicComponent.boundingBoxMod.BoundingBox
import typingsSlinky.reactMosaicComponent.splitMod.SplitProps
import typingsSlinky.reactMosaicComponent.typesMod.MosaicDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Split {
  @JSImport("react-mosaic-component/lib/Split", "Split")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMosaicComponent.splitMod.Split] {
    @scala.inline
    def minimumPaneSizePercentage(value: Double): this.type = set("minimumPaneSizePercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def onChange(value: /* percentOfParent */ Double => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onRelease(value: /* percentOfParent */ Double => Unit): this.type = set("onRelease", js.Any.fromFunction1(value))
  }
  
  def withProps(p: SplitProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(boundingBox: BoundingBox, direction: MosaicDirection, splitPercentage: Double): Builder = {
    val __props = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], splitPercentage = splitPercentage.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SplitProps]))
  }
}

