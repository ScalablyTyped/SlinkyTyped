package typingsSlinky.reactDom.experimentalMod.reactDomAugmentingMod

import typingsSlinky.react.mod.ReactChild
import typingsSlinky.react.mod.ReactNodeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Root extends js.Object {
  
  def render(children: ReactChild): Unit = js.native
  def render(children: ReactChild, callback: js.Function0[Unit]): Unit = js.native
  def render(children: ReactNodeArray): Unit = js.native
  def render(children: ReactNodeArray, callback: js.Function0[Unit]): Unit = js.native
  
  def unmount(): Unit = js.native
  def unmount(callback: js.Function0[Unit]): Unit = js.native
}
