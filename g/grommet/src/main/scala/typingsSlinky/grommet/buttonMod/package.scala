package typingsSlinky.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buttonMod {
  type ButtonType = typingsSlinky.grommet.buttonMod.ButtonProps with (typingsSlinky.grommet.utilsMod.Omit[
    typingsSlinky.react.mod.DetailedHTMLProps[
      typingsSlinky.react.mod.ButtonHTMLAttributes[org.scalajs.dom.raw.HTMLButtonElement], 
      org.scalajs.dom.raw.HTMLButtonElement
    ], 
    typingsSlinky.grommet.grommetStrings.color
  ])
}
