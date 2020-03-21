package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.paragraphMod.ParagraphProps
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.FC
import typingsSlinky.react.mod.HTMLAttributes
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

