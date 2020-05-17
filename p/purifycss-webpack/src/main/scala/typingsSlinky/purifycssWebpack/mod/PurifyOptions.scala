package typingsSlinky.purifycssWebpack.mod

import typingsSlinky.purifycssWebpack.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurifyOptions extends js.Object {
  var minimize: js.UndefOr[Boolean] = js.native
  var moduleExtensions: js.UndefOr[js.Array[String]] = js.native
  var paths: js.UndefOr[js.Object | js.Array[String]] = js.native
  var purifyOptions: js.UndefOr[Info] = js.native
  var styleExtensions: js.UndefOr[js.Array[String]] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object PurifyOptions {
  @scala.inline
  def apply(): PurifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurifyOptions]
  }
  @scala.inline
  implicit class PurifyOptionsOps[Self <: PurifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinimize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimize")(js.undefined)
        ret
    }
    @scala.inline
    def withModuleExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModuleExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: js.Object | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
    @scala.inline
    def withPurifyOptions(value: Info): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purifyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurifyOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purifyOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

