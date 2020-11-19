package typingsSlinky.reactMdUtils.components

import typingsSlinky.reactMdUtils.mediaOnlyMod.MediaOnlyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabletOnly {
  
  @JSImport("@react-md/utils", "TabletOnly")
  @js.native
  object component extends js.Object
  
  def withProps(p: MediaOnlyProps): SharedBuilder_MediaOnlyProps_420184836 = new SharedBuilder_MediaOnlyProps_420184836(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TabletOnly.type): SharedBuilder_MediaOnlyProps_420184836 = new SharedBuilder_MediaOnlyProps_420184836(js.Array(this.component, js.Dictionary.empty))()
}
