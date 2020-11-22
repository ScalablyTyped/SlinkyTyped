package typingsSlinky.devextreme.mod.default.ui

import typingsSlinky.devextreme.anon.Compile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "ui")
@js.native
object ^ extends js.Object {
  
  var dxItem: js.Any = js.native
  
  /**
    * [descr:ui.notify(message,type,displayTime)]
    */
  def notify(message: String): Unit = js.native
  def notify(message: String, `type`: js.UndefOr[scala.Nothing], displayTime: Double): Unit = js.native
  def notify(message: String, `type`: String): Unit = js.native
  def notify(message: String, `type`: String, displayTime: Double): Unit = js.native
  /**
    * [descr:ui.notify(options,type,displayTime)]
    */
  def notify(options: js.Any): Unit = js.native
  def notify(options: js.Any, `type`: js.UndefOr[scala.Nothing], displayTime: Double): Unit = js.native
  def notify(options: js.Any, `type`: String): Unit = js.native
  def notify(options: js.Any, `type`: String, displayTime: Double): Unit = js.native
  
  /**
    * [descr:ui.repaintFloatingActionButton()]
    */
  def repaintFloatingActionButton(): Unit = js.native
  
  /**
    * [descr:ui.setTemplateEngine(name)]
    */
  def setTemplateEngine(templateEngineName: String): Unit = js.native
  /**
    * [descr:ui.setTemplateEngine(options)]
    */
  def setTemplateEngine(templateEngineOptions: Compile): Unit = js.native
}
