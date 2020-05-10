package typingsSlinky.googleapis.polyV1Mod.polyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Info about the sources of this asset (i.e. assets that were remixed to
  * create this asset).
  */
@js.native
trait SchemaRemixInfo extends js.Object {
  /**
    * Resource ids for the sources of this remix, of the form:
    * `assets/{ASSET_ID}`
    */
  var sourceAsset: js.UndefOr[js.Array[String]] = js.native
}

object SchemaRemixInfo {
  @scala.inline
  def apply(): SchemaRemixInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemixInfo]
  }
  @scala.inline
  implicit class SchemaRemixInfoOps[Self <: SchemaRemixInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceAsset(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAsset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAsset")(js.undefined)
        ret
    }
  }
  
}

