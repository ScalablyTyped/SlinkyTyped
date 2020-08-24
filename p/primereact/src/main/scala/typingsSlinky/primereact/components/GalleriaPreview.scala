package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.primereact.galleriaPreviewMod.GalleriaPreviewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GalleriaPreview {
  @JSImport("primereact/components/galleria/GalleriaPreview", "GalleriaPreview")
  @js.native
  object component extends js.Object
  
  def withProps(p: GalleriaPreviewProps): Default[tag.type, typingsSlinky.primereact.galleriaPreviewMod.GalleriaPreview] = new Default[tag.type, typingsSlinky.primereact.galleriaPreviewMod.GalleriaPreview](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: GalleriaPreview.type): Default[tag.type, typingsSlinky.primereact.galleriaPreviewMod.GalleriaPreview] = new Default[tag.type, typingsSlinky.primereact.galleriaPreviewMod.GalleriaPreview](js.Array(this.component, js.Dictionary.empty))()
}

