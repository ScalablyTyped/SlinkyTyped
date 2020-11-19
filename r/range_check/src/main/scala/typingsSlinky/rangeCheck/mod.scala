package typingsSlinky.rangeCheck

import typingsSlinky.rangeCheck.rangeCheckNumbers.`0`
import typingsSlinky.rangeCheck.rangeCheckNumbers.`4`
import typingsSlinky.rangeCheck.rangeCheckNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("range_check", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def displayIP(): String = js.native
  def displayIP(ip: String): String = js.native
  
  def inRange(ip: String, ranges: String): Boolean = js.native
  def inRange(ip: String, ranges: js.Array[String]): Boolean = js.native
  
  def in_range(ip: String, ranges: String): Boolean = js.native
  def in_range(ip: String, ranges: js.Array[String]): Boolean = js.native
  
  def isIP(ip: String): Boolean = js.native
  
  def isRange(range: String): Boolean = js.native
  
  def isV4(ip: String): Boolean = js.native
  
  def isV6(ip: String): Boolean = js.native
  
  def searchIP(ip: String): String | Null = js.native
  
  def storeIP(ip: String): String | Null = js.native
  
  def validIp(ip: String): Boolean = js.native
  
  def validRange(range: String): Boolean = js.native
  
  def valid_ip(ip: String): Boolean = js.native
  
  def valid_range(range: String): Boolean = js.native
  
  def ver(ip: String): `0` | `4` | `6` = js.native
}
