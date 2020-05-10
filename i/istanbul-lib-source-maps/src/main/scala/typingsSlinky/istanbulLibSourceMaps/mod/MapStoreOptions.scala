package typingsSlinky.istanbulLibSourceMaps.mod

import typingsSlinky.istanbulLibSourceMaps.istanbulLibSourceMapsStrings.file
import typingsSlinky.istanbulLibSourceMaps.istanbulLibSourceMapsStrings.memory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapStoreOptions extends js.Object {
  var baseDir: String = js.native
  var sourceStore: memory | file = js.native
  var tmpdir: String = js.native
  var verbose: Boolean = js.native
}

object MapStoreOptions {
  @scala.inline
  def apply(baseDir: String, sourceStore: memory | file, tmpdir: String, verbose: Boolean): MapStoreOptions = {
    val __obj = js.Dynamic.literal(baseDir = baseDir.asInstanceOf[js.Any], sourceStore = sourceStore.asInstanceOf[js.Any], tmpdir = tmpdir.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStoreOptions]
  }
  @scala.inline
  implicit class MapStoreOptionsOps[Self <: MapStoreOptions] (val x: Self) extends AnyVal {
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
    def withSourceStore(value: memory | file): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceStore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTmpdir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmpdir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

