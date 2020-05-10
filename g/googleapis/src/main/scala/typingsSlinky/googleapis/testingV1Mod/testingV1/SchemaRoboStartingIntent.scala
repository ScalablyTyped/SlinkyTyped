package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message for specifying the start activities to crawl.
  */
@js.native
trait SchemaRoboStartingIntent extends js.Object {
  var launcherActivity: js.UndefOr[SchemaLauncherActivityIntent] = js.native
  var startActivity: js.UndefOr[SchemaStartActivityIntent] = js.native
  /**
    * Timeout in seconds for each intent.
    */
  var timeout: js.UndefOr[String] = js.native
}

object SchemaRoboStartingIntent {
  @scala.inline
  def apply(): SchemaRoboStartingIntent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoboStartingIntent]
  }
  @scala.inline
  implicit class SchemaRoboStartingIntentOps[Self <: SchemaRoboStartingIntent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLauncherActivity(value: SchemaLauncherActivityIntent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launcherActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLauncherActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launcherActivity")(js.undefined)
        ret
    }
    @scala.inline
    def withStartActivity(value: SchemaStartActivityIntent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startActivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartActivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startActivity")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

