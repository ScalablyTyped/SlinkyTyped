package typingsSlinky.phoenixLiveView

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Node
import typingsSlinky.phoenix.mod.Socket
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Browser {
    
    @JSImport("phoenix_live_view", "Browser.canPushState")
    @js.native
    def canPushState(): Boolean = js.native
    
    @JSImport("phoenix_live_view", "Browser.dropLocal")
    @js.native
    def dropLocal(namespace: String, subkey: String): js.Any = js.native
    
    @JSImport("phoenix_live_view", "Browser.fetchPage")
    @js.native
    def fetchPage(href: String, callback: js.Function2[/* status */ Double, /* resp */ js.UndefOr[String], _]): js.Any = js.native
    
    @JSImport("phoenix_live_view", "Browser.getCookie")
    @js.native
    def getCookie(name: String): String = js.native
    
    @JSImport("phoenix_live_view", "Browser.getHashTargetEl")
    @js.native
    def getHashTargetEl(hash: js.Any): HTMLElement | Null = js.native
    
    @JSImport("phoenix_live_view", "Browser.getLocal")
    @js.native
    def getLocal(namespace: String, subkey: String): js.Any = js.native
    
    @JSImport("phoenix_live_view", "Browser.localKey")
    @js.native
    def localKey(namespace: String, subkey: String): String = js.native
    
    @JSImport("phoenix_live_view", "Browser.pushState")
    @js.native
    def pushState(kind: js.Any, meta: js.Any, to: String): Unit = js.native
    
    @JSImport("phoenix_live_view", "Browser.redirect")
    @js.native
    def redirect(toURL: String, flash: js.Any): Unit = js.native
    
    @JSImport("phoenix_live_view", "Browser.setCookie")
    @js.native
    def setCookie(name: String, value: String): Unit = js.native
    
    @JSImport("phoenix_live_view", "Browser.updateLocal")
    @js.native
    def updateLocal(namespace: String, subkey: String, initial: js.Any, func: js.Function1[/* current */ js.Any, _]): js.Any = js.native
  }
  
  object DOM {
    
    @JSImport("phoenix_live_view", "DOM.all")
    @js.native
    def all(node: Node, query: String, callback: js.Function1[/* el */ HTMLElement, HTMLElement]): js.Array[HTMLElement] = js.native
    
    @JSImport("phoenix_live_view", "DOM.byId")
    @js.native
    def byId(id: String): HTMLElement | Unit = js.native
    
    @JSImport("phoenix_live_view", "DOM.cleanChildNodes")
    @js.native
    def cleanChildNodes(container: js.Any, phxUpdate: js.Any): Unit = js.native
    
    @JSImport("phoenix_live_view", "DOM.cloneNode")
    @js.native
    def cloneNode(node: Node, html: js.Any): Node = js.native
    
    @JSImport("phoenix_live_view", "DOM.copyPrivates")
    @js.native
    def copyPrivates(target: HTMLElement, source: HTMLElement): Unit = js.native
    
    @JSImport("phoenix_live_view", "DOM.debounce")
    @js.native
    def debounce(
      el: HTMLElement,
      event: Event,
      phxDebounce: String,
      defaultDebounce: String,
      phxThrottle: String,
      defaultThrottle: String,
      callback: js.Function0[_]
    ): js.Any = js.native
    @JSImport("phoenix_live_view", "DOM.debounce")
    @js.native
    def debounce(
      el: HTMLElement,
      event: Event,
      phxDebounce: String,
      defaultDebounce: String,
      phxThrottle: String,
      defaultThrottle: Null,
      callback: js.Function0[_]
    ): js.Any = js.native
    @JSImport("phoenix_live_view", "DOM.debounce")
    @js.native
    def debounce(
      el: HTMLElement,
      event: Event,
      phxDebounce: String,
      defaultDebounce: Null,
      phxThrottle: String,
      defaultThrottle: String,
      callback: js.Function0[_]
    ): js.Any = js.native
    @JSImport("phoenix_live_view", "DOM.debounce")
    @js.native
    def debounce(
      el: HTMLElement,
      event: Event,
      phxDebounce: String,
      defaultDebounce: Null,
      phxThrottle: String,
      defaultThrottle: Null,
      callback: js.Function0[_]
    ): js.Any = js.native
    
    @JSImport("phoenix_live_view", "DOM.deletePrivate")
    @js.native
    def deletePrivate(el: HTMLElement, key: String): Unit = js.native
    
    @JSImport("phoenix_live_view", "DOM.discardError")
    @js.native
    def discardError(container: HTMLElement, el: HTMLElement, phxFeedbackFor: String): Unit = js.native
    
    @JSImport("phoenix_live_view", "DOM.dispatchEvent")
    @js.native
    def dispatchEvent(target: Node, eventString: String): Unit = js.native
    @JSImport("phoenix_live_view", "DOM.dispatchEvent")
    @js.native
    def dispatchEvent(target: Node, eventString: String, detail: js.Object): Unit = js.native
    
    @JSImport("phoenix_live_view", "DOM.findComponentNode")
    @js.native
    def findComponentNode(node: Node, cid: Double): js.Array[HTMLElement] = js.native
    
    @JSImport("phoenix_live_view", "DOM.findParentCIDs")
    @js.native
    def findParentCIDs(node: Node, cids: js.Array[Double]): Set[Double] = js.native
    
    @JSImport("phoenix_live_view", "DOM.findPhxChildren")
    @js.native
    def findPhxChildren(el: HTMLElement, parentId: String): js.Array[HTMLElement] = js.native
    
    @JSImport("phoenix_live_view", "DOM.findPhxChildrenInFragment")
    @js.native
    def findPhxChildrenInFragment(html: String, parentId: String): js.Array[HTMLElement] = js.native
    
    @JSImport("phoenix_live_view", "DOM.incCycle")
    @js.native
    def incCycle(el: HTMLElement, key: String): Double = js.native
    @JSImport("phoenix_live_view", "DOM.incCycle")
    @js.native
    def incCycle(el: HTMLElement, key: String, trigger: js.Any): Double = js.native
    
    @JSImport("phoenix_live_view", "DOM.isFormInput")
    @js.native
    def isFormInput(el: HTMLElement): Boolean = js.native
    
    @JSImport("phoenix_live_view", "DOM.isNowTriggerFormExternal")
    @js.native
    def isNowTriggerFormExternal(el: HTMLElement, phxTriggerExternal: String): Boolean = js.native
    
    @JSImport("phoenix_live_view", "DOM.isPhxChild")
    @js.native
    def isPhxChild(el: HTMLElement): Boolean = js.native
    
    @JSImport("phoenix_live_view", "DOM.isPhxUpdate")
    @js.native
    def isPhxUpdate(el: HTMLElement, phxUpdate: js.Any, updateTypes: js.Array[String]): Boolean = js.native
    
    @JSImport("phoenix_live_view", "DOM.isTextualInput")
    @js.native
    def isTextualInput(el: HTMLElement): Boolean = js.native
    
    @JSImport("phoenix_live_view", "DOM.mergeAttrs")
    @js.native
    def mergeAttrs(target: HTMLElement, source: HTMLElement): Unit = js.native
    @JSImport("phoenix_live_view", "DOM.mergeAttrs")
    @js.native
    def mergeAttrs(target: HTMLElement, source: HTMLElement, exclude: js.Array[String]): Unit = js.native
    
    @JSImport("phoenix_live_view", "DOM.mergeFocusedInput")
    @js.native
    def mergeFocusedInput(target: HTMLElement, source: HTMLElement): Unit = js.native
    
    @JSImport("phoenix_live_view", "DOM.once")
    @js.native
    def once(el: HTMLElement, key: String): Boolean = js.native
    
    @JSImport("phoenix_live_view", "DOM.putPrivate")
    @js.native
    def putPrivate(el: HTMLElement, key: String, value: js.Any): Unit = js.native
    
    @JSImport("phoenix_live_view", "DOM.putTitle")
    @js.native
    def putTitle(str: String): Unit = js.native
    
    @JSImport("phoenix_live_view", "DOM.removeClass")
    @js.native
    def removeClass(el: HTMLElement, className: String): Unit = js.native
    
    @JSImport("phoenix_live_view", "DOM.restoreFocus")
    @js.native
    def restoreFocus(focused: HTMLElement, selectionStart: Double, selectionEnd: Double): Unit = js.native
    
    @JSImport("phoenix_live_view", "DOM.syncAttrsToProps")
    @js.native
    def syncAttrsToProps(el: HTMLElement): Unit = js.native
    
    @JSImport("phoenix_live_view", "DOM.syncPendingRef")
    @js.native
    def syncPendingRef(ref: Double, fromEl: HTMLElement, toEl: HTMLElement): Boolean = js.native
    @JSImport("phoenix_live_view", "DOM.syncPendingRef")
    @js.native
    def syncPendingRef(ref: Null, fromEl: HTMLElement, toEl: HTMLElement): Boolean = js.native
    
    @JSImport("phoenix_live_view", "DOM.triggerCycle")
    @js.native
    def triggerCycle(el: HTMLElement, key: String): Unit = js.native
    @JSImport("phoenix_live_view", "DOM.triggerCycle")
    @js.native
    def triggerCycle(el: HTMLElement, key: String, currentCycle: Double): Unit = js.native
  }
  
  @JSImport("phoenix_live_view", "LiveSocket")
  @js.native
  class LiveSocket protected () extends StObject {
    // phxSocket should be the Socket class (LiveSocket will use the constructor)
    def this(url: String, phxSocket: js.Any, opts: SocketOptions) = this()
    
    // public
    def connect(): Unit = js.native
    
    def disableDebug(): Unit = js.native
    
    def disableLatencySim(): Unit = js.native
    
    def disableProfiling(): Unit = js.native
    
    def disconnect(callback: js.Any): Unit = js.native
    
    def enableDebug(): Unit = js.native
    
    def enableLatencySim(upperBoundMs: Double): Unit = js.native
    
    def enableProfiling(): Unit = js.native
    
    def getLatencySim(): Double | Null = js.native
    
    def getSocket(): Socket = js.native
    
    def isDebugEnabled(): Boolean = js.native
    
    def isPhxView(el: HTMLElement): Boolean = js.native
    
    def isProfileEnabled(): Boolean = js.native
  }
  
  @JSImport("phoenix_live_view", "Rendered")
  @js.native
  class Rendered protected () extends StObject {
    def this(viewId: String, rendered: js.Any) = this()
    
    // public
    def componentCIDs(diff: js.Any): js.Array[Double] = js.native
    
    def componentToString(cid: Double): String = js.native
    
    def expandStatics(diff: js.Any): Unit = js.native
    
    def getComponent(diff: js.Any, cid: Double): js.Any = js.native
    
    def isComponentOnlyDiff(diff: js.Any): Boolean = js.native
    
    def mergeDiff(diff: js.Any): Unit = js.native
    
    def parentViewId(): String = js.native
    
    def pruneCIDs(cids: js.Array[Double]): js.Any = js.native
    
    def recursiveMerge(target: js.Object, source: js.Object): Unit = js.native
    
    def recursiveToString(rendered: js.Any, components: js.Any): String = js.native
    def recursiveToString(rendered: js.Any, components: js.Any, onlyCids: js.Array[Double]): String = js.native
    
    def toString(onlyCids: js.Array[Double]): String = js.native
  }
  
  @JSImport("phoenix_live_view", "View")
  @js.native
  class View protected () extends StObject {
    def this(el: HTMLElement, liveSocket: LiveSocket, parentView: View, href: String, o: js.Any) = this()
    
    def ackJoin(child: js.Any): Unit = js.native
    
    def addHook(el: HTMLElement): Unit = js.native
    
    def applyJoinPatch(live_patch: js.Any, html: js.Any, events: js.Array[js.Tuple2[String, js.Object]]): Unit = js.native
    
    def applyPendingUpdates(): Unit = js.native
    
    def attachTrueDocEl(): Unit = js.native
    
    def bindChannel(): Unit = js.native
    
    def binding(kind: String): js.Any = js.native
    
    def closestComponentID(): Double | Null = js.native
    def closestComponentID(targetCtx: js.Object): Double | Null = js.native
    
    def componentID(el: HTMLElement): Double | Null = js.native
    
    def componentPatch(diff: js.Any, cid: Double): Boolean = js.native
    
    def connectParams(): js.Object = js.native
    
    def destroy(): Unit = js.native
    def destroy(callback: js.Function0[Unit]): Unit = js.native
    
    def destroyAllChildren(): Unit = js.native
    
    def destroyDescendent(id: String): js.Any = js.native
    
    def destroyHook(hook: ViewHookInterface): Unit = js.native
    
    def dispatchEvents(events: js.Array[js.Tuple2[String, js.Object]]): Unit = js.native
    
    def displayError(): Unit = js.native
    
    def dropPendingRefs(): Unit = js.native
    
    def expandURL(to: String): String = js.native
    
    def extractMeta(el: HTMLElement, meta: js.Object): js.Object = js.native
    
    def formsForRecovery(html: String): js.Array[HTMLElement] = js.native
    
    def getChildById(id: String): js.Any = js.native
    
    def getDescendentByEl(el: HTMLElement): js.Any = js.native
    
    def getHook(el: HTMLElement): ViewHookInterface = js.native
    
    def getSession(): String = js.native
    
    def getStatic(): String | Null = js.native
    
    def hideLoader(): Unit = js.native
    
    def isConnected(): Boolean = js.native
    
    def isDestroyed(): Boolean = js.native
    
    def isJoinPending(): Boolean = js.native
    
    def isLoading(): Boolean = js.native
    
    def isMain(): Boolean = js.native
    
    def join(): js.Any = js.native
    def join(callback: js.Function2[/* view */ this.type, /* joinCount */ Double, Unit]): js.Any = js.native
    
    def joinChild(el: HTMLElement): js.Any = js.native
    
    def joinNewChildren(): Unit = js.native
    
    def log(kind: String, msgCallback: js.Any): Unit = js.native
    
    def maybePushComponentsDestroyed(destroyedCIDs: js.Array[Double]): js.Any = js.native
    
    def name(): String = js.native
    
    def onAllChildJoinsComplete(): Unit = js.native
    
    def onChannel(event: String, cb: js.Function1[/* resp */ js.Any, Unit]): Unit = js.native
    
    def onClose(): Unit = js.native
    
    def onError(reason: js.Any): Unit = js.native
    
    def onJoin(resp: js.Object): Unit = js.native
    
    def onJoinComplete(resp: js.Object, html: js.Any, events: js.Array[js.Tuple2[String, js.Object]]): Unit = js.native
    
    def onJoinError(resp: js.Object): Unit = js.native
    
    def onLivePatch(redir: js.Object): Unit = js.native
    
    def onLiveRedirect(redir: js.Object): Unit = js.native
    
    def onRedirect(redir: js.Object): Unit = js.native
    
    def ownsElement(el: HTMLElement): Boolean = js.native
    
    def performPatch(patch: js.Any, pruneCids: Boolean): Boolean = js.native
    
    def pushEvent(`type`: String, el: HTMLElement, targetCtx: js.Object, phxEvent: String, meta: js.Object): Unit = js.native
    def pushEvent(`type`: String, el: HTMLElement, targetCtx: Null, phxEvent: String, meta: js.Object): Unit = js.native
    
    def pushFormRecovery(form: HTMLElement, callback: js.Any): Unit = js.native
    
    def pushFormSubmit(inputEl: HTMLElement, targetCtx: js.Object, kind: String, phxEvent: String, onReply: js.Any): Unit = js.native
    def pushFormSubmit(inputEl: HTMLElement, targetCtx: Null, kind: String, phxEvent: String, onReply: js.Any): Unit = js.native
    
    def pushHookEvent(targetCtx: js.Object, event: String, payload: js.Object): Unit = js.native
    def pushHookEvent(targetCtx: Null, event: String, payload: js.Object): Unit = js.native
    
    def pushInput(inputEl: HTMLElement, targetCtx: js.Object, kind: String, phxEvent: String, callback: js.Any): Unit = js.native
    def pushInput(inputEl: HTMLElement, targetCtx: Null, kind: String, phxEvent: String, callback: js.Any): Unit = js.native
    
    def pushKey(keyElement: HTMLElement, targetCtx: js.Object, kind: String, phxEvent: String, meta: js.Object): Unit = js.native
    def pushKey(keyElement: HTMLElement, targetCtx: Null, kind: String, phxEvent: String, meta: js.Object): Unit = js.native
    
    def pushLinkPatch(href: String, targetEl: HTMLElement, callback: js.Any): Unit = js.native
    
    def pushWithReply(refGenerator: js.Any, event: String, payload: js.Object, onReply: js.Any): js.Any = js.native
    
    def putRef(elements: js.Array[HTMLElement], event: String): js.Tuple2[Double, js.Array[HTMLElement]] = js.native
    
    def renderContainer(diff: js.Any, kind: String): String = js.native
    
    def setContainerClasses(classes: js.Any*): Unit = js.native
    
    def showLoader(): Unit = js.native
    def showLoader(timeout: Double): Unit = js.native
    
    def submitForm(form: HTMLElement, targetCtx: js.Object, phxEvent: String): Unit = js.native
    def submitForm(form: HTMLElement, targetCtx: Null, phxEvent: String): Unit = js.native
    
    def targetComponentID(target: HTMLElement): Double | Null = js.native
    def targetComponentID(target: HTMLElement, targetCtx: js.Object): Double | Null = js.native
    
    def triggerBeforeUpdate(fromEl: HTMLElement, toEl: HTMLElement): js.Any = js.native
    
    def triggerReconnected(): Unit = js.native
    
    def triggerUpdatedHook(hook: js.Any): Unit = js.native
    
    def undoRefs(ref: Double): Unit = js.native
    
    def update(diff: js.Any, events: js.Array[js.Tuple2[String, js.Object]]): Unit = js.native
  }
  
  @JSImport("phoenix_live_view", "debug")
  @js.native
  def debug(view: View, kind: String, msg: js.Object, obj: js.Object): Unit = js.native
  
  type BindCallback = js.Function7[
    /* e */ Event, 
    /* event */ String, 
    /* view */ View, 
    /* el */ HTMLElement, 
    /* targetCtx */ js.Object, 
    /* phxEvent */ String, 
    /* windowOwner */ js.UndefOr[String], 
    Unit
  ]
  
  @js.native
  trait Defaults extends StObject {
    
    var debounce: js.UndefOr[Double] = js.native
    
    var throttle: js.UndefOr[Double] = js.native
  }
  object Defaults {
    
    @scala.inline
    def apply(): Defaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Defaults]
    }
    
    @scala.inline
    implicit class DefaultsMutableBuilder[Self <: Defaults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
      
      @scala.inline
      def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    }
  }
  
  @js.native
  trait DomOptions extends StObject {
    
    var childrenOnly: js.UndefOr[Boolean] = js.native
    
    var getNodeKey: js.UndefOr[js.Function1[/* node */ Node, _]] = js.native
    
    var onBeforeElChildrenUpdated: js.UndefOr[js.Function2[/* fromEl */ HTMLElement, /* toEl */ HTMLElement, Boolean]] = js.native
    
    var onBeforeElUpdated: js.UndefOr[js.Function2[/* fromEl */ HTMLElement, /* toEl */ HTMLElement, Boolean]] = js.native
    
    var onBeforeNodeAdded: js.UndefOr[js.Function1[/* node */ Node, Node]] = js.native
    
    var onBeforeNodeDiscarded: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.native
    
    var onElUpdated: js.UndefOr[js.Function1[/* el */ HTMLElement, Unit]] = js.native
    
    var onNodeAdded: js.UndefOr[js.Function1[/* node */ Node, Node]] = js.native
    
    var onNodeDiscarded: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.native
  }
  object DomOptions {
    
    @scala.inline
    def apply(): DomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomOptions]
    }
    
    @scala.inline
    implicit class DomOptionsMutableBuilder[Self <: DomOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildrenOnly(value: Boolean): Self = StObject.set(x, "childrenOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenOnlyUndefined: Self = StObject.set(x, "childrenOnly", js.undefined)
      
      @scala.inline
      def setGetNodeKey(value: /* node */ Node => _): Self = StObject.set(x, "getNodeKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetNodeKeyUndefined: Self = StObject.set(x, "getNodeKey", js.undefined)
      
      @scala.inline
      def setOnBeforeElChildrenUpdated(value: (/* fromEl */ HTMLElement, /* toEl */ HTMLElement) => Boolean): Self = StObject.set(x, "onBeforeElChildrenUpdated", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBeforeElChildrenUpdatedUndefined: Self = StObject.set(x, "onBeforeElChildrenUpdated", js.undefined)
      
      @scala.inline
      def setOnBeforeElUpdated(value: (/* fromEl */ HTMLElement, /* toEl */ HTMLElement) => Boolean): Self = StObject.set(x, "onBeforeElUpdated", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnBeforeElUpdatedUndefined: Self = StObject.set(x, "onBeforeElUpdated", js.undefined)
      
      @scala.inline
      def setOnBeforeNodeAdded(value: /* node */ Node => Node): Self = StObject.set(x, "onBeforeNodeAdded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeNodeAddedUndefined: Self = StObject.set(x, "onBeforeNodeAdded", js.undefined)
      
      @scala.inline
      def setOnBeforeNodeDiscarded(value: /* node */ Node => Boolean): Self = StObject.set(x, "onBeforeNodeDiscarded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeNodeDiscardedUndefined: Self = StObject.set(x, "onBeforeNodeDiscarded", js.undefined)
      
      @scala.inline
      def setOnElUpdated(value: /* el */ HTMLElement => Unit): Self = StObject.set(x, "onElUpdated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnElUpdatedUndefined: Self = StObject.set(x, "onElUpdated", js.undefined)
      
      @scala.inline
      def setOnNodeAdded(value: /* node */ Node => Node): Self = StObject.set(x, "onNodeAdded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNodeAddedUndefined: Self = StObject.set(x, "onNodeAdded", js.undefined)
      
      @scala.inline
      def setOnNodeDiscarded(value: /* node */ Node => Unit): Self = StObject.set(x, "onNodeDiscarded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNodeDiscardedUndefined: Self = StObject.set(x, "onNodeDiscarded", js.undefined)
    }
  }
  
  @js.native
  trait SocketOptions extends StObject {
    
    var bindingPrefix: js.UndefOr[String] = js.native
    
    var defaults: js.UndefOr[Defaults] = js.native
    
    var dom: js.UndefOr[DomOptions] = js.native
    
    var hooks: js.UndefOr[js.Object] = js.native
    
    var loaderTimeout: js.UndefOr[Double] = js.native
    
    var params: js.UndefOr[js.Object] = js.native
    
    var viewLogger: js.UndefOr[ViewLogger] = js.native
  }
  object SocketOptions {
    
    @scala.inline
    def apply(): SocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocketOptions]
    }
    
    @scala.inline
    implicit class SocketOptionsMutableBuilder[Self <: SocketOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBindingPrefix(value: String): Self = StObject.set(x, "bindingPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindingPrefixUndefined: Self = StObject.set(x, "bindingPrefix", js.undefined)
      
      @scala.inline
      def setDefaults(value: Defaults): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      @scala.inline
      def setDom(value: DomOptions): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
      
      @scala.inline
      def setHooks(value: js.Object): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      @scala.inline
      def setLoaderTimeout(value: Double): Self = StObject.set(x, "loaderTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaderTimeoutUndefined: Self = StObject.set(x, "loaderTimeout", js.undefined)
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setViewLogger(value: (/* view */ View, /* kind */ String, /* msg */ js.Any, /* obj */ js.Any) => Unit): Self = StObject.set(x, "viewLogger", js.Any.fromFunction4(value))
      
      @scala.inline
      def setViewLoggerUndefined: Self = StObject.set(x, "viewLogger", js.undefined)
    }
  }
  
  @js.native
  trait ViewHookInterface extends StObject {
    
    var beforeDestroy: js.UndefOr[js.Function0[Unit]] = js.native
    
    var beforeUpdate: js.UndefOr[js.Function0[Unit]] = js.native
    
    var destroyed: js.UndefOr[js.Function0[Unit]] = js.native
    
    var disconnected: js.UndefOr[js.Function0[Unit]] = js.native
    
    var el: HTMLElement = js.native
    
    def handleEvent(event: String, callback: js.Function1[/* payload */ js.Object, Unit]): Unit = js.native
    
    // callbacks
    var mounted: js.UndefOr[js.Function0[Unit]] = js.native
    
    def pushEvent(event: String, payload: js.Object): Unit = js.native
    def pushEvent(event: String, payload: js.Object, onReply: js.Function2[/* reply */ js.Any, /* ref */ Double, _]): Unit = js.native
    
    def pushEventTo(selectorOrTarget: js.Any, event: String, payload: js.Object): Unit = js.native
    def pushEventTo(
      selectorOrTarget: js.Any,
      event: String,
      payload: js.Object,
      onReply: js.Function2[/* reply */ js.Any, /* ref */ Double, _]
    ): Unit = js.native
    
    var reconnected: js.UndefOr[js.Function0[Unit]] = js.native
    
    var updated: js.UndefOr[js.Function0[Unit]] = js.native
    
    var viewName: String = js.native
  }
  
  type ViewLogger = js.Function4[/* view */ View, /* kind */ String, /* msg */ js.Any, /* obj */ js.Any, Unit]
}
