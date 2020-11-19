package typingsSlinky.nodeSql2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JoinTableNode extends TableNode {
  
  def on(filter: String): TableNode = js.native
  def on(filter: BinaryNode): TableNode = js.native
}
