package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.mod.global.JQueryPromise
import typingsSlinky.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFileManager extends Widget {
  
  /**
    * [descr:dxFileManager.getCurrentDirectory()]
    */
  def getCurrentDirectory(): js.Any = js.native
  
  /**
    * [descr:dxFileManager.getSelectedItems()]
    */
  def getSelectedItems(): js.Array[_] = js.native
  
  /**
    * [descr:dxFileManager.refresh()]
    */
  def refresh(): Promise[_] with JQueryPromise[_] = js.native
}
