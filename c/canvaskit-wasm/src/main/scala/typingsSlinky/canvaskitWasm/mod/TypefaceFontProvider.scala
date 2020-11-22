package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypefaceFontProvider extends EmbindObject[TypefaceFontProvider] {
  
  /**
    * Registers a given typeface with the given family name (ignoring whatever name the
    * typface has for itself).
    * @param bytes - the raw bytes for a typeface.
    * @param family
    */
  def registerFont(bytes: js.typedarray.ArrayBuffer, family: String): Unit = js.native
  def registerFont(bytes: js.typedarray.Uint8Array, family: String): Unit = js.native
}
