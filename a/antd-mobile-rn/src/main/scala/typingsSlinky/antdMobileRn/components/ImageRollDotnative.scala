package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antdMobileRn.imageRollNativeMod.ImageRollProps
import typingsSlinky.antdMobileRn.imageRollNativeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ImageRollDotnative {
  @JSImport("antd-mobile-rn/lib/image-picker/ImageRoll.native", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ImageRollProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onCancel: () => Unit, onSelected: js.Object => Unit): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSelected = js.Any.fromFunction1(onSelected))
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[ImageRollProps]))
  }
}

