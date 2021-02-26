package typingsSlinky.jupyterlabStatusbar

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.facade.ReactElement
import typingsSlinky.jupyterlabStatusbar.groupMod.GroupItem.IProps
import typingsSlinky.jupyterlabStatusbar.hoverMod.Popup.IOptions
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  object GroupItem {
    
    @JSImport("@jupyterlab/statusbar/lib/components", "GroupItem")
    @js.native
    def apply(props: IProps with HTMLAttributes[HTMLDivElement]): ReactElement = js.native
  }
  
  @JSImport("@jupyterlab/statusbar/lib/components", "Popup")
  @js.native
  class Popup protected ()
    extends typingsSlinky.jupyterlabStatusbar.hoverMod.Popup {
    /**
      * Construct a new Popup.
      */
    def this(options: IOptions) = this()
  }
  
  object ProgressBar {
    
    @JSImport("@jupyterlab/statusbar/lib/components", "ProgressBar")
    @js.native
    def apply(props: typingsSlinky.jupyterlabStatusbar.progressBarMod.ProgressBar.IProps): ReactElement = js.native
  }
  
  object TextItem {
    
    @JSImport("@jupyterlab/statusbar/lib/components", "TextItem")
    @js.native
    def apply(
      props: typingsSlinky.jupyterlabStatusbar.textMod.TextItem.IProps with HTMLAttributes[HTMLSpanElement]
    ): ReactElement = js.native
  }
  
  @JSImport("@jupyterlab/statusbar/lib/components", "showPopup")
  @js.native
  def showPopup(options: IOptions): typingsSlinky.jupyterlabStatusbar.hoverMod.Popup = js.native
}
