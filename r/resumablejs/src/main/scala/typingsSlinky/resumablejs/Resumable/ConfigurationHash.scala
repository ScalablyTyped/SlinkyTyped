package typingsSlinky.resumablejs.Resumable

import typingsSlinky.resumablejs.resumablejsStrings.DELETE
import typingsSlinky.resumablejs.resumablejsStrings.GET
import typingsSlinky.resumablejs.resumablejsStrings.OPTIONS
import typingsSlinky.resumablejs.resumablejsStrings.POST
import typingsSlinky.resumablejs.resumablejsStrings.PUT
import typingsSlinky.resumablejs.resumablejsStrings.multipart
import typingsSlinky.resumablejs.resumablejsStrings.octet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationHash extends js.Object {
  /**
    * The name of the chunk index (base-1) in the current upload POST parameter to use for the file chunk (Default: resumableChunkNumber)
    */
  var chunkNumberParameterName: js.UndefOr[String] = js.native
  /**
    * The number of milliseconds to wait before retrying a chunk on a non-permanent error. Valid values are any positive integer and undefined for immediate retry. (Default: undefined)
    **/
  var chunkRetryInterval: js.UndefOr[Double] = js.native
  /**
    * The size in bytes of each uploaded chunk of data. The last uploaded chunk will be at least this size and up to two the size, see Issue #51 for details and reasons. (Default: 1*1024*1024)
    **/
  var chunkSize: js.UndefOr[Double] = js.native
  /**
    * The name of the general chunk size POST parameter to use for the file chunk (Default: resumableChunkSize)
    */
  var chunkSizeParameterName: js.UndefOr[String] = js.native
  /**
    * The name of the current chunk size POST parameter to use for the file chunk (Default: resumableCurrentChunkSize)
    */
  var currentChunkSizeParameterName: js.UndefOr[String] = js.native
  /**
    * The name of the original file name POST parameter to use for the file chunk (Default: resumableFilename)
    */
  var fileNameParameterName: js.UndefOr[String] = js.native
  /**
    * The name of the multipart POST parameter to use for the file chunk (Default: file)
    **/
  var fileParameterName: js.UndefOr[String] = js.native
  /**
    * The file types allowed to upload. An empty array allow any file type. (Default: [])
    **/
  var fileType: js.UndefOr[js.Array[String]] = js.native
  /**
    * A function which displays an error a selected file has type not allowed. (Default: displays an alert for every bad file.)
    **/
  var fileTypeErrorCallback: js.UndefOr[js.Function2[/* file */ js.Any, /* errorCount */ js.Any, Unit]] = js.native
  /**
    * Force all chunks to be less or equal than chunkSize. Otherwise, the last chunk will be greater than or equal to chunkSize. (Default: false)
    **/
  var forceChunkSize: js.UndefOr[Boolean] = js.native
  /**
    * Override the function that generates unique identifiers for each file. (Default: null)
    **/
  var generateUniqueIdentifier: js.UndefOr[js.Function0[String]] = js.native
  /**
    * Extra headers to include in the multipart POST with data. This can be an object or a function that allows you to construct and return a value, based on supplied file (Default: {})
    **/
  var headers: js.UndefOr[js.Object | (js.Function1[/* file */ js.Any, js.Object])] = js.native
  /**
    * The name of the unique identifier POST parameter to use for the file chunk (Default: resumableIdentifier)
    */
  var identifierParameterName: js.UndefOr[String] = js.native
  /**
    * The maximum number of retries for a chunk before the upload is failed. Valid values are any positive integer and undefined for no limit. (Default: undefined)
    **/
  var maxChunkRetries: js.UndefOr[Double] = js.native
  /**
    * The maximum allowed file size. (Default: undefined)
    **/
  var maxFileSize: js.UndefOr[Boolean] = js.native
  /**
    * A function which displays an error a selected file is larger than allowed. (Default: displays an alert for every bad file.)
    **/
  var maxFileSizeErrorCallback: js.UndefOr[js.Function2[/* file */ js.Any, /* errorCount */ js.Any, Unit]] = js.native
  /**
    * Indicates how many files can be uploaded in a single session. Valid values are any positive integer and undefined for no limit. (Default: undefined)
    **/
  var maxFiles: js.UndefOr[Double] = js.native
  /**
    * A function which displays the please upload n file(s) at a time message. (Default: displays an alert box with the message Please n one file(s) at a time.)
    **/
  var maxFilesErrorCallback: js.UndefOr[js.Function2[/* files */ js.Any, /* errorCount */ js.Any, Unit]] = js.native
  /**
    * Method to use when POSTing chunks to the server (multipart or octet) (Default: multipart)
    **/
  var method: js.UndefOr[multipart | octet] = js.native
  /**
    * The minimum allowed file size. (Default: undefined)
    **/
  var minFileSize: js.UndefOr[Boolean] = js.native
  /**
    * A function which displays an error a selected file is smaller than allowed. (Default: displays an alert for every bad file.)
    **/
  var minFileSizeErrorCallback: js.UndefOr[js.Function2[/* file */ js.Any, /* errorCount */ js.Any, Unit]] = js.native
  /**
    * Extra prefix added before the name of each parameter included in the multipart POST or in the test GET. (Default: '')
    **/
  var parameterNamespace: js.UndefOr[String] = js.native
  /**
    * Optional function to process each chunk before testing & sending. Function is passed the chunk as parameter, and should call the preprocessFinished method on the chunk when finished. (Default: null)
    **/
  var preprocess: js.UndefOr[js.Function1[/* chunk */ ResumableChunk, ResumableChunk]] = js.native
  /**
    * Prioritize first and last chunks of all files. This can be handy if you can determine if a file is valid for your service from only the first or last chunk. For example, photo or video meta data is usually located in the first part of a file, making it easy to test support from only the first chunk. (Default: false)
    **/
  var prioritizeFirstAndLastChunk: js.UndefOr[Boolean] = js.native
  /**
    * Extra parameters to include in the multipart POST with data. This can be an object or a function. If a function, it will be passed a ResumableFile and a ResumableChunk object (Default: {})
    **/
  var query: js.UndefOr[js.Object] = js.native
  /**
    * The name of the file's relative path POST parameter to use for the file chunk (Default: resumableRelativePath)
    */
  var relativePathParameterName: js.UndefOr[String] = js.native
  /**
    * setChunkTypeFromFile` Set chunk content-type from original file.type. (Default: false, if false default Content-Type: application/octet-stream)
    **/
  var setChunkTypeFromFile: js.UndefOr[Boolean] = js.native
  /**
    * Number of simultaneous uploads (Default: 3)
    **/
  var simultaneousUploads: js.UndefOr[Double] = js.native
  /**
    * The target URL for the multipart POST request. This can be a string or a function that allows you you to construct and return a value, based on supplied params. (Default: /)
    **/
  var target: js.UndefOr[String] = js.native
  /**
    * Make a GET request to the server for each chunks to see if it already exists. If implemented on the server-side, this will allow for upload resumes even after a browser crash or even a computer restart. (Default: true)
    **/
  var testChunks: js.UndefOr[Boolean] = js.native
  /**
    * Method for chunk test request. (Default: 'GET')
    **/
  var testMethod: js.UndefOr[GET | POST | OPTIONS | PUT | DELETE] = js.native
  /**
    * The name of the total number of chunks POST parameter to use for the file chunk (Default: resumableTotalChunks)
    */
  var totalChunksParameterName: js.UndefOr[String] = js.native
  /**
    * The name of the total file size number POST parameter to use for the file chunk (Default: resumableTotalSize)
    */
  var totalSizeParameterName: js.UndefOr[String] = js.native
  /**
    * The name of the file type POST parameter to use for the file chunk (Default: resumableType)
    */
  var typeParameterName: js.UndefOr[String] = js.native
  /**
    * Method for chunk upload request. (Default: 'POST')
    **/
  var uploadMethod: js.UndefOr[GET | POST | OPTIONS | PUT | DELETE] = js.native
  /**
    * Standard CORS requests do not send or set any cookies by default. In order to include cookies as part of the request, you need to set the withCredentials property to true. (Default: false)
    **/
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object ConfigurationHash {
  @scala.inline
  def apply(): ConfigurationHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationHash]
  }
  @scala.inline
  implicit class ConfigurationHashOps[Self <: ConfigurationHash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkNumberParameterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkNumberParameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkNumberParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkNumberParameterName")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkRetryInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkRetryInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkRetryInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkRetryInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkSizeParameterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSizeParameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkSizeParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkSizeParameterName")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentChunkSizeParameterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentChunkSizeParameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentChunkSizeParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentChunkSizeParameterName")(js.undefined)
        ret
    }
    @scala.inline
    def withFileNameParameterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileNameParameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileNameParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileNameParameterName")(js.undefined)
        ret
    }
    @scala.inline
    def withFileParameterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileParameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileParameterName")(js.undefined)
        ret
    }
    @scala.inline
    def withFileType(value: js.Array[String]): Self = {
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
    def withFileTypeErrorCallback(value: (/* file */ js.Any, /* errorCount */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypeErrorCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFileTypeErrorCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypeErrorCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withForceChunkSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceChunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceChunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateUniqueIdentifier(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateUniqueIdentifier")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGenerateUniqueIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateUniqueIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadersFunction1(value: /* file */ js.Any => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeaders(value: js.Object | (js.Function1[/* file */ js.Any, js.Object])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifierParameterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifierParameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifierParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifierParameterName")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxChunkRetries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxChunkRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxChunkRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxChunkRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFileSize(value: Boolean): Self = {
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
    def withMaxFileSizeErrorCallback(value: (/* file */ js.Any, /* errorCount */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFileSizeErrorCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMaxFileSizeErrorCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFileSizeErrorCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFiles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFilesErrorCallback(value: (/* files */ js.Any, /* errorCount */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFilesErrorCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMaxFilesErrorCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFilesErrorCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: multipart | octet): Self = {
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
    def withMinFileSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinFileSizeErrorCallback(value: (/* file */ js.Any, /* errorCount */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFileSizeErrorCallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMinFileSizeErrorCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minFileSizeErrorCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withPreprocess(value: /* chunk */ ResumableChunk => ResumableChunk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreprocess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocess")(js.undefined)
        ret
    }
    @scala.inline
    def withPrioritizeFirstAndLastChunk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prioritizeFirstAndLastChunk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrioritizeFirstAndLastChunk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prioritizeFirstAndLastChunk")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativePathParameterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePathParameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativePathParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePathParameterName")(js.undefined)
        ret
    }
    @scala.inline
    def withSetChunkTypeFromFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setChunkTypeFromFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetChunkTypeFromFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setChunkTypeFromFile")(js.undefined)
        ret
    }
    @scala.inline
    def withSimultaneousUploads(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simultaneousUploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimultaneousUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simultaneousUploads")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTestChunks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testChunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestChunks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testChunks")(js.undefined)
        ret
    }
    @scala.inline
    def withTestMethod(value: GET | POST | OPTIONS | PUT | DELETE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalChunksParameterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalChunksParameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalChunksParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalChunksParameterName")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalSizeParameterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSizeParameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSizeParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalSizeParameterName")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeParameterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeParameterName")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadMethod(value: GET | POST | OPTIONS | PUT | DELETE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(js.undefined)
        ret
    }
  }
  
}

