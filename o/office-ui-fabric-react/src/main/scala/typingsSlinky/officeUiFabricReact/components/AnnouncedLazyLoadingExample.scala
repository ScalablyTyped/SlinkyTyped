package typingsSlinky.officeUiFabricReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.officeUiFabricReact.announcedLazyLoadingExampleMod.IAnnouncedLazyLoadingExampleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AnnouncedLazyLoadingExample {
  @JSImport("office-ui-fabric-react/lib/components/Announced/examples/Announced.LazyLoading.Example", "AnnouncedLazyLoadingExample")
  @js.native
  object component extends js.Object
  
  def withProps(p: IAnnouncedLazyLoadingExampleProps): Default[
    tag.type, 
    typingsSlinky.officeUiFabricReact.announcedLazyLoadingExampleMod.AnnouncedLazyLoadingExample
  ] = new Default[
    tag.type, 
    typingsSlinky.officeUiFabricReact.announcedLazyLoadingExampleMod.AnnouncedLazyLoadingExample
  ](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: AnnouncedLazyLoadingExample.type): Default[
    tag.type, 
    typingsSlinky.officeUiFabricReact.announcedLazyLoadingExampleMod.AnnouncedLazyLoadingExample
  ] = new Default[
    tag.type, 
    typingsSlinky.officeUiFabricReact.announcedLazyLoadingExampleMod.AnnouncedLazyLoadingExample
  ](js.Array(this.component, js.Dictionary.empty))()
}

