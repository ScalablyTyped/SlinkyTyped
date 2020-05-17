package typingsSlinky.ngFileUpload.mod.angularAugmentingMod.angularFileUpload

import typingsSlinky.angular.mod.IRequestConfig
import typingsSlinky.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileUploadConfigFile extends IRequestConfig {
  /**
    * This is to accommodate server implementations expecting array data object keys in '[i]' or '[]' or
    * ''(multiple entries with same key) format.
    * Example: data: {rec: [file[0], file[1], ...]} sent as: rec[0] -> file[0], rec[1] -> file[1],...
    * data: {rec: {rec: [f[0], f[1], ...], arrayKey: '[]'} sent as: rec[] -> f[0], rec[] -> f[1],...
    * @type {string}
    */
  var arrayKey: js.UndefOr[String] = js.native
  /**
    * Default false, experimental as hotfix for potential library conflicts with other plugins
    * @type {boolean}
    */
  var disableProgress: js.UndefOr[Boolean] = js.native
  /**
    * This is to accommodate server implementations expecting nested data object keys in .key or [key] format.
    * Example: data: {rec: {name: 'N', pic: file}} sent as: rec[name] -> N, rec[pic] -> file
    * data: {rec: {name: 'N', pic: file}, objectKey: '.k'} sent as: rec.name -> N, rec.pic -> file
    * @type {string}
    */
  var objectKey: js.UndefOr[String] = js.native
  /**
    * Upload in chunks of specified size
    * @type {(number|string)}
    */
  var resumeChunkSize: js.UndefOr[Double | String] = js.native
  /**
    * Function that returns a prommise which will be resolved to the upload file size on the server.
    * @type {[type]}
    */
  var resumeSize: js.UndefOr[Function] = js.native
  /**
    * Reads the uploaded file size from resumeSizeUrl GET response
    * @type {Function}
    */
  var resumeSizeResponseReader: js.UndefOr[Function] = js.native
  /**
    * Uploaded file size so far on the server
    * @type {string}
    */
  var resumeSizeUrl: js.UndefOr[String] = js.native
}

object IFileUploadConfigFile {
  @scala.inline
  def apply(method: String, url: String): IFileUploadConfigFile = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileUploadConfigFile]
  }
  @scala.inline
  implicit class IFileUploadConfigFileOps[Self <: IFileUploadConfigFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableProgress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectKey")(js.undefined)
        ret
    }
    @scala.inline
    def withResumeChunkSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeChunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResumeChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeChunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withResumeSize(value: Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResumeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withResumeSizeResponseReader(value: Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeSizeResponseReader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResumeSizeResponseReader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeSizeResponseReader")(js.undefined)
        ret
    }
    @scala.inline
    def withResumeSizeUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeSizeUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResumeSizeUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumeSizeUrl")(js.undefined)
        ret
    }
  }
  
}

