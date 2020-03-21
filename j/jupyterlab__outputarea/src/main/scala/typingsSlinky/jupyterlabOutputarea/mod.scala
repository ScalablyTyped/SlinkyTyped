package typingsSlinky.jupyterlabOutputarea

import typingsSlinky.jupyterlabApputils.clientsessionMod.IClientSession
import typingsSlinky.jupyterlabOutputarea.widgetMod.OutputArea.IOptions
import typingsSlinky.jupyterlabServices.messagesMod.KernelMessage.IExecuteReplyMsg
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/outputarea", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class OutputArea protected ()
    extends typingsSlinky.jupyterlabOutputarea.widgetMod.OutputArea {
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
    extends typingsSlinky.jupyterlabOutputarea.modelMod.OutputAreaModel {
    def this(options: typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions) = this()
  }
  
  @js.native
  class OutputPrompt ()
    extends typingsSlinky.jupyterlabOutputarea.widgetMod.OutputPrompt
  
  @js.native
  class SimplifiedOutputArea ()
    extends typingsSlinky.jupyterlabOutputarea.widgetMod.SimplifiedOutputArea
  
  @js.native
  class Stdin protected ()
    extends typingsSlinky.jupyterlabOutputarea.widgetMod.Stdin {
    /**
      * Construct a new input widget.
      */
    def this(options: typingsSlinky.jupyterlabOutputarea.widgetMod.Stdin.IOptions) = this()
  }
  
  @js.native
  object OutputArea extends js.Object {
    /**
      * The default implementation of `IContentFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typingsSlinky.jupyterlabOutputarea.widgetMod.OutputArea.ContentFactory
    
    /**
      * The default `ContentFactory` instance.
      */
    val defaultContentFactory: typingsSlinky.jupyterlabOutputarea.widgetMod.OutputArea.ContentFactory = js.native
    /**
      * Execute code on an output area.
      */
    def execute(
      code: String,
      output: typingsSlinky.jupyterlabOutputarea.widgetMod.OutputArea,
      session: IClientSession
    ): js.Promise[IExecuteReplyMsg] = js.native
    def execute(
      code: String,
      output: typingsSlinky.jupyterlabOutputarea.widgetMod.OutputArea,
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
      extends typingsSlinky.jupyterlabOutputarea.modelMod.OutputAreaModel.ContentFactory
    
    /**
      * The default output model factory.
      */
    val defaultContentFactory: typingsSlinky.jupyterlabOutputarea.modelMod.OutputAreaModel.ContentFactory = js.native
  }
  
}

