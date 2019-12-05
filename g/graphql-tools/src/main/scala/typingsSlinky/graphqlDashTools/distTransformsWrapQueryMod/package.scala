package typingsSlinky.graphqlDashTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTransformsWrapQueryMod {
  import typingsSlinky.graphql.languageAstMod.SelectionNode
  import typingsSlinky.graphql.languageAstMod.SelectionSetNode

  type QueryWrapper = js.Function1[/* subtree */ SelectionSetNode, SelectionNode | SelectionSetNode]
}
