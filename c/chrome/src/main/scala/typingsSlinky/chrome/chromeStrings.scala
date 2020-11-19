package typingsSlinky.chrome

import typingsSlinky.chrome.chrome.contentSettings.ScopeEnum
import typingsSlinky.chrome.chrome.cookies.SameSiteStatus
import typingsSlinky.chrome.chrome.idle.IdleState
import typingsSlinky.chrome.chrome.input.ime.AssistiveWindowButton
import typingsSlinky.chrome.chrome.loginState.ProfileType
import typingsSlinky.chrome.chrome.loginState.SessionState
import typingsSlinky.chrome.chrome.omnibox.OnInputEnteredDisposition
import typingsSlinky.chrome.chrome.runtime.RequestUpdateCheckStatus
import typingsSlinky.chrome.chrome.webRequest.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromeStrings {
  
  @scala.inline
  def IN_LOCK_SCREEN: IN_LOCK_SCREEN = "IN_LOCK_SCREEN".asInstanceOf[IN_LOCK_SCREEN]
  
  @scala.inline
  def IN_LOGIN_SCREEN: IN_LOGIN_SCREEN = "IN_LOGIN_SCREEN".asInstanceOf[IN_LOGIN_SCREEN]
  
  @scala.inline
  def IN_OOBE_SCREEN: IN_OOBE_SCREEN = "IN_OOBE_SCREEN".asInstanceOf[IN_OOBE_SCREEN]
  
  @scala.inline
  def IN_SESSION: IN_SESSION = "IN_SESSION".asInstanceOf[IN_SESSION]
  
  @scala.inline
  def SIGNIN_PROFILE: SIGNIN_PROFILE = "SIGNIN_PROFILE".asInstanceOf[SIGNIN_PROFILE]
  
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @scala.inline
  def USER_PROFILE: USER_PROFILE = "USER_PROFILE".asInstanceOf[USER_PROFILE]
  
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  
  @scala.inline
  def addToDictionary: addToDictionary = "addToDictionary".asInstanceOf[addToDictionary]
  
  @scala.inline
  def allow: allow = "allow".asInstanceOf[allow]
  
  @scala.inline
  def app: app = "app".asInstanceOf[app]
  
  @scala.inline
  def ask: ask = "ask".asInstanceOf[ask]
  
  @scala.inline
  def block: block = "block".asInstanceOf[block]
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @scala.inline
  def break: break = "break".asInstanceOf[break]
  
  @scala.inline
  def buffer_overflow: buffer_overflow = "buffer_overflow".asInstanceOf[buffer_overflow]
  
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @scala.inline
  def csp_report: csp_report = "csp_report".asInstanceOf[csp_report]
  
  @scala.inline
  def currentTab: currentTab = "currentTab".asInstanceOf[currentTab]
  
  @scala.inline
  def dark: dark = "dark".asInstanceOf[dark]
  
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @scala.inline
  def detect_important_content: detect_important_content = "detect_important_content".asInstanceOf[detect_important_content]
  
  @scala.inline
  def device_lost: device_lost = "device_lost".asInstanceOf[device_lost]
  
  @scala.inline
  def devtools: devtools = "devtools".asInstanceOf[devtools]
  
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @scala.inline
  def eight: eight = "eight".asInstanceOf[eight]
  
  @scala.inline
  def even: even = "even".asInstanceOf[even]
  
  @scala.inline
  def font: font = "font".asInstanceOf[font]
  
  @scala.inline
  def frame_error: frame_error = "frame_error".asInstanceOf[frame_error]
  
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  
  @scala.inline
  def incognito_session_only: incognito_session_only = "incognito_session_only".asInstanceOf[incognito_session_only]
  
  @scala.inline
  def lax: lax = "lax".asInstanceOf[lax]
  
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @scala.inline
  def loading: loading = "loading".asInstanceOf[loading]
  
  @scala.inline
  def locked: locked = "locked".asInstanceOf[locked]
  
  @scala.inline
  def main_frame: main_frame = "main_frame".asInstanceOf[main_frame]
  
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  
  @scala.inline
  def mixed: mixed = "mixed".asInstanceOf[mixed]
  
  @scala.inline
  def newBackgroundTab: newBackgroundTab = "newBackgroundTab".asInstanceOf[newBackgroundTab]
  
  @scala.inline
  def newForegroundTab: newForegroundTab = "newForegroundTab".asInstanceOf[newForegroundTab]
  
  @scala.inline
  def no: no = "no".asInstanceOf[no]
  
  @scala.inline
  def no_restriction: no_restriction = "no_restriction".asInstanceOf[no_restriction]
  
  @scala.inline
  def no_update: no_update = "no_update".asInstanceOf[no_update]
  
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  
  @scala.inline
  def odd: odd = "odd".asInstanceOf[odd]
  
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  
  @scala.inline
  def one: one = "one".asInstanceOf[one]
  
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  
  @scala.inline
  def overrun: overrun = "overrun".asInstanceOf[overrun]
  
  @scala.inline
  def panel: panel = "panel".asInstanceOf[panel]
  
  @scala.inline
  def parity_error: parity_error = "parity_error".asInstanceOf[parity_error]
  
  @scala.inline
  def ping: ping = "ping".asInstanceOf[ping]
  
  @scala.inline
  def popup: popup = "popup".asInstanceOf[popup]
  
  @scala.inline
  def regular: regular = "regular".asInstanceOf[regular]
  
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @scala.inline
  def script: script = "script".asInstanceOf[script]
  
  @scala.inline
  def session_only: session_only = "session_only".asInstanceOf[session_only]
  
  @scala.inline
  def seven: seven = "seven".asInstanceOf[seven]
  
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  
  @scala.inline
  def stylesheet: stylesheet = "stylesheet".asInstanceOf[stylesheet]
  
  @scala.inline
  def sub_frame: sub_frame = "sub_frame".asInstanceOf[sub_frame]
  
  @scala.inline
  def system_error: system_error = "system_error".asInstanceOf[system_error]
  
  @scala.inline
  def throttled: throttled = "throttled".asInstanceOf[throttled]
  
  @scala.inline
  def timeout: timeout = "timeout".asInstanceOf[timeout]
  
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @scala.inline
  def two: two = "two".asInstanceOf[two]
  
  @scala.inline
  def undo: undo = "undo".asInstanceOf[undo]
  
  @scala.inline
  def unspecified: unspecified = "unspecified".asInstanceOf[unspecified]
  
  @scala.inline
  def update_available: update_available = "update_available".asInstanceOf[update_available]
  
  @scala.inline
  def websocket: websocket = "websocket".asInstanceOf[websocket]
  
  @scala.inline
  def xmlhttprequest: xmlhttprequest = "xmlhttprequest".asInstanceOf[xmlhttprequest]
  
  @js.native
  sealed trait IN_LOCK_SCREEN extends SessionState
  
  @js.native
  sealed trait IN_LOGIN_SCREEN extends SessionState
  
  @js.native
  sealed trait IN_OOBE_SCREEN extends SessionState
  
  @js.native
  sealed trait IN_SESSION extends SessionState
  
  @js.native
  sealed trait SIGNIN_PROFILE extends ProfileType
  
  @js.native
  sealed trait UNKNOWN extends SessionState
  
  @js.native
  sealed trait USER_PROFILE extends ProfileType
  
  @js.native
  sealed trait active extends IdleState
  
  @js.native
  sealed trait addToDictionary extends AssistiveWindowButton
  
  @js.native
  sealed trait allow extends js.Object
  
  @js.native
  sealed trait app extends js.Object
  
  @js.native
  sealed trait ask extends js.Object
  
  @js.native
  sealed trait block extends js.Object
  
  @js.native
  sealed trait bottom extends js.Object
  
  @js.native
  sealed trait break extends js.Object
  
  @js.native
  sealed trait buffer_overflow extends js.Object
  
  @js.native
  sealed trait complete extends js.Object
  
  @js.native
  sealed trait csp_report extends ResourceType
  
  @js.native
  sealed trait currentTab extends OnInputEnteredDisposition
  
  @js.native
  sealed trait dark extends js.Object
  
  @js.native
  sealed trait default extends js.Object
  
  @js.native
  sealed trait detect_important_content extends js.Object
  
  @js.native
  sealed trait device_lost extends js.Object
  
  @js.native
  sealed trait devtools extends js.Object
  
  @js.native
  sealed trait disconnected extends js.Object
  
  @js.native
  sealed trait eight extends js.Object
  
  @js.native
  sealed trait even extends js.Object
  
  @js.native
  sealed trait font extends ResourceType
  
  @js.native
  sealed trait frame_error extends js.Object
  
  @js.native
  sealed trait idle extends IdleState
  
  @js.native
  sealed trait image extends ResourceType
  
  @js.native
  sealed trait incognito_session_only extends ScopeEnum
  
  @js.native
  sealed trait lax extends SameSiteStatus
  
  @js.native
  sealed trait left extends js.Object
  
  @js.native
  sealed trait loading extends js.Object
  
  @js.native
  sealed trait locked extends IdleState
  
  @js.native
  sealed trait main_frame extends ResourceType
  
  @js.native
  sealed trait media extends ResourceType
  
  @js.native
  sealed trait mixed extends js.Object
  
  @js.native
  sealed trait newBackgroundTab extends OnInputEnteredDisposition
  
  @js.native
  sealed trait newForegroundTab extends OnInputEnteredDisposition
  
  @js.native
  sealed trait no extends js.Object
  
  @js.native
  sealed trait no_restriction extends SameSiteStatus
  
  @js.native
  sealed trait no_update extends RequestUpdateCheckStatus
  
  @js.native
  sealed trait normal extends js.Object
  
  @js.native
  sealed trait `object` extends ResourceType
  
  @js.native
  sealed trait odd extends js.Object
  
  @js.native
  sealed trait off extends js.Object
  
  @js.native
  sealed trait one extends js.Object
  
  @js.native
  sealed trait other extends ResourceType
  
  @js.native
  sealed trait overrun extends js.Object
  
  @js.native
  sealed trait panel extends js.Object
  
  @js.native
  sealed trait parity_error extends js.Object
  
  @js.native
  sealed trait ping extends ResourceType
  
  @js.native
  sealed trait popup extends js.Object
  
  @js.native
  sealed trait regular extends ScopeEnum
  
  @js.native
  sealed trait right extends js.Object
  
  @js.native
  sealed trait script extends ResourceType
  
  @js.native
  sealed trait session_only extends js.Object
  
  @js.native
  sealed trait seven extends js.Object
  
  @js.native
  sealed trait strict extends SameSiteStatus
  
  @js.native
  sealed trait stylesheet extends ResourceType
  
  @js.native
  sealed trait sub_frame extends ResourceType
  
  @js.native
  sealed trait system_error extends js.Object
  
  @js.native
  sealed trait throttled extends RequestUpdateCheckStatus
  
  @js.native
  sealed trait timeout extends js.Object
  
  @js.native
  sealed trait top extends js.Object
  
  @js.native
  sealed trait two extends js.Object
  
  @js.native
  sealed trait undo extends AssistiveWindowButton
  
  @js.native
  sealed trait unspecified extends SameSiteStatus
  
  @js.native
  sealed trait update_available extends RequestUpdateCheckStatus
  
  @js.native
  sealed trait websocket extends ResourceType
  
  @js.native
  sealed trait xmlhttprequest extends ResourceType
}
