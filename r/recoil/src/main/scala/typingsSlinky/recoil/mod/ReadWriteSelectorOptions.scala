package typingsSlinky.recoil.mod

import typingsSlinky.recoil.anon.Reset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadWriteSelectorOptions[T] extends ReadOnlySelectorOptions[T] {
  
  def set(opts: Reset, newValue: T): Unit = js.native
  def set(opts: Reset, newValue: DefaultValue): Unit = js.native
}
