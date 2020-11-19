package typingsSlinky.rcPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object monthBodyMod {
  
  type MonthCellRender[DateType] = js.Function2[
    /* currentDate */ DateType, 
    /* locale */ typingsSlinky.rcPicker.interfaceMod.Locale, 
    slinky.core.facade.ReactElement
  ]
}
