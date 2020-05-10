package typingsSlinky.reactShare.components

import typingsSlinky.reactShare.mod.IconComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LinkedinIcon {
  @JSImport("react-share", "LinkedinIcon")
  @js.native
  object component extends js.Object
  
  def withProps(p: IconComponentProps): SharedBuilder_IconComponentProps_1792398978 = new SharedBuilder_IconComponentProps_1792398978(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: LinkedinIcon.type): SharedBuilder_IconComponentProps_1792398978 = new SharedBuilder_IconComponentProps_1792398978(js.Array(this.component, js.Dictionary.empty))()
}

