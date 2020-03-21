package typingsSlinky.jupyterlabAttachments

import typingsSlinky.jupyterlabAttachments.modelMod.IAttachmentsModel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/attachments", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  /**
    * Construct a new observable outputs instance.
    */
  class AttachmentsModel ()
    extends typingsSlinky.jupyterlabAttachments.modelMod.AttachmentsModel {
    def this(options: IOptions) = this()
  }
  
  @js.native
  class AttachmentsResolver protected ()
    extends typingsSlinky.jupyterlabAttachments.modelMod.AttachmentsResolver {
    /**
      * Create an attachments resolver object.
      */
    def this(options: typingsSlinky.jupyterlabAttachments.modelMod.AttachmentsResolver.IOptions) = this()
  }
  
  @js.native
  object AttachmentsModel extends js.Object {
    /**
      * The default implementation of a `IAttachemntsModel.IContentFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typingsSlinky.jupyterlabAttachments.modelMod.AttachmentsModel.ContentFactory
    
    /**
      * The default attachment model factory.
      */
    val defaultContentFactory: typingsSlinky.jupyterlabAttachments.modelMod.AttachmentsModel.ContentFactory = js.native
  }
  
}

