package typingsSlinky.jestTypes.circusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hook extends js.Object {
  
  var asyncError: js.Error = js.native
  
  def fn(): js.UndefOr[(js.Promise[js.UndefOr[Unit | _]]) | Unit] = js.native
  def fn(done: typingsSlinky.jestTypes.globalMod.DoneFn): js.UndefOr[(js.Promise[js.UndefOr[Unit | _]]) | Unit] = js.native
  @JSName("fn")
  var fn_Original: HookFn = js.native
  
  var parent: DescribeBlock = js.native
  
  var timeout: js.UndefOr[Double | Null] = js.native
  
  var `type`: HookType = js.native
}
