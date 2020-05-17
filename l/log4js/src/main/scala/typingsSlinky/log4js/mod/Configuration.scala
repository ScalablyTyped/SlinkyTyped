package typingsSlinky.log4js.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.log4js.anon.Appenders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  var appenders: StringDictionary[Appender] = js.native
  var categories: StringDictionary[Appenders] = js.native
  var disableClustering: js.UndefOr[Boolean] = js.native
  var levels: js.UndefOr[Levels_] = js.native
  var pm2: js.UndefOr[Boolean] = js.native
  var pm2InstanceVar: js.UndefOr[String] = js.native
}

object Configuration {
  @scala.inline
  def apply(appenders: StringDictionary[Appender], categories: StringDictionary[Appenders]): Configuration = {
    val __obj = js.Dynamic.literal(appenders = appenders.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppenders(value: StringDictionary[Appender]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appenders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategories(value: StringDictionary[Appenders]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableClustering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableClustering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableClustering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableClustering")(js.undefined)
        ret
    }
    @scala.inline
    def withLevels(value: Levels_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(js.undefined)
        ret
    }
    @scala.inline
    def withPm2(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pm2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPm2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pm2")(js.undefined)
        ret
    }
    @scala.inline
    def withPm2InstanceVar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pm2InstanceVar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPm2InstanceVar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pm2InstanceVar")(js.undefined)
        ret
    }
  }
  
}

