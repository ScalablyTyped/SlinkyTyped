package typingsSlinky.qiniu.mod.rs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPolicyOptions extends js.Object {
  var callbackBody: js.UndefOr[String] = js.native
  var callbackBodyType: js.UndefOr[String] = js.native
  var callbackFetchKey: js.UndefOr[Double] = js.native
  var callbackHost: js.UndefOr[String] = js.native
  var callbackUrl: js.UndefOr[String] = js.native
  var deleteAfterDays: js.UndefOr[Double] = js.native
  var detectMime: js.UndefOr[Double] = js.native
  var endUser: js.UndefOr[String] = js.native
  var expires: js.UndefOr[Double] = js.native
  var fileType: js.UndefOr[Double] = js.native
  var fsizeLimit: js.UndefOr[Double] = js.native
  var fsizeMin: js.UndefOr[Double] = js.native
  var insertOnly: js.UndefOr[Double] = js.native
  var isPrefixalScope: js.UndefOr[Double] = js.native
  var mimeLimit: js.UndefOr[String] = js.native
  var persistentNotifyUrl: js.UndefOr[String] = js.native
  var persistentOps: js.UndefOr[String] = js.native
  var persistentPipeline: js.UndefOr[String] = js.native
  var returnBody: js.UndefOr[String] = js.native
  var returnUrl: js.UndefOr[String] = js.native
  var saveKey: js.UndefOr[String] = js.native
  var scope: js.UndefOr[String] = js.native
}

object PutPolicyOptions {
  @scala.inline
  def apply(): PutPolicyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutPolicyOptions]
  }
  @scala.inline
  implicit class PutPolicyOptionsOps[Self <: PutPolicyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbackBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackBody")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbackBodyType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackBodyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackBodyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackBodyType")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbackFetchKey(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackFetchKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackFetchKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackFetchKey")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbackHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackHost")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbackUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteAfterDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAfterDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteAfterDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteAfterDays")(js.undefined)
        ret
    }
    @scala.inline
    def withDetectMime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectMime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectMime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectMime")(js.undefined)
        ret
    }
    @scala.inline
    def withEndUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endUser")(js.undefined)
        ret
    }
    @scala.inline
    def withExpires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(js.undefined)
        ret
    }
    @scala.inline
    def withFileType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileType")(js.undefined)
        ret
    }
    @scala.inline
    def withFsizeLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsizeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFsizeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsizeLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withFsizeMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsizeMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFsizeMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fsizeMin")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertOnly(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPrefixalScope(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrefixalScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPrefixalScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrefixalScope")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentNotifyUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentNotifyUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentNotifyUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentNotifyUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentOps(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentOps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentOps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentOps")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistentPipeline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentPipeline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistentPipeline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistentPipeline")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnBody")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveKey")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

