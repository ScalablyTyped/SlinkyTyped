package typingsSlinky.chaiHttp.mod.global.Chai

import typingsSlinky.chaiHttp.mod.global.ChaiHttp.Agent
import typingsSlinky.std.PromiseConstructorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChaiHttpRequest extends js.Object {
  
  def apply(server: js.Any): Agent = js.native
  
  def addPromises(promiseConstructor: PromiseConstructorLike): Unit = js.native
  
  def agent(server: js.Any): Agent = js.native
}
