package typingsSlinky.rcNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object notificationMod {
  type HolderReadyCallback = js.Function2[
    /* div */ org.scalajs.dom.raw.HTMLDivElement, 
    /* noticeProps */ typingsSlinky.rcNotification.NoticePropskeyKey, 
    scala.Unit
  ]
  type NoticeFunc = js.Function1[
    /* noticeProps */ typingsSlinky.rcNotification.notificationMod.NoticeContent, 
    scala.Unit
  ]
}
