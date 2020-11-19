package typingsSlinky.rnFetchBlob.mod

import org.scalajs.dom.raw.Event
import typingsSlinky.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolyfillFileReader extends EventTarget {
  
  def abort(): Unit = js.native
  
  var isRNFBPolyFill: Boolean = js.native
  
  def onabort(e: Event): Unit = js.native
  
  def onerror(e: Event): Unit = js.native
  
  def onload(e: Event): Unit = js.native
  
  def onloadend(e: Event): Unit = js.native
  
  def onloadstart(e: Event): Unit = js.native
  
  def onprogress(e: Event): Unit = js.native
  
  def readAsArrayBuffer(b: PolyfillBlob): Unit = js.native
  
  def readAsBinaryString(b: PolyfillBlob): Unit = js.native
  
  def readAsDataURL(b: PolyfillBlob): Unit = js.native
  
  def readAsText(b: PolyfillBlob): Unit = js.native
  def readAsText(b: PolyfillBlob, label: String): Unit = js.native
  
  var readyState: Double = js.native
  
  var result: Double = js.native
}
@JSImport("rn-fetch-blob", "PolyfillFileReader")
@js.native
object PolyfillFileReader extends js.Object {
  
  val DONE: Double = js.native
  
  val EMPTY: Double = js.native
  
  val LOADING: Double = js.native
}
