package typingsSlinky.grommet.paragraphMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLParagraphElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/es6/components/Paragraph", "Paragraph")
@js.native
object Paragraph extends TopLevel[
      ReactComponentClass[
        ParagraphProps with (Omit[
          DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
          color
        ])
      ]
    ]

