package typingsSlinky.phenomnomnominalTsquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tsqueryTypesMod {
  type TSQueryAttributeOperator = js.Function3[
    /* obj */ js.Any, 
    /* value */ js.Any, 
    /* type */ typingsSlinky.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryAttributeOperatorType, 
    scala.Boolean
  ]
  type TSQueryAttributeOperators = org.scalablytyped.runtime.StringDictionary[typingsSlinky.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryAttributeOperator]
  type TSQueryMatcher = js.Function4[
    /* node */ typingsSlinky.typescript.mod.Node, 
    /* selector */ typingsSlinky.phenomnomnominalTsquery.tsqueryTypesMod.TSQuerySelectorNode, 
    /* ancestry */ js.Array[typingsSlinky.typescript.mod.Node], 
    /* options */ typingsSlinky.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryOptions, 
    scala.Boolean
  ]
  type TSQueryMatchers = org.scalablytyped.runtime.StringDictionary[typingsSlinky.phenomnomnominalTsquery.tsqueryTypesMod.TSQueryMatcher]
  type TSQueryNodeTransformer = js.Function1[
    /* node */ typingsSlinky.typescript.mod.Node, 
    js.UndefOr[typingsSlinky.typescript.mod.Node | scala.Null]
  ]
  type TSQueryStringTransformer = js.Function1[
    /* node */ typingsSlinky.typescript.mod.Node, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
}
