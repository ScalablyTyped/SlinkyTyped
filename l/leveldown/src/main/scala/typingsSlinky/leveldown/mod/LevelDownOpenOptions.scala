package typingsSlinky.leveldown.mod

import typingsSlinky.abstractLeveldown.mod.AbstractOpenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelDownOpenOptions extends AbstractOpenOptions {
  var blockRestartInterval: js.UndefOr[Double] = js.native
  var blockSize: js.UndefOr[Double] = js.native
  var cacheSize: js.UndefOr[Double] = js.native
  var compression: js.UndefOr[Boolean] = js.native
  var maxFileSize: js.UndefOr[Double] = js.native
  var maxOpenFiles: js.UndefOr[Double] = js.native
  var writeBufferSize: js.UndefOr[Double] = js.native
}

object LevelDownOpenOptions {
  @scala.inline
  def apply(): LevelDownOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LevelDownOpenOptions]
  }
  @scala.inline
  implicit class LevelDownOpenOptionsOps[Self <: LevelDownOpenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockRestartInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockRestartInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockRestartInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockRestartInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCompression(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compression")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxOpenFiles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOpenFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxOpenFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxOpenFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeBufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeBufferSize")(js.undefined)
        ret
    }
  }
  
}

