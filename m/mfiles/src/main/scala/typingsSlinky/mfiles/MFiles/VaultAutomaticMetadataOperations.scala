package typingsSlinky.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.mfiles.IAutomaticMetadataResult
import typingsSlinky.mfiles.IIDs
import typingsSlinky.mfiles.IObjVer
import typingsSlinky.mfiles.IVaultAutomaticMetadataOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultAutomaticMetadataOperations")
@js.native
class VaultAutomaticMetadataOperations () extends IVaultAutomaticMetadataOperations {
  /* CompleteClass */
  override def GetAutomaticMetadataForObject(ObjVer: IObjVer): IAutomaticMetadataResult = js.native
  /* CompleteClass */
  override def GetAutomaticMetadataForTemporaryFile(UploadSessionID: Double): IAutomaticMetadataResult = js.native
  /* CompleteClass */
  override def GetAutomaticMetadataForTemporaryFiles(IIDs: IIDs): IAutomaticMetadataResult = js.native
}

@JSGlobal("MFiles.VaultAutomaticMetadataOperations")
@js.native
object VaultAutomaticMetadataOperations extends Instantiable0[IVaultAutomaticMetadataOperations]

