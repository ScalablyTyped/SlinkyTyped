package typingsSlinky.chaiRoughly

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.chai.Chai.ChaiPlugin
import typingsSlinky.chai.Chai.LanguageChains
import typingsSlinky.chai.Chai.NumericComparison
import typingsSlinky.chai.Chai.TypeComparison
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-roughly", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      // For Assert APIs
      @js.native
      trait Assert extends StObject {
        
        def roughly(): Assertion = js.native
        def roughly(tolerance: Double): Assertion = js.native
        def roughly(`type`: String): typingsSlinky.chai.Chai.Assertion = js.native
        def roughly(`type`: String, message: String): typingsSlinky.chai.Chai.Assertion = js.native
        @JSName("roughly")
        var roughly_Original: Roughly = js.native
      }
      
      @js.native
      trait Assertion
        extends LanguageChains
           with NumericComparison
           with TypeComparison {
        
        def roughly(): Assertion = js.native
        def roughly(tolerance: Double): Assertion = js.native
        def roughly(`type`: String): typingsSlinky.chai.Chai.Assertion = js.native
        def roughly(`type`: String, message: String): typingsSlinky.chai.Chai.Assertion = js.native
        @JSName("roughly")
        var roughly_Original: Roughly = js.native
      }
      
      // For BDD APIs
      @js.native
      trait Roughly extends Assertion {
        
        def apply(): Assertion = js.native
        def apply(tolerance: Double): Assertion = js.native
      }
    }
  }
}
