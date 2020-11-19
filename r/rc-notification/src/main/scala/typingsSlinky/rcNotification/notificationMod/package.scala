package typingsSlinky.rcNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object notificationMod {
  
  type HolderReadyCallback = js.Function2[
    /* div */ org.scalajs.dom.raw.HTMLDivElement, 
    /* noticeProps */ typingsSlinky.rcNotification.anon.NoticePropskeyKey, 
    scala.Unit
  ]
  
  type NoticeFunc = js.Function1[
    /* noticeProps */ typingsSlinky.rcNotification.notificationMod.NoticeContent, 
    scala.Unit
  ]
}
