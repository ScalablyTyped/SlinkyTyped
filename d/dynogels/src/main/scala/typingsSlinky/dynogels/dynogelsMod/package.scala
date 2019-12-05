package typingsSlinky.dynogels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dynogelsMod {
  import org.scalablytyped.runtime.StringDictionary

  type Document = StringDictionary[js.Any]
  type DynogelsItemCallback = js.Function2[/* err */ js.Error, /* data */ Item, Unit]
  type QueryFilterChain = ExtendedChain[Query]
  type QueryWhereChain = BaseChain[Query]
  type tableResolve = js.Function0[String]
}
