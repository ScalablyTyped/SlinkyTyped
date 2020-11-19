package typingsSlinky.reactFoundation.components

import typingsSlinky.reactFoundation.thumbnailMod.ThumbnailProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThumbnailLink {
  
  @JSImport("react-foundation", "ThumbnailLink")
  @js.native
  object component extends js.Object
  
  def withProps(p: ThumbnailProps): SharedBuilder_ThumbnailProps1581258749 = new SharedBuilder_ThumbnailProps1581258749(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ThumbnailLink.type): SharedBuilder_ThumbnailProps1581258749 = new SharedBuilder_ThumbnailProps1581258749(js.Array(this.component, js.Dictionary.empty))()
}
