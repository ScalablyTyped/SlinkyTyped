package typingsSlinky.humaneJs.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Humane extends js.Object {
  
  var addnCls: String = js.native
  
  var baseCls: String = js.native
  
  var clickToClose: Boolean = js.native
  
  var container: Element = js.native
  
  def create(): Humane = js.native
  def create(options: HumaneOptions): Humane = js.native
  
  var error: js.UndefOr[SpawnLogFunction] = js.native
  
  var info: js.UndefOr[SpawnLogFunction] = js.native
  
  def log(message: logMessage): Humane = js.native
  def log(message: logMessage, callback: js.UndefOr[scala.Nothing], options: HumaneMessageOptions): Humane = js.native
  def log(message: logMessage, callback: completionCallback): Humane = js.native
  def log(message: logMessage, callback: completionCallback, options: HumaneMessageOptions): Humane = js.native
  def log(message: logMessage, options: HumaneMessageOptions): Humane = js.native
  
  var queue: js.Array[String] = js.native
  
  def remove(): Unit = js.native
  def remove(cb: completionCallback): Unit = js.native
  
  def spawn(options: HumaneMessageOptions): SpawnLogFunction = js.native
  
  var timeout: Double = js.native
  
  var waitForMove: Boolean = js.native
}
