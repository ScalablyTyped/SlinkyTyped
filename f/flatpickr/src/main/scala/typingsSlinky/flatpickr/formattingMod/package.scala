package typingsSlinky.flatpickr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object formattingMod {
  
  type RevFormatFn = js.Function3[
    /* date */ typingsSlinky.flatpickr.globalsMod.global.Date, 
    /* data */ java.lang.String, 
    /* locale */ typingsSlinky.flatpickr.localeMod.Locale, 
    js.UndefOr[typingsSlinky.flatpickr.globalsMod.global.Date | scala.Unit]
  ]
  
  type RevFormat_ = typingsSlinky.std.Record[java.lang.String, typingsSlinky.flatpickr.formattingMod.RevFormatFn]
}
