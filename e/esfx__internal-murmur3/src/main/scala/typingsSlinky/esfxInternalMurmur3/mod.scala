package typingsSlinky.esfxInternalMurmur3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/internal-murmur3", "createSeed")
  @js.native
  def createSeed(): Double = js.native
  
  @JSImport("@esfx/internal-murmur3", "defaultSeed")
  @js.native
  val defaultSeed: Double = js.native
  
  @JSImport("@esfx/internal-murmur3", "hash")
  @js.native
  def hash(buffer: js.typedarray.ArrayBuffer, seed: Double): Double = js.native
}
