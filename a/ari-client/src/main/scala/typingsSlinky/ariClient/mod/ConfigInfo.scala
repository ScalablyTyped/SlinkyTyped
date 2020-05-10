package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigInfo extends js.Object {
  var default_language: String = js.native
  var max_channels: js.UndefOr[Double] = js.native
  var max_load: js.UndefOr[Double] = js.native
  var max_open_files: js.UndefOr[Double] = js.native
  /* Properties */
  var name: String = js.native
  var setid: SetId = js.native
}

object ConfigInfo {
  @scala.inline
  def apply(default_language: String, name: String, setid: SetId): ConfigInfo = {
    val __obj = js.Dynamic.literal(default_language = default_language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setid = setid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigInfo]
  }
  @scala.inline
  implicit class ConfigInfoOps[Self <: ConfigInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault_language(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default_language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetid(value: SetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax_channels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_channels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_channels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_channels")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_load(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_load")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_load: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_load")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_open_files(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_open_files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_open_files: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_open_files")(js.undefined)
        ret
    }
  }
  
}

