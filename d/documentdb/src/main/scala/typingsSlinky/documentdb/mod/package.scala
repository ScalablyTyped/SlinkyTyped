package typingsSlinky.documentdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DatabaseMeta = typingsSlinky.documentdb.mod.AbstractMeta
  type DocumentQuery = typingsSlinky.documentdb.mod.SqlQuerySpec | java.lang.String
  type PartitionKind = typingsSlinky.documentdb.documentdbStrings.Hash
  type Procedure = typingsSlinky.documentdb.mod.UserScriptable
  type RequestCallback[TResult] = js.Function3[
    /* error */ typingsSlinky.documentdb.mod.QueryError, 
    /* resource */ TResult, 
    /* responseHeaders */ js.Any, 
    scala.Unit
  ]
  type UserDefinedFunctionMeta = typingsSlinky.documentdb.mod.AbstractMeta
  type UserDefinedFunctionType = typingsSlinky.documentdb.documentdbStrings.Javascript
  type UserFunction = (js.Function1[/* repeated */ js.Any, scala.Unit]) | java.lang.String
}
