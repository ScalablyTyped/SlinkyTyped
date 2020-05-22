package typingsSlinky.breeze.global.breeze

import typingsSlinky.breeze.anon.ExtractKeyMappings
import typingsSlinky.breeze.breeze.KeyMapping
import typingsSlinky.breeze.breeze.NodeContext
import typingsSlinky.breeze.breeze.QueryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.JsonResultsAdapter")
@js.native
class JsonResultsAdapter protected ()
  extends typingsSlinky.breeze.breeze.JsonResultsAdapter {
  def this(config: ExtractKeyMappings) = this()
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override def extractKeyMappings(data: js.Object): js.Array[KeyMapping] = js.native
  /* CompleteClass */
  override def extractResults(data: js.Object): js.Object = js.native
  /* CompleteClass */
  override def extractSaveResults(data: js.Object): js.Array[_] = js.native
  /* CompleteClass */
  override def visitNode(node: js.Object, queryContext: QueryContext, nodeContext: NodeContext): typingsSlinky.breeze.anon.EntityType = js.native
}

