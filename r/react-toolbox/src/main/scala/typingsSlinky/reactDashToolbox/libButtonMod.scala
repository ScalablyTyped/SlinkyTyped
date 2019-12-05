package typingsSlinky.reactDashToolbox

import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashToolbox.libButtonBrowseButtonMod.BrowseButtonProps
import typingsSlinky.reactDashToolbox.libButtonButtonMod.ButtonProps
import typingsSlinky.reactDashToolbox.libButtonIconButtonMod.IconButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/lib/button", JSImport.Namespace)
@js.native
object libButtonMod extends js.Object {
  @js.native
  class BrowseButton ()
    extends Component[BrowseButtonProps, js.Object, js.Any]
  
  @js.native
  class Button ()
    extends Component[ButtonProps, js.Object, js.Any]
  
  @js.native
  class IconButton ()
    extends Component[IconButtonProps, js.Object, js.Any]
  
  @js.native
  class default ()
    extends Component[ButtonProps, js.Object, js.Any]
  
}

