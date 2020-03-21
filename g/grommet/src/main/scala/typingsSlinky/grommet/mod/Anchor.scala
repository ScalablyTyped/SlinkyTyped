package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.anchorMod.AnchorProps
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.AnchorHTMLAttributes
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.FC
import typingsSlinky.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Anchor")
@js.native
object Anchor extends TopLevel[
      FC[
        AnchorProps with (Omit[
          DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
          color
        ])
      ]
    ]

