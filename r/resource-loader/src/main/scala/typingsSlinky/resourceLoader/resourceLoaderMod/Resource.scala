package typingsSlinky.resourceLoader.resourceLoaderMod

import org.scalajs.dom.raw.HTMLAudioElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalajs.dom.raw.XMLHttpRequest
import typingsSlinky.resourceLoader.anon.CrossOrigin
import typingsSlinky.resourceLoader.mod.default
import typingsSlinky.resourceLoader.resourceLoaderMod.Resource.IMetadata
import typingsSlinky.resourceLoader.resourceLoaderMod.Resource.LOAD_TYPE
import typingsSlinky.resourceLoader.resourceLoaderMod.Resource.OnCompleteSignal
import typingsSlinky.resourceLoader.resourceLoaderMod.Resource.OnProgressSignal
import typingsSlinky.resourceLoader.resourceLoaderMod.Resource.OnStartSignal
import typingsSlinky.resourceLoader.resourceLoaderMod.Resource.TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @param {string} name - The name of the resource to load.
  * @param {string|string[]} url - The url for this resource, for audio/video loads you can pass
  *      an array of sources.
  * @param {object} [options] - The options for the load.
  * @param {string|boolean} [options.crossOrigin] - Is this request cross-origin? Default is to
  *      determine automatically.
  * @param {number} [options.timeout=0] - A timeout in milliseconds for the load. If the load takes
  *      longer than this time it is cancelled and the load is considered a failure. If this value is
  *      set to `0` then there is no explicit timeout.
  * @param {Resource.LOAD_TYPE} [options.loadType=Resource.LOAD_TYPE.XHR] - How should this resource
  *      be loaded?
  * @param {Resource.XHR_RESPONSE_TYPE} [options.xhrType=Resource.XHR_RESPONSE_TYPE.DEFAULT] - How
  *      should the data being loaded be interpreted when using XHR?
  * @param {Resource.IMetadata} [options.metadata] - Extra configuration for middleware and the Resource object.
  */
@JSImport("resource-loader", "Resource")
@js.native
class Resource protected () extends StObject {
  def this(name: String, url: String) = this()
  def this(name: String, url: js.Array[String]) = this()
  def this(name: String, url: String, options: CrossOrigin) = this()
  def this(name: String, url: js.Array[String], options: CrossOrigin) = this()
  
  /**
    * Aborts the loading of this resource, with an optional message.
    *
    * @param {string} message - The message to use for the error
    */
  def abort(message: String): Unit = js.native
  
  /**
    * The child resources this resource owns.
    *
    * @readonly
    * @member {Resource[]}
    */
  val children: js.Array[Resource] = js.native
  
  /**
    * Marks the resource as complete.
    *
    */
  def complete(): Unit = js.native
  
  /**
    * Is this request cross-origin? If unset, determined automatically.
    *
    * @member {string}
    */
  var crossOrigin: String = js.native
  
  /**
    * The data that was loaded by the resource.
    *
    * @member {any}
    */
  var data: js.Any = js.native
  
  /**
    * The error that occurred while loading (if any).
    *
    * @readonly
    * @member {Error}
    */
  val error: js.Error = js.native
  
  /**
    * The extension used to load this resource.
    *
    * @readonly
    * @member {string}
    */
  val extension: String = js.native
  
  /**
    * Describes if this resource has finished loading. Is true when the resource has completely
    * loaded.
    *
    * @readonly
    * @member {boolean}
    */
  val isComplete: Boolean = js.native
  
  /**
    * Stores whether or not this url is a data url.
    *
    * @readonly
    * @member {boolean}
    */
  val isDataUrl: Boolean = js.native
  
  /**
    * Describes if this resource is currently loading. Is true when the resource starts loading,
    * and is false again when complete.
    *
    * @readonly
    * @member {boolean}
    */
  val isLoading: Boolean = js.native
  
  /**
    * Kicks off loading of this resource. This method is asynchronous.
    *
    * @param {Resource.OnCompleteSignal} [cb] - Optional callback to call once the resource is loaded.
    */
  def load(): Unit = js.native
  def load(cb: OnCompleteSignal): Unit = js.native
  
  /**
    * The method of loading to use for this resource.
    *
    * @member {Resource.LOAD_TYPE}
    */
  var loadType: LOAD_TYPE = js.native
  
  /**
    * Extra info for middleware, and controlling specifics about how the resource loads.
    *
    * Note that if you pass in a `loadElement`, the Resource class takes ownership of it.
    * Meaning it will modify it as it sees fit.
    *
    * @member {Resource.IMetadata}
    */
  var metadata: IMetadata = js.native
  
  /**
    * The name of this resource.
    *
    * @readonly
    * @member {string}
    */
  val name: String = js.native
  
  /**
    * Dispatched after this resource has had all the *after* middleware run on it.
    *
    * The callback looks like {@link Resource.OnCompleteSignal}.
    *
    * @member {Signal<Resource.OnCompleteSignal>}
    */
  var onAfterMiddleware: default[OnCompleteSignal] = js.native
  
  /**
    * Dispatched once this resource has loaded, if there was an error it will
    * be in the `error` property.
    *
    * The callback looks like {@link Resource.OnCompleteSignal}.
    *
    * @member {Signal<Resource.OnCompleteSignal>}
    */
  var onComplete: default[OnCompleteSignal] = js.native
  
  /**
    * Dispatched each time progress of this resource load updates.
    * Not all resources types and loader systems can support this event
    * so sometimes it may not be available. If the resource
    * is being loaded on a modern browser, using XHR, and the remote server
    * properly sets Content-Length headers, then this will be available.
    *
    * The callback looks like {@link Resource.OnProgressSignal}.
    *
    * @member {Signal<Resource.OnProgressSignal>}
    */
  var onProgress: default[OnProgressSignal] = js.native
  
  /**
    * Dispatched when the resource beings to load.
    *
    * The callback looks like {@link Resource.OnStartSignal}.
    *
    * @member {Signal<Resource.OnStartSignal>}
    */
  var onStart: default[OnStartSignal] = js.native
  
  /**
    * The progress chunk owned by this resource.
    *
    * @readonly
    * @member {number}
    */
  val progressChunk: Double = js.native
  
  /**
    * A timeout in milliseconds for the load. If the load takes longer than this time
    * it is cancelled and the load is considered a failure. If this value is set to `0`
    * then there is no explicit timeout.
    *
    * @member {number}
    */
  var timeout: Double = js.native
  
  /**
    * The resource type.
    *
    * @readonly
    * @member {Resource.TYPE}
    */
  val `type`: TYPE = js.native
  
  /**
    * The url used to load this resource.
    *
    * @readonly
    * @member {string}
    */
  val url: String = js.native
  
  /**
    * The XHR object that was used to load this resource. This is only set
    * when `loadType` is `Resource.LOAD_TYPE.XHR`.
    *
    * @readonly
    * @member {XMLHttpRequest}
    */
  val xhr: XMLHttpRequest = js.native
  
  /**
    * The type used to load the resource via XHR. If unset, determined automatically.
    *
    * @member {string}
    */
  var xhrType: String = js.native
}
object Resource {
  
  @js.native
  sealed trait LOAD_TYPE extends StObject
  /**
    * The types of loading a resource can use.
    *
    * @static
    * @readonly
    * @enum {number}
    */
  @JSImport("resource-loader", "Resource.LOAD_TYPE")
  @js.native
  object LOAD_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LOAD_TYPE with Double] = js.native
    
    @js.native
    sealed trait AUDIO extends LOAD_TYPE
    /* 2 */ val AUDIO: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.LOAD_TYPE.AUDIO with Double = js.native
    
    @js.native
    sealed trait IMAGE extends LOAD_TYPE
    /* 1 */ val IMAGE: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.LOAD_TYPE.IMAGE with Double = js.native
    
    @js.native
    sealed trait VIDEO extends LOAD_TYPE
    /* 3 */ val VIDEO: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.LOAD_TYPE.VIDEO with Double = js.native
    
    @js.native
    sealed trait XHR extends LOAD_TYPE
    /* 0 */ val XHR: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.LOAD_TYPE.XHR with Double = js.native
  }
  
  @js.native
  sealed trait STATUS_FLAGS extends StObject
  /**
    * The types of resources a resource could represent.
    *
    * @static
    * @readonly
    * @enum {number}
    */
  @JSImport("resource-loader", "Resource.STATUS_FLAGS")
  @js.native
  object STATUS_FLAGS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[STATUS_FLAGS with Double] = js.native
    
    @js.native
    sealed trait COMPLETE extends STATUS_FLAGS
    /* 2 */ val COMPLETE: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.STATUS_FLAGS.COMPLETE with Double = js.native
    
    @js.native
    sealed trait DATA_URL extends STATUS_FLAGS
    /* 1 */ val DATA_URL: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.STATUS_FLAGS.DATA_URL with Double = js.native
    
    @js.native
    sealed trait LOADING extends STATUS_FLAGS
    /* 3 */ val LOADING: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.STATUS_FLAGS.LOADING with Double = js.native
    
    @js.native
    sealed trait NONE extends STATUS_FLAGS
    /* 0 */ val NONE: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.STATUS_FLAGS.NONE with Double = js.native
  }
  
  @js.native
  sealed trait TYPE extends StObject
  /**
    * The types of resources a resource could represent.
    *
    * @static
    * @readonly
    * @enum {number}
    */
  @JSImport("resource-loader", "Resource.TYPE")
  @js.native
  object TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TYPE with Double] = js.native
    
    @js.native
    sealed trait AUDIO extends TYPE
    /* 4 */ val AUDIO: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.TYPE.AUDIO with Double = js.native
    
    @js.native
    sealed trait IMAGE extends TYPE
    /* 3 */ val IMAGE: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.TYPE.IMAGE with Double = js.native
    
    @js.native
    sealed trait JSON extends TYPE
    /* 1 */ val JSON: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.TYPE.JSON with Double = js.native
    
    @js.native
    sealed trait TEXT extends TYPE
    /* 6 */ val TEXT: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.TYPE.TEXT with Double = js.native
    
    @js.native
    sealed trait UNKNOWN extends TYPE
    /* 0 */ val UNKNOWN: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.TYPE.UNKNOWN with Double = js.native
    
    @js.native
    sealed trait VIDEO extends TYPE
    /* 5 */ val VIDEO: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.TYPE.VIDEO with Double = js.native
    
    @js.native
    sealed trait XML extends TYPE
    /* 2 */ val XML: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.TYPE.XML with Double = js.native
  }
  
  @js.native
  sealed trait XHR_RESPONSE_TYPE extends StObject
  /**
    * The XHR ready states, used internally.
    *
    * @static
    * @readonly
    * @enum {string}
    */
  @JSImport("resource-loader", "Resource.XHR_RESPONSE_TYPE")
  @js.native
  object XHR_RESPONSE_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[XHR_RESPONSE_TYPE with Double] = js.native
    
    @js.native
    sealed trait BLOB extends XHR_RESPONSE_TYPE
    /* 2 */ val BLOB: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.XHR_RESPONSE_TYPE.BLOB with Double = js.native
    
    @js.native
    sealed trait BUFFER extends XHR_RESPONSE_TYPE
    /* 1 */ val BUFFER: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.XHR_RESPONSE_TYPE.BUFFER with Double = js.native
    
    @js.native
    sealed trait DEFAULT extends XHR_RESPONSE_TYPE
    /* 0 */ val DEFAULT: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.XHR_RESPONSE_TYPE.DEFAULT with Double = js.native
    
    @js.native
    sealed trait DOCUMENT extends XHR_RESPONSE_TYPE
    /* 3 */ val DOCUMENT: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.XHR_RESPONSE_TYPE.DOCUMENT with Double = js.native
    
    @js.native
    sealed trait JSON extends XHR_RESPONSE_TYPE
    /* 4 */ val JSON: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.XHR_RESPONSE_TYPE.JSON with Double = js.native
    
    @js.native
    sealed trait TEXT extends XHR_RESPONSE_TYPE
    /* 5 */ val TEXT: typingsSlinky.resourceLoader.resourceLoaderMod.Resource.XHR_RESPONSE_TYPE.TEXT with Double = js.native
  }
  
  /**
    * Sets the load type to be used for a specific extension.
    *
    * @static
    * @param {string} extname - The extension to set the type for, e.g. "png" or "fnt"
    * @param {Resource.LOAD_TYPE} loadType - The load type to set it to.
    */
  /* static member */
  @JSImport("resource-loader", "Resource.setExtensionLoadType")
  @js.native
  def setExtensionLoadType(extname: String, loadType: LOAD_TYPE): Unit = js.native
  
  /**
    * Sets the load type to be used for a specific extension.
    *
    * @static
    * @param {string} extname - The extension to set the type for, e.g. "png" or "fnt"
    * @param {Resource.XHR_RESPONSE_TYPE} xhrType - The xhr type to set it to.
    */
  /* static member */
  @JSImport("resource-loader", "Resource.setExtensionXhrType")
  @js.native
  def setExtensionXhrType(extname: String, xhrType: XHR_RESPONSE_TYPE): Unit = js.native
  
  /**
    * @memberof Resource
    * @typedef {object} IMetadata
    * @property {HTMLImageElement|HTMLAudioElement|HTMLVideoElement} [loadElement=null] - The
    *      element to use for loading, instead of creating one.
    * @property {boolean} [skipSource=false] - Skips adding source(s) to the load element. This
    *      is useful if you want to pass in a `loadElement` that you already added load sources to.
    * @property {string|string[]} [mimeType] - The mime type to use for the source element
    *      of a video/audio elment. If the urls are an array, you can pass this as an array as well
    *      where each index is the mime type to use for the corresponding url index.
    */
  @js.native
  trait IMetadata extends StObject {
    
    var loadElement: js.UndefOr[HTMLImageElement | HTMLAudioElement | HTMLVideoElement] = js.native
    
    var mimeType: js.UndefOr[String | js.Array[String]] = js.native
    
    var skipSource: js.UndefOr[Boolean] = js.native
  }
  object IMetadata {
    
    @scala.inline
    def apply(): IMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMetadata]
    }
    
    @scala.inline
    implicit class IMetadataMutableBuilder[Self <: IMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadElement(value: HTMLImageElement | HTMLAudioElement | HTMLVideoElement): Self = StObject.set(x, "loadElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadElementHTMLAudioElement(value: HTMLAudioElement): Self = StObject.set(x, "loadElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadElementHTMLImageElement(value: HTMLImageElement): Self = StObject.set(x, "loadElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadElementHTMLVideoElement(value: HTMLVideoElement): Self = StObject.set(x, "loadElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadElementUndefined: Self = StObject.set(x, "loadElement", js.undefined)
      
      @scala.inline
      def setMimeType(value: String | js.Array[String]): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      @scala.inline
      def setMimeTypeVarargs(value: String*): Self = StObject.set(x, "mimeType", js.Array(value :_*))
      
      @scala.inline
      def setSkipSource(value: Boolean): Self = StObject.set(x, "skipSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipSourceUndefined: Self = StObject.set(x, "skipSource", js.undefined)
    }
  }
  
  /**
    * When the resource finishes loading.
    *
    * @memberof Resource
    * @callback OnCompleteSignal
    * @param {Resource} resource - The resource that the event happened on.
    */
  type OnCompleteSignal = js.Function1[/* resource */ Resource, Unit]
  
  /**
    * When the resource reports loading progress.
    *
    * @memberof Resource
    * @callback OnProgressSignal
    * @param {Resource} resource - The resource that the event happened on.
    * @param {number} percentage - The progress of the load in the range [0, 1].
    */
  type OnProgressSignal = js.Function2[/* resource */ Resource, /* percentage */ Double, Unit]
  
  /**
    * When the resource starts to load.
    *
    * @memberof Resource
    * @callback OnStartSignal
    * @param {Resource} resource - The resource that the event happened on.
    */
  type OnStartSignal = js.Function1[/* resource */ Resource, Unit]
}
