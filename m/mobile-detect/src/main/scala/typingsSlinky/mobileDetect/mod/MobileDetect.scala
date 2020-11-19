package typingsSlinky.mobileDetect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileDetect extends js.Object {
  
  def is(key: String): Boolean = js.native
  
  def isPhoneSized(): Boolean = js.native
  def isPhoneSized(maxPhoneWidth: Double): Boolean = js.native
  
  def `match`(pattern: String): Boolean = js.native
  def `match`(pattern: js.RegExp): Boolean = js.native
  
  def mobile(): String = js.native
  
  def mobileGrade(): String = js.native
  
  def os(): String = js.native
  
  def phone(): String = js.native
  
  def tablet(): String = js.native
  
  def userAgent(): String = js.native
  
  def userAgents(): js.Array[String] = js.native
  
  def version(value: String): Double = js.native
  
  def versionStr(value: String): String = js.native
}
