package typingsSlinky.qunitDom

import org.scalajs.dom.raw.Element
import typingsSlinky.qunitDom.assertionsMod.AssertionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("qunit-dom/dist/helpers/test-assertions", JSImport.Namespace)
@js.native
object testAssertionsMod extends js.Object {
  
  @js.native
  trait TestAssertions extends js.Object {
    
    def dom(): typingsSlinky.qunitDom.assertionsMod.default = js.native
    def dom(target: String): typingsSlinky.qunitDom.assertionsMod.default = js.native
    def dom(target: String, rootElement: Element): typingsSlinky.qunitDom.assertionsMod.default = js.native
    def dom(target: Null, rootElement: Element): typingsSlinky.qunitDom.assertionsMod.default = js.native
    def dom(target: Element): typingsSlinky.qunitDom.assertionsMod.default = js.native
    def dom(target: Element, rootElement: Element): typingsSlinky.qunitDom.assertionsMod.default = js.native
    
    def pushResult(result: AssertionResult): Unit = js.native
    
    var results: js.Array[AssertionResult] = js.native
  }
  
  @js.native
  class default () extends TestAssertions
}
