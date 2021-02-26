package typingsSlinky.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.reactBootstrap.anon.ActiveIndex
import typingsSlinky.reactBootstrap.mod.Omit
import typingsSlinky.reactBootstrap.reactBootstrapStrings.wrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselMod {
  
  @JSImport("react-bootstrap/lib/Carousel", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[CarouselProps, js.Object, js.Any]
  @JSImport("react-bootstrap/lib/Carousel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Carousel", "Caption")
  @js.native
  class Caption ()
    extends typingsSlinky.reactBootstrap.carouselCaptionMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Carousel", "Caption")
  @js.native
  def Caption: Instantiable0[typingsSlinky.reactBootstrap.carouselCaptionMod.^] = js.native
  @scala.inline
  def Caption_=(x: Instantiable0[typingsSlinky.reactBootstrap.carouselCaptionMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Caption")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Carousel", "Item")
  @js.native
  class Item ()
    extends typingsSlinky.reactBootstrap.carouselItemMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Carousel", "Item")
  @js.native
  def Item: Instantiable0[typingsSlinky.reactBootstrap.carouselItemMod.^] = js.native
  @scala.inline
  def Item_=(x: Instantiable0[typingsSlinky.reactBootstrap.carouselItemMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Carousel
    extends Component[CarouselProps, js.Object, js.Any]
  
  type CarouselProps = (Omit[HTMLProps[Carousel], wrap]) with ActiveIndex
}
