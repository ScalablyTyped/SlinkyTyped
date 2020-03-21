package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.textMod.TextProps
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.FC
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Text")
@js.native
object Text extends TopLevel[
      FC[
        TextProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], color])
      ]
    ]

