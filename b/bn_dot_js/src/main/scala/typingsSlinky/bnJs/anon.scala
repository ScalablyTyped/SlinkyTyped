package typingsSlinky.bnJs

import typingsSlinky.bnJs.mod.BN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait A extends StObject {
    
    var a: BN = js.native
    
    var b: BN = js.native
    
    var gcd: BN = js.native
  }
  object A {
    
    @scala.inline
    def apply(a: BN, b: BN, gcd: BN): A = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], gcd = gcd.asInstanceOf[js.Any])
      __obj.asInstanceOf[A]
    }
    
    @scala.inline
    implicit class AMutableBuilder[Self <: A] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: BN): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: BN): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGcd(value: BN): Self = StObject.set(x, "gcd", value.asInstanceOf[js.Any])
    }
  }
}
