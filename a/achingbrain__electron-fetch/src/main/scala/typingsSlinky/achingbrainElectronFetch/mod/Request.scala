package typingsSlinky.achingbrainElectronFetch.mod

import org.scalajs.dom.experimental.AbortSignal
import org.scalajs.dom.experimental.RequestRedirect
import typingsSlinky.electron.mod.Session_
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@achingbrain/electron-fetch", "Request")
@js.native
class Request protected () extends Body {
  def this(input: RequestInfo) = this()
  def this(input: RequestInfo, init: RequestInit) = this()
  
  val body: Readable = js.native
  
  // (/!\ only works when running on Node.js)
  var counter: Double = js.native
  
  ////////////////////////////////////////////////////////////////////////////
  // The following properties are electron-fetch extensions
  // (/!\ only works when running on Node.js) maximum redirect count. 0 to not follow redirect
  var follow: Double = js.native
  
  val headers: Headers = js.native
  
  val method: String = js.native
  
  val redirect: RequestRedirect = js.native
  
  // (/!\ only works when running on Electron)
  var session: js.UndefOr[Session_] = js.native
  
  val signal: AbortSignal = js.native
  
  val url: String = js.native
  
  // (/!\ only works when running on Electron, throws when set to true on Node.js)
  var useElectronNet: Boolean = js.native
  
  // (/!\ only works when running on Electron)
  var useSessionCookies: js.UndefOr[Boolean] = js.native
}
