package typingsSlinky.emberPolyfills

import typingsSlinky.emberPolyfills.typesMod.Mix
import typingsSlinky.emberPolyfills.typesMod.Mix3
import typingsSlinky.emberPolyfills.typesMod.Mix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember/polyfills", "assign")
  @js.native
  def assign(target: js.Object): scala.Nothing = js.native
  @JSImport("@ember/polyfills", "assign")
  @js.native
  def assign(target: js.Object, sources: js.Object*): js.Any = js.native
  @JSImport("@ember/polyfills", "assign")
  @js.native
  def assign[T /* <: js.Object */, U /* <: js.Object */](target: T, source: U): Mix[T, U] = js.native
  @JSImport("@ember/polyfills", "assign")
  @js.native
  def assign[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */](target: T, source1: U, source2: V): Mix3[T, U, V] = js.native
  @JSImport("@ember/polyfills", "assign")
  @js.native
  def assign[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */, W /* <: js.Object */](target: T, source1: U, source2: V, source3: W): Mix4[T, U, V, W] = js.native
  
  @JSImport("@ember/polyfills", "merge")
  @js.native
  def merge[T /* <: js.Object */, U /* <: js.Object */](original: T, updates: U): Mix[T, U] = js.native
}
