package typingsSlinky.grommet.grommetMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.componentsHeadingMod.HeadingProps
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.reactMod.DetailedHTMLProps
import typingsSlinky.react.reactMod.FC
import typingsSlinky.react.reactMod.HTMLAttributes
import typingsSlinky.std.HTMLHeadingElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Heading")
@js.native
object Heading extends TopLevel[
      FC[
        HeadingProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], color])
      ]
    ]

