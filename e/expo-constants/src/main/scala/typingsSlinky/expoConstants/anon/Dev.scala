package typingsSlinky.expoConstants.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dev
  extends /* key */ StringDictionary[js.Any] {
  var dev: js.UndefOr[Boolean] = js.native
  var hostType: js.UndefOr[String] = js.native
  var lanType: js.UndefOr[String] = js.native
  var minify: js.UndefOr[Boolean] = js.native
  var strict: js.UndefOr[Boolean] = js.native
  var urlRandomness: js.UndefOr[String] = js.native
  var urlType: js.UndefOr[String] = js.native
}

object Dev {
  @scala.inline
  def apply(): Dev = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dev]
  }
  @scala.inline
  implicit class DevOps[Self <: Dev] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDev(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dev")(js.undefined)
        ret
    }
    @scala.inline
    def withHostType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostType")(js.undefined)
        ret
    }
    @scala.inline
    def withLanType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lanType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lanType")(js.undefined)
        ret
    }
    @scala.inline
    def withMinify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minify")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlRandomness(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlRandomness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlRandomness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlRandomness")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlType")(js.undefined)
        ret
    }
  }
  
}

