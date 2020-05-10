package typingsSlinky.log4js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAppenders extends js.Object {
  var appenders: js.Array[String] = js.native
  var enableCallStack: js.UndefOr[Boolean] = js.native
  var level: String = js.native
}

object AnonAppenders {
  @scala.inline
  def apply(appenders: js.Array[String], level: String): AnonAppenders = {
    val __obj = js.Dynamic.literal(appenders = appenders.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppenders]
  }
  @scala.inline
  implicit class AnonAppendersOps[Self <: AnonAppenders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppenders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appenders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableCallStack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCallStack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCallStack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCallStack")(js.undefined)
        ret
    }
  }
  
}

