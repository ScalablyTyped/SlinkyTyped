package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxOverlay extends Widget {
  
  /**
    * [descr:dxOverlay.content()]
    */
  def content(): dxElement = js.native
  
  /**
    * [descr:dxOverlay.hide()]
    */
  def hide(): Promise[Boolean] with JQueryPromise[Boolean] = js.native
  
  /**
    * [descr:dxOverlay.show()]
    */
  def show(): Promise[Boolean] with JQueryPromise[Boolean] = js.native
  
  /**
    * [descr:dxOverlay.toggle(showing)]
    */
  def toggle(showing: Boolean): Promise[Boolean] with JQueryPromise[Boolean] = js.native
}
