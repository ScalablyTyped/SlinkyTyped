package typingsSlinky.blueprintjsCore.mod

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.contextMenuMod.IOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ContextMenu {
  
  @JSImport("@blueprintjs/core", "ContextMenu.hide")
  @js.native
  def hide(): Unit = js.native
  
  @JSImport("@blueprintjs/core", "ContextMenu.isOpen")
  @js.native
  def isOpen(): Boolean = js.native
  
  @JSImport("@blueprintjs/core", "ContextMenu.show")
  @js.native
  def show(menu: ReactElement, offset: IOffset): Unit = js.native
  @JSImport("@blueprintjs/core", "ContextMenu.show")
  @js.native
  def show(menu: ReactElement, offset: IOffset, onClose: js.UndefOr[scala.Nothing], isDarkTheme: Boolean): Unit = js.native
  @JSImport("@blueprintjs/core", "ContextMenu.show")
  @js.native
  def show(menu: ReactElement, offset: IOffset, onClose: js.Function0[Unit]): Unit = js.native
  @JSImport("@blueprintjs/core", "ContextMenu.show")
  @js.native
  def show(menu: ReactElement, offset: IOffset, onClose: js.Function0[Unit], isDarkTheme: Boolean): Unit = js.native
}
