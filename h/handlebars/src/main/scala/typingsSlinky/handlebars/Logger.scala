package typingsSlinky.handlebars

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  var DEBUG: Double = js.native
  var ERROR: Double = js.native
  var INFO: Double = js.native
  var WARN: Double = js.native
  var level: Double = js.native
  var methodMap: NumberDictionary[String] = js.native
  def log(level: Double, obj: String): Unit = js.native
}

object Logger {
  @scala.inline
  def apply(
    DEBUG: Double,
    ERROR: Double,
    INFO: Double,
    WARN: Double,
    level: Double,
    log: (Double, String) => Unit,
    methodMap: NumberDictionary[String]
  ): Logger = {
    val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], log = js.Any.fromFunction2(log), methodMap = methodMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Logger]
  }
  @scala.inline
  implicit class LoggerOps[Self <: Logger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDEBUG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withERROR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINFO(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INFO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWARN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLog(value: (Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withMethodMap(value: NumberDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

