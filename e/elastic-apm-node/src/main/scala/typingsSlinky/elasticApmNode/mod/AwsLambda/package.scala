package typingsSlinky.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object AwsLambda {
  
  type Callback[TResult] = js.Function2[
    /* error */ js.UndefOr[js.Error | scala.Null | java.lang.String], 
    /* result */ js.UndefOr[TResult], 
    scala.Unit
  ]
  
  type Handler[TEvent, TResult] = js.Function3[
    /* event */ TEvent, 
    /* context */ typingsSlinky.elasticApmNode.mod.AwsLambda.Context, 
    /* callback */ typingsSlinky.elasticApmNode.mod.AwsLambda.Callback[TResult], 
    scala.Unit | js.Promise[TResult]
  ]
}
