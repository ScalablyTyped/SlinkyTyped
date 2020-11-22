package typingsSlinky.jestTypes.anon

import typingsSlinky.jestTypes.circusMod.SyncEvent
import typingsSlinky.jestTypes.circusMod.TestFn
import typingsSlinky.jestTypes.circusMod.TestMode
import typingsSlinky.jestTypes.circusMod.TestName
import typingsSlinky.jestTypes.globalMod.DoneFn
import typingsSlinky.jestTypes.jestTypesStrings.add_test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mode extends SyncEvent {
  
  var asyncError: js.Error = js.native
  
  def fn(): js.UndefOr[(js.Promise[js.UndefOr[Unit | _]]) | Unit] = js.native
  def fn(done: DoneFn): js.UndefOr[(js.Promise[js.UndefOr[Unit | _]]) | Unit] = js.native
  @JSName("fn")
  var fn_Original: TestFn = js.native
  
  var mode: js.UndefOr[TestMode] = js.native
  
  var name: add_test = js.native
  
  var testName: TestName = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
