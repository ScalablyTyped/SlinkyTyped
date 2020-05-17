package typingsSlinky.cordovaSqliteStorage.SQLitePlugin

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenArgs
  extends /* key */ StringDictionary[js.Any] {
  var androidDatabaseImplementation: js.UndefOr[Double] = js.native
  var androidLockWorkaround: js.UndefOr[Double] = js.native
  var createFromLocation: js.UndefOr[Double] = js.native
  var iosDatabaseLocation: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  var name: String = js.native
}

object OpenArgs {
  @scala.inline
  def apply(name: String): OpenArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenArgs]
  }
  @scala.inline
  implicit class OpenArgsOps[Self <: OpenArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroidDatabaseImplementation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDatabaseImplementation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidDatabaseImplementation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDatabaseImplementation")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidLockWorkaround(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidLockWorkaround")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidLockWorkaround: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidLockWorkaround")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateFromLocation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFromLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateFromLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFromLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withIosDatabaseLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosDatabaseLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosDatabaseLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosDatabaseLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
  }
  
}

