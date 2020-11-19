package typingsSlinky.favicoJs.favicojs

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Favico extends js.Object {
  
  def badge(number: Double): Unit = js.native
  def badge(number: Double, animation: String): Unit = js.native
  def badge(number: Double, opts: FavicoJsOptions): Unit = js.native
  
  def image(imageElement: HTMLElement): Unit = js.native
  
  def reset(): Unit = js.native
  
  def video(imageElement: HTMLElement): Unit = js.native
  
  def webcam(): Unit = js.native
}
