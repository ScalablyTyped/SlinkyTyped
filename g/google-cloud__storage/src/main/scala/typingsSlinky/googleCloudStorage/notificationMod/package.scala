package typingsSlinky.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object notificationMod {
  
  type DeleteNotificationCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type GetNotificationCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* notification */ js.UndefOr[typingsSlinky.googleCloudStorage.notificationMod.Notification | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type GetNotificationMetadataCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* metadata */ js.UndefOr[typingsSlinky.googleCloudCommon.utilMod.ResponseBody], 
    /* apiResponse */ js.UndefOr[typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  
  type GetNotificationMetadataResponse = js.Tuple2[
    typingsSlinky.googleCloudCommon.utilMod.ResponseBody, 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
  
  type GetNotificationResponse = js.Tuple2[
    typingsSlinky.googleCloudStorage.notificationMod.Notification, 
    typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
  ]
}
