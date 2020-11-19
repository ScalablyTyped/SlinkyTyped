package typingsSlinky.graphqlToolsBatchDelegate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type BatchDelegateFn[TContext, K] = js.Function1[
    /* batchDelegateOptions */ typingsSlinky.graphqlToolsBatchDelegate.typesMod.BatchDelegateOptions[TContext, K], 
    js.Any
  ]
  
  type BatchDelegateOptionsFn[TContext, K] = js.Function1[
    /* batchDelegateOptions */ typingsSlinky.graphqlToolsBatchDelegate.typesMod.BatchDelegateOptions[TContext, K], 
    typingsSlinky.graphqlToolsDelegate.typesMod.IDelegateToSchemaOptions[TContext, typingsSlinky.std.Record[java.lang.String, js.Any]]
  ]
}
