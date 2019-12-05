package typingsSlinky.atJupyterlabFilebrowser

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atJupyterlabApputils.libDialogMod.Dialog.IResult
import typingsSlinky.atJupyterlabFilebrowser.atJupyterlabFilebrowserMod.FileBrowserModel
import typingsSlinky.atJupyterlabFilebrowser.libCrumbsMod.BreadCrumbs.IOptions
import typingsSlinky.atJupyterlabFilebrowser.libOpendialogMod.FileDialog.IDirectoryOptions
import typingsSlinky.atJupyterlabFilebrowser.libOpendialogMod.FileDialog.IFileOptions
import typingsSlinky.atJupyterlabServices.libContentsMod.Contents.IModel
import typingsSlinky.atJupyterlabUiDashComponents.libIconInterfacesMod.IIconRegistry
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/filebrowser", JSImport.Namespace)
@js.native
object atJupyterlabFilebrowserMod extends js.Object {
  @js.native
  class BreadCrumbs protected ()
    extends typingsSlinky.atJupyterlabFilebrowser.libCrumbsMod.BreadCrumbs {
    /**
      * Construct a new file browser crumb widget.
      *
      * @param model - The file browser view model.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class DirListing protected ()
    extends typingsSlinky.atJupyterlabFilebrowser.libListingMod.DirListing {
    /**
      * Construct a new file browser directory listing widget.
      *
      * @param model - The file browser view model.
      */
    def this(options: typingsSlinky.atJupyterlabFilebrowser.libListingMod.DirListing.IOptions) = this()
  }
  
  @js.native
  class FileBrowser protected ()
    extends typingsSlinky.atJupyterlabFilebrowser.libBrowserMod.FileBrowser {
    /**
      * Construct a new file browser.
      *
      * @param model - The file browser view model.
      */
    def this(options: typingsSlinky.atJupyterlabFilebrowser.libBrowserMod.FileBrowser.IOptions) = this()
  }
  
  @js.native
  class FileBrowserModel protected ()
    extends typingsSlinky.atJupyterlabFilebrowser.libModelMod.FileBrowserModel {
    /**
      * Construct a new file browser model.
      */
    def this(options: typingsSlinky.atJupyterlabFilebrowser.libModelMod.FileBrowserModel.IOptions) = this()
  }
  
  @js.native
  class FileUploadStatus protected ()
    extends typingsSlinky.atJupyterlabFilebrowser.libUploadstatusMod.FileUploadStatus {
    /**
      * Construct a new FileUpload status item.
      */
    def this(opts: typingsSlinky.atJupyterlabFilebrowser.libUploadstatusMod.FileUploadStatus.IOptions) = this()
  }
  
  @js.native
  class FilterFileBrowserModel protected ()
    extends typingsSlinky.atJupyterlabFilebrowser.libModelMod.FilterFileBrowserModel {
    def this(options: typingsSlinky.atJupyterlabFilebrowser.libModelMod.FilterFileBrowserModel.IOptions) = this()
  }
  
  @js.native
  class Uploader protected ()
    extends typingsSlinky.atJupyterlabFilebrowser.libUploadMod.Uploader {
    /**
      * Construct a new file browser buttons widget.
      */
    def this(options: typingsSlinky.atJupyterlabFilebrowser.libUploadMod.Uploader.IOptions) = this()
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
      extends typingsSlinky.atJupyterlabFilebrowser.libListingMod.DirListing.Renderer {
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
      extends typingsSlinky.atJupyterlabFilebrowser.libUploadstatusMod.FileUploadStatus.Model {
      /**
        * Construct a new model.
        */
      def this(browserModel: FileBrowserModel) = this()
    }
    
  }
  
  @js.native
  object IFileBrowserFactory
    extends TopLevel[Token[typingsSlinky.atJupyterlabFilebrowser.libTokensMod.IFileBrowserFactory]]
  
}

