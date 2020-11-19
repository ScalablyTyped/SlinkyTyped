package typingsSlinky.graphqlToolsWrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object transformQueryMod {
  
  type ErrorPathTransformer = js.Function1[
    /* path */ js.Array[java.lang.String | scala.Double], 
    js.Array[java.lang.String | scala.Double]
  ]
  
  type QueryTransformer = js.Function2[
    /* selectionSet */ typingsSlinky.graphql.astMod.SelectionSetNode, 
    /* fragments */ typingsSlinky.std.Record[java.lang.String, typingsSlinky.graphql.astMod.FragmentDefinitionNode], 
    typingsSlinky.graphql.astMod.SelectionSetNode
  ]
  
  type ResultTransformer = js.Function1[/* result */ js.Any, js.Any]
}
