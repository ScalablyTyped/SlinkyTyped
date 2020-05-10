package typingsSlinky.jsonquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type PathQuery = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Query[T] = typingsSlinky.jsonquery.mod.BinaryQueryCondition[T] | typingsSlinky.jsonquery.mod.QueryValue[T] | typingsSlinky.jsonquery.mod.PathQuery
  type QueryValue[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] | jsonquery.jsonquery.BaseCondition<T[P]>}
    */ typingsSlinky.jsonquery.jsonqueryStrings.QueryValue with org.scalablytyped.runtime.TopLevel[js.Any]
}
