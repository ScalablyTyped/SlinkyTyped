package typingsSlinky.logkitty

import typingsSlinky.logkitty.iosConstantsMod.PriorityNames
import typingsSlinky.logkitty.typesMod.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logkittyStrings {
  
  @js.native
  sealed trait DEBUG
    extends PriorityNames
       with typingsSlinky.logkitty.constantsMod.PriorityNames
  @scala.inline
  def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  
  @js.native
  sealed trait DEFAULT extends PriorityNames
  @scala.inline
  def DEFAULT: DEFAULT = "DEFAULT".asInstanceOf[DEFAULT]
  
  @js.native
  sealed trait ERROR
    extends PriorityNames
       with typingsSlinky.logkitty.constantsMod.PriorityNames
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait FATAL
    extends typingsSlinky.logkitty.constantsMod.PriorityNames
  @scala.inline
  def FATAL: FATAL = "FATAL".asInstanceOf[FATAL]
  
  @js.native
  sealed trait INFO
    extends PriorityNames
       with typingsSlinky.logkitty.constantsMod.PriorityNames
  @scala.inline
  def INFO: INFO = "INFO".asInstanceOf[INFO]
  
  @js.native
  sealed trait SILENT
    extends typingsSlinky.logkitty.constantsMod.PriorityNames
  @scala.inline
  def SILENT: SILENT = "SILENT".asInstanceOf[SILENT]
  
  @js.native
  sealed trait UNKNOWN
    extends typingsSlinky.logkitty.constantsMod.PriorityNames
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait VERBOSE
    extends typingsSlinky.logkitty.constantsMod.PriorityNames
  @scala.inline
  def VERBOSE: VERBOSE = "VERBOSE".asInstanceOf[VERBOSE]
  
  @js.native
  sealed trait WARN
    extends typingsSlinky.logkitty.constantsMod.PriorityNames
  @scala.inline
  def WARN: WARN = "WARN".asInstanceOf[WARN]
  
  @js.native
  sealed trait android extends Platform
  @scala.inline
  def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait ios extends Platform
  @scala.inline
  def ios: ios = "ios".asInstanceOf[ios]
}
