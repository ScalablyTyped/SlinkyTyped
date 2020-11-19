package typingsSlinky.node.NodeJS

import typingsSlinky.node.anon.Paths
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequireResolve extends js.Object {
  
  def apply(id: String): String = js.native
  def apply(id: String, options: Paths): String = js.native
  
  def paths(request: String): js.Array[String] | Null = js.native
}
