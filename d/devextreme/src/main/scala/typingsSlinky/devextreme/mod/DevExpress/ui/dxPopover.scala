package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.mod._Global_.JQuery
import typingsSlinky.devextreme.mod._Global_.JQueryPromise
import typingsSlinky.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPopover extends dxOverlay {
  /** Shows the widget for a target element. */
  def show(target: String): Promise[Boolean] with JQueryPromise[Boolean] = js.native
  def show(target: JQuery): Promise[Boolean] with JQueryPromise[Boolean] = js.native
  def show(target: Element): Promise[Boolean] with JQueryPromise[Boolean] = js.native
}

