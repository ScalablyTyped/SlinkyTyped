package typingsSlinky.nodegit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oidMod {
  
  @JSImport("nodegit/oid", "Oid")
  @js.native
  class Oid () extends StObject {
    
    def cmp(b: Oid): Double = js.native
    
    def cpy(): Oid = js.native
    
    def equal(b: Oid): Double = js.native
    
    def iszero(): Double = js.native
    
    def ncmp(b: Oid, len: Double): Double = js.native
    
    def strcmp(str: String): Double = js.native
    
    def streq(str: String): Double = js.native
    
    def tostrS(): String = js.native
  }
  /* static members */
  object Oid {
    
    @JSImport("nodegit/oid", "Oid.fromString")
    @js.native
    def fromString(str: String): Oid = js.native
  }
}
