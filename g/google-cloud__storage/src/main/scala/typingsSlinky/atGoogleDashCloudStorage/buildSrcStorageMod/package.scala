package typingsSlinky.atGoogleDashCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcStorageMod {
  import typingsSlinky.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Metadata
  import typingsSlinky.atGoogleDashCloudStorage.buildSrcBucketMod.Bucket
  import typingsSlinky.atGoogleDashCloudStorage.buildSrcHmacKeyMod.HmacKey

  type BucketCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* bucket */ js.UndefOr[Bucket | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type CreateBucketResponse = js.Tuple2[Bucket, Metadata]
  type CreateHmacKeyCallback = js.Function4[
    /* err */ js.Error | Null, 
    /* hmacKey */ js.UndefOr[HmacKey | Null], 
    /* secret */ js.UndefOr[String | Null], 
    /* apiResponse */ js.UndefOr[HmacKeyResourceResponse], 
    Unit
  ]
  type CreateHmacKeyResponse = js.Tuple3[HmacKey, String, HmacKeyResourceResponse]
  type GetBucketsCallback = js.Function4[
    /* err */ js.Error | Null, 
    /* buckets */ js.Array[Bucket], 
    /* nextQuery */ js.UndefOr[js.Object], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type GetBucketsResponse = js.Tuple3[js.Array[Bucket], js.Object, Metadata]
  type GetHmacKeysCallback = js.Function4[
    /* err */ js.Error | Null, 
    /* hmacKeys */ js.Array[HmacKey] | Null, 
    /* nextQuery */ js.UndefOr[js.Object], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type GetHmacKeysResponse = js.Array[js.Array[HmacKey]]
  type GetServiceAccountCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* serviceAccount */ js.UndefOr[ServiceAccount], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type GetServiceAccountResponse = js.Tuple2[ServiceAccount, Metadata]
}
