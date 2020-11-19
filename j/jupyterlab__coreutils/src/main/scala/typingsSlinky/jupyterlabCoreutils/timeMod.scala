package typingsSlinky.jupyterlabCoreutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/coreutils/lib/time", JSImport.Namespace)
@js.native
object timeMod extends js.Object {
  
  @js.native
  object Time extends js.Object {
    
    /**
      * Convert a timestring to a date format.
      *
      * @param value - The date timestring or date object.
      *
      * @param format - The format string.
      *
      * @returns A formatted date.
      */
    def format(value: String): String = js.native
    def format(value: String, timeFormat: String): String = js.native
    def format(value: js.Date): String = js.native
    def format(value: js.Date, timeFormat: String): String = js.native
    
    /**
      * Convert a timestring to a human readable string (e.g. 'two minutes ago').
      *
      * @param value - The date timestring or date object.
      *
      * @returns A formatted date.
      */
    def formatHuman(value: String): String = js.native
    def formatHuman(value: js.Date): String = js.native
  }
}
