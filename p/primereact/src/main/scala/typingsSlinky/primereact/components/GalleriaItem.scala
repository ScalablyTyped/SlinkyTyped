package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.primereact.galleriaItemMod.GalleriaItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GalleriaItem {
  
  @JSImport("primereact/components/galleria/GalleriaItem", "GalleriaItem")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: GalleriaItem.type): Default[tag.type, typingsSlinky.primereact.galleriaItemMod.GalleriaItem] = new Default[tag.type, typingsSlinky.primereact.galleriaItemMod.GalleriaItem](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GalleriaItemProps): Default[tag.type, typingsSlinky.primereact.galleriaItemMod.GalleriaItem] = new Default[tag.type, typingsSlinky.primereact.galleriaItemMod.GalleriaItem](js.Array(this.component, p.asInstanceOf[js.Any]))
}
