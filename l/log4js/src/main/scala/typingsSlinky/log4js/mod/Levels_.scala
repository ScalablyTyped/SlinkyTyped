package typingsSlinky.log4js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Levels_ extends js.Object {
  var ALL: Level = js.native
  var DEBUG: Level = js.native
  var ERROR: Level = js.native
  var FATAL: Level = js.native
  var INFO: Level = js.native
  var MARK: Level = js.native
  var OFF: Level = js.native
  var TRACE: Level = js.native
  var WARN: Level = js.native
  var levels: js.Array[Level] = js.native
  def addLevels(customLevels: js.Object): Unit = js.native
  def getLevel(level: String): Level = js.native
}

object Levels_ {
  @scala.inline
  def apply(
    ALL: Level,
    DEBUG: Level,
    ERROR: Level,
    FATAL: Level,
    INFO: Level,
    MARK: Level,
    OFF: Level,
    TRACE: Level,
    WARN: Level,
    addLevels: js.Object => Unit,
    getLevel: String => Level,
    levels: js.Array[Level]
  ): Levels_ = {
    val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FATAL = FATAL.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], MARK = MARK.asInstanceOf[js.Any], OFF = OFF.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any], addLevels = js.Any.fromFunction1(addLevels), getLevel = js.Any.fromFunction1(getLevel), levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Levels_]
  }
  @scala.inline
  implicit class Levels_Ops[Self <: Levels_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withALL(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDEBUG(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withERROR(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFATAL(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FATAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINFO(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INFO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMARK(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MARK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOFF(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OFF")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRACE(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRACE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWARN(value: Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddLevels(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLevels")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLevel(value: String => Level): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLevel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLevels(value: js.Array[Level]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

