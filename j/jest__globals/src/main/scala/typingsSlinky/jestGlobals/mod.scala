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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/globals", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val afterAll: HookBase with FnCallFnTimeout = js.native
  
  val afterEach: HookBase with FnCallFnTimeout = js.native
  
  val beforeAll: HookBase with FnCallFnTimeout = js.native
  
  val beforeEach: HookBase with FnCallFnTimeout = js.native
  
  val describe: Describe with (js.Function2[/* blockName */ BlockName, /* blockFn */ BlockFn, Unit]) = js.native
  
  val expect: Expect = js.native
  
  val fdescribe: DescribeBase with (js.Function2[/* blockName */ BlockName, /* blockFn */ BlockFn, Unit]) = js.native
  
  val fit: ItBaseconcurrentItConcurr with FnCall = js.native
  
  val it: ItConcurrent with FnCall = js.native
  
  val jest: Jest = js.native
  
  val test: ItConcurrent with FnCall = js.native
  
  val xdescribe: DescribeBase with (js.Function2[/* blockName */ BlockName, /* blockFn */ BlockFn, Unit]) = js.native
  
  val xit: ItBase with FnCall = js.native
  
  val xtest: ItBase with FnCall = js.native
}
