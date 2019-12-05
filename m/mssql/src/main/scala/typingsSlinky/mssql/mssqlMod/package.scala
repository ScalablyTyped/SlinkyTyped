package typingsSlinky.mssql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mssqlMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.mssql.Anon_CaseSensitive
  import typingsSlinky.mssql.Anon_Io
  import typingsSlinky.node.Buffer

  type IColumnMetadata = StringDictionary[Anon_CaseSensitive]
  type IIsolationLevel = Double
  type IRequestParameters = StringDictionary[Anon_Io]
  type IRow = js.Array[js.UndefOr[String | Double | Boolean | js.Date | Buffer]]
}
