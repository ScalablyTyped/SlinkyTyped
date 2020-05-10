package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A product to be made visible to a user.
  */
@js.native
trait SchemaProductVisibility extends js.Object {
  /**
    * The product ID to make visible to the user. Required for each item in the
    * productVisibility list.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * Grants the user visibility to the specified product track(s), identified
    * by trackIds.
    */
  var trackIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Deprecated. Use trackIds instead.
    */
  var tracks: js.UndefOr[js.Array[String]] = js.native
}

object SchemaProductVisibility {
  @scala.inline
  def apply(): SchemaProductVisibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductVisibility]
  }
  @scala.inline
  implicit class SchemaProductVisibilityOps[Self <: SchemaProductVisibility] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTracks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracks")(js.undefined)
        ret
    }
  }
  
}

