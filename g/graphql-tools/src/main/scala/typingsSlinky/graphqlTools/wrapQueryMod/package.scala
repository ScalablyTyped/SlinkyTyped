package typingsSlinky.graphqlTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wrapQueryMod {
  type QueryWrapper = js.Function1[
    /* subtree */ typingsSlinky.graphql.astMod.SelectionSetNode, 
    typingsSlinky.graphql.astMod.SelectionNode | typingsSlinky.graphql.astMod.SelectionSetNode
  ]
}
