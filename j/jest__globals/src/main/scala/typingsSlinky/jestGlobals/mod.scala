package typingsSlinky.jestGlobals

import typingsSlinky.expect.typesMod.Expect
import typingsSlinky.jestEnvironment.mod.Jest
import typingsSlinky.jestGlobals.anon.FnCall
import typingsSlinky.jestGlobals.anon.FnCallFnTimeout
import typingsSlinky.jestTypes.anon.ItBaseconcurrentItConcurr
import typingsSlinky.jestTypes.globalMod.BlockFn
import typingsSlinky.jestTypes.globalMod.BlockName
import typingsSlinky.jestTypes.globalMod.Describe
import typingsSlinky.jestTypes.globalMod.DescribeBase
import typingsSlinky.jestTypes.globalMod.HookBase
import typingsSlinky.jestTypes.globalMod.ItBase
import typingsSlinky.jestTypes.globalMod.ItConcurrent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jest/globals", "afterAll")
  @js.native
  val afterAll: HookBase with FnCallFnTimeout = js.native
  
  @JSImport("@jest/globals", "afterEach")
  @js.native
  val afterEach: HookBase with FnCallFnTimeout = js.native
  
  @JSImport("@jest/globals", "beforeAll")
  @js.native
  val beforeAll: HookBase with FnCallFnTimeout = js.native
  
  @JSImport("@jest/globals", "beforeEach")
  @js.native
  val beforeEach: HookBase with FnCallFnTimeout = js.native
  
  @JSImport("@jest/globals", "describe")
  @js.native
  val describe: Describe with (js.Function2[/* blockName */ BlockName, /* blockFn */ BlockFn, Unit]) = js.native
  
  @JSImport("@jest/globals", "expect")
  @js.native
  val expect: Expect = js.native
  
  @JSImport("@jest/globals", "fdescribe")
  @js.native
  val fdescribe: DescribeBase with (js.Function2[/* blockName */ BlockName, /* blockFn */ BlockFn, Unit]) = js.native
  
  @JSImport("@jest/globals", "fit")
  @js.native
  val fit: ItBaseconcurrentItConcurr with FnCall = js.native
  
  @JSImport("@jest/globals", "it")
  @js.native
  val it: ItConcurrent with FnCall = js.native
  
  @JSImport("@jest/globals", "jest")
  @js.native
  val jest: Jest = js.native
  
  @JSImport("@jest/globals", "test")
  @js.native
  val test: ItConcurrent with FnCall = js.native
  
  @JSImport("@jest/globals", "xdescribe")
  @js.native
  val xdescribe: DescribeBase with (js.Function2[/* blockName */ BlockName, /* blockFn */ BlockFn, Unit]) = js.native
  
  @JSImport("@jest/globals", "xit")
  @js.native
  val xit: ItBase with FnCall = js.native
  
  @JSImport("@jest/globals", "xtest")
  @js.native
  val xtest: ItBase with FnCall = js.native
}
