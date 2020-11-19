package typingsSlinky.graphqlToolsWrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object wrapQueryMod {
  
  type QueryWrapper = js.Function1[
    /* subtree */ typingsSlinky.graphql.astMod.SelectionSetNode, 
    typingsSlinky.graphql.astMod.SelectionNode | typingsSlinky.graphql.astMod.SelectionSetNode
  ]
}
