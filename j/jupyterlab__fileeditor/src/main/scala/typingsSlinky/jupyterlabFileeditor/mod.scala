package typingsSlinky.jupyterlabFileeditor

import typingsSlinky.jupyterlabFileeditor.widgetMod.FileEditor.IOptions
import typingsSlinky.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/fileeditor", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val IEditorTracker: Token[typingsSlinky.jupyterlabFileeditor.tokensMod.IEditorTracker] = js.native
  
  @js.native
  class FileEditor protected ()
    extends typingsSlinky.jupyterlabFileeditor.widgetMod.FileEditor {
    /**
      * Construct a new editor widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class FileEditorCodeWrapper protected ()
    extends typingsSlinky.jupyterlabFileeditor.widgetMod.FileEditorCodeWrapper {
    /**
      * Construct a new editor widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class FileEditorFactory protected ()
    extends typingsSlinky.jupyterlabFileeditor.widgetMod.FileEditorFactory {
    /**
      * Construct a new editor widget factory.
      */
    def this(options: typingsSlinky.jupyterlabFileeditor.widgetMod.FileEditorFactory.IOptions) = this()
  }
  
  /**
    * A namespace for TabSpaceComponent statics.
    */
  @js.native
  object TabSpaceComponent extends js.Object
  
  @js.native
  class TabSpaceStatus protected ()
    extends typingsSlinky.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus {
    /**
      * Create a new tab/space status item.
      */
    def this(options: typingsSlinky.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus.IOptions) = this()
  }
  @js.native
  object TabSpaceStatus extends js.Object {
    
    /**
      * A VDomModel for the TabSpace status item.
      */
    @js.native
    class Model ()
      extends typingsSlinky.jupyterlabFileeditor.tabspacestatusMod.TabSpaceStatus.Model
  }
}
