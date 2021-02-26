package typingsSlinky.openpgp.mod.enums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait s2k extends StObject
/**
  * A string to key specifier type
  */
@JSImport("openpgp", "enums.s2k")
@js.native
object s2k extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[s2k with Double] = js.native
  
  @js.native
  sealed trait gnu extends s2k
  /* 101 */ val gnu: typingsSlinky.openpgp.mod.enums.s2k.gnu with Double = js.native
  
  @js.native
  sealed trait iterated extends s2k
  /* 3 */ val iterated: typingsSlinky.openpgp.mod.enums.s2k.iterated with Double = js.native
  
  @js.native
  sealed trait salted extends s2k
  /* 1 */ val salted: typingsSlinky.openpgp.mod.enums.s2k.salted with Double = js.native
  
  @js.native
  sealed trait simple extends s2k
  /* 0 */ val simple: typingsSlinky.openpgp.mod.enums.s2k.simple with Double = js.native
}
