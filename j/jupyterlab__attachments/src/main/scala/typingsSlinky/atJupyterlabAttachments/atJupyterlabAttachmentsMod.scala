package typingsSlinky.atJupyterlabAttachments

import typingsSlinky.atJupyterlabAttachments.libModelMod.IAttachmentsModel.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/attachments", JSImport.Namespace)
@js.native
object atJupyterlabAttachmentsMod extends js.Object {
  @js.native
  /**
    * Construct a new observable outputs instance.
    */
  class AttachmentsModel ()
    extends typingsSlinky.atJupyterlabAttachments.libModelMod.AttachmentsModel {
    def this(options: IOptions) = this()
  }
  
  @js.native
  class AttachmentsResolver protected ()
    extends typingsSlinky.atJupyterlabAttachments.libModelMod.AttachmentsResolver {
    /**
      * Create an attachments resolver object.
      */
    def this(options: typingsSlinky.atJupyterlabAttachments.libModelMod.AttachmentsResolver.IOptions) = this()
  }
  
  @js.native
  object AttachmentsModel extends js.Object {
    /**
      * The default implementation of a `IAttachemntsModel.IContentFactory`.
      */
    @js.native
    class ContentFactory ()
      extends typingsSlinky.atJupyterlabAttachments.libModelMod.AttachmentsModel.ContentFactory
    
    /**
      * The default attachment model factory.
      */
    val defaultContentFactory: typingsSlinky.atJupyterlabAttachments.libModelMod.AttachmentsModel.ContentFactory = js.native
  }
  
}

