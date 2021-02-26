package typingsSlinky.jestTypes.anon

import typingsSlinky.jestTypes.circusMod.HookFn
import typingsSlinky.jestTypes.circusMod.HookType
import typingsSlinky.jestTypes.circusMod.SyncEvent
import typingsSlinky.jestTypes.globalMod.DoneFn
import typingsSlinky.jestTypes.jestTypesStrings.add_hook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn extends SyncEvent {
  
  var asyncError: js.Error = js.native
  
  def fn(): js.UndefOr[(js.Promise[js.UndefOr[Unit | _]]) | Unit] = js.native
  def fn(done: DoneFn): js.UndefOr[(js.Promise[js.UndefOr[Unit | _]]) | Unit] = js.native
  @JSName("fn")
  var fn_Original: HookFn = js.native
  
  var hookType: HookType = js.native
  
  var name: add_hook = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
