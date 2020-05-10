package typingsSlinky.jupyterlabFilebrowser

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jupyterlabApputils.dialogMod.Dialog.IResult
import typingsSlinky.jupyterlabFilebrowser.crumbsMod.BreadCrumbs.IOptions
import typingsSlinky.jupyterlabFilebrowser.opendialogMod.FileDialog.IDirectoryOptions
import typingsSlinky.jupyterlabFilebrowser.opendialogMod.FileDialog.IFileOptions
import typingsSlinky.jupyterlabServices.contentsMod.Contents.IModel
import typingsSlinky.jupyterlabUiComponents.interfacesMod.IIconRegistry
import typingsSlinky.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/filebrowser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BreadCrumbs protected ()
    extends typingsSlinky.jupyterlabFilebrowser.crumbsMod.BreadCrumbs {
    /**
      * Construct a new file browser crumb widget.
      *
      * @param model - The file browser view model.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class DirListing protected ()
    extends typingsSlinky.jupyterlabFilebrowser.listingMod.DirListing {
    /**
      * Construct a new file browser directory listing widget.
      *
      * @param model - The file browser view model.
      */
    def this(options: typingsSlinky.jupyterlabFilebrowser.listingMod.DirListing.IOptions) = this()
  }
  
  @js.native
  class FileBrowser protected ()
    extends typingsSlinky.jupyterlabFilebrowser.browserMod.FileBrowser {
    /**
      * Construct a new file browser.
      *
      * @param model - The file browser view model.
      */
    def this(options: typingsSlinky.jupyterlabFilebrowser.browserMod.FileBrowser.IOptions) = this()
  }
  
  @js.native
  class FileBrowserModel protected ()
    extends typingsSlinky.jupyterlabFilebrowser.modelMod.FileBrowserModel {
    /**
      * Construct a new file browser model.
      */
    def this(options: typingsSlinky.jupyterlabFilebrowser.modelMod.FileBrowserModel.IOptions) = this()
  }
  
  @js.native
  class FileUploadStatus protected ()
    extends typingsSlinky.jupyterlabFilebrowser.uploadstatusMod.FileUploadStatus {
    /**
      * Construct a new FileUpload status item.
      */
    def this(opts: typingsSlinky.jupyterlabFilebrowser.uploadstatusMod.FileUploadStatus.IOptions) = this()
  }
  
  @js.native
  class FilterFileBrowserModel protected ()
    extends typingsSlinky.jupyterlabFilebrowser.modelMod.FilterFileBrowserModel {
    def this(options: typingsSlinky.jupyterlabFilebrowser.modelMod.FilterFileBrowserModel.IOptions) = this()
  }
  
  @js.native
  class Uploader protected ()
    extends typingsSlinky.jupyterlabFilebrowser.uploadMod.Uploader {
    /**
      * Construct a new file browser buttons widget.
      */
    def this(options: typingsSlinky.jupyterlabFilebrowser.uploadMod.Uploader.IOptions) = this()
  }
  
  val CHUNK_SIZE: Double = js.native
  val LARGE_FILE_SIZE: Double = js.native
  @js.native
  object DirListing extends js.Object {
    /**
      * The default implementation of an `IRenderer`.
      */
    @js.native
    class Renderer protected ()
      extends typingsSlinky.jupyterlabFilebrowser.listingMod.DirListing.Renderer {
      def this(icoReg: IIconRegistry) = this()
    }
    
  }
  
  @js.native
  object FileDialog extends js.Object {
    /**
      * Create and show a open directory dialog.
      *
      * Note: if nothing is selected when `getValue` will return the browser
      * model current path.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted.
      */
    def getExistingDirectory(options: IDirectoryOptions): js.Promise[IResult[js.Array[IModel]]] = js.native
    /**
      * Create and show a open files dialog.
      *
      * Note: if nothing is selected when `getValue` will return the browser
      * model current path.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted.
      */
    def getOpenFiles(options: IFileOptions): js.Promise[IResult[js.Array[IModel]]] = js.native
  }
  
  @js.native
  object FileUploadStatus extends js.Object {
    /**
      * The VDomModel for the FileUpload renderer.
      */
    @js.native
    class Model ()
      extends typingsSlinky.jupyterlabFilebrowser.uploadstatusMod.FileUploadStatus.Model {
      /**
        * Construct a new model.
        */
      def this(browserModel: FileBrowserModel) = this()
    }
    
  }
  
  @js.native
  object IFileBrowserFactory
    extends TopLevel[Token[typingsSlinky.jupyterlabFilebrowser.tokensMod.IFileBrowserFactory]]
  
}

