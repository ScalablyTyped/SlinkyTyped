package typingsSlinky.csvDashStringify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object csvDashStringifyMod {
  import typingsSlinky.node.Buffer
  import typingsSlinky.std.Record

  type Callback = js.Function2[/* err */ js.UndefOr[Null | js.Error], /* output */ js.UndefOr[String], Unit]
  type Cast[T] = js.Function2[/* value */ T, /* context */ CastingContext, String]
  type Input = js.Array[js.Any]
  type PlainObject[T] = Record[String, T]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
    - typings.csvDashStringify.csvDashStringifyStrings.auto
    - typings.csvDashStringify.csvDashStringifyStrings.unix
    - typings.csvDashStringify.csvDashStringifyStrings.mac
    - typings.csvDashStringify.csvDashStringifyStrings.windows
    - typings.csvDashStringify.csvDashStringifyStrings.ascii
    - typings.csvDashStringify.csvDashStringifyStrings.unicode
  */
  type RecordDelimiter = _RecordDelimiter | String | Buffer
}
