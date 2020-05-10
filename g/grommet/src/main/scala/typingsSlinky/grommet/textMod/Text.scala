package typingsSlinky.grommet.textMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Text", "Text")
@js.native
object Text extends TopLevel[
      ReactComponentClass[
        TextProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], color])
      ]
    ]

