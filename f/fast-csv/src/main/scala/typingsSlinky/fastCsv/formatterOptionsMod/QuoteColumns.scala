package typingsSlinky.fastCsv.formatterOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - js.Array[scala.Boolean]
  - typingsSlinky.fastCsv.formatterOptionsMod.QuoteColumnMap
*/
trait QuoteColumns extends js.Object

object QuoteColumns {
  @scala.inline
  implicit def apply(value: js.Array[Boolean]): QuoteColumns = value.asInstanceOf[QuoteColumns]
  @scala.inline
  implicit def apply(value: Boolean): QuoteColumns = value.asInstanceOf[QuoteColumns]
  @scala.inline
  implicit def apply(value: QuoteColumnMap): QuoteColumns = value.asInstanceOf[QuoteColumns]
}

