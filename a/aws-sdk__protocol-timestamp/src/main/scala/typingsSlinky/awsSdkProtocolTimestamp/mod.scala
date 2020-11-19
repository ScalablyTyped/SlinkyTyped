package typingsSlinky.awsSdkProtocolTimestamp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/protocol-timestamp", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def epoch(time: String): Double = js.native
  def epoch(time: Double): Double = js.native
  def epoch(time: js.Date): Double = js.native
  
  def iso8601(time: String): String = js.native
  def iso8601(time: Double): String = js.native
  def iso8601(time: js.Date): String = js.native
  
  def rfc822(time: String): String = js.native
  def rfc822(time: Double): String = js.native
  def rfc822(time: js.Date): String = js.native
  
  def toDate(time: String): js.Date = js.native
  def toDate(time: Double): js.Date = js.native
  def toDate(time: js.Date): js.Date = js.native
}
