package typingsSlinky.grommet.paragraphMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.FC
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.HTMLParagraphElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Paragraph", "Paragraph")
@js.native
object Paragraph extends TopLevel[
      FC[
        ParagraphProps with (Omit[
          DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
          color
        ])
      ]
    ]

