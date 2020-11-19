package typingsSlinky.proxyquire.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Proxyquire extends js.Object {
  
  def apply(request: String, stubs: js.Any): js.Any = js.native
  
  def callThru(): Proxyquire = js.native
  
  def load(request: String, stubs: js.Any): js.Any = js.native
  @JSName("load")
  def load_T_T[T](request: String, stubs: js.Any): T = js.native
  
  def noCallThru(): Proxyquire = js.native
  
  def noPreserveCache(): Proxyquire = js.native
  
  def preserveCache(): Proxyquire = js.native
}
