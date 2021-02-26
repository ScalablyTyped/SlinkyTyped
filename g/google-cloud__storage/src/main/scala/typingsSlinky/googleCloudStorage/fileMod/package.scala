package typingsSlinky.googleCloudStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fileMod {
  
  type CopyCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* file */ js.UndefOr[typingsSlinky.googleCloudStorage.fileMod.File | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type CopyResponse = js.Tuple2[
    typingsSlinky.googleCloudStorage.fileMod.File, 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type CreateResumableUploadCallback = js.Function2[/* err */ js.Error | scala.Null, /* uri */ js.UndefOr[java.lang.String], scala.Unit]
  
  type CreateResumableUploadResponse = js.Array[java.lang.String]
  
  type DeleteFileCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type DeleteFileResponse = js.Array[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata]
  
  type DownloadCallback = js.Function2[
    /* err */ typingsSlinky.googleCloudStorage.fileMod.RequestError | scala.Null, 
    /* contents */ typingsSlinky.node.Buffer, 
    scala.Unit
  ]
  
  type DownloadResponse = js.Array[typingsSlinky.node.Buffer]
  
  type FileExistsCallback = js.Function2[/* err */ js.Error | scala.Null, /* exists */ js.UndefOr[scala.Boolean], scala.Unit]
  
  type FileExistsResponse = js.Array[scala.Boolean]
  
  type GenerateSignedPostPolicyV2Callback = typingsSlinky.googleCloudStorage.fileMod.GetSignedPolicyCallback
  
  type GenerateSignedPostPolicyV2Options = typingsSlinky.googleCloudStorage.fileMod.GetSignedPolicyOptions
  
  type GenerateSignedPostPolicyV2Response = typingsSlinky.googleCloudStorage.fileMod.GetSignedPolicyResponse
  
  type GenerateSignedPostPolicyV4Callback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* output */ js.UndefOr[typingsSlinky.googleCloudStorage.fileMod.SignedPostPolicyV4Output], 
    scala.Unit
  ]
  
  type GenerateSignedPostPolicyV4Response = js.Array[typingsSlinky.googleCloudStorage.fileMod.SignedPostPolicyV4Output]
  
  type GetExpirationDateCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* expirationDate */ js.UndefOr[js.Date | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type GetExpirationDateResponse = js.Array[js.Date]
  
  type GetFileCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* file */ js.UndefOr[typingsSlinky.googleCloudStorage.fileMod.File], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type GetFileMetadataCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* metadata */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type GetFileMetadataResponse = js.Tuple2[
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata, 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type GetFileResponse = js.Tuple2[
    typingsSlinky.googleCloudStorage.fileMod.File, 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type GetSignedPolicyCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* policy */ js.UndefOr[typingsSlinky.googleCloudStorage.fileMod.PolicyDocument], 
    scala.Unit
  ]
  
  type GetSignedPolicyResponse = js.Array[typingsSlinky.googleCloudStorage.fileMod.PolicyDocument]
  
  type IsPublicCallback = js.Function2[/* err */ js.Error | scala.Null, /* resp */ js.UndefOr[scala.Boolean], scala.Unit]
  
  type IsPublicResponse = js.Array[scala.Boolean]
  
  type MakeFilePrivateCallback = typingsSlinky.googleCloudStorage.fileMod.SetFileMetadataCallback
  
  type MakeFilePrivateResponse = js.Array[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata]
  
  type MakeFilePublicCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type MakeFilePublicResponse = js.Array[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata]
  
  type MoveCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* destinationFile */ js.UndefOr[typingsSlinky.googleCloudStorage.fileMod.File | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type MoveResponse = js.Array[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata]
  
  type PolicyFields = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type RenameCallback = typingsSlinky.googleCloudStorage.fileMod.MoveCallback
  
  type RenameOptions = typingsSlinky.googleCloudStorage.fileMod.MoveOptions
  
  type RenameResponse = typingsSlinky.googleCloudStorage.fileMod.MoveResponse
  
  type RotateEncryptionKeyCallback = typingsSlinky.googleCloudStorage.fileMod.CopyCallback
  
  type RotateEncryptionKeyOptions = java.lang.String | typingsSlinky.node.Buffer | typingsSlinky.googleCloudStorage.fileMod.EncryptionKeyOptions
  
  type RotateEncryptionKeyResponse = typingsSlinky.googleCloudStorage.fileMod.CopyResponse
  
  @scala.inline
  def STORAGE_POST_POLICY_BASE_URL: /* "https://storage.googleapis.com" */ java.lang.String = typingsSlinky.googleCloudStorage.fileMod.^.asInstanceOf[js.Dynamic].selectDynamic("STORAGE_POST_POLICY_BASE_URL").asInstanceOf[/* "https://storage.googleapis.com" */ java.lang.String]
  
  type SaveCallback = js.Function1[/* err */ js.UndefOr[js.Error | scala.Null], scala.Unit]
  
  type SetFileMetadataCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type SetFileMetadataResponse = js.Array[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata]
  
  type SetStorageClassCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type SetStorageClassResponse = js.Array[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata]
}
