package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLParagraphElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.paragraphMod.ParagraphProps
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grommet/es6", "Paragraph")
@js.native
object Paragraph extends TopLevel[
      ReactComponentClass[
        ParagraphProps with (Omit[
          DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement], 
          color
        ])
      ]
    ]
