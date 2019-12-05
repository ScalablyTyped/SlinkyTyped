package typingsSlinky.atJestTypes

import typingsSlinky.atJestTypes.atJestTypesStrings.add_hook
import typingsSlinky.atJestTypes.buildCircusMod.DoneFn
import typingsSlinky.atJestTypes.buildCircusMod.Event
import typingsSlinky.atJestTypes.buildCircusMod.HookFn
import typingsSlinky.atJestTypes.buildCircusMod.HookType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Addhook extends Event {
  var asyncError: js.Error = js.native
  @JSName("fn")
  var fn_Original: HookFn = js.native
  var hookType: HookType = js.native
  var name: add_hook = js.native
  var timeout: js.UndefOr[Double] = js.native
  def fn(): js.UndefOr[js.Promise[_] | Null] = js.native
  def fn(done: DoneFn): js.UndefOr[js.Promise[_] | Null] = js.native
}

