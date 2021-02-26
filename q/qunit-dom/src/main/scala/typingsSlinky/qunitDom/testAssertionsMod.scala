package typingsSlinky.qunitDom

import org.scalajs.dom.raw.Element
import typingsSlinky.qunitDom.assertionsMod.AssertionResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testAssertionsMod {
  
  @JSImport("qunit-dom/dist/helpers/test-assertions", JSImport.Default)
  @js.native
  class default () extends TestAssertions
  
  @js.native
  trait TestAssertions extends StObject {
    
    def dom(): typingsSlinky.qunitDom.assertionsMod.default = js.native
    def dom(target: String): typingsSlinky.qunitDom.assertionsMod.default = js.native
    def dom(target: String, rootElement: Element): typingsSlinky.qunitDom.assertionsMod.default = js.native
    def dom(target: Element): typingsSlinky.qunitDom.assertionsMod.default = js.native
    def dom(target: Element, rootElement: Element): typingsSlinky.qunitDom.assertionsMod.default = js.native
    def dom(target: Null, rootElement: Element): typingsSlinky.qunitDom.assertionsMod.default = js.native
    
    def pushResult(result: AssertionResult): Unit = js.native
    
    var results: js.Array[AssertionResult] = js.native
  }
}
