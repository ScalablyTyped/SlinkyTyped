package typingsSlinky.jcanvas

import org.scalajs.dom.raw.Window
import typingsSlinky.jquery.JQueryStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// note this declare module is necessary to tell TypeScript not to interpret the whole file as one module;
// the JQuery interface below should extend the existing jquery module interface
@JSImport("jcanvas", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(jquery: JQueryStatic, window: Window): Unit = js.native
}
