package typingsSlinky.chaiOequal

import typingsSlinky.chai.Chai.Equal
import typingsSlinky.chai.Chai.LanguageChains
import typingsSlinky.chai.Chai.NumericComparison
import typingsSlinky.chai.Chai.TypeComparison
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Chai {
  
  // For Assert APIs
  @js.native
  trait Assert extends StObject {
    
    def oeq(act: js.Any, exp: js.Any): Equal = js.native
    def oeq(act: js.Any, exp: js.Any, method: String): Equal = js.native
    
    def oeql(act: js.Any, exp: js.Any): Equal = js.native
    def oeql(act: js.Any, exp: js.Any, method: String): Equal = js.native
    
    def oequal(act: js.Any, exp: js.Any): Equal = js.native
    def oequal(act: js.Any, exp: js.Any, method: String): Equal = js.native
  }
  
  // For BDD APIs
  @js.native
  trait Assertion
    extends LanguageChains
       with NumericComparison
       with TypeComparison {
    
    def oeq(result: js.Any): Equal = js.native
    def oeq(result: js.Any, method: String): Equal = js.native
    
    def oeql(result: js.Any): Equal = js.native
    def oeql(result: js.Any, method: String): Equal = js.native
    
    def oequal(result: js.Any): Equal = js.native
    def oequal(result: js.Any, method: String): Equal = js.native
  }
}
