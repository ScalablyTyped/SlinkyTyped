package typingsSlinky.atGoogleDashCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcNotificationMod {
  import typingsSlinky.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Metadata
  import typingsSlinky.atGoogleDashCloudCommon.buildSrcUtilMod.ResponseBody

  type DeleteNotificationCallback = js.Function2[/* err */ js.Error | Null, /* apiResponse */ js.UndefOr[Metadata], Unit]
  type GetNotificationCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* notification */ js.UndefOr[Notification | Null], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type GetNotificationMetadataCallback = js.Function3[
    /* err */ js.Error | Null, 
    /* metadata */ js.UndefOr[ResponseBody], 
    /* apiResponse */ js.UndefOr[Metadata], 
    Unit
  ]
  type GetNotificationMetadataResponse = js.Tuple2[ResponseBody, Metadata]
  type GetNotificationResponse = js.Tuple2[Notification, Metadata]
}
