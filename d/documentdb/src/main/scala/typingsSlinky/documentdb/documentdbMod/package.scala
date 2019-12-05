package typingsSlinky.documentdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object documentdbMod {
  import typingsSlinky.documentdb.documentdbStrings.Hash
  import typingsSlinky.documentdb.documentdbStrings.Javascript

  type DatabaseMeta = AbstractMeta
  type DocumentQuery = SqlQuerySpec | String
  type PartitionKind = Hash
  type Procedure = UserScriptable
  type RequestCallback[TResult] = js.Function3[/* error */ QueryError, /* resource */ TResult, /* responseHeaders */ js.Any, Unit]
  type UserDefinedFunctionMeta = AbstractMeta
  type UserDefinedFunctionType = Javascript
  type UserFunction = (js.Function1[/* repeated */ js.Any, Unit]) | String
}
