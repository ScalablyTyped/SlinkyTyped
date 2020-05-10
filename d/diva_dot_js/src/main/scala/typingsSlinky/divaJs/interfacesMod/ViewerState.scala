package typingsSlinky.divaJs.interfacesMod

import org.scalajs.dom.experimental.Response
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.divaJs.handlersMod.ViewHandler
import typingsSlinky.divaJs.imageManifestMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewerState extends js.Object {
  var ID: String = js.native
  var activePageIndex: Double = js.native
  var currentPageIndices: js.Array[Double] = js.native
  var horizontalOffset: Double = js.native
  var horizontalPadding: Double = js.native
  var initialKeyScroll: Boolean = js.native
  var initialSpaceScroll: Boolean = js.native
  var innerElement: HTMLElement = js.native
  var innerObject: HTMLElement = js.native
  var isActiveDiva: Boolean = js.native
  var isScrollable: Boolean = js.native
  var isZooming: Boolean = js.native
  var loaded: Boolean = js.native
  var manifest: default = js.native
  var mobileWebkit: Boolean = js.native
  var numPages: Double = js.native
  var oldZoomLevel: Double = js.native
  var options: Options = js.native
  var outerElement: HTMLElement = js.native
  var outerObject: HTMLElement = js.native
  var pageOverlays: js.Object = js.native
   // new PageOverlayManager();
  var pageTools: js.Array[js.Object] = js.native
   // plugins as page tools
  var parentObject: HTMLElement = js.native
  var pendingManifestRequest: js.Promise[Response] = js.native
  var pluginInstances: js.Array[js.Object] = js.native
   // enabled plugins from the registr;
  var renderer: typingsSlinky.divaJs.rendererMod.default = js.native
  var resizeTimer: Double = js.native
  var scrollbarWidth: Double = js.native
  var selector: String = js.native
  var throbberTimeoutID: Double = js.native
  var toolbar: js.Object = js.native
  var verticalOffset: Double = js.native
  var verticalPadding: Double = js.native
  var viewHandler: ViewHandler = js.native
  var viewport: typingsSlinky.divaJs.viewportMod.default = js.native
  var viewportElement: HTMLElement = js.native
  var viewportObject: HTMLElement = js.native
  var zoomDuration: Double = js.native
}

object ViewerState {
  @scala.inline
  def apply(
    ID: String,
    activePageIndex: Double,
    currentPageIndices: js.Array[Double],
    horizontalOffset: Double,
    horizontalPadding: Double,
    initialKeyScroll: Boolean,
    initialSpaceScroll: Boolean,
    innerElement: HTMLElement,
    innerObject: HTMLElement,
    isActiveDiva: Boolean,
    isScrollable: Boolean,
    isZooming: Boolean,
    loaded: Boolean,
    manifest: default,
    mobileWebkit: Boolean,
    numPages: Double,
    oldZoomLevel: Double,
    options: Options,
    outerElement: HTMLElement,
    outerObject: HTMLElement,
    pageOverlays: js.Object,
    pageTools: js.Array[js.Object],
    parentObject: HTMLElement,
    pendingManifestRequest: js.Promise[Response],
    pluginInstances: js.Array[js.Object],
    renderer: typingsSlinky.divaJs.rendererMod.default,
    resizeTimer: Double,
    scrollbarWidth: Double,
    selector: String,
    throbberTimeoutID: Double,
    toolbar: js.Object,
    verticalOffset: Double,
    verticalPadding: Double,
    viewHandler: ViewHandler,
    viewport: typingsSlinky.divaJs.viewportMod.default,
    viewportElement: HTMLElement,
    viewportObject: HTMLElement,
    zoomDuration: Double
  ): ViewerState = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], activePageIndex = activePageIndex.asInstanceOf[js.Any], currentPageIndices = currentPageIndices.asInstanceOf[js.Any], horizontalOffset = horizontalOffset.asInstanceOf[js.Any], horizontalPadding = horizontalPadding.asInstanceOf[js.Any], initialKeyScroll = initialKeyScroll.asInstanceOf[js.Any], initialSpaceScroll = initialSpaceScroll.asInstanceOf[js.Any], innerElement = innerElement.asInstanceOf[js.Any], innerObject = innerObject.asInstanceOf[js.Any], isActiveDiva = isActiveDiva.asInstanceOf[js.Any], isScrollable = isScrollable.asInstanceOf[js.Any], isZooming = isZooming.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], mobileWebkit = mobileWebkit.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any], oldZoomLevel = oldZoomLevel.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], outerElement = outerElement.asInstanceOf[js.Any], outerObject = outerObject.asInstanceOf[js.Any], pageOverlays = pageOverlays.asInstanceOf[js.Any], pageTools = pageTools.asInstanceOf[js.Any], parentObject = parentObject.asInstanceOf[js.Any], pendingManifestRequest = pendingManifestRequest.asInstanceOf[js.Any], pluginInstances = pluginInstances.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], resizeTimer = resizeTimer.asInstanceOf[js.Any], scrollbarWidth = scrollbarWidth.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], throbberTimeoutID = throbberTimeoutID.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any], verticalOffset = verticalOffset.asInstanceOf[js.Any], verticalPadding = verticalPadding.asInstanceOf[js.Any], viewHandler = viewHandler.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], viewportObject = viewportObject.asInstanceOf[js.Any], zoomDuration = zoomDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewerState]
  }
  @scala.inline
  implicit class ViewerStateOps[Self <: ViewerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivePageIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activePageIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentPageIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPageIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHorizontalPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialKeyScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialKeyScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialSpaceScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSpaceScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerObject(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActiveDiva(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActiveDiva")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsScrollable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScrollable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsZooming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isZooming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManifest(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobileWebkit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileWebkit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumPages(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldZoomLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterObject(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageOverlays(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageOverlays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageTools(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageTools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentObject(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingManifestRequest(value: js.Promise[Response]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingManifestRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluginInstances(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderer(value: typingsSlinky.divaJs.rendererMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResizeTimer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeTimer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbarWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThrobberTimeoutID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throbberTimeoutID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolbar(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewHandler(value: ViewHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewport(value: typingsSlinky.divaJs.viewportMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportObject(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomDuration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

