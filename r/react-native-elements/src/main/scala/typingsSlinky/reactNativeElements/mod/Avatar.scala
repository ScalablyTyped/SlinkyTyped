package typingsSlinky.reactNativeElements.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNativeElements.anon.PartialIconPropsPartialIm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-elements", "Avatar")
@js.native
class Avatar protected ()
  extends Component[AvatarProps, js.Object, js.Any] {
  def this(props: AvatarProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: AvatarProps, context: js.Any) = this()
}
/* static members */
object Avatar {
  
  @JSImport("react-native-elements", "Avatar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-elements", "Avatar.Accessory")
  @js.native
  def Accessory: ReactComponentClass[PartialIconPropsPartialIm] = js.native
  @scala.inline
  def Accessory_=(x: ReactComponentClass[PartialIconPropsPartialIm]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Accessory")(x.asInstanceOf[js.Any])
}
