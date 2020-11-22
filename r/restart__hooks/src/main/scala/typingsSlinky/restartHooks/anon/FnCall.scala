package typingsSlinky.restartHooks.anon

import typingsSlinky.restartHooks.restartHooksBooleans.`true`
import typingsSlinky.restartHooks.restartHooksStrings.down
import typingsSlinky.restartHooks.restartHooksStrings.up
import typingsSlinky.restartHooks.useBreakpointMod.BreakpointDirection
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall[TKey /* <: String */] extends js.Object {
  
  def apply(breakpointMap: Partial[Record[TKey, BreakpointDirection]]): Boolean = js.native
  def apply(breakpoint: TKey): Boolean = js.native
  def apply(breakpoint: TKey, direction: `true`): Boolean = js.native
  def apply(breakpoint: TKey, direction: down): Boolean = js.native
  def apply(breakpoint: TKey, direction: up): Boolean = js.native
}
