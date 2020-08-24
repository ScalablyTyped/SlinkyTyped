package typingsSlinky.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object checkBoxGroupMod {
  type CheckBoxType = typingsSlinky.grommet.utilsMod.Omit[
    typingsSlinky.grommet.checkBoxMod.CheckBoxProps with (typingsSlinky.react.mod.DetailedHTMLProps[
      typingsSlinky.react.mod.InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement], 
      org.scalajs.dom.raw.HTMLInputElement
    ]), 
    typingsSlinky.grommet.grommetStrings.checked
  ]
}
