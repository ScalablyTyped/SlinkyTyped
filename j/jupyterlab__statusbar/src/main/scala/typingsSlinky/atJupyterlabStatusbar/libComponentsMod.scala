package typingsSlinky.atJupyterlabStatusbar

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.facade.ReactElement
import typingsSlinky.atJupyterlabStatusbar.libComponentsGroupMod.GroupItem.IProps
import typingsSlinky.atJupyterlabStatusbar.libComponentsHoverMod.Popup.IOptions
import typingsSlinky.react.reactMod.HTMLAttributes
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar/lib/components", JSImport.Namespace)
@js.native
object libComponentsMod extends js.Object {
  @js.native
  class Popup protected ()
    extends typingsSlinky.atJupyterlabStatusbar.libComponentsHoverMod.Popup {
    /**
      * Construct a new Popup.
      */
    def this(options: IOptions) = this()
  }
  
  def showPopup(options: IOptions): typingsSlinky.atJupyterlabStatusbar.libComponentsHoverMod.Popup = js.native
  @js.native
  object GroupItem extends js.Object {
    def apply(props: IProps with HTMLAttributes[HTMLDivElement]): ReactElement = js.native
  }
  
  @js.native
  object ProgressBar extends js.Object {
    def apply(props: typingsSlinky.atJupyterlabStatusbar.libComponentsProgressBarMod.ProgressBar.IProps): Element = js.native
  }
  
  @js.native
  object TextItem extends js.Object {
    def apply(
      props: typingsSlinky.atJupyterlabStatusbar.libComponentsTextMod.TextItem.IProps with HTMLAttributes[HTMLSpanElement]
    ): ReactElement = js.native
  }
  
}

