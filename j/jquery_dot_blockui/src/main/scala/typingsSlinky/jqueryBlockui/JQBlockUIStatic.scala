package typingsSlinky.jqueryBlockui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQBlockUIStatic extends js.Object {
  
  /** block user activity for the page */
  def apply(): Unit = js.native
  /**
    * block user activity for the page
    * @param options options 
    */
  def apply(option: JQBlockUIOptions): Unit = js.native
  
  /** default options */
  var defaults: js.UndefOr[JQBlockUIOptions] = js.native
}
