package typingsSlinky.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storageMod {
  type BucketCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* bucket */ js.UndefOr[typingsSlinky.googleCloudStorage.bucketMod.Bucket | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type CreateBucketResponse = js.Tuple2[
    typingsSlinky.googleCloudStorage.bucketMod.Bucket, 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
  type CreateHmacKeyCallback = js.Function4[
    /* err */ js.Error | scala.Null, 
    /* hmacKey */ js.UndefOr[typingsSlinky.googleCloudStorage.hmacKeyMod.HmacKey | scala.Null], 
    /* secret */ js.UndefOr[java.lang.String | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudStorage.storageMod.HmacKeyResourceResponse], 
    scala.Unit
  ]
  type CreateHmacKeyResponse = js.Tuple3[
    typingsSlinky.googleCloudStorage.hmacKeyMod.HmacKey, 
    java.lang.String, 
    typingsSlinky.googleCloudStorage.storageMod.HmacKeyResourceResponse
  ]
  type GetBucketsCallback = js.Function4[
    /* err */ js.Error | scala.Null, 
    /* buckets */ js.Array[typingsSlinky.googleCloudStorage.bucketMod.Bucket], 
    /* nextQuery */ js.UndefOr[js.Object], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type GetBucketsResponse = js.Tuple3[
    js.Array[typingsSlinky.googleCloudStorage.bucketMod.Bucket], 
    js.Object, 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
  type GetHmacKeysCallback = js.Function4[
    /* err */ js.Error | scala.Null, 
    /* hmacKeys */ js.Array[typingsSlinky.googleCloudStorage.hmacKeyMod.HmacKey] | scala.Null, 
    /* nextQuery */ js.UndefOr[js.Object], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type GetHmacKeysResponse = js.Array[js.Array[typingsSlinky.googleCloudStorage.hmacKeyMod.HmacKey]]
  type GetServiceAccountCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* serviceAccount */ js.UndefOr[typingsSlinky.googleCloudStorage.storageMod.ServiceAccount], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type GetServiceAccountResponse = js.Tuple2[
    typingsSlinky.googleCloudStorage.storageMod.ServiceAccount, 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
}
