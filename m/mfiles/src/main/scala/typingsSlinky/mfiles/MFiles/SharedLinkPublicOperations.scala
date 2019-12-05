package typingsSlinky.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.mfiles.IFileDownloadSession
import typingsSlinky.mfiles.INamedValues
import typingsSlinky.mfiles.ISharedFileInfo
import typingsSlinky.mfiles.ISharedLinkPublicOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SharedLinkPublicOperations")
@js.native
class SharedLinkPublicOperations () extends ISharedLinkPublicOperations {
  /* CompleteClass */
  override def DownloadSharedFileInBlocks_Begin(VaultGUID: String, AccessKey: String, AdditionalData: INamedValues): IFileDownloadSession = js.native
  /* CompleteClass */
  override def DownloadSharedFileInBlocks_Begin_32bit(VaultGUID: String, AccessKey: String, AdditionalData: INamedValues): IFileDownloadSession = js.native
  /* CompleteClass */
  override def DownloadSharedFileInBlocks_ReadBlock(VaultGUID: String, AccessKey: String, DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double] = js.native
  /* CompleteClass */
  override def DownloadSharedFileInBlocks_ReadBlock_32bit(VaultGUID: String, AccessKey: String, DownloadID: Double, BlockSize: Double, Offset: Double): js.Array[Double] = js.native
  /* CompleteClass */
  override def GetSharedLinkInfo(VaultGUID: String, AccessKey: String, AdditionalData: INamedValues): ISharedFileInfo = js.native
}

@JSGlobal("MFiles.SharedLinkPublicOperations")
@js.native
object SharedLinkPublicOperations extends Instantiable0[ISharedLinkPublicOperations]

