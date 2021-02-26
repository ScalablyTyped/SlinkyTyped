package typingsSlinky.jupyterlabAttachments

import typingsSlinky.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/attachments", "AttachmentsModel")
  @js.native
  /**
    * Construct a new observable outputs instance.
    */
  class AttachmentsModel ()
    extends typingsSlinky.jupyterlabAttachments.modelMod.AttachmentsModel {
    def this(options: IOptions) = this()
  }
  object AttachmentsModel {
    
    /**
      * The default implementation of a `IAttachemntsModel.IContentFactory`.
      */
    @JSImport("@jupyterlab/attachments", "AttachmentsModel.ContentFactory")
    @js.native
    class ContentFactory ()
      extends typingsSlinky.jupyterlabAttachments.modelMod.AttachmentsModel.ContentFactory
    
    /**
      * The default attachment model factory.
      */
    @JSImport("@jupyterlab/attachments", "AttachmentsModel.defaultContentFactory")
    @js.native
    val defaultContentFactory: typingsSlinky.jupyterlabAttachments.modelMod.AttachmentsModel.ContentFactory = js.native
  }
  
  @JSImport("@jupyterlab/attachments", "AttachmentsResolver")
  @js.native
  class AttachmentsResolver protected ()
    extends typingsSlinky.jupyterlabAttachments.modelMod.AttachmentsResolver {
    /**
      * Create an attachments resolver object.
      */
    def this(options: typingsSlinky.jupyterlabAttachments.modelMod.AttachmentsResolver.IOptions) = this()
  }
}
