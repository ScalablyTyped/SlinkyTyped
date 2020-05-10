package typingsSlinky.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResumeOptions extends js.Object {
  /**
    * Define custom keys used to identify this file among other resume records.
    * 
    * The file's ID will be passed to your provided function
    * 
    * @default `function(fileId) { return [] }`
    */
  var customKeys: js.UndefOr[js.Function] = js.native
  /**
    * Enable or disable the ability to resume failed or stopped chunked uploads
    *
    * @default `false`
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * paramNames.resuming - Sent with the first request of the resume with a value of `true`.
    *
    * @default `'qqresume'`
    */
  var paramNames: js.UndefOr[ParamNamesOptions] = js.native
  /**
    * The number of days before a persistent resume record will expire
    *
    * @default `7`
    */
  var recordsExpireIn: js.UndefOr[Double] = js.native
}

object ResumeOptions {
  @scala.inline
  def apply(): ResumeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResumeOptions]
  }
  @scala.inline
  implicit class ResumeOptionsOps[Self <: ResumeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomKeys(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withParamNames(value: ParamNamesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParamNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramNames")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordsExpireIn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordsExpireIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordsExpireIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordsExpireIn")(js.undefined)
        ret
    }
  }
  
}

