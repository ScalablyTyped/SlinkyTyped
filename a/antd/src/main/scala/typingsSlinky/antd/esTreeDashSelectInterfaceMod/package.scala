package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esTreeDashSelectInterfaceMod {
  import org.scalablytyped.runtime.StringDictionary
  import slinky.core.TagMod

  type TreeNode = TreeNodeNormal | TreeNodeSimpleMode
  type TreeNodeSimpleMode = StringDictionary[String | Boolean | TagMod[Any]]
  type TreeNodeValue = String | Double | (js.Array[Double | String])
}
