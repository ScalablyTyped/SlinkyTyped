package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.mod.global.JQuery
import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxPopover extends dxOverlay {
  
  /**
    * [descr:dxPopover.show(target)]
    */
  def show(target: String): Promise[Boolean] with JQueryPromise[Boolean] = js.native
  def show(target: JQuery): Promise[Boolean] with JQueryPromise[Boolean] = js.native
  def show(target: Element): Promise[Boolean] with JQueryPromise[Boolean] = js.native
}
