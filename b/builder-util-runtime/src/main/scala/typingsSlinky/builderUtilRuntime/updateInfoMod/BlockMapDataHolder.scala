package typingsSlinky.builderUtilRuntime.updateInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockMapDataHolder extends js.Object {
  /**
    * The block map file size. Used when block map data is embedded into the file (appimage, windows web installer package).
    * This information can be obtained from the file itself, but it requires additional HTTP request,
    * so, to reduce request count, block map size is specified in the update metadata too.
    */
  var blockMapSize: js.UndefOr[Double] = js.native
  val isAdminRightsRequired: js.UndefOr[Boolean] = js.native
  /**
    * The file checksum.
    */
  val sha512: String = js.native
  /**
    * The file size. Used to verify downloaded size (save one HTTP request to get length).
    * Also used when block map data is embedded into the file (appimage, windows web installer package).
    */
  var size: js.UndefOr[Double] = js.native
}

object BlockMapDataHolder {
  @scala.inline
  def apply(sha512: String): BlockMapDataHolder = {
    val __obj = js.Dynamic.literal(sha512 = sha512.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockMapDataHolder]
  }
  @scala.inline
  implicit class BlockMapDataHolderOps[Self <: BlockMapDataHolder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSha512(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha512")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockMapSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockMapSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockMapSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockMapSize")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAdminRightsRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAdminRightsRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAdminRightsRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAdminRightsRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

