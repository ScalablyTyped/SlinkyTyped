package typingsSlinky.minio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ItemBucketMetadata = org.scalablytyped.runtime.StringDictionary[js.Any]
  type NoResultCallback = js.Function1[/* error */ js.Error | scala.Null, scala.Unit]
  type ResultCallback[T] = js.Function2[/* error */ js.Error | scala.Null, /* result */ T, scala.Unit]
}
