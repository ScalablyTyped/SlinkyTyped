package typingsSlinky.naja

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("naja", JSImport.Default)
  @js.native
  val default: typingsSlinky.naja.najaMod.Naja = js.native
  
  @JSImport("naja", "HttpError")
  @js.native
  class HttpError ()
    extends typingsSlinky.naja.najaMod.HttpError
  
  @JSImport("naja", "Naja")
  @js.native
  class Naja ()
    extends typingsSlinky.naja.najaMod.Naja
  
  type _To = typingsSlinky.naja.najaMod.Naja
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: typingsSlinky.naja.najaMod.Naja = default
}
