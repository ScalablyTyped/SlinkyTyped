package typingsSlinky.reactMdUtils.components

import typingsSlinky.reactMdUtils.mediaOnlyMod.MediaOnlyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DesktopOnly {
  @JSImport("@react-md/utils", "DesktopOnly")
  @js.native
  object component extends js.Object
  
  def withProps(p: MediaOnlyProps): SharedBuilder_MediaOnlyProps_420184836 = new SharedBuilder_MediaOnlyProps_420184836(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DesktopOnly.type): SharedBuilder_MediaOnlyProps_420184836 = new SharedBuilder_MediaOnlyProps_420184836(js.Array(this.component, js.Dictionary.empty))()
}

