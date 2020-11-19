package typingsSlinky.ngCordova.ngCordova

import typingsSlinky.cordovaPluginFile.FileEntry
import typingsSlinky.cordovaPluginFileTransfer.FileUploadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileTransferService extends js.Object {
  
  def download(url: String, filePath: String): IFileTransferPromise[FileEntry] = js.native
  def download(url: String, filePath: String, options: js.UndefOr[scala.Nothing], trustAllHosts: Boolean): IFileTransferPromise[FileEntry] = js.native
  def download(url: String, filePath: String, options: IFileDownloadOptions): IFileTransferPromise[FileEntry] = js.native
  def download(url: String, filePath: String, options: IFileDownloadOptions, trustAllHosts: Boolean): IFileTransferPromise[FileEntry] = js.native
  
  def upload(url: String, filePath: String): IFileTransferPromise[FileUploadResult] = js.native
  def upload(url: String, filePath: String, options: js.UndefOr[scala.Nothing], trustAllHosts: Boolean): IFileTransferPromise[FileUploadResult] = js.native
  def upload(url: String, filePath: String, options: IFileUploadOptions): IFileTransferPromise[FileUploadResult] = js.native
  def upload(url: String, filePath: String, options: IFileUploadOptions, trustAllHosts: Boolean): IFileTransferPromise[FileUploadResult] = js.native
}
