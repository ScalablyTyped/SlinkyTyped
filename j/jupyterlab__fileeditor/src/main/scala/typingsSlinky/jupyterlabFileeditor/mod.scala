package typingsSlinky.jupyterlabFileeditor

import typingsSlinky.jupyterlabFileeditor.widgetMod.FileEditor.IOptions
import typingsSlinky.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/fileeditor", "FileEditor")
  @js.native
  class FileEditor protected ()
    extends typingsSlinky.jupyterlabFileeditor.widgetMod.FileEditor {
    /**
      * Construct a new editor widget.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/fileeditor", "FileEditorCodeWrapper")
  @js.native
  class FileEditorCodeWrapper protected ()
    extends typingsSlinky.jupyterlabFileeditor.widgetMod.FileEditorCodeWrapper {
    /**
      * Construct a new editor widget.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/fileeditor", "FileEditorFactory")
  @js.native
  class FileEditorFactory protected ()
    extends typingsSlinky.jupyterlabFileeditor.widgetMod.FileEditorFactory {
    /**
      * Construct a new editor widget factory.
      */
    def this(options: typingsSlinky.jupyterlabFileeditor.widgetMod.FileEditorFactory.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/fileeditor", "IEditorTracker")
  @js.native
  val IEditorTracker: Token[typingsSlinky.jupyterlabFileeditor.tokensMod.IEditorTracker] = js.native
  
  @JSImport("@jupyterlab/fileeditor", "TabSpaceStatus")
  @js.native
  class TabSpaceStatus protected ()
    extends typingsSlinky.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus {
    /**
      * Create a new tab/space status item.
      */
    def this(options: typingsSlinky.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus.IOptions) = this()
  }
  object TabSpaceStatus {
    
    /**
      * A VDomModel for the TabSpace status item.
      */
    @JSImport("@jupyterlab/fileeditor", "TabSpaceStatus.Model")
    @js.native
    class Model ()
      extends typingsSlinky.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus.Model
  }
  
  /**
    * A namespace for TabSpaceComponent statics.
    */
  object TabSpaceComponent
}
