package typingsSlinky.chromeApps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alwaysupdate extends js.Object {
  /**
    * If the key is specified and its value is true, it allows the app to
    * be always updated regardless of whether the underlying platform is
    * compliant or not. If the value is false or the key is not specified,
    * the required platform version is respected and the app update is
    * deferred until the underlying platform becomes compliant.
    */
  var always_update: js.UndefOr[Boolean] = js.native
  var required_platform_version: js.UndefOr[String] = js.native
}

object Alwaysupdate {
  @scala.inline
  def apply(): Alwaysupdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alwaysupdate]
  }
  @scala.inline
  implicit class AlwaysupdateOps[Self <: Alwaysupdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlways_update(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always_update")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlways_update: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("always_update")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired_platform_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_platform_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired_platform_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_platform_version")(js.undefined)
        ret
    }
  }
  
}

