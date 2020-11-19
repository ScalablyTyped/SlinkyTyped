package typingsSlinky.coreJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("core-js/fn/date", JSImport.Namespace)
@js.native
object fnDateMod extends js.Object {
  
  def format(date: Date, template: java.lang.String): java.lang.String = js.native
  def format(date: Date, template: java.lang.String, locale: java.lang.String): java.lang.String = js.native
  
  def formatUTC(date: Date, template: java.lang.String): java.lang.String = js.native
  def formatUTC(date: Date, template: java.lang.String, locale: java.lang.String): java.lang.String = js.native
  
  def now(): Double = js.native
  
  def toISOString(date: Date): java.lang.String = js.native
}
