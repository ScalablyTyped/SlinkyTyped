package typingsSlinky.jsJoda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // TODO: js-joda doesn't have Chronology yet. Methods like `LocalDate.chronology()`
  // actually return an `IsoChronology` so Chronology is an alias type of that class
  // for now. Change this if Chronology is added.
  type Chronology = typingsSlinky.jsJoda.mod.IsoChronology
}
