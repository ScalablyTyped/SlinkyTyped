package typingsSlinky.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object breeze {
  type EntityActionSymbol = typingsSlinky.breeze.breeze.core.EnumSymbol
  type ExecuteQueryErrorCallback = js.Function1[/* error */ typingsSlinky.breeze.anon.EntityManager, scala.Unit]
  type ExecuteQuerySuccessCallback = js.Function1[/* data */ typingsSlinky.breeze.breeze.QueryResult, scala.Unit]
  type FilterQueryOpSymbol = typingsSlinky.breeze.breeze.core.EnumSymbol
  type MergeStrategySymbol = typingsSlinky.breeze.breeze.core.EnumSymbol
  type SaveChangesErrorCallback = js.Function1[/* error */ typingsSlinky.breeze.anon.EntityErrors, scala.Unit]
  type SaveChangesSuccessCallback = js.Function1[/* saveResult */ typingsSlinky.breeze.breeze.SaveResult, scala.Unit]
  type ValidatorFunction = js.Function2[
    /* value */ js.Any, 
    /* context */ typingsSlinky.breeze.breeze.ValidatorFunctionContext, 
    scala.Unit
  ]
}
