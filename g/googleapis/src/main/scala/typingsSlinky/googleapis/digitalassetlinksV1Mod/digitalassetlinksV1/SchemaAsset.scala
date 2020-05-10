package typingsSlinky.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Uniquely identifies an asset.  A digital asset is an identifiable and
  * addressable online entity that typically provides some service or content.
  * Examples of assets are websites, Android apps, Twitter feeds, and Plus
  * Pages.
  */
@js.native
trait SchemaAsset extends js.Object {
  /**
    * Set if this is an Android App asset.
    */
  var androidApp: js.UndefOr[SchemaAndroidAppAsset] = js.native
  /**
    * Set if this is a web asset.
    */
  var web: js.UndefOr[SchemaWebAsset] = js.native
}

object SchemaAsset {
  @scala.inline
  def apply(): SchemaAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsset]
  }
  @scala.inline
  implicit class SchemaAssetOps[Self <: SchemaAsset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidApp(value: SchemaAndroidAppAsset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidApp")(js.undefined)
        ret
    }
    @scala.inline
    def withWeb(value: SchemaWebAsset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web")(js.undefined)
        ret
    }
  }
  
}

