package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.buttonMod.ButtonProps
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.ButtonHTMLAttributes
import typingsSlinky.react.mod.DetailedHTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grommet/es6", "Button")
@js.native
object Button extends TopLevel[
      ReactComponentClass[
        ButtonProps with (Omit[
          DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
          color
        ])
      ]
    ]
