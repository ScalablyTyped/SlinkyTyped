package typingsSlinky.bsLogger

import typingsSlinky.bsLogger.loggerMod.CreateLoggerOptions
import typingsSlinky.bsLogger.loggerMod.Logger
import typingsSlinky.bsLogger.targetMockMod.ExtendedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bs-logger/dist/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  
  def createLoggerMock(): LoggerMock = js.native
  def createLoggerMock(options: js.UndefOr[scala.Nothing], target: typingsSlinky.bsLogger.targetMockMod.LogTargetMock): LoggerMock = js.native
  def createLoggerMock(options: CreateLoggerOptions): LoggerMock = js.native
  def createLoggerMock(options: CreateLoggerOptions, target: typingsSlinky.bsLogger.targetMockMod.LogTargetMock): LoggerMock = js.native
  
  def extendArray[T](array: js.Array[T]): ExtendedArray[T] = js.native
  
  def setup(): Unit = js.native
  def setup(target: typingsSlinky.bsLogger.targetMockMod.LogTargetMock): Unit = js.native
  
  @js.native
  class LogTargetMock ()
    extends typingsSlinky.bsLogger.targetMockMod.LogTargetMock {
    def this(minLevel: Double) = this()
  }
  
  @js.native
  trait LoggerMock extends Logger {
    
    val target: typingsSlinky.bsLogger.targetMockMod.LogTargetMock = js.native
  }
}
