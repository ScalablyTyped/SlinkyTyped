package typingsSlinky.logkitty

import typingsSlinky.logkitty.iosConstantsMod.PriorityNames
import typingsSlinky.logkitty.typesMod.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object logkittyStrings {
  @js.native
  sealed trait DEBUG
    extends PriorityNames
       with typingsSlinky.logkitty.constantsMod.PriorityNames
  
  @js.native
  sealed trait DEFAULT extends PriorityNames
  
  @js.native
  sealed trait ERROR
    extends PriorityNames
       with typingsSlinky.logkitty.constantsMod.PriorityNames
  
  @js.native
  sealed trait FATAL
    extends typingsSlinky.logkitty.constantsMod.PriorityNames
  
  @js.native
  sealed trait INFO
    extends PriorityNames
       with typingsSlinky.logkitty.constantsMod.PriorityNames
  
  @js.native
  sealed trait SILENT
    extends typingsSlinky.logkitty.constantsMod.PriorityNames
  
  @js.native
  sealed trait UNKNOWN
    extends typingsSlinky.logkitty.constantsMod.PriorityNames
  
  @js.native
  sealed trait VERBOSE
    extends typingsSlinky.logkitty.constantsMod.PriorityNames
  
  @js.native
  sealed trait WARN
    extends typingsSlinky.logkitty.constantsMod.PriorityNames
  
  @js.native
  sealed trait android extends Platform
  
  @js.native
  sealed trait ios extends Platform
  
  @scala.inline
  def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  @scala.inline
  def DEFAULT: DEFAULT = "DEFAULT".asInstanceOf[DEFAULT]
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  @scala.inline
  def FATAL: FATAL = "FATAL".asInstanceOf[FATAL]
  @scala.inline
  def INFO: INFO = "INFO".asInstanceOf[INFO]
  @scala.inline
  def SILENT: SILENT = "SILENT".asInstanceOf[SILENT]
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  @scala.inline
  def VERBOSE: VERBOSE = "VERBOSE".asInstanceOf[VERBOSE]
  @scala.inline
  def WARN: WARN = "WARN".asInstanceOf[WARN]
  @scala.inline
  def android: android = "android".asInstanceOf[android]
  @scala.inline
  def ios: ios = "ios".asInstanceOf[ios]
}

