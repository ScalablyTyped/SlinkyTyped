package typingsSlinky.atGoogleDashCloudStorage.buildSrcBucketMod

import typingsSlinky.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.DeleteCallback
import typingsSlinky.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Metadata
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBucketCallback extends DeleteCallback {
  def apply(err: Null, apiResponse: Metadata): Unit = js.native
  def apply(err: Error, apiResponse: Metadata): Unit = js.native
}

