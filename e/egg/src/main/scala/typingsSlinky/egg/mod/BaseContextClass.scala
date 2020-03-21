package typingsSlinky.egg.mod

import typingsSlinky.eggLogger.mod.EggLogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("egg", "BaseContextClass")
@js.native
class BaseContextClass ()
  extends typingsSlinky.eggCore.mod.BaseContextClass[Context, Application, EggAppConfig, IService] {
  // tslint:disable-line
  /**
    * logger
    */
  var logger: EggLogger = js.native
}

