package typingsSlinky.fastCsv.parserTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fastCsv.parserTypesMod.SyncRowTransform
  - typingsSlinky.fastCsv.parserTypesMod.AsyncRowTransform
*/
trait RowTransformFunction extends js.Object

object RowTransformFunction {
  @scala.inline
  implicit def apply(value: AsyncRowTransform): RowTransformFunction = value.asInstanceOf[RowTransformFunction]
  @scala.inline
  implicit def apply(value: SyncRowTransform): RowTransformFunction = value.asInstanceOf[RowTransformFunction]
}

