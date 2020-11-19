package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XFrame
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XOutputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.task.XStatusIndicator
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes properties of a document, regarding the relationship between the loaded document and the resource the document is loaded from / stored to.
  *
  * This service may be represented by a {@link com.sun.star.beans.PropertyValue} []. Such descriptors will be passed to different functions, included
  * into possible load/save processes. Every member of such process can use this descriptor and may change it if to actualize the information about the
  * document. So this descriptor should be used as an in/out parameter.
  *
  * Note: ;  It's not allowed to hold member of this descriptor by references longer than they will be used (especially a possible stream). It's allowed
  * to use it directly or by copying it only.
  * @see com.sun.star.beans.PropertyValue
  */
@js.native
trait MediaDescriptor extends js.Object {
  
  /** May be set by filters or detection services if user has chosen to abort loading/saving, e.g. while entering a password. */
  var Aborted: Boolean = js.native
  
  /**
    * document is a template
    *
    * Loading a component of type "template" creates a new untitled document by default, but setting the "AsTemplate" property to `FALSE` loads the template
    * document for editing. Setting "AsTemplate" to `TRUE` creates a new untitled document out of the loaded document, even if it has not a "template" type.
    */
  var AsTemplate: Boolean = js.native
  
  /**
    * the author of the document
    *
    * Only for storing versions in components supporting versioning: author of version.
    */
  var Author: String = js.native
  
  /**
    * identifier of used character set
    *
    * Defines the character set for document formats that contain single byte characters (if necessary).
    */
  var CharacterSet: String = js.native
  
  /**
    * description of document
    *
    * Only for storing versions in components supporting versioning: comment (description) for stored version.
    */
  var Comment: String = js.native
  
  /**
    * pack specific properties of caller
    *
    * This is a parameter that can be used for any properties specific for a special component type. Format of that depends from real type of addressed
    * component.
    *
    * For extensibility, it is recommended to use values of type sequence<com.sun.star.beans.NamedValue> with this property.
    */
  var ComponentData: js.Any = js.native
  
  /** The base URL of the document to be used to resolve relative links. */
  var DocumentBaseURL: String = js.native
  
  /**
    * document title
    *
    * This parameter can be used to specify a title for a document.
    */
  var DocumentTitle: String = js.native
  
  /**
    * encryption information for encryption/decryption of documents
    *
    * It contains the necessary information for encryption/decryption of a component (if necessary). If neither password nor encryption data is specified,
    * loading of a password protected document will fail, storing will be done without encryption. If both are provided, the encryption data is used ( if
    * the filter supports it ).
    *
    * The encryption data is generated based on the password.
    */
  var EncryptionData: SafeArray[NamedValue] = js.native
  
  /**
    * same as {@link MediaDescriptor.URL}
    *
    * It will be supported for compatibility reasons only.
    * @deprecated Deprecated
    */
  var FileName: String = js.native
  
  /**
    * additional properties for filter
    *
    * This is a parameter that can be used for any properties specific for a special filter type. It should be used if {@link MediaDescriptor.FilterOptions}
    * isn't enough.
    */
  var FilterData: js.Any = js.native
  
  /**
    * same as {@link MediaDescriptor.FilterOptions}
    *
    * It will be supported for compatibility reasons only.
    * @deprecated Deprecated
    */
  var FilterFlags: String = js.native
  
  /**
    * internal filter name
    *
    * Name of a filter that should be used for loading or storing the component. Names must match the names of the {@link TypeDetection} configuration,
    * invalid names are ignored. If a name is specified on loading, it still will be verified by a filter detection, but in case of doubt it will be
    * preferred.
    */
  var FilterName: String = js.native
  
  /**
    * additional properties for filter
    *
    * Some filters need additional parameters; use only together with property {@link MediaDescriptor.FilterName} . Details must be documented by the
    * filter. This is an old format for some filters. If a string is not enough, filters can use the property {@link MediaDescriptor.FilterData} .
    */
  var FilterOptions: String = js.native
  
  /** specifies the frame containing the document. May be empty. */
  var Frame: XFrame = js.native
  
  /**
    * load document invisible
    *
    * Defines if the loaded component is made visible. If this property is not specified, the component is made visible by default.
    */
  var Hidden: Boolean = js.native
  
  /** The hierarchical path to the embedded document from topmost container. */
  var HierarchicalDocumentName: String = js.native
  
  /**
    * content of document
    *
    * If used when loading a document: reading must be done using this stream. If no stream is provided, the loader will create a stream by itself using the
    * other properties. It is not allowed to keep a reference to this InputStream after loading the component, and it would be useless, because in general
    * an InputStream is usable for reading only once, except when it also implements the {@link com.sun.star.io.XSeekable} interface.
    */
  var InputStream: XInputStream = js.native
  
  /**
    * handle exceptional situations
    *
    * Object implementing the {@link com.sun.star.task.InteractionHandler} service that is used to handle exceptional situations where proceeding with the
    * task is impossible without additional information or impossible at all. The implemented API provides a default implementation for it that can handle
    * many situations. If no InteractionHandler is set, a suitable exception is thrown. It is not allowed to keep a reference to this object, even not in
    * the loaded or stored component's copy of the {@link MediaDescriptor} provided by its arguments attribute.
    */
  var InteractionHandler: XInteractionHandler = js.native
  
  /**
    * jump to a marked position after loading
    *
    * This is the same as the text behind a "#" in a http URL. But this syntax with a "#" is not specified in most URL schemas.
    */
  var JumpMark: String = js.native
  
  /**
    * should the macro be executed. the value should be one from {@link com.sun.star.document.MacroExecMode} constant list.
    * @since OOo 1.1.2
    */
  var MacroExecutionMode: Double = js.native
  
  /**
    * specify mime type of content
    *
    * Type of the medium to load, that must match to one of the types defined in the {@link TypeDetection} configuration (otherwise it's ignored). This
    * bypasses the type detection of the {@link com.sun.star.frame.Desktop} environment, so passing a wrong MediaType will cause failure of loading.
    */
  var MediaType: String = js.native
  
  /**
    * please use the corresponding parameters of this descriptor instead
    *
    * String that summarizes some flags for loading. The string contains capital letters for the flags: ; {{table here, see documentation}}
    * @deprecated Deprecated
    */
  var OpenFlags: String = js.native
  
  /**
    * opens a new view for an already loaded document
    *
    * Setting this to `TRUE` forces the component to create a new window on loading in any case. If the component supports multiple views, a second view is
    * opened, if not, the component is loaded one more time. Otherwise the behavior depends on the default window handling of the {@link
    * com.sun.star.frame.Desktop} environment.
    */
  var OpenNewView: Boolean = js.native
  
  /**
    * a stream to receive the document data.
    *
    * If used when storing a document: writing must be done using this stream. If no stream is provided, the loader will create a stream by itself using the
    * other properties. It is not allowed to keep a reference to this OutputStream after storing the component.
    */
  var OutputStream: XOutputStream = js.native
  
  /**
    * overwrite any existing file
    *
    * For storing only: overwrite any existing file, default is `FALSE` , so an error occurs if the target file already exists.
    */
  var Overwrite: Boolean = js.native
  
  /**
    * password for loading storing documents
    *
    * It contains a password for loading or storing a component (if necessary). If neither password nor encryption data is specified, loading of a password
    * protected document will fail, storing will be done without encryption. If both are provided, the encryption data is used ( if the filter supports it
    * ).
    */
  var Password: String = js.native
  
  /**
    * contains the data for HTTP post method as a sequence of bytes.
    *
    * Data to send to a location described by the media descriptor to get a result in return that will be loaded as a component (usually in webforms).
    * Default is: no PostData.
    */
  var PostData: SafeArray[Double] = js.native
  
  /**
    * use {@link MediaDescriptor.PostData} instead of this
    *
    * Same as PostData, but the data is transferred as a string (just for compatibility).
    * @deprecated Deprecated
    */
  var PostString: String = js.native
  
  /**
    * show preview
    *
    * Setting this to `TRUE` tells the a loaded component that it is loaded as a preview, so it can optimize loading and viewing for this special purpose.
    * Default is `FALSE` .
    */
  var Preview: Boolean = js.native
  
  /**
    * open document readonly
    *
    * Tells whether a document should be loaded in a (logical) readonly or in read/write mode. If opening in the desired mode is impossible, an error
    * occurs. By default the loaded content decides what to do: if its UCB content supports a "readonly" property, the logical open mode depends on that,
    * otherwise it will be read/write. This is only a UI related property, opening a document in read only mode will not prevent the component from being
    * modified by API calls, but all modifying functionality in the UI will be disabled or removed.
    */
  var ReadOnly: Boolean = js.native
  
  /**
    * name of document referrer
    *
    * A URL describing the environment of the request; e.g. a referrer may be a URL of a document, if a hyperlink inside this document is clicked to load
    * another document. The referrer may be evaluated by the addressed UCB content or the loaded document. Without a referrer the processing of URLs that
    * needs security checks will be denied, e.g. "macro:" URLs. ;  Don't be confused about the wrong spelling; it is kept for compatibility reasons.
    */
  var Referer: String = js.native
  
  /**
    * let the document be opened in repair mode
    *
    * For loading of corrupted zip packages: Setting this to `TRUE` let the document be opened in repair mode, so as much as possible information will be
    * retrieved.
    * @since OOo 1.1.2
    */
  var RepairPackage: Boolean = js.native
  
  /**
    * start presentation from a document
    *
    * Tells the component loading the document that a presentation that is in the document is to be started right away.
    */
  var StartPresentation: Boolean = js.native
  
  /**
    * can be used for status information
    *
    * Object implementing the {@link com.sun.star.task.XStatusIndicator} interface that can be used to give status information (text or progress) for the
    * task. The office provides a default implementation for it. It is not allowed to keep a reference to this object, even not in the loaded or stored
    * component's copy of the {@link MediaDescriptor} provided by its arguments attribute.
    */
  var StatusIndicator: XStatusIndicator = js.native
  
  /**
    * allows to specify the URL that is used next time SaveAs dialog is opened
    *
    * If the parameter is specified, the URL will be used by SaveAs dialog next time as target folder.
    */
  var SuggestedSaveAsDir: String = js.native
  
  /**
    * allows to specify the suggested file name that is used next time SaveAs dialog is opened
    *
    * If the parameter is specified, the file name will be suggested by SaveAs dialog next time.
    */
  var SuggestedSaveAsName: String = js.native
  
  /**
    * name of the template instead of the URL
    *
    * The logical name of a template to load. Together with the MediaDescriptor::TemplateRegion property it can be used instead of the URL of the template.
    * Use always in conjunction with {@link MediaDescriptor.TemplateRegionName} .
    */
  var TemplateName: String = js.native
  
  /**
    * name of the template instead of the URL
    *
    * See {@link MediaDescriptor.TemplateName} . The template region names are the folder names you see in the templates dialog.
    */
  var TemplateRegionName: String = js.native
  
  /**
    * URL of the document
    *
    * The location of the component in URL syntax. It must be the full qualified URL and
    */
  var URL: String = js.native
  
  /**
    * regulate using of compressing
    *
    * For storing: Setting this to `TRUE` means, don't use a zip file to save the document, use a folder instead (only usable for UCB contents, that support
    * folders). Default is `FALSE` .
    */
  var Unpacked: Boolean = js.native
  
  /**
    * can the document be updated depending from links. the value should be one from {@link com.sun.star.document.UpdateDocMode} constant list.
    * @since OOo 1.1.2
    */
  var UpdateDocMode: Double = js.native
  
  /**
    * storage version
    *
    * For components supporting versioning: the number of the version to be loaded or saved. Default is zero and means: no version is created or loaded, the
    * "main" document is processed.
    */
  var Version: Double = js.native
  
  /**
    * specifies the name of the view controller to create when loading a document
    *
    * If this property is used when loading a document into a frame, then it specifies the name of the view controller to create. That is, the property is
    * passed to the document's {@link com.sun.star.frame.XModel2.createViewController()} method. ;  If the loaded document does not support the `XModel2`
    * interface, the property is ignored.
    * @see com.sun.star.frame.XModel2.createViewController
    * @see com.sun.star.frame.XController2.ViewControllerName
    * @since OOo 3.0
    */
  var ViewControllerName: String = js.native
  
  /**
    * set special view state
    *
    * Data to set a special view state after loading. The type depends on the component and is usually retrieved from a {@link
    * com.sun.star.frame.Controller} object by its {@link com.sun.star.frame.XController} interface. Default is: no view data.
    */
  var ViewData: js.Any = js.native
  
  /**
    * id of the initial view
    *
    * For components supporting different views: a number to define the view that should be constructed after loading. Default is: zero, and this should be
    * treated by the component as the default view.
    */
  var ViewId: Double = js.native
}
object MediaDescriptor {
  
  @scala.inline
  def apply(
    Aborted: Boolean,
    AsTemplate: Boolean,
    Author: String,
    CharacterSet: String,
    Comment: String,
    ComponentData: js.Any,
    DocumentBaseURL: String,
    DocumentTitle: String,
    EncryptionData: SafeArray[NamedValue],
    FileName: String,
    FilterData: js.Any,
    FilterFlags: String,
    FilterName: String,
    FilterOptions: String,
    Frame: XFrame,
    Hidden: Boolean,
    HierarchicalDocumentName: String,
    InputStream: XInputStream,
    InteractionHandler: XInteractionHandler,
    JumpMark: String,
    MacroExecutionMode: Double,
    MediaType: String,
    OpenFlags: String,
    OpenNewView: Boolean,
    OutputStream: XOutputStream,
    Overwrite: Boolean,
    Password: String,
    PostData: SafeArray[Double],
    PostString: String,
    Preview: Boolean,
    ReadOnly: Boolean,
    Referer: String,
    RepairPackage: Boolean,
    StartPresentation: Boolean,
    StatusIndicator: XStatusIndicator,
    SuggestedSaveAsDir: String,
    SuggestedSaveAsName: String,
    TemplateName: String,
    TemplateRegionName: String,
    URL: String,
    Unpacked: Boolean,
    UpdateDocMode: Double,
    Version: Double,
    ViewControllerName: String,
    ViewData: js.Any,
    ViewId: Double
  ): MediaDescriptor = {
    val __obj = js.Dynamic.literal(Aborted = Aborted.asInstanceOf[js.Any], AsTemplate = AsTemplate.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], CharacterSet = CharacterSet.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], ComponentData = ComponentData.asInstanceOf[js.Any], DocumentBaseURL = DocumentBaseURL.asInstanceOf[js.Any], DocumentTitle = DocumentTitle.asInstanceOf[js.Any], EncryptionData = EncryptionData.asInstanceOf[js.Any], FileName = FileName.asInstanceOf[js.Any], FilterData = FilterData.asInstanceOf[js.Any], FilterFlags = FilterFlags.asInstanceOf[js.Any], FilterName = FilterName.asInstanceOf[js.Any], FilterOptions = FilterOptions.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], HierarchicalDocumentName = HierarchicalDocumentName.asInstanceOf[js.Any], InputStream = InputStream.asInstanceOf[js.Any], InteractionHandler = InteractionHandler.asInstanceOf[js.Any], JumpMark = JumpMark.asInstanceOf[js.Any], MacroExecutionMode = MacroExecutionMode.asInstanceOf[js.Any], MediaType = MediaType.asInstanceOf[js.Any], OpenFlags = OpenFlags.asInstanceOf[js.Any], OpenNewView = OpenNewView.asInstanceOf[js.Any], OutputStream = OutputStream.asInstanceOf[js.Any], Overwrite = Overwrite.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], PostData = PostData.asInstanceOf[js.Any], PostString = PostString.asInstanceOf[js.Any], Preview = Preview.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], Referer = Referer.asInstanceOf[js.Any], RepairPackage = RepairPackage.asInstanceOf[js.Any], StartPresentation = StartPresentation.asInstanceOf[js.Any], StatusIndicator = StatusIndicator.asInstanceOf[js.Any], SuggestedSaveAsDir = SuggestedSaveAsDir.asInstanceOf[js.Any], SuggestedSaveAsName = SuggestedSaveAsName.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateRegionName = TemplateRegionName.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], Unpacked = Unpacked.asInstanceOf[js.Any], UpdateDocMode = UpdateDocMode.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], ViewControllerName = ViewControllerName.asInstanceOf[js.Any], ViewData = ViewData.asInstanceOf[js.Any], ViewId = ViewId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDescriptor]
  }
  
  @scala.inline
  implicit class MediaDescriptorOps[Self <: MediaDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAborted(value: Boolean): Self = this.set("Aborted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsTemplate(value: Boolean): Self = this.set("AsTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: String): Self = this.set("Author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterSet(value: String): Self = this.set("CharacterSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComment(value: String): Self = this.set("Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentData(value: js.Any): Self = this.set("ComponentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentBaseURL(value: String): Self = this.set("DocumentBaseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentTitle(value: String): Self = this.set("DocumentTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionData(value: SafeArray[NamedValue]): Self = this.set("EncryptionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = this.set("FileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterData(value: js.Any): Self = this.set("FilterData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterFlags(value: String): Self = this.set("FilterFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterName(value: String): Self = this.set("FilterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterOptions(value: String): Self = this.set("FilterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: XFrame): Self = this.set("Frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("Hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchicalDocumentName(value: String): Self = this.set("HierarchicalDocumentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStream(value: XInputStream): Self = this.set("InputStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionHandler(value: XInteractionHandler): Self = this.set("InteractionHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJumpMark(value: String): Self = this.set("JumpMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacroExecutionMode(value: Double): Self = this.set("MacroExecutionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: String): Self = this.set("MediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenFlags(value: String): Self = this.set("OpenFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenNewView(value: Boolean): Self = this.set("OpenNewView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputStream(value: XOutputStream): Self = this.set("OutputStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = this.set("Overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostData(value: SafeArray[Double]): Self = this.set("PostData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostString(value: String): Self = this.set("PostString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview(value: Boolean): Self = this.set("Preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferer(value: String): Self = this.set("Referer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepairPackage(value: Boolean): Self = this.set("RepairPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPresentation(value: Boolean): Self = this.set("StartPresentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusIndicator(value: XStatusIndicator): Self = this.set("StatusIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedSaveAsDir(value: String): Self = this.set("SuggestedSaveAsDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedSaveAsName(value: String): Self = this.set("SuggestedSaveAsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateName(value: String): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateRegionName(value: String): Self = this.set("TemplateRegionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnpacked(value: Boolean): Self = this.set("Unpacked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDocMode(value: Double): Self = this.set("UpdateDocMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewControllerName(value: String): Self = this.set("ViewControllerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewData(value: js.Any): Self = this.set("ViewData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewId(value: Double): Self = this.set("ViewId", value.asInstanceOf[js.Any])
  }
}
