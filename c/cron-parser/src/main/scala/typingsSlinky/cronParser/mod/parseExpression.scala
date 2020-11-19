package typingsSlinky.cronParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cron-parser", "parseExpression")
@js.native
object parseExpression extends js.Object {
  
  /** Wrapper for CronExpression.parse method */
  def apply(expression: String): CronExpression = js.native
  def apply(expression: String, options: ParserOptions): CronExpression = js.native
}
