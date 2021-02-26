package typingsSlinky.reactBootstrap

import org.scalablytyped.runtime.Instantiable0
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import typingsSlinky.react.mod.ReactType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaMod {
  
  @JSImport("react-bootstrap/lib/Media", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[MediaProps, js.Object, js.Any]
  @JSImport("react-bootstrap/lib/Media", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "Body")
  @js.native
  class Body ()
    extends typingsSlinky.reactBootstrap.mediaBodyMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "Body")
  @js.native
  def Body: Instantiable0[typingsSlinky.reactBootstrap.mediaBodyMod.^] = js.native
  @scala.inline
  def Body_=(x: Instantiable0[typingsSlinky.reactBootstrap.mediaBodyMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "Heading")
  @js.native
  class Heading ()
    extends typingsSlinky.reactBootstrap.mediaHeadingMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "Heading")
  @js.native
  def Heading: Instantiable0[typingsSlinky.reactBootstrap.mediaHeadingMod.^] = js.native
  @scala.inline
  def Heading_=(x: Instantiable0[typingsSlinky.reactBootstrap.mediaHeadingMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Heading")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "Left")
  @js.native
  class Left ()
    extends typingsSlinky.reactBootstrap.mediaLeftMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "Left")
  @js.native
  def Left: Instantiable0[typingsSlinky.reactBootstrap.mediaLeftMod.^] = js.native
  @scala.inline
  def Left_=(x: Instantiable0[typingsSlinky.reactBootstrap.mediaLeftMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Left")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "List")
  @js.native
  class List ()
    extends typingsSlinky.reactBootstrap.mediaListMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "List")
  @js.native
  def List: Instantiable0[typingsSlinky.reactBootstrap.mediaListMod.^] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "ListItem")
  @js.native
  class ListItem ()
    extends typingsSlinky.reactBootstrap.mediaListItemMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "ListItem")
  @js.native
  def ListItem: Instantiable0[typingsSlinky.reactBootstrap.mediaListItemMod.^] = js.native
  @scala.inline
  def ListItem_=(x: Instantiable0[typingsSlinky.reactBootstrap.mediaListItemMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ListItem")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def List_=(x: Instantiable0[typingsSlinky.reactBootstrap.mediaListMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("List")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Media", "Right")
  @js.native
  class Right ()
    extends typingsSlinky.reactBootstrap.mediaRightMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Media", "Right")
  @js.native
  def Right: Instantiable0[typingsSlinky.reactBootstrap.mediaRightMod.^] = js.native
  @scala.inline
  def Right_=(x: Instantiable0[typingsSlinky.reactBootstrap.mediaRightMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Right")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Media
    extends Component[MediaProps, js.Object, js.Any]
  
  @js.native
  trait MediaProps extends HTMLProps[Media] {
    
    var componentClass: js.UndefOr[ReactType[_]] = js.native
  }
  object MediaProps {
    
    @scala.inline
    def apply(): MediaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaProps]
    }
    
    @scala.inline
    implicit class MediaPropsMutableBuilder[Self <: MediaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentClass(value: ReactType[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
