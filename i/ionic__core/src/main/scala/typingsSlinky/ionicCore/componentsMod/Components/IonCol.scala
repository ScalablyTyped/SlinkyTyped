package typingsSlinky.ionicCore.componentsMod.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonCol extends js.Object {
  /**
    * The amount to offset the column, in terms of how many columns it should shift to the end of the total available.
    */
  var offset: js.UndefOr[String] = js.native
  /**
    * The amount to offset the column for lg screens, in terms of how many columns it should shift to the end of the total available.
    */
  var offsetLg: js.UndefOr[String] = js.native
  /**
    * The amount to offset the column for md screens, in terms of how many columns it should shift to the end of the total available.
    */
  var offsetMd: js.UndefOr[String] = js.native
  /**
    * The amount to offset the column for sm screens, in terms of how many columns it should shift to the end of the total available.
    */
  var offsetSm: js.UndefOr[String] = js.native
  /**
    * The amount to offset the column for xl screens, in terms of how many columns it should shift to the end of the total available.
    */
  var offsetXl: js.UndefOr[String] = js.native
  /**
    * The amount to offset the column for xs screens, in terms of how many columns it should shift to the end of the total available.
    */
  var offsetXs: js.UndefOr[String] = js.native
  /**
    * The amount to pull the column, in terms of how many columns it should shift to the start of the total available.
    */
  var pull: js.UndefOr[String] = js.native
  /**
    * The amount to pull the column for lg screens, in terms of how many columns it should shift to the start of the total available.
    */
  var pullLg: js.UndefOr[String] = js.native
  /**
    * The amount to pull the column for md screens, in terms of how many columns it should shift to the start of the total available.
    */
  var pullMd: js.UndefOr[String] = js.native
  /**
    * The amount to pull the column for sm screens, in terms of how many columns it should shift to the start of the total available.
    */
  var pullSm: js.UndefOr[String] = js.native
  /**
    * The amount to pull the column for xl screens, in terms of how many columns it should shift to the start of the total available.
    */
  var pullXl: js.UndefOr[String] = js.native
  /**
    * The amount to pull the column for xs screens, in terms of how many columns it should shift to the start of the total available.
    */
  var pullXs: js.UndefOr[String] = js.native
  /**
    * The amount to push the column, in terms of how many columns it should shift to the end of the total available.
    */
  var push: js.UndefOr[String] = js.native
  /**
    * The amount to push the column for lg screens, in terms of how many columns it should shift to the end of the total available.
    */
  var pushLg: js.UndefOr[String] = js.native
  /**
    * The amount to push the column for md screens, in terms of how many columns it should shift to the end of the total available.
    */
  var pushMd: js.UndefOr[String] = js.native
  /**
    * The amount to push the column for sm screens, in terms of how many columns it should shift to the end of the total available.
    */
  var pushSm: js.UndefOr[String] = js.native
  /**
    * The amount to push the column for xl screens, in terms of how many columns it should shift to the end of the total available.
    */
  var pushXl: js.UndefOr[String] = js.native
  /**
    * The amount to push the column for xs screens, in terms of how many columns it should shift to the end of the total available.
    */
  var pushXs: js.UndefOr[String] = js.native
  /**
    * The size of the column, in terms of how many columns it should take up out of the total available. If `"auto"` is passed, the column will be the size of its content.
    */
  var size: js.UndefOr[String] = js.native
  /**
    * The size of the column for lg screens, in terms of how many columns it should take up out of the total available. If `"auto"` is passed, the column will be the size of its content.
    */
  var sizeLg: js.UndefOr[String] = js.native
  /**
    * The size of the column for md screens, in terms of how many columns it should take up out of the total available. If `"auto"` is passed, the column will be the size of its content.
    */
  var sizeMd: js.UndefOr[String] = js.native
  /**
    * The size of the column for sm screens, in terms of how many columns it should take up out of the total available. If `"auto"` is passed, the column will be the size of its content.
    */
  var sizeSm: js.UndefOr[String] = js.native
  /**
    * The size of the column for xl screens, in terms of how many columns it should take up out of the total available. If `"auto"` is passed, the column will be the size of its content.
    */
  var sizeXl: js.UndefOr[String] = js.native
  /**
    * The size of the column for xs screens, in terms of how many columns it should take up out of the total available. If `"auto"` is passed, the column will be the size of its content.
    */
  var sizeXs: js.UndefOr[String] = js.native
}

object IonCol {
  @scala.inline
  def apply(): IonCol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonCol]
  }
  @scala.inline
  implicit class IonColOps[Self <: IonCol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetLg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetLg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetLg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetLg")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetMd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetMd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetMd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetMd")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetSm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetSm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetSm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetSm")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetXl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetXl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetXl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetXl")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetXs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetXs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetXs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetXs")(js.undefined)
        ret
    }
    @scala.inline
    def withPull(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(js.undefined)
        ret
    }
    @scala.inline
    def withPullLg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullLg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullLg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullLg")(js.undefined)
        ret
    }
    @scala.inline
    def withPullMd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullMd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullMd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullMd")(js.undefined)
        ret
    }
    @scala.inline
    def withPullSm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullSm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullSm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullSm")(js.undefined)
        ret
    }
    @scala.inline
    def withPullXl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullXl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullXl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullXl")(js.undefined)
        ret
    }
    @scala.inline
    def withPullXs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullXs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullXs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullXs")(js.undefined)
        ret
    }
    @scala.inline
    def withPush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.undefined)
        ret
    }
    @scala.inline
    def withPushLg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushLg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushLg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushLg")(js.undefined)
        ret
    }
    @scala.inline
    def withPushMd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushMd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushMd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushMd")(js.undefined)
        ret
    }
    @scala.inline
    def withPushSm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushSm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushSm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushSm")(js.undefined)
        ret
    }
    @scala.inline
    def withPushXl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushXl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushXl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushXl")(js.undefined)
        ret
    }
    @scala.inline
    def withPushXs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushXs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushXs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushXs")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
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
    @scala.inline
    def withSizeLg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeLg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeLg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeLg")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeMd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeMd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeMd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeMd")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeSm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeSm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeSm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeSm")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeXl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeXl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeXl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeXl")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeXs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeXs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeXs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeXs")(js.undefined)
        ret
    }
  }
  
}

