package typingsSlinky.breeze.breeze

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeStrategy extends IEnum {
  var Disallowed: MergeStrategySymbol = js.native
  var OverwriteChanges: MergeStrategySymbol = js.native
  var PreserveChanges: MergeStrategySymbol = js.native
  var SkipMerge: MergeStrategySymbol = js.native
}

@JSGlobal("breeze.MergeStrategy")
@js.native
object MergeStrategy extends TopLevel[MergeStrategy]

