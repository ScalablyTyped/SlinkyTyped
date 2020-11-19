package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxAccordion extends CollectionWidget {
  
  /** @name dxAccordion.collapseItem(index) */
  def collapseItem(index: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /** @name dxAccordion.expandItem(index) */
  def expandItem(index: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /** @name dxAccordion.updateDimensions() */
  def updateDimensions(): Promise[Unit] with JQueryPromise[Unit] = js.native
}
