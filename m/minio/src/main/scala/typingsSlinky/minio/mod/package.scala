package typingsSlinky.minio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ItemBucketMetadata = org.scalablytyped.runtime.StringDictionary[js.Any]
  type NoResultCallback = js.Function1[/* error */ js.Error | scala.Null, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.minio.minioStrings.`us-east-1`
    - typingsSlinky.minio.minioStrings.`us-west-1`
    - typingsSlinky.minio.minioStrings.`us-west-2`
    - typingsSlinky.minio.minioStrings.`eu-west-1`
    - typingsSlinky.minio.minioStrings.`eu-central-1`
    - typingsSlinky.minio.minioStrings.`ap-southeast-1`
    - typingsSlinky.minio.minioStrings.`ap-northeast-1`
    - typingsSlinky.minio.minioStrings.`ap-southeast-2`
    - typingsSlinky.minio.minioStrings.`sa-east-1`
    - typingsSlinky.minio.minioStrings.`cn-north-1`
    - java.lang.String
  */
  type Region = typingsSlinky.minio.mod._Region | java.lang.String
  type ResultCallback[T] = js.Function2[/* error */ js.Error | scala.Null, /* result */ T, scala.Unit]
}
