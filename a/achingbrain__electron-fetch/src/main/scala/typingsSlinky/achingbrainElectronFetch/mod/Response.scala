package typingsSlinky.achingbrainElectronFetch.mod

import org.scalajs.dom.experimental.ResponseInit
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@achingbrain/electron-fetch", "Response")
@js.native
class Response protected () extends Body {
  def this(body: BodyInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
  
  val body: Readable | String = js.native
  
  val headers: Headers = js.native
  
  val ok: Boolean = js.native
  
  val status: Double = js.native
  
  val statusText: String = js.native
  
  val url: String = js.native
}
