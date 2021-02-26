package typingsSlinky.jupyterlabStatusbar

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.facade.ReactElement
import typingsSlinky.jupyterlabStatusbar.groupMod.GroupItem.IProps
import typingsSlinky.jupyterlabStatusbar.kernelStatusMod.KernelStatus.IOptions
import typingsSlinky.jupyterlabStatusbar.statusbarMod.StatusBar
import typingsSlinky.luminoCoreutils.mod.Token
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object GroupItem {
    
    @JSImport("@jupyterlab/statusbar", "GroupItem")
    @js.native
    def apply(props: IProps with HTMLAttributes[HTMLDivElement]): ReactElement = js.native
  }
  
  object IStatusBar extends Shortcut {
    
    @JSImport("@jupyterlab/statusbar", "IStatusBar")
    @js.native
    val ^ : Token[typingsSlinky.jupyterlabStatusbar.tokensMod.IStatusBar] = js.native
    
    type _To = Token[typingsSlinky.jupyterlabStatusbar.tokensMod.IStatusBar]
    
    /* This means you don't have to write `^`, but can instead just say `IStatusBar.foo` */
    override def _to: Token[typingsSlinky.jupyterlabStatusbar.tokensMod.IStatusBar] = ^
  }
  
  @JSImport("@jupyterlab/statusbar", "KernelStatus")
  @js.native
  class KernelStatus protected ()
    extends typingsSlinky.jupyterlabStatusbar.defaultsMod.KernelStatus {
    /**
      * Construct the kernel status widget.
      */
    def this(opts: IOptions) = this()
  }
  object KernelStatus {
    
    /**
      * A VDomModel for the kernel status indicator.
      */
    @JSImport("@jupyterlab/statusbar", "KernelStatus.Model")
    @js.native
    class Model ()
      extends typingsSlinky.jupyterlabStatusbar.defaultsMod.KernelStatus.Model
  }
  
  @JSImport("@jupyterlab/statusbar", "LineCol")
  @js.native
  /**
    * Construct a new LineCol status item.
    */
  class LineCol ()
    extends typingsSlinky.jupyterlabStatusbar.defaultsMod.LineCol
  object LineCol {
    
    /**
      * A VDom model for a status item tracking the line/column of an editor.
      */
    @JSImport("@jupyterlab/statusbar", "LineCol.Model")
    @js.native
    class Model ()
      extends typingsSlinky.jupyterlabStatusbar.defaultsMod.LineCol.Model
  }
  
  @JSImport("@jupyterlab/statusbar", "MemoryUsage")
  @js.native
  /**
    * Construct a new memory usage status item.
    */
  class MemoryUsage ()
    extends typingsSlinky.jupyterlabStatusbar.defaultsMod.MemoryUsage
  object MemoryUsage {
    
    /**
      * A VDomModel for the memory usage status item.
      */
    @JSImport("@jupyterlab/statusbar", "MemoryUsage.Model")
    @js.native
    class Model protected ()
      extends typingsSlinky.jupyterlabStatusbar.defaultsMod.MemoryUsage.Model {
      /**
        * Construct a new memory usage model.
        *
        * @param options: the options for creating the model.
        */
      def this(options: typingsSlinky.jupyterlabStatusbar.memoryUsageMod.MemoryUsage.Model.IOptions) = this()
    }
    /**
      * A namespace for Model statics.
      */
    object Model
  }
  
  @JSImport("@jupyterlab/statusbar", "Popup")
  @js.native
  class Popup protected ()
    extends typingsSlinky.jupyterlabStatusbar.componentsMod.Popup {
    /**
      * Construct a new Popup.
      */
    def this(options: typingsSlinky.jupyterlabStatusbar.hoverMod.Popup.IOptions) = this()
  }
  
  object ProgressBar {
    
    @JSImport("@jupyterlab/statusbar", "ProgressBar")
    @js.native
    def apply(props: typingsSlinky.jupyterlabStatusbar.progressBarMod.ProgressBar.IProps): ReactElement = js.native
  }
  
  @JSImport("@jupyterlab/statusbar", "RunningSessions")
  @js.native
  class RunningSessions protected ()
    extends typingsSlinky.jupyterlabStatusbar.defaultsMod.RunningSessions {
    /**
      * Create a new RunningSessions widget.
      */
    def this(opts: typingsSlinky.jupyterlabStatusbar.runningSessionsMod.RunningSessions.IOptions) = this()
  }
  object RunningSessions {
    
    /**
      * A VDomModel for the RunninSessions status item.
      */
    @JSImport("@jupyterlab/statusbar", "RunningSessions.Model")
    @js.native
    class Model ()
      extends typingsSlinky.jupyterlabStatusbar.defaultsMod.RunningSessions.Model
  }
  
  @JSImport("@jupyterlab/statusbar", "StatusBar")
  @js.native
  class StatusBar_ () extends StatusBar
  
  object TextItem {
    
    @JSImport("@jupyterlab/statusbar", "TextItem")
    @js.native
    def apply(
      props: typingsSlinky.jupyterlabStatusbar.textMod.TextItem.IProps with HTMLAttributes[HTMLSpanElement]
    ): ReactElement = js.native
  }
  
  @JSImport("@jupyterlab/statusbar", "clickedItem")
  @js.native
  val clickedItem: String = js.native
  
  @JSImport("@jupyterlab/statusbar", "interactiveItem")
  @js.native
  val interactiveItem: String = js.native
  
  @JSImport("@jupyterlab/statusbar", "item")
  @js.native
  val item: String = js.native
  
  @JSImport("@jupyterlab/statusbar", "leftSide")
  @js.native
  val leftSide: String = js.native
  
  @JSImport("@jupyterlab/statusbar", "rightSide")
  @js.native
  val rightSide: String = js.native
  
  @JSImport("@jupyterlab/statusbar", "showPopup")
  @js.native
  def showPopup(options: typingsSlinky.jupyterlabStatusbar.hoverMod.Popup.IOptions): typingsSlinky.jupyterlabStatusbar.hoverMod.Popup = js.native
  
  @JSImport("@jupyterlab/statusbar", "side")
  @js.native
  val side: String = js.native
  
  @JSImport("@jupyterlab/statusbar", "statusBar")
  @js.native
  val statusBar: String = js.native
  
  /**
    * A namespace for LineColComponent.
    */
  object LineColComponent
}
