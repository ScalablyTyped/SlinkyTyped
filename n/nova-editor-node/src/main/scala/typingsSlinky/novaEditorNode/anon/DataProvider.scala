package typingsSlinky.novaEditorNode.anon

import typingsSlinky.novaEditorNode.TreeDataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProvider[E] extends js.Object {
  var dataProvider: TreeDataProvider[E]
}

object DataProvider {
  @scala.inline
  def apply[E](dataProvider: TreeDataProvider[E]): DataProvider[E] = {
    val __obj = js.Dynamic.literal(dataProvider = dataProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProvider[E]]
  }
}

