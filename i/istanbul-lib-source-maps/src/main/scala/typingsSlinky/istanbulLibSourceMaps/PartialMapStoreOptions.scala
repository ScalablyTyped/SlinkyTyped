package typingsSlinky.istanbulLibSourceMaps

import typingsSlinky.istanbulLibSourceMaps.istanbulLibSourceMapsStrings.file
import typingsSlinky.istanbulLibSourceMaps.istanbulLibSourceMapsStrings.memory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<istanbul-lib-source-maps.istanbul-lib-source-maps.MapStoreOptions> */
@js.native
trait PartialMapStoreOptions extends js.Object {
  var baseDir: js.UndefOr[String] = js.native
  var sourceStore: js.UndefOr[memory | file] = js.native
  var tmpdir: js.UndefOr[String] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object PartialMapStoreOptions {
  @scala.inline
  def apply(): PartialMapStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMapStoreOptions]
  }
  @scala.inline
  implicit class PartialMapStoreOptionsOps[Self <: PartialMapStoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDir")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceStore(value: memory | file): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceStore")(js.undefined)
        ret
    }
    @scala.inline
    def withTmpdir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmpdir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTmpdir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmpdir")(js.undefined)
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

