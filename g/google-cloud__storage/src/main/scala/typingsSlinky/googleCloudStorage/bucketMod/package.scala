package typingsSlinky.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object bucketMod {
  
  type BucketExistsCallback = typingsSlinky.googleCloudCommon.serviceObjectMod.ExistsCallback
  
  type BucketExistsResponse = js.Array[scala.Boolean]
  
  type BucketLockCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type BucketLockResponse = js.Array[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata]
  
  type CombineCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* newFile */ typingsSlinky.googleCloudStorage.fileMod.File | scala.Null, 
    /* apiResponse */ typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata, 
    scala.Unit
  ]
  
  type CombineResponse = js.Tuple2[
    typingsSlinky.googleCloudStorage.fileMod.File, 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type CreateChannelCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* channel */ typingsSlinky.googleCloudStorage.channelMod.Channel | scala.Null, 
    /* apiResponse */ typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata, 
    scala.Unit
  ]
  
  type CreateChannelResponse = js.Tuple2[
    typingsSlinky.googleCloudStorage.channelMod.Channel, 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type CreateNotificationCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* notification */ typingsSlinky.googleCloudStorage.notificationMod.Notification | scala.Null, 
    /* apiResponse */ typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata, 
    scala.Unit
  ]
  
  type CreateNotificationResponse = js.Tuple2[
    typingsSlinky.googleCloudStorage.notificationMod.Notification, 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type DeleteBucketResponse = js.Array[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata]
  
  type DeleteFilesCallback = js.Function2[
    /* err */ js.Error | js.Array[js.Error] | scala.Null, 
    /* apiResponse */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  
  type DeleteLabelsCallback = typingsSlinky.googleCloudStorage.bucketMod.SetLabelsCallback
  
  type DeleteLabelsResponse = js.Array[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata]
  
  type DisableRequesterPaysCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  
  type DisableRequesterPaysResponse = js.Array[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata]
  
  type EnableRequesterPaysCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type EnableRequesterPaysResponse = js.Array[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata]
  
  type GetBucketCallback = js.Function3[
    /* err */ typingsSlinky.googleCloudCommon.mod.ApiError | scala.Null, 
    /* bucket */ typingsSlinky.googleCloudStorage.bucketMod.Bucket | scala.Null, 
    /* apiResponse */ typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata, 
    scala.Unit
  ]
  
  type GetBucketMetadataCallback = js.Function3[
    /* err */ typingsSlinky.googleCloudCommon.mod.ApiError | scala.Null, 
    /* metadata */ typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata | scala.Null, 
    /* apiResponse */ typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata, 
    scala.Unit
  ]
  
  type GetBucketMetadataResponse = js.Tuple2[
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata, 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type GetBucketResponse = js.Tuple2[
    typingsSlinky.googleCloudStorage.bucketMod.Bucket, 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type GetFilesCallback = js.Function4[
    /* err */ js.Error | scala.Null, 
    /* files */ js.UndefOr[js.Array[typingsSlinky.googleCloudStorage.fileMod.File]], 
    /* nextQuery */ js.UndefOr[js.Object], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type GetFilesResponse = js.Tuple3[
    js.Array[typingsSlinky.googleCloudStorage.fileMod.File], 
    js.Object, 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type GetLabelsCallback = js.Function2[/* err */ js.Error | scala.Null, /* labels */ js.Object | scala.Null, scala.Unit]
  
  type GetLabelsResponse = js.Array[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata]
  
  type GetNotificationsCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* notifications */ js.Array[typingsSlinky.googleCloudStorage.notificationMod.Notification] | scala.Null, 
    /* apiResponse */ typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata, 
    scala.Unit
  ]
  
  type GetNotificationsResponse = js.Tuple2[
    js.Array[typingsSlinky.googleCloudStorage.notificationMod.Notification], 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type Labels = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type MakeAllFilesPublicPrivateCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | js.Array[js.Error] | scala.Null], 
    /* files */ js.UndefOr[js.Array[typingsSlinky.googleCloudStorage.fileMod.File]], 
    scala.Unit
  ]
  
  type MakeAllFilesPublicPrivateResponse = js.Array[js.Array[typingsSlinky.googleCloudStorage.fileMod.File]]
  
  type MakeBucketPrivateCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* files */ js.UndefOr[js.Array[typingsSlinky.googleCloudStorage.fileMod.File]], 
    scala.Unit
  ]
  
  type MakeBucketPrivateResponse = js.Array[js.Array[typingsSlinky.googleCloudStorage.fileMod.File]]
  
  type MakeBucketPublicCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* files */ js.UndefOr[js.Array[typingsSlinky.googleCloudStorage.fileMod.File]], 
    scala.Unit
  ]
  
  type MakeBucketPublicResponse = js.Array[js.Array[typingsSlinky.googleCloudStorage.fileMod.File]]
  
  type SetBucketMetadataCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* metadata */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type SetBucketMetadataResponse = js.Array[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata]
  
  type SetBucketStorageClassCallback = js.Function1[/* err */ js.UndefOr[js.Error | scala.Null], scala.Unit]
  
  type SetLabelsCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* metadata */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type SetLabelsResponse = js.Array[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata]
  
  type UploadCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* file */ js.UndefOr[typingsSlinky.googleCloudStorage.fileMod.File | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type UploadResponse = js.Tuple2[
    typingsSlinky.googleCloudStorage.fileMod.File, 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
}
