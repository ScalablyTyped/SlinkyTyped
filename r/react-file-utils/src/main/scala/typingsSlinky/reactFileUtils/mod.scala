package typingsSlinky.reactFileUtils

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reactFileUtils.anon.Accept
import typingsSlinky.reactFileUtils.anon.Accepts
import typingsSlinky.reactFileUtils.anon.BackgroundColor
import typingsSlinky.reactFileUtils.anon.Big
import typingsSlinky.reactFileUtils.anon.Children
import typingsSlinky.reactFileUtils.anon.Disabled
import typingsSlinky.reactFileUtils.anon.HandleClose
import typingsSlinky.reactFileUtils.anon.HandleFiles
import typingsSlinky.reactFileUtils.anon.Multiple
import typingsSlinky.reactFileUtils.anon.OnClick
import typingsSlinky.std.DataTransferItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-file-utils", "AttachmentIcon")
  @js.native
  class AttachmentIcon protected ()
    extends PureComponent[js.Object, js.Object, js.Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "FileIcon")
  @js.native
  class FileIcon protected ()
    extends Component[Big, js.Object, js.Any] {
    def this(props: Big) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Big, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "FilePreviewer")
  @js.native
  class FilePreviewer protected ()
    extends Component[HandleFiles, js.Object, js.Any] {
    def this(props: HandleFiles) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HandleFiles, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "FileUploadButton")
  @js.native
  class FileUploadButton protected ()
    extends Component[Accepts, js.Object, js.Any] {
    def this(props: Accepts) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Accepts, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "IconButton")
  @js.native
  class IconButton protected ()
    extends Component[OnClick, js.Object, js.Any] {
    def this(props: OnClick) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: OnClick, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "ImageDropzone")
  @js.native
  class ImageDropzone protected ()
    extends Component[Accept, js.Object, js.Any] {
    def this(props: Accept) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Accept, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "ImagePreviewer")
  @js.native
  class ImagePreviewer protected ()
    extends Component[Disabled, js.Object, js.Any] {
    def this(props: Disabled) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Disabled, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "ImageUploadButton")
  @js.native
  class ImageUploadButton protected ()
    extends Component[Children, js.Object, js.Any] {
    def this(props: Children) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Children, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "LoadingIndicator")
  @js.native
  class LoadingIndicator protected ()
    extends Component[BackgroundColor, js.Object, js.Any] {
    def this(props: BackgroundColor) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BackgroundColor, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "PictureIcon")
  @js.native
  class PictureIcon protected ()
    extends PureComponent[js.Object, js.Object, js.Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "Thumbnail")
  @js.native
  class Thumbnail protected ()
    extends Component[HandleClose, js.Object, js.Any] {
    def this(props: HandleClose) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HandleClose, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "ThumbnailPlaceholder")
  @js.native
  class ThumbnailPlaceholder protected ()
    extends Component[Multiple, js.Object, js.Any] {
    def this(props: Multiple) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Multiple, context: js.Any) = this()
  }
  
  @JSImport("react-file-utils", "dataTransferItemsHaveFiles")
  @js.native
  def dataTransferItemsHaveFiles(): Boolean = js.native
  @JSImport("react-file-utils", "dataTransferItemsHaveFiles")
  @js.native
  def dataTransferItemsHaveFiles(items: js.Array[DataTransferItem]): Boolean = js.native
  
  @JSImport("react-file-utils", "dataTransferItemsToFiles")
  @js.native
  def dataTransferItemsToFiles(): js.Promise[js.Array[FileLike]] = js.native
  @JSImport("react-file-utils", "dataTransferItemsToFiles")
  @js.native
  def dataTransferItemsToFiles(items: js.Array[DataTransferItem]): js.Promise[js.Array[FileLike]] = js.native
  
  type FileLike = Blob | File
  
  @js.native
  trait FileUpload extends UploadInfo {
    
    var file: File = js.native
  }
  object FileUpload {
    
    @scala.inline
    def apply(file: File, id: String, state: UploadState): FileUpload = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUpload]
    }
    
    @scala.inline
    implicit class FileUploadMutableBuilder[Self <: FileUpload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ImageUpload extends UploadInfo {
    
    var file: Blob | File = js.native
    
    var previewUri: js.UndefOr[String] = js.native
  }
  object ImageUpload {
    
    @scala.inline
    def apply(file: Blob | File, id: String, state: UploadState): ImageUpload = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageUpload]
    }
    
    @scala.inline
    implicit class ImageUploadMutableBuilder[Self <: ImageUpload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: Blob | File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileBlob(value: Blob): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewUri(value: String): Self = StObject.set(x, "previewUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewUriUndefined: Self = StObject.set(x, "previewUri", js.undefined)
    }
  }
  
  @js.native
  trait UploadInfo extends StObject {
    
    var id: String = js.native
    
    var state: UploadState = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object UploadInfo {
    
    @scala.inline
    def apply(id: String, state: UploadState): UploadInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadInfo]
    }
    
    @scala.inline
    implicit class UploadInfoMutableBuilder[Self <: UploadInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: UploadState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactFileUtils.reactFileUtilsStrings.uploading
    - typingsSlinky.reactFileUtils.reactFileUtilsStrings.finished
    - typingsSlinky.reactFileUtils.reactFileUtilsStrings.failed
  */
  trait UploadState extends StObject
  object UploadState {
    
    @scala.inline
    def failed: typingsSlinky.reactFileUtils.reactFileUtilsStrings.failed = "failed".asInstanceOf[typingsSlinky.reactFileUtils.reactFileUtilsStrings.failed]
    
    @scala.inline
    def finished: typingsSlinky.reactFileUtils.reactFileUtilsStrings.finished = "finished".asInstanceOf[typingsSlinky.reactFileUtils.reactFileUtilsStrings.finished]
    
    @scala.inline
    def uploading: typingsSlinky.reactFileUtils.reactFileUtilsStrings.uploading = "uploading".asInstanceOf[typingsSlinky.reactFileUtils.reactFileUtilsStrings.uploading]
  }
}
