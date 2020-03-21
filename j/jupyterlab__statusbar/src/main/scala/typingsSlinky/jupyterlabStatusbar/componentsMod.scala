package typingsSlinky.jupyterlabStatusbar

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.facade.ReactElement
import typingsSlinky.jupyterlabStatusbar.groupMod.GroupItem.IProps
import typingsSlinky.jupyterlabStatusbar.hoverMod.Popup.IOptions
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar/lib/components", JSImport.Namespace)
@js.native
object componentsMod extends js.Object {
  @js.native
  class Popup protected ()
    extends typingsSlinky.jupyterlabStatusbar.hoverMod.Popup {
    /**
      * Construct a new Popup.
      */
    def this(options: IOptions) = this()
  }
  
  def showPopup(options: IOptions): typingsSlinky.jupyterlabStatusbar.hoverMod.Popup = js.native
  @js.native
  object GroupItem extends js.Object {
    def apply(props: IProps with HTMLAttributes[HTMLDivElement]): ReactElement = js.native
  }
  
  @js.native
  object ProgressBar extends js.Object {
    def apply(props: typingsSlinky.jupyterlabStatusbar.progressBarMod.ProgressBar.IProps): ReactElement = js.native
  }
  
  @js.native
  object TextItem extends js.Object {
    def apply(
      props: typingsSlinky.jupyterlabStatusbar.textMod.TextItem.IProps with HTMLAttributes[HTMLSpanElement]
    ): ReactElement = js.native
  }
  
}

