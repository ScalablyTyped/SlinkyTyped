package typingsSlinky.eslintPluginReact.mod._Global_

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.estree.mod.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASTNode
  extends BaseNode
     with /* _ */ StringDictionary[js.Any]

object ASTNode {
  @scala.inline
  def apply(`type`: String): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
}

