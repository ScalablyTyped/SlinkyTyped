package typingsSlinky.protractor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.seleniumWebdriver.loggingMod.IType
import typingsSlinky.seleniumWebdriver.loggingMod.Level
import typingsSlinky.seleniumWebdriver.loggingMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoflogging extends js.Object {
  var Entry: Instantiable2[
    /* level */ Level, 
    /* message */ String, 
    typingsSlinky.seleniumWebdriver.mod.logging.Entry
  ] = js.native
  var Level: TypeofLevel = js.native
  var LogManager: Instantiable0[typingsSlinky.seleniumWebdriver.mod.logging.LogManager] = js.native
  var Logger: Instantiable1[/* name */ String, typingsSlinky.seleniumWebdriver.mod.logging.Logger] = js.native
  var Preferences: Instantiable0[typingsSlinky.seleniumWebdriver.mod.logging.Preferences] = js.native
  val Type: IType = js.native
  def addConsoleHandler(): Unit = js.native
  def addConsoleHandler(opt_logger: Logger): Unit = js.native
  def getLevel(nameOrValue: String): Level = js.native
  def getLevel(nameOrValue: Double): Level = js.native
  def getLogger(): Logger = js.native
  def getLogger(name: String): Logger = js.native
  def installConsoleHandler(): Unit = js.native
  def removeConsoleHandler(): Unit = js.native
  def removeConsoleHandler(opt_logger: Logger): Unit = js.native
}

