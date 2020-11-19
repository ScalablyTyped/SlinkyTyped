package typingsSlinky.meteor.global

import typingsSlinky.meteor.DDPRateLimiter.Matcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("DDPRateLimiter")
@js.native
object DDPRateLimiter extends js.Object {
  
  def addRule(matcher: Matcher, numRequests: Double, timeInterval: Double): String = js.native
  
  def removeRule(ruleId: String): Boolean = js.native
}
