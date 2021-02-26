package typingsSlinky.chaiArrays

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
  
  @JSImport("chai-arrays", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assert extends StObject {
        
        def array(`val`: js.Array[_]): Unit = js.native
        def array(`val`: js.Array[_], msg: String): Unit = js.native
        
        def containing(`val`: js.Array[_], value: js.Any): Unit = js.native
        def containing(`val`: js.Array[_], value: js.Any, msg: String): Unit = js.native
        
        def containingAllOf(`val`: js.Array[_], values: js.Array[_]): Unit = js.native
        def containingAllOf(`val`: js.Array[_], values: js.Array[_], msg: String): Unit = js.native
        
        def containingAnyOf(`val`: js.Array[_], values: js.Array[_]): Unit = js.native
        def containingAnyOf(`val`: js.Array[_], values: js.Array[_], msg: String): Unit = js.native
        
        def equalTo(`val`: js.Array[_], array: js.Array[_]): Unit = js.native
        def equalTo(`val`: js.Array[_], array: js.Array[_], msg: String): Unit = js.native
        
        def ofSize(`val`: js.Array[_], size: Double): Unit = js.native
        def ofSize(`val`: js.Array[_], size: Double, msg: String): Unit = js.native
        
        def sorted(`val`: js.Array[_]): Unit = js.native
        def sorted(`val`: js.Array[_], msg: String): Unit = js.native
      }
      
      @js.native
      trait Assertion
        extends LanguageChains
           with NumericComparison
           with TypeComparison {
        
        def array(): Assertion = js.native
        
        def containing(value: js.Any): Assertion = js.native
        
        def containingAllOf(values: js.Array[_]): Assertion = js.native
        
        def containingAnyOf(values: js.Array[_]): Assertion = js.native
        
        def equalTo(arr: js.Array[_]): Assertion = js.native
        
        def ofSize(size: Double): Assertion = js.native
        
        def sorted(): Assertion = js.native
      }
    }
  }
}
