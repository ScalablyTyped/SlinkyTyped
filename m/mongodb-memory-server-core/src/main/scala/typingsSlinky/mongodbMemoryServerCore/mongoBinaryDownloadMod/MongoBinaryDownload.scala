package typingsSlinky.mongodbMemoryServerCore.mongoBinaryDownloadMod

import typingsSlinky.mongodbMemoryServerCore.typesMod.DownloadProgressT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoBinaryDownload extends js.Object {
  var _downloadingUrl: js.UndefOr[String] = js.native
  var arch: String = js.native
  var checkMD5: Boolean = js.native
  var dlProgress: DownloadProgressT = js.native
  var downloadDir: String = js.native
  var platform: String = js.native
  var version: String = js.native
  /**
    * Download file from downloadUrl
    * @param downloadUrl URL to download a File
    */
  def download(downloadUrl: String): js.Promise[String] = js.native
  /**
    * Extract given Archive
    * @param mongoDBArchive Archive location
    * @returns extracted directory location
    */
  def extract(mongoDBArchive: String): js.Promise[String] = js.native
  /**
    * Extract a .tar.gz archive
    * @param mongoDBArchive Archive location
    * @param extractDir Directory to extract to
    * @param filter Method to determine which files to extract
    */
  def extractTarGz(mongoDBArchive: String, extractDir: String, filter: js.Function1[/* file */ String, Boolean]): js.Promise[Unit] = js.native
  /**
    * Extract a .zip archive
    * @param mongoDBArchive Archive location
    * @param extractDir Directory to extract to
    * @param filter Method to determine which files to extract
    */
  def extractZip(mongoDBArchive: String, extractDir: String, filter: js.Function1[/* file */ String, Boolean]): js.Promise[Unit] = js.native
  /**
    * Get the path of the already downloaded "mongod" file
    * otherwise download it and then return the path
    */
  def getMongodPath(): js.Promise[String] = js.native
  /**
    * Downlaod given httpOptions to tempDownloadLocation, then move it to downloadLocation
    * @param httpOptions The httpOptions directly passed to https.get
    * @param downloadLocation The location the File should be after the download
    * @param tempDownloadLocation The location the File should be while downloading
    */
  def httpDownload(httpOptions: HttpDownloadOptions, downloadLocation: String, tempDownloadLocation: String): js.Promise[String] = js.native
  /**
    * Test if the location given is already used
    * Does *not* dereference links
    * @param location The Path to test
    */
  def locationExists(location: String): js.Promise[Boolean] = js.native
  /**
    * Download MD5 file and check it against the MongoDB Archive
    * @param urlForReferenceMD5 URL to download the MD5
    * @param mongoDBArchive The MongoDB Archive file location
    */
  def makeMD5check(urlForReferenceMD5: String, mongoDBArchive: String): js.Promise[js.UndefOr[Boolean]] = js.native
  /**
    * Print the Download Progress to STDOUT
    * @param chunk A chunk to get the length
    */
  def printDownloadProgress(chunk: js.Any): Unit = js.native
  /**
    * Download the MongoDB Archive and check it against an MD5
    * @returns The MongoDB Archive location
    */
  def startDownload(): js.Promise[String] = js.native
}

object MongoBinaryDownload {
  @scala.inline
  def apply(
    arch: String,
    checkMD5: Boolean,
    dlProgress: DownloadProgressT,
    download: String => js.Promise[String],
    downloadDir: String,
    extract: String => js.Promise[String],
    extractTarGz: (String, String, js.Function1[/* file */ String, Boolean]) => js.Promise[Unit],
    extractZip: (String, String, js.Function1[/* file */ String, Boolean]) => js.Promise[Unit],
    getMongodPath: () => js.Promise[String],
    httpDownload: (HttpDownloadOptions, String, String) => js.Promise[String],
    locationExists: String => js.Promise[Boolean],
    makeMD5check: (String, String) => js.Promise[js.UndefOr[Boolean]],
    platform: String,
    printDownloadProgress: js.Any => Unit,
    startDownload: () => js.Promise[String],
    version: String
  ): MongoBinaryDownload = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], checkMD5 = checkMD5.asInstanceOf[js.Any], dlProgress = dlProgress.asInstanceOf[js.Any], download = js.Any.fromFunction1(download), downloadDir = downloadDir.asInstanceOf[js.Any], extract = js.Any.fromFunction1(extract), extractTarGz = js.Any.fromFunction3(extractTarGz), extractZip = js.Any.fromFunction3(extractZip), getMongodPath = js.Any.fromFunction0(getMongodPath), httpDownload = js.Any.fromFunction3(httpDownload), locationExists = js.Any.fromFunction1(locationExists), makeMD5check = js.Any.fromFunction2(makeMD5check), platform = platform.asInstanceOf[js.Any], printDownloadProgress = js.Any.fromFunction1(printDownloadProgress), startDownload = js.Any.fromFunction0(startDownload), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoBinaryDownload]
  }
  @scala.inline
  implicit class MongoBinaryDownloadOps[Self <: MongoBinaryDownload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckMD5(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkMD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDlProgress(value: DownloadProgressT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dlProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownload(value: String => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDownloadDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtract(value: String => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extract")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExtractTarGz(value: (String, String, js.Function1[/* file */ String, Boolean]) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractTarGz")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withExtractZip(value: (String, String, js.Function1[/* file */ String, Boolean]) => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extractZip")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetMongodPath(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMongodPath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHttpDownload(value: (HttpDownloadOptions, String, String) => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpDownload")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLocationExists(value: String => js.Promise[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationExists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMakeMD5check(value: (String, String) => js.Promise[js.UndefOr[Boolean]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("makeMD5check")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintDownloadProgress(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printDownloadProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartDownload(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDownload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_downloadingUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_downloadingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_downloadingUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_downloadingUrl")(js.undefined)
        ret
    }
  }
  
}

