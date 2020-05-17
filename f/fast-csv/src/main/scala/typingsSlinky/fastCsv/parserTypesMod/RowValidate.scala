package typingsSlinky.fastCsv.parserTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fastCsv.parserTypesMod.AsyncRowValidate
  - typingsSlinky.fastCsv.parserTypesMod.SyncRowValidate
*/
trait RowValidate extends js.Object

object RowValidate {
  @scala.inline
  implicit def apply(value: AsyncRowValidate): RowValidate = value.asInstanceOf[RowValidate]
  @scala.inline
  implicit def apply(value: SyncRowValidate): RowValidate = value.asInstanceOf[RowValidate]
}

