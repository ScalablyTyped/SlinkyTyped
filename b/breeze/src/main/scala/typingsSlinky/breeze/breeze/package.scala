package typingsSlinky.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object breeze {
  type ExecuteQueryErrorCallback = js.Function1[/* error */ typingsSlinky.breeze.AnonEntityManager, scala.Unit]
  type ExecuteQuerySuccessCallback = js.Function1[/* data */ typingsSlinky.breeze.breeze.QueryResult, scala.Unit]
  type SaveChangesErrorCallback = js.Function1[/* error */ typingsSlinky.breeze.AnonEntityErrors, scala.Unit]
  type SaveChangesSuccessCallback = js.Function1[/* saveResult */ typingsSlinky.breeze.breeze.SaveResult, scala.Unit]
  type ValidatorFunction = js.Function2[
    /* value */ js.Any, 
    /* context */ typingsSlinky.breeze.breeze.ValidatorFunctionContext, 
    scala.Unit
  ]
}
