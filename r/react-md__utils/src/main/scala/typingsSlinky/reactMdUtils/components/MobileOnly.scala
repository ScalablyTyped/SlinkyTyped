package typingsSlinky.reactMdUtils.components

import typingsSlinky.reactMdUtils.mediaOnlyMod.MediaOnlyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MobileOnly {
  @JSImport("@react-md/utils", "MobileOnly")
  @js.native
  object component extends js.Object
  
  def withProps(p: MediaOnlyProps): SharedBuilder_MediaOnlyProps_420184836 = new SharedBuilder_MediaOnlyProps_420184836(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MobileOnly.type): SharedBuilder_MediaOnlyProps_420184836 = new SharedBuilder_MediaOnlyProps_420184836(js.Array(this.component, js.Dictionary.empty))()
}

