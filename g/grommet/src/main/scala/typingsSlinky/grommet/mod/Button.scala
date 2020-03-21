package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.buttonMod.ButtonProps
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.ButtonHTMLAttributes
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.FC
import typingsSlinky.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Button")
@js.native
object Button extends TopLevel[
      FC[
        ButtonProps with (Omit[
          DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
          color
        ])
      ]
    ]

