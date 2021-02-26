package typingsSlinky.reactNativeElements.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-elements", "Card")
@js.native
class Card protected ()
  extends Component[CardProps, js.Object, js.Any] {
  def this(props: CardProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: CardProps, context: js.Any) = this()
}
/* static members */
object Card {
  
  @JSImport("react-native-elements", "Card")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-elements", "Card.Divider")
  @js.native
  def Divider: ReactComponentClass[DividerProps] = js.native
  @scala.inline
  def Divider_=(x: ReactComponentClass[DividerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-elements", "Card.FeaturedSubtitle")
  @js.native
  def FeaturedSubtitle: ReactComponentClass[TextProps] = js.native
  @scala.inline
  def FeaturedSubtitle_=(x: ReactComponentClass[TextProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FeaturedSubtitle")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-elements", "Card.FeaturedTitle")
  @js.native
  def FeaturedTitle: ReactComponentClass[TextProps] = js.native
  @scala.inline
  def FeaturedTitle_=(x: ReactComponentClass[TextProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FeaturedTitle")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-elements", "Card.Image")
  @js.native
  def Image: ReactComponentClass[ImageProps] = js.native
  @scala.inline
  def Image_=(x: ReactComponentClass[ImageProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
  
  @JSImport("react-native-elements", "Card.Title")
  @js.native
  def Title: ReactComponentClass[TextProps] = js.native
  @scala.inline
  def Title_=(x: ReactComponentClass[TextProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
}
