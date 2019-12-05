package typingsSlinky.betterDashSqlite3.betterDashSqlite3Mod

import typingsSlinky.integer.integerMod.IntLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunResult extends js.Object {
  var changes: Double
  var lastInsertRowid: IntLike
}

object RunResult {
  @scala.inline
  def apply(changes: Double, lastInsertRowid: IntLike): RunResult = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], lastInsertRowid = lastInsertRowid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RunResult]
  }
}

