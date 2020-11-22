package typingsSlinky.bsLogger.targetMockMod

import typingsSlinky.bsLogger.messageMod.LogMessage
import typingsSlinky.bsLogger.targetMod.LogTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bs-logger/dist/testing/target-mock", "LogTargetMock")
@js.native
class LogTargetMock () extends LogTarget {
  def this(minLevel: Double) = this()
  
  def clear(): Unit = js.native
  
  def filteredLines(level: Double): ExtendedArray[String] = js.native
  def filteredLines(level: Double, untilLevel: Double): ExtendedArray[String] = js.native
  def filteredLines(level: Null): ExtendedArray[String] = js.native
  
  def filteredMessages(level: Double): ExtendedArray[LogMessage] = js.native
  def filteredMessages(level: Double, untilLevel: Double): ExtendedArray[LogMessage] = js.native
  def filteredMessages(level: Null): ExtendedArray[LogMessage] = js.native
  
  val lines: ExtendedArray[String] with LogLevelMap[ExtendedArray[String]] = js.native
  
  val messages: ExtendedArray[LogMessage] with LogLevelMap[ExtendedArray[LogMessage]] = js.native
}
