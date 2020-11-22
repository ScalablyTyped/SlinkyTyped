package typingsSlinky.naverWhale

import typingsSlinky.naverWhale.whale.contentSettings.ScopeEnum
import typingsSlinky.naverWhale.whale.cookies.SameSiteStatus
import typingsSlinky.naverWhale.whale.idle.IdleState
import typingsSlinky.naverWhale.whale.omnibox.OnInputEnteredDisposition
import typingsSlinky.naverWhale.whale.runtime.RequestUpdateCheckStatus
import typingsSlinky.naverWhale.whale.storage.AreaName
import typingsSlinky.naverWhale.whale.webRequest.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object naverWhaleStrings {
  
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  
  @scala.inline
  def allow: allow = "allow".asInstanceOf[allow]
  
  @scala.inline
  def app: app = "app".asInstanceOf[app]
  
  @scala.inline
  def ask: ask = "ask".asInstanceOf[ask]
  
  @scala.inline
  def block: block = "block".asInstanceOf[block]
  
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @scala.inline
  def csp_report: csp_report = "csp_report".asInstanceOf[csp_report]
  
  @scala.inline
  def currentTab: currentTab = "currentTab".asInstanceOf[currentTab]
  
  @scala.inline
  def detect_important_content: detect_important_content = "detect_important_content".asInstanceOf[detect_important_content]
  
  @scala.inline
  def devtools: devtools = "devtools".asInstanceOf[devtools]
  
  @scala.inline
  def font: font = "font".asInstanceOf[font]
  
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  
  @scala.inline
  def incognito_session_only: incognito_session_only = "incognito_session_only".asInstanceOf[incognito_session_only]
  
  @scala.inline
  def lax: lax = "lax".asInstanceOf[lax]
  
  @scala.inline
  def loading: loading = "loading".asInstanceOf[loading]
  
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  
  @scala.inline
  def locked: locked = "locked".asInstanceOf[locked]
  
  @scala.inline
  def main_frame: main_frame = "main_frame".asInstanceOf[main_frame]
  
  @scala.inline
  def managed: managed = "managed".asInstanceOf[managed]
  
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  
  @scala.inline
  def newBackgroundTab: newBackgroundTab = "newBackgroundTab".asInstanceOf[newBackgroundTab]
  
  @scala.inline
  def newForegroundTab: newForegroundTab = "newForegroundTab".asInstanceOf[newForegroundTab]
  
  @scala.inline
  def no_restriction: no_restriction = "no_restriction".asInstanceOf[no_restriction]
  
  @scala.inline
  def no_update: no_update = "no_update".asInstanceOf[no_update]
  
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  
  @scala.inline
  def panel: panel = "panel".asInstanceOf[panel]
  
  @scala.inline
  def ping: ping = "ping".asInstanceOf[ping]
  
  @scala.inline
  def popup: popup = "popup".asInstanceOf[popup]
  
  @scala.inline
  def regular: regular = "regular".asInstanceOf[regular]
  
  @scala.inline
  def script: script = "script".asInstanceOf[script]
  
  @scala.inline
  def session_only: session_only = "session_only".asInstanceOf[session_only]
  
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  
  @scala.inline
  def stylesheet: stylesheet = "stylesheet".asInstanceOf[stylesheet]
  
  @scala.inline
  def sub_frame: sub_frame = "sub_frame".asInstanceOf[sub_frame]
  
  @scala.inline
  def sync: sync = "sync".asInstanceOf[sync]
  
  @scala.inline
  def throttled: throttled = "throttled".asInstanceOf[throttled]
  
  @scala.inline
  def unspecified: unspecified = "unspecified".asInstanceOf[unspecified]
  
  @scala.inline
  def update_available: update_available = "update_available".asInstanceOf[update_available]
  
  @scala.inline
  def websocket: websocket = "websocket".asInstanceOf[websocket]
  
  @scala.inline
  def xmlhttprequest: xmlhttprequest = "xmlhttprequest".asInstanceOf[xmlhttprequest]
  
  @js.native
  sealed trait active extends IdleState
  
  @js.native
  sealed trait allow extends js.Object
  
  @js.native
  sealed trait app extends js.Object
  
  @js.native
  sealed trait ask extends js.Object
  
  @js.native
  sealed trait block extends js.Object
  
  @js.native
  sealed trait complete extends js.Object
  
  @js.native
  sealed trait csp_report extends ResourceType
  
  @js.native
  sealed trait currentTab extends OnInputEnteredDisposition
  
  @js.native
  sealed trait detect_important_content extends js.Object
  
  @js.native
  sealed trait devtools extends js.Object
  
  @js.native
  sealed trait font extends ResourceType
  
  @js.native
  sealed trait idle extends IdleState
  
  @js.native
  sealed trait image extends ResourceType
  
  @js.native
  sealed trait incognito_session_only extends ScopeEnum
  
  @js.native
  sealed trait lax extends SameSiteStatus
  
  @js.native
  sealed trait loading extends js.Object
  
  @js.native
  sealed trait local extends AreaName
  
  @js.native
  sealed trait locked extends IdleState
  
  @js.native
  sealed trait main_frame extends ResourceType
  
  @js.native
  sealed trait managed extends AreaName
  
  @js.native
  sealed trait media extends ResourceType
  
  @js.native
  sealed trait newBackgroundTab extends OnInputEnteredDisposition
  
  @js.native
  sealed trait newForegroundTab extends OnInputEnteredDisposition
  
  @js.native
  sealed trait no_restriction extends SameSiteStatus
  
  @js.native
  sealed trait no_update extends RequestUpdateCheckStatus
  
  @js.native
  sealed trait normal extends js.Object
  
  @js.native
  sealed trait `object` extends ResourceType
  
  @js.native
  sealed trait other extends ResourceType
  
  @js.native
  sealed trait panel extends js.Object
  
  @js.native
  sealed trait ping extends ResourceType
  
  @js.native
  sealed trait popup extends js.Object
  
  @js.native
  sealed trait regular extends ScopeEnum
  
  @js.native
  sealed trait script extends ResourceType
  
  @js.native
  sealed trait session_only extends js.Object
  
  @js.native
  sealed trait strict extends SameSiteStatus
  
  @js.native
  sealed trait stylesheet extends ResourceType
  
  @js.native
  sealed trait sub_frame extends ResourceType
  
  @js.native
  sealed trait sync extends AreaName
  
  @js.native
  sealed trait throttled extends RequestUpdateCheckStatus
  
  @js.native
  sealed trait unspecified extends SameSiteStatus
  
  @js.native
  sealed trait update_available extends RequestUpdateCheckStatus
  
  @js.native
  sealed trait websocket extends ResourceType
  
  @js.native
  sealed trait xmlhttprequest extends ResourceType
}
