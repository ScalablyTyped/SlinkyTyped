package typingsSlinky.chaiLike.mod.ChaiLike

import typingsSlinky.chai.Chai.ChaiPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChaiLike extends ChaiPlugin {
  
  def clearPlugins(): Unit = js.native
  
  def extend(plugin: Plugin): Unit = js.native
}
