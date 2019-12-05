package typingsSlinky.atJupyterlabFileeditor

import typingsSlinky.atJupyterlabFileeditor.libWidgetMod.FileEditor.IOptions
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/fileeditor", JSImport.Namespace)
@js.native
object atJupyterlabFileeditorMod extends js.Object {
  @js.native
  class FileEditor protected ()
    extends typingsSlinky.atJupyterlabFileeditor.libWidgetMod.FileEditor {
    /**
      * Construct a new editor widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class FileEditorCodeWrapper protected ()
    extends typingsSlinky.atJupyterlabFileeditor.libWidgetMod.FileEditorCodeWrapper {
    /**
      * Construct a new editor widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class FileEditorFactory protected ()
    extends typingsSlinky.atJupyterlabFileeditor.libWidgetMod.FileEditorFactory {
    /**
      * Construct a new editor widget factory.
      */
    def this(options: typingsSlinky.atJupyterlabFileeditor.libWidgetMod.FileEditorFactory.IOptions) = this()
  }
  
  @js.native
  class TabSpaceStatus protected ()
    extends typingsSlinky.atJupyterlabFileeditor.libTabspacestatusMod.TabSpaceStatus {
    /**
      * Create a new tab/space status item.
      */
    def this(options: typingsSlinky.atJupyterlabFileeditor.libTabspacestatusMod.TabSpaceStatus.IOptions) = this()
  }
  
  val IEditorTracker: Token[typingsSlinky.atJupyterlabFileeditor.libTokensMod.IEditorTracker] = js.native
  /**
    * A namespace for TabSpaceComponent statics.
    */
  @js.native
  object TabSpaceComponent extends js.Object
  
  @js.native
  object TabSpaceStatus extends js.Object {
    /**
      * A VDomModel for the TabSpace status item.
      */
    @js.native
    class Model ()
      extends typingsSlinky.atJupyterlabFileeditor.libTabspacestatusMod.TabSpaceStatus.Model
    
  }
  
}

