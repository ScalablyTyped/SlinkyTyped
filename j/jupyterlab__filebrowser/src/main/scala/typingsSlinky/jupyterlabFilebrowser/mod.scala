package typingsSlinky.jupyterlabFilebrowser

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.jupyterlabApputils.dialogMod.Dialog.IResult
import typingsSlinky.jupyterlabFilebrowser.crumbsMod.BreadCrumbs.IOptions
import typingsSlinky.jupyterlabFilebrowser.opendialogMod.FileDialog.IDirectoryOptions
import typingsSlinky.jupyterlabFilebrowser.opendialogMod.FileDialog.IFileOptions
import typingsSlinky.jupyterlabServices.contentsMod.Contents.IModel
import typingsSlinky.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/filebrowser", "BreadCrumbs")
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
  
  @JSImport("@jupyterlab/filebrowser", "CHUNK_SIZE")
  @js.native
  val CHUNK_SIZE: Double = js.native
  
  @JSImport("@jupyterlab/filebrowser", "DirListing")
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
  object DirListing {
    
    /**
      * The default implementation of an `IRenderer`.
      */
    @JSImport("@jupyterlab/filebrowser", "DirListing.Renderer")
    @js.native
    class Renderer ()
      extends typingsSlinky.jupyterlabFilebrowser.listingMod.DirListing.Renderer
    
    /**
      * The default `IRenderer` instance.
      */
    @JSImport("@jupyterlab/filebrowser", "DirListing.defaultRenderer")
    @js.native
    val defaultRenderer: typingsSlinky.jupyterlabFilebrowser.listingMod.DirListing.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/filebrowser", "FileBrowser")
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
  
  @JSImport("@jupyterlab/filebrowser", "FileBrowserModel")
  @js.native
  class FileBrowserModel protected ()
    extends typingsSlinky.jupyterlabFilebrowser.modelMod.FileBrowserModel {
    /**
      * Construct a new file browser model.
      */
    def this(options: typingsSlinky.jupyterlabFilebrowser.modelMod.FileBrowserModel.IOptions) = this()
  }
  
  object FileDialog {
    
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
    @JSImport("@jupyterlab/filebrowser", "FileDialog.getExistingDirectory")
    @js.native
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
    @JSImport("@jupyterlab/filebrowser", "FileDialog.getOpenFiles")
    @js.native
    def getOpenFiles(options: IFileOptions): js.Promise[IResult[js.Array[IModel]]] = js.native
  }
  
  @JSImport("@jupyterlab/filebrowser", "FileUploadStatus")
  @js.native
  class FileUploadStatus protected ()
    extends typingsSlinky.jupyterlabFilebrowser.uploadstatusMod.FileUploadStatus {
    /**
      * Construct a new FileUpload status item.
      */
    def this(opts: typingsSlinky.jupyterlabFilebrowser.uploadstatusMod.FileUploadStatus.IOptions) = this()
  }
  object FileUploadStatus {
    
    /**
      * The VDomModel for the FileUpload renderer.
      */
    @JSImport("@jupyterlab/filebrowser", "FileUploadStatus.Model")
    @js.native
    /**
      * Construct a new model.
      */
    class Model ()
      extends typingsSlinky.jupyterlabFilebrowser.uploadstatusMod.FileUploadStatus.Model {
      def this(browserModel: FileBrowserModel) = this()
    }
  }
  
  @JSImport("@jupyterlab/filebrowser", "FilterFileBrowserModel")
  @js.native
  class FilterFileBrowserModel protected ()
    extends typingsSlinky.jupyterlabFilebrowser.modelMod.FilterFileBrowserModel {
    def this(options: typingsSlinky.jupyterlabFilebrowser.modelMod.FilterFileBrowserModel.IOptions) = this()
  }
  
  object IFileBrowserFactory extends Shortcut {
    
    @JSImport("@jupyterlab/filebrowser", "IFileBrowserFactory")
    @js.native
    val ^ : Token[typingsSlinky.jupyterlabFilebrowser.tokensMod.IFileBrowserFactory] = js.native
    
    type _To = Token[typingsSlinky.jupyterlabFilebrowser.tokensMod.IFileBrowserFactory]
    
    /* This means you don't have to write `^`, but can instead just say `IFileBrowserFactory.foo` */
    override def _to: Token[typingsSlinky.jupyterlabFilebrowser.tokensMod.IFileBrowserFactory] = ^
  }
  
  @JSImport("@jupyterlab/filebrowser", "LARGE_FILE_SIZE")
  @js.native
  val LARGE_FILE_SIZE: Double = js.native
  
  @JSImport("@jupyterlab/filebrowser", "Uploader")
  @js.native
  class Uploader protected ()
    extends typingsSlinky.jupyterlabFilebrowser.uploadMod.Uploader {
    /**
      * Construct a new file browser buttons widget.
      */
    def this(options: typingsSlinky.jupyterlabFilebrowser.uploadMod.Uploader.IOptions) = this()
  }
}
