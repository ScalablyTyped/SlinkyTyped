package typingsSlinky.reactFoundation.components

import typingsSlinky.reactFoundation.thumbnailMod.ThumbnailProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Thumbnail {
  @JSImport("react-foundation", "Thumbnail")
  @js.native
  object component extends js.Object
  
  def withProps(p: ThumbnailProps): SharedBuilder_ThumbnailProps1581258749 = new SharedBuilder_ThumbnailProps1581258749(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Thumbnail.type): SharedBuilder_ThumbnailProps1581258749 = new SharedBuilder_ThumbnailProps1581258749(js.Array(this.component, js.Dictionary.empty))()
}

