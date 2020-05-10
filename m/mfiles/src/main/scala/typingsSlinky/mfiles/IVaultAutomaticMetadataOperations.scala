package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultAutomaticMetadataOperations extends js.Object {
  def GetAutomaticMetadataForObject(ObjVer: IObjVer): IAutomaticMetadataResult = js.native
  def GetAutomaticMetadataForTemporaryFile(UploadSessionID: Double): IAutomaticMetadataResult = js.native
  def GetAutomaticMetadataForTemporaryFiles(IIDs: IIDs): IAutomaticMetadataResult = js.native
}

object IVaultAutomaticMetadataOperations {
  @scala.inline
  def apply(
    GetAutomaticMetadataForObject: IObjVer => IAutomaticMetadataResult,
    GetAutomaticMetadataForTemporaryFile: Double => IAutomaticMetadataResult,
    GetAutomaticMetadataForTemporaryFiles: IIDs => IAutomaticMetadataResult
  ): IVaultAutomaticMetadataOperations = {
    val __obj = js.Dynamic.literal(GetAutomaticMetadataForObject = js.Any.fromFunction1(GetAutomaticMetadataForObject), GetAutomaticMetadataForTemporaryFile = js.Any.fromFunction1(GetAutomaticMetadataForTemporaryFile), GetAutomaticMetadataForTemporaryFiles = js.Any.fromFunction1(GetAutomaticMetadataForTemporaryFiles))
    __obj.asInstanceOf[IVaultAutomaticMetadataOperations]
  }
  @scala.inline
  implicit class IVaultAutomaticMetadataOperationsOps[Self <: IVaultAutomaticMetadataOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAutomaticMetadataForObject(value: IObjVer => IAutomaticMetadataResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAutomaticMetadataForObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAutomaticMetadataForTemporaryFile(value: Double => IAutomaticMetadataResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAutomaticMetadataForTemporaryFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAutomaticMetadataForTemporaryFiles(value: IIDs => IAutomaticMetadataResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAutomaticMetadataForTemporaryFiles")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

