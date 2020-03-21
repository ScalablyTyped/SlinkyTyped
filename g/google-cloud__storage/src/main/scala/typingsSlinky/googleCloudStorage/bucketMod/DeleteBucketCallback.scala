package typingsSlinky.googleCloudStorage.bucketMod

import typingsSlinky.googleCloudCommon.serviceObjectMod.DeleteCallback
import typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketCallback extends DeleteCallback {
  def apply(err: Null, apiResponse: Metadata): Unit = js.native
  def apply(err: Error, apiResponse: Metadata): Unit = js.native
}

