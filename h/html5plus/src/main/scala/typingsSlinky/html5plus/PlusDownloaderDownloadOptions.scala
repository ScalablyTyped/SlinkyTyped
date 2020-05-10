package typingsSlinky.html5plus

import typingsSlinky.html5plus.html5plusStrings.GET
import typingsSlinky.html5plus.html5plusStrings.POST
import typingsSlinky.html5plus.html5plusStrings._docSlash
import typingsSlinky.html5plus.html5plusStrings._documentsSlash
import typingsSlinky.html5plus.html5plusStrings._downloadsSlash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 下载任务参数
  * 在创建下载任务时设置的参数，如设置下载任务使用的HTTP协议类型、优先级等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
  */
@js.native
trait PlusDownloaderDownloadOptions extends js.Object {
  /**
    * POST请求时提交的数据
    * 仅在网络请求类型method设置为"POST"时有效，"GET"请求时忽略此数据。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var data: js.UndefOr[String] = js.native
  /**
    * 下载文件保存的路径
    * 保存文件路径仅支持以"_downloads/"、"_doc/"、"_documents/"开头的字符串。
    * 	文件路径以文件后缀名结尾（如"_doc/download/a.doc"）表明指定保存文件目录及名称，以“/”结尾则认为指定保存文件的目录（此时程序自动生成文件名）。
    * 	如果指定的文件已经存在，则自动在文件名后面加"(i)"，其中i为数字，如果文件名称后面已经是此格式，则数字i递增，如"download(1).doc"。
    * 	默认保存目录为（"_downloads"），并自动生成文件名称。
    * - _doc/: 应用私有文档目录
    * - _documents/: 共享文档目录
    * - _downloads/: 共享下载目录
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var filename: js.UndefOr[_docSlash | _documentsSlash | _downloadsSlash] = js.native
  /**
    * 网络请求类型
    * 支持http协议的“GET”、“POST”，默认为“GET”请求。
    * - GET: GET请求
    * - POST: POST请求
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var method: js.UndefOr[GET | POST] = js.native
  /**
    * 下载任务的优先级
    * 数值类型，数值越大优先级越高，默认优先级值为0。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * 下载任务重试次数
    * 数值类型，默认为重试3次。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var retry: js.UndefOr[Double] = js.native
  /**
    * 下载任务重试间隔时间
    * 数值类型，单位为s(秒)，默认值为30s。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var retryInterval: js.UndefOr[Double] = js.native
  /**
    * 下载任务超时时间
    * 数值类型，单位为s(秒)，默认值为120s。
    * 	超时时间为服务器响应请求的时间（不是下载任务完成的总时间），如果设置为0则表示永远不超时。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  var timeout: js.UndefOr[Double] = js.native
}

object PlusDownloaderDownloadOptions {
  @scala.inline
  def apply(): PlusDownloaderDownloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusDownloaderDownloadOptions]
  }
  @scala.inline
  implicit class PlusDownloaderDownloadOptionsOps[Self <: PlusDownloaderDownloadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withFilename(value: _docSlash | _documentsSlash | _downloadsSlash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: GET | POST): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withRetry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retry")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

