package typingsSlinky.jestTypes.anon

import typingsSlinky.jestTypes.circusMod.DoneFn
import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.circusMod.HookFn
import typingsSlinky.jestTypes.circusMod.HookType
import typingsSlinky.jestTypes.jestTypesStrings.add_hook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn extends Event {
  
  var asyncError: js.Error = js.native
  
  def fn(): js.UndefOr[js.Promise[_] | Null] = js.native
  def fn(done: DoneFn): js.UndefOr[js.Promise[_] | Null] = js.native
  @JSName("fn")
  var fn_Original: HookFn = js.native
  
  var hookType: HookType = js.native
  
  var name: add_hook = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
