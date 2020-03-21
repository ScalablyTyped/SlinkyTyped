package typingsSlinky.reactToolbox

import typingsSlinky.react.mod.Component
import typingsSlinky.reactToolbox.cardCardActionsMod.CardActionsProps
import typingsSlinky.reactToolbox.cardCardMediaMod.CardMediaProps
import typingsSlinky.reactToolbox.cardCardTextMod.CardTextProps
import typingsSlinky.reactToolbox.cardCardTitleMod.CardTitleProps
import typingsSlinky.reactToolbox.libCardCardMod.CardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toolbox/lib/card", JSImport.Namespace)
@js.native
object libCardMod extends js.Object {
  @js.native
  class Card ()
    extends Component[CardProps, js.Object, js.Any]
  
  @js.native
  class CardActions ()
    extends Component[CardActionsProps, js.Object, js.Any]
  
  @js.native
  class CardMedia ()
    extends Component[CardMediaProps, js.Object, js.Any]
  
  @js.native
  class CardText ()
    extends Component[CardTextProps, js.Object, js.Any]
  
  @js.native
  class CardTitle ()
    extends Component[CardTitleProps, js.Object, js.Any]
  
  @js.native
  class default ()
    extends Component[CardProps, js.Object, js.Any]
  
}

