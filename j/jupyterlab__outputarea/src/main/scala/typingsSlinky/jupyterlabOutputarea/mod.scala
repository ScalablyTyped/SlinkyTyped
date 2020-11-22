package typingsSlinky.jupyterlabOutputarea

import typingsSlinky.jupyterlabApputils.sessioncontextMod.ISessionContext
import typingsSlinky.jupyterlabOutputarea.widgetMod.OutputArea.IOptions
import typingsSlinky.jupyterlabServices.messagesMod.IExecuteReplyMsg
import typingsSlinky.luminoCoreutils.jsonMod.JSONObject
import typingsSlinky.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  object OutputArea extends js.Object {
    
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
      sessionContext: ISessionContext
    ): js.Promise[js.UndefOr[IExecuteReplyMsg]] = js.native
    def execute(
      code: String,
      output: typingsSlinky.jupyterlabOutputarea.widgetMod.OutputArea,
      sessionContext: ISessionContext,
      metadata: JSONObject
    ): js.Promise[js.UndefOr[IExecuteReplyMsg]] = js.native
    
    def isIsolated(mimeType: String, metadata: ReadonlyPartialJSONObject): Boolean = js.native
    
    /**
      * The default implementation of `IContentFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typingsSlinky.jupyterlabOutputarea.widgetMod.OutputArea.ContentFactory
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
  object OutputAreaModel extends js.Object {
    
    /**
      * The default output model factory.
      */
    val defaultContentFactory: typingsSlinky.jupyterlabOutputarea.modelMod.OutputAreaModel.ContentFactory = js.native
    
    /**
      * The default implementation of a `IModelOutputFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typingsSlinky.jupyterlabOutputarea.modelMod.OutputAreaModel.ContentFactory
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
}
