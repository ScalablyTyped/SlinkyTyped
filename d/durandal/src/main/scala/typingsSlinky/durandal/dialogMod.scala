package typingsSlinky.durandal

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.durandal.compositionMod.CompositionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The dialog module enables the display of message boxes, custom modal dialogs and other overlays or slide-out UI abstractions. Dialogs are constructed by the composition system which interacts with a user defined dialog context. The dialog module enforced the activator lifecycle.
  * @requires system
  * @requires app
  * @requires composition
  * @requires activator
  * @requires viewEngine
  * @requires jquery
  * @requires knockout
  */
object dialogMod {
  
  @JSImport("plugins/dialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plugins/dialog", "MessageBox")
  @js.native
  def MessageBox: Box = js.native
  @scala.inline
  def MessageBox_=(x: Box): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MessageBox")(x.asInstanceOf[js.Any])
  
  @JSImport("plugins/dialog", "addContext")
  @js.native
  def addContext(name: String, modalContext: DialogContext): Unit = js.native
  
  @JSImport("plugins/dialog", "close")
  @js.native
  def close(obj: js.Any, results: js.Any*): Unit = js.native
  
  @JSImport("plugins/dialog", "currentZIndex")
  @js.native
  def currentZIndex: Double = js.native
  @scala.inline
  def currentZIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentZIndex")(x.asInstanceOf[js.Any])
  
  @JSImport("plugins/dialog", "getContext")
  @js.native
  def getContext(): DialogContext = js.native
  @JSImport("plugins/dialog", "getContext")
  @js.native
  def getContext(name: String): DialogContext = js.native
  
  @JSImport("plugins/dialog", "getDialog")
  @js.native
  def getDialog(obj: js.Any): Dialog = js.native
  
  @JSImport("plugins/dialog", "getNextZIndex")
  @js.native
  def getNextZIndex(): Double = js.native
  
  @JSImport("plugins/dialog", "install")
  @js.native
  def install(config: js.Object): Unit = js.native
  
  @JSImport("plugins/dialog", "isOpen")
  @js.native
  def isOpen(): Boolean = js.native
  
  @JSImport("plugins/dialog", "show")
  @js.native
  def show(obj: js.Any): DurandalPromise[_] = js.native
  @JSImport("plugins/dialog", "show")
  @js.native
  def show(obj: js.Any, activationData: js.UndefOr[scala.Nothing], context: String): DurandalPromise[_] = js.native
  @JSImport("plugins/dialog", "show")
  @js.native
  def show(obj: js.Any, activationData: js.Any): DurandalPromise[_] = js.native
  @JSImport("plugins/dialog", "show")
  @js.native
  def show(obj: js.Any, activationData: js.Any, context: String): DurandalPromise[_] = js.native
  
  @JSImport("plugins/dialog", "showMessage")
  @js.native
  def showMessage(message: String): DurandalPromise[String] = js.native
  @JSImport("plugins/dialog", "showMessage")
  @js.native
  def showMessage(
    message: String,
    title: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    autoclose: js.UndefOr[scala.Nothing],
    settings: js.Object
  ): DurandalPromise[String] = js.native
  @JSImport("plugins/dialog", "showMessage")
  @js.native
  def showMessage(
    message: String,
    title: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    autoclose: Boolean
  ): DurandalPromise[String] = js.native
  @JSImport("plugins/dialog", "showMessage")
  @js.native
  def showMessage(
    message: String,
    title: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    autoclose: Boolean,
    settings: js.Object
  ): DurandalPromise[String] = js.native
  @JSImport("plugins/dialog", "showMessage")
  @js.native
  def showMessage(message: String, title: js.UndefOr[scala.Nothing], options: js.Array[DialogButton | String]): DurandalPromise[String] = js.native
  @JSImport("plugins/dialog", "showMessage")
  @js.native
  def showMessage(
    message: String,
    title: js.UndefOr[scala.Nothing],
    options: js.Array[DialogButton | String],
    autoclose: js.UndefOr[scala.Nothing],
    settings: js.Object
  ): DurandalPromise[String] = js.native
  @JSImport("plugins/dialog", "showMessage")
  @js.native
  def showMessage(
    message: String,
    title: js.UndefOr[scala.Nothing],
    options: js.Array[DialogButton | String],
    autoclose: Boolean
  ): DurandalPromise[String] = js.native
  @JSImport("plugins/dialog", "showMessage")
  @js.native
  def showMessage(
    message: String,
    title: js.UndefOr[scala.Nothing],
    options: js.Array[DialogButton | String],
    autoclose: Boolean,
    settings: js.Object
  ): DurandalPromise[String] = js.native
  @JSImport("plugins/dialog", "showMessage")
  @js.native
  def showMessage(message: String, title: String): DurandalPromise[String] = js.native
  @JSImport("plugins/dialog", "showMessage")
  @js.native
  def showMessage(
    message: String,
    title: String,
    options: js.UndefOr[scala.Nothing],
    autoclose: js.UndefOr[scala.Nothing],
    settings: js.Object
  ): DurandalPromise[String] = js.native
  @JSImport("plugins/dialog", "showMessage")
  @js.native
  def showMessage(message: String, title: String, options: js.UndefOr[scala.Nothing], autoclose: Boolean): DurandalPromise[String] = js.native
  @JSImport("plugins/dialog", "showMessage")
  @js.native
  def showMessage(
    message: String,
    title: String,
    options: js.UndefOr[scala.Nothing],
    autoclose: Boolean,
    settings: js.Object
  ): DurandalPromise[String] = js.native
  @JSImport("plugins/dialog", "showMessage")
  @js.native
  def showMessage(message: String, title: String, options: js.Array[DialogButton | String]): DurandalPromise[String] = js.native
  @JSImport("plugins/dialog", "showMessage")
  @js.native
  def showMessage(
    message: String,
    title: String,
    options: js.Array[DialogButton | String],
    autoclose: js.UndefOr[scala.Nothing],
    settings: js.Object
  ): DurandalPromise[String] = js.native
  @JSImport("plugins/dialog", "showMessage")
  @js.native
  def showMessage(message: String, title: String, options: js.Array[DialogButton | String], autoclose: Boolean): DurandalPromise[String] = js.native
  @JSImport("plugins/dialog", "showMessage")
  @js.native
  def showMessage(
    message: String,
    title: String,
    options: js.Array[DialogButton | String],
    autoclose: Boolean,
    settings: js.Object
  ): DurandalPromise[String] = js.native
  
  /**
    * Models a message box's message, title and options.
    * @class
    */
  @js.native
  trait Box extends StObject {
    
    /**
      * Provides the view to the composition system.
      * @returns {DOMElement} The view of the message box.
      */
    def getView(): HTMLElement = js.native
    
    /**
      * Selects an option and closes the message box, returning the selected option through the dialog system's promise.
      * @param {string} dialogResult The result to select.
      */
    def selectOption(dialogResult: String): Unit = js.native
  }
  object Box {
    
    @scala.inline
    def apply(getView: () => HTMLElement, selectOption: String => Unit): Box = {
      val __obj = js.Dynamic.literal(getView = js.Any.fromFunction0(getView), selectOption = js.Any.fromFunction1(selectOption))
      __obj.asInstanceOf[Box]
    }
    
    @scala.inline
    implicit class BoxMutableBuilder[Self <: Box] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetView(value: () => HTMLElement): Self = StObject.set(x, "getView", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSelectOption(value: String => Unit): Self = StObject.set(x, "selectOption", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Dialog extends StObject {
    
    var activator: DurandalActivator[_] = js.native
    
    def close(): DurandalPromise[_] = js.native
    
    var context: DialogContext = js.native
    
    var host: HTMLElement = js.native
    
    var owner: js.Any = js.native
    
    var settings: CompositionContext = js.native
  }
  object Dialog {
    
    @scala.inline
    def apply(
      activator: DurandalActivator[_],
      close: () => DurandalPromise[_],
      context: DialogContext,
      host: HTMLElement,
      owner: js.Any,
      settings: CompositionContext
    ): Dialog = {
      val __obj = js.Dynamic.literal(activator = activator.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), context = context.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dialog]
    }
    
    @scala.inline
    implicit class DialogMutableBuilder[Self <: Dialog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivator(value: DurandalActivator[_]): Self = StObject.set(x, "activator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClose(value: () => DurandalPromise[_]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContext(value: DialogContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettings(value: CompositionContext): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DialogContext extends StObject {
    
    /**
      * In this function, you are expected to add a DOM element to the tree which will serve as the "host" for the modal's composed view. You must add a property called host to the modalWindow object which references the dom element. It is this host which is passed to the composition module.
      * @param {Dialog} theDialog The dialog model.
      */
    def addHost(theDialog: Dialog): Unit = js.native
    
    /**
      * Opacity of the blockout. The default is 0.6.
      */
    var blockoutOpacity: js.UndefOr[Double] = js.native
    
    /**
      * This function is called after the modal is fully composed into the DOM, allowing your implementation to do any final modifications, such as positioning or animation. You can obtain the original dialog object by using `getDialog` on context.model.
      * @param {DOMElement} child The dialog view.
      * @param {DOMElement} parent The parent view.
      * @param {object} context The composition context.
      */
    def compositionComplete(child: HTMLElement, parent: HTMLElement, context: CompositionContext): Unit = js.native
    
    /**
      * This function is expected to remove any DOM machinery associated with the specified dialog and do any other necessary cleanup.
      * @param {Dialog} theDialog The dialog model.
      */
    def removeHost(theDialog: Dialog): Unit = js.native
  }
  object DialogContext {
    
    @scala.inline
    def apply(
      addHost: Dialog => Unit,
      compositionComplete: (HTMLElement, HTMLElement, CompositionContext) => Unit,
      removeHost: Dialog => Unit
    ): DialogContext = {
      val __obj = js.Dynamic.literal(addHost = js.Any.fromFunction1(addHost), compositionComplete = js.Any.fromFunction3(compositionComplete), removeHost = js.Any.fromFunction1(removeHost))
      __obj.asInstanceOf[DialogContext]
    }
    
    @scala.inline
    implicit class DialogContextMutableBuilder[Self <: DialogContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddHost(value: Dialog => Unit): Self = StObject.set(x, "addHost", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBlockoutOpacity(value: Double): Self = StObject.set(x, "blockoutOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockoutOpacityUndefined: Self = StObject.set(x, "blockoutOpacity", js.undefined)
      
      @scala.inline
      def setCompositionComplete(value: (HTMLElement, HTMLElement, CompositionContext) => Unit): Self = StObject.set(x, "compositionComplete", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRemoveHost(value: Dialog => Unit): Self = StObject.set(x, "removeHost", js.Any.fromFunction1(value))
    }
  }
}
