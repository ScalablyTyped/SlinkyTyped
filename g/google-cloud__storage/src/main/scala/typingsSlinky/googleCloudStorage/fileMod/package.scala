package typingsSlinky.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  type GetSignedUrlCallback = js.Function2[/* err */ js.Error | scala.Null, /* url */ js.UndefOr[java.lang.String], scala.Unit]
  type GetSignedUrlResponse = js.Array[java.lang.String]
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
  type RotateEncryptionKeyCallback = typingsSlinky.googleCloudStorage.fileMod.CopyCallback
  type RotateEncryptionKeyOptions = java.lang.String | typingsSlinky.node.Buffer | typingsSlinky.googleCloudStorage.fileMod.EncryptionKeyOptions
  type RotateEncryptionKeyResponse = typingsSlinky.googleCloudStorage.fileMod.CopyResponse
  type SaveCallback = js.Function1[/* err */ js.UndefOr[js.Error | scala.Null], scala.Unit]
  type SaveOptions = typingsSlinky.googleCloudStorage.fileMod.CreateWriteStreamOptions
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
