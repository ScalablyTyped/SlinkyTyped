package typingsSlinky.reflexbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reflexboxMod {
  import org.scalajs.dom.raw.HTMLDivElement
  import typingsSlinky.atEmotionStyledDashBase.atEmotionStyledDashBaseMod.StyledComponent
  import typingsSlinky.atEmotionStyledDashBase.typesHelperMod.Omit
  import typingsSlinky.react.reactMod.DetailedHTMLProps
  import typingsSlinky.react.reactMod.HTMLAttributes

  type BoxType = StyledComponent[
    DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], 
    Omit[
      (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) with BoxProps, 
      String
    ], 
    js.Object
  ]
}
