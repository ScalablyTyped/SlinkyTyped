package typingsSlinky.grommet.grommetMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.componentsParagraphMod.ParagraphProps
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.reactMod.DetailedHTMLProps
import typingsSlinky.react.reactMod.FC
import typingsSlinky.react.reactMod.HTMLAttributes
import typingsSlinky.std.HTMLParagraphElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Paragraph")
@js.native
object Paragraph extends TopLevel[
      FC[
        ParagraphProps with (Omit[
          DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
          color
        ])
      ]
    ]

