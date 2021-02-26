package typingsSlinky.mochaEach

import typingsSlinky.mocha.mod.Context
import typingsSlinky.mocha.mod.Suite_
import typingsSlinky.mocha.mod.Test_
import typingsSlinky.mochaEach.mod.ForEachDescribeDefinition
import typingsSlinky.mochaEach.mod.ForEachTestFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Describe extends StObject {
    
    def describe(expectation: String): Suite_ = js.native
    def describe(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, _]): Suite_ = js.native
    @JSName("describe")
    var describe_Original: ForEachDescribeDefinition = js.native
    
    def it(expectation: String): Test_ = js.native
    def it(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, _]): Test_ = js.native
    @JSName("it")
    var it_Original: ForEachTestFunction = js.native
  }
}
