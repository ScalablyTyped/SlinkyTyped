package typingsSlinky.logkitty.apiMod

import typingsSlinky.logkitty.logkittyStrings.DEBUG
import typingsSlinky.logkitty.logkittyStrings.ERROR
import typingsSlinky.logkitty.logkittyStrings.FATAL
import typingsSlinky.logkitty.logkittyStrings.INFO
import typingsSlinky.logkitty.logkittyStrings.SILENT
import typingsSlinky.logkitty.logkittyStrings.UNKNOWN
import typingsSlinky.logkitty.logkittyStrings.VERBOSE
import typingsSlinky.logkitty.logkittyStrings.WARN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("logkitty/build/api", "AndroidPriority")
@js.native
object AndroidPriority extends js.Object {
  
  var DEBUG: Double = js.native
  
  var ERROR: Double = js.native
  
  var FATAL: Double = js.native
  
  var INFO: Double = js.native
  
  var SILENT: Double = js.native
  
  var UNKNOWN: Double = js.native
  
  var VERBOSE: Double = js.native
  
  var WARN: Double = js.native
  
  def fromLetter(letter: String): Double = js.native
  
  @JSName("fromName")
  def fromName_DEBUG(name: DEBUG): Double = js.native
  @JSName("fromName")
  def fromName_ERROR(name: ERROR): Double = js.native
  @JSName("fromName")
  def fromName_FATAL(name: FATAL): Double = js.native
  @JSName("fromName")
  def fromName_INFO(name: INFO): Double = js.native
  @JSName("fromName")
  def fromName_SILENT(name: SILENT): Double = js.native
  @JSName("fromName")
  def fromName_UNKNOWN(name: UNKNOWN): Double = js.native
  @JSName("fromName")
  def fromName_VERBOSE(name: VERBOSE): Double = js.native
  @JSName("fromName")
  def fromName_WARN(name: WARN): Double = js.native
  
  def toLetter(code: Double): String = js.native
  
  def toName(code: Double): UNKNOWN | VERBOSE | DEBUG | INFO | WARN | ERROR | FATAL | SILENT = js.native
}
