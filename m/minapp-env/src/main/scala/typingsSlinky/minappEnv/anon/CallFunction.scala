package typingsSlinky.minappEnv.anon

import typingsSlinky.minappEnv.ICloud.CallFunctionParam
import typingsSlinky.minappEnv.ICloud.CallFunctionResult
import typingsSlinky.minappEnv.ICloud.DeleteFileParam
import typingsSlinky.minappEnv.ICloud.DeleteFileResult
import typingsSlinky.minappEnv.ICloud.DownloadFileParam
import typingsSlinky.minappEnv.ICloud.DownloadFileResult
import typingsSlinky.minappEnv.ICloud.GetTempFileURLParam
import typingsSlinky.minappEnv.ICloud.GetTempFileURLResult
import typingsSlinky.minappEnv.ICloud.UploadFileParam
import typingsSlinky.minappEnv.ICloud.UploadFileResult
import typingsSlinky.minappEnv.ICloudConfig
import typingsSlinky.minappEnv.OQ
import typingsSlinky.minappEnv.Promise
import typingsSlinky.minappEnv.WXNS.IDownloadFileTask
import typingsSlinky.minappEnv.WXNS.IUploadFileTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallFunction extends StObject {
  
  // callFunction: (param: ICloud.CallFunctionParam) => Promise<ICloud.CallFunctionResult> | void,
  // uploadFile: (param: ICloud.UploadFileParam) => Promise<ICloud.UploadFileResult> | WXNS.IUploadFileTask,
  // downloadFile: (param: ICloud.DownloadFileParam) => Promise<ICloud.DownloadFileResult> | WXNS.IDownloadFileTask,
  // getTempFileURL: (param: ICloud.GetTempFileURLParam) => Promise<ICloud.GetTempFileURLResult> | void,
  // deleteFile: (param: ICloud.DeleteFileParam) => Promise<ICloud.DeleteFileResult> | void,
  def callFunction(param: OQ[CallFunctionParam]): Unit = js.native
  def callFunction(param: RQCallFunctionParam): Promise[CallFunctionResult] = js.native
  
  def database(): typingsSlinky.minappEnv.DB.Database = js.native
  def database(config: ICloudConfig): typingsSlinky.minappEnv.DB.Database = js.native
  
  def deleteFile(param: OQ[DeleteFileParam]): Unit = js.native
  def deleteFile(param: RQDeleteFileParam): Promise[DeleteFileResult] = js.native
  
  def downloadFile(param: OQ[DownloadFileParam]): IDownloadFileTask = js.native
  def downloadFile(param: RQDownloadFileParam): Promise[DownloadFileResult] = js.native
  
  def getTempFileURL(param: OQ[GetTempFileURLParam]): Unit = js.native
  def getTempFileURL(param: RQGetTempFileURLParam): Promise[GetTempFileURLResult] = js.native
  
  def init(): Unit = js.native
  def init(config: ICloudConfig): Unit = js.native
  
  def uploadFile(param: OQ[UploadFileParam]): IUploadFileTask = js.native
  def uploadFile(param: RQUploadFileParam): Promise[UploadFileResult] = js.native
}
