package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.primereact.galleriaThumbnailsMod.GalleriaThumbnailsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GalleriaThumbnails {
  @JSImport("primereact/components/galleria/GalleriaThumbnails", "GalleriaThumbnails")
  @js.native
  object component extends js.Object
  
  def withProps(p: GalleriaThumbnailsProps): Default[tag.type, typingsSlinky.primereact.galleriaThumbnailsMod.GalleriaThumbnails] = new Default[tag.type, typingsSlinky.primereact.galleriaThumbnailsMod.GalleriaThumbnails](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: GalleriaThumbnails.type): Default[tag.type, typingsSlinky.primereact.galleriaThumbnailsMod.GalleriaThumbnails] = new Default[tag.type, typingsSlinky.primereact.galleriaThumbnailsMod.GalleriaThumbnails](js.Array(this.component, js.Dictionary.empty))()
}

