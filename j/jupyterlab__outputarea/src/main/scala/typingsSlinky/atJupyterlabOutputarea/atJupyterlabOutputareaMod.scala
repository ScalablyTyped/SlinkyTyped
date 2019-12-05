package typingsSlinky.atJupyterlabOutputarea

import typingsSlinky.atJupyterlabApputils.libClientsessionMod.IClientSession
import typingsSlinky.atJupyterlabOutputarea.libWidgetMod.OutputArea.IOptions
import typingsSlinky.atJupyterlabServices.libKernelMessagesMod.KernelMessage.IExecuteReplyMsg
import typingsSlinky.atPhosphorCoreutils.libJsonMod.JSONObject
import typingsSlinky.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/outputarea", JSImport.Namespace)
@js.native
object atJupyterlabOutputareaMod extends js.Object {
  @js.native
  class OutputArea protected ()
    extends typingsSlinky.atJupyterlabOutputarea.libWidgetMod.OutputArea {
    /**
      * Construct an output area widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  /**
    * Construct a new observable outputs instance.
    */
  class OutputAreaModel ()
    extends typingsSlinky.atJupyterlabOutputarea.libModelMod.OutputAreaModel {
    def this(options: typingsSlinky.atJupyterlabOutputarea.libModelMod.IOutputAreaModel.IOptions) = this()
  }
  
  @js.native
  class OutputPrompt ()
    extends typingsSlinky.atJupyterlabOutputarea.libWidgetMod.OutputPrompt
  
  @js.native
  class SimplifiedOutputArea ()
    extends typingsSlinky.atJupyterlabOutputarea.libWidgetMod.SimplifiedOutputArea
  
  @js.native
  class Stdin protected ()
    extends typingsSlinky.atJupyterlabOutputarea.libWidgetMod.Stdin {
    /**
      * Construct a new input widget.
      */
    def this(options: typingsSlinky.atJupyterlabOutputarea.libWidgetMod.Stdin.IOptions) = this()
  }
  
  @js.native
  object OutputArea extends js.Object {
    /**
      * The default implementation of `IContentFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typingsSlinky.atJupyterlabOutputarea.libWidgetMod.OutputArea.ContentFactory
    
    /**
      * The default `ContentFactory` instance.
      */
    val defaultContentFactory: typingsSlinky.atJupyterlabOutputarea.libWidgetMod.OutputArea.ContentFactory = js.native
    /**
      * Execute code on an output area.
      */
    def execute(
      code: String,
      output: typingsSlinky.atJupyterlabOutputarea.libWidgetMod.OutputArea,
      session: IClientSession
    ): js.Promise[IExecuteReplyMsg] = js.native
    def execute(
      code: String,
      output: typingsSlinky.atJupyterlabOutputarea.libWidgetMod.OutputArea,
      session: IClientSession,
      metadata: JSONObject
    ): js.Promise[IExecuteReplyMsg] = js.native
    def isIsolated(mimeType: String, metadata: ReadonlyJSONObject): Boolean = js.native
  }
  
  @js.native
  object OutputAreaModel extends js.Object {
    /**
      * The default implementation of a `IModelOutputFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typingsSlinky.atJupyterlabOutputarea.libModelMod.OutputAreaModel.ContentFactory
    
    /**
      * The default output model factory.
      */
    val defaultContentFactory: typingsSlinky.atJupyterlabOutputarea.libModelMod.OutputAreaModel.ContentFactory = js.native
  }
  
}

