package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * identifies a control.
  *
  * Implementations of this interface are abstract windows. The main reason to instantiate this implementation is to show the window on the screen. Before
  * the window appears on the screen, the {@link XControl.createPeer()} method must be called.
  *
  * If the implementation of the control does not distinguish between model, view and controller, it must allow to set a new {@link XGraphics} in the
  * view, so that the control can be printed.
  */
@js.native
trait XControl extends XComponent {
  /** gets the context of the control. */
  var Context: XInterface = js.native
  /** returns the model for this control. */
  var Model: XControlModel = js.native
  /** returns the peer which was previously created or set. */
  val Peer: XWindowPeer = js.native
  /** returns the view of this control. */
  val View: XView = js.native
  /**
    * creates a "child" window on the screen.
    *
    * If the parent is NULL, then the desktop window of the toolkit is the parent.
    */
  def createPeer(Toolkit: XToolkit, Parent: XWindowPeer): Unit = js.native
  /** gets the context of the control. */
  def getContext(): XInterface = js.native
  /** returns the model for this control. */
  def getModel(): XControlModel = js.native
  /** returns the peer which was previously created or set. */
  def getPeer(): XWindowPeer = js.native
  /** returns the view of this control. */
  def getView(): XView = js.native
  /** returns `TRUE` if the control is in design mode, `FALSE` otherwise. */
  def isDesignMode(): Boolean = js.native
  /** returns `TRUE` if the control is transparent, `FALSE` otherwise. */
  def isTransparent(): Boolean = js.native
  /** sets the context of the control. */
  def setContext(Context: XInterface): Unit = js.native
  /**
    * sets the design mode for use in a design editor.
    *
    * Normally the control will be painted directly without a peer.
    */
  def setDesignMode(bOn: Boolean): Unit = js.native
  /** sets a model for the control. */
  def setModel(Model: XControlModel): Boolean = js.native
}

object XControl {
  @scala.inline
  def apply(
    Context: XInterface,
    Model: XControlModel,
    Peer: XWindowPeer,
    View: XView,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    createPeer: (XToolkit, XWindowPeer) => Unit,
    dispose: () => Unit,
    getContext: () => XInterface,
    getModel: () => XControlModel,
    getPeer: () => XWindowPeer,
    getView: () => XView,
    isDesignMode: () => Boolean,
    isTransparent: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setContext: XInterface => Unit,
    setDesignMode: Boolean => Unit,
    setModel: XControlModel => Boolean
  ): XControl = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), getContext = js.Any.fromFunction0(getContext), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setModel = js.Any.fromFunction1(setModel))
    __obj.asInstanceOf[XControl]
  }
  @scala.inline
  implicit class XControlOps[Self <: XControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: XInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: XControlModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeer(value: XWindowPeer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Peer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: XView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("View")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatePeer(value: (XToolkit, XWindowPeer) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createPeer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetContext(value: () => XInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetModel(value: () => XControlModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPeer(value: () => XWindowPeer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPeer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetView(value: () => XView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDesignMode(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDesignMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsTransparent(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTransparent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetContext(value: XInterface => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContext")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDesignMode(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDesignMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetModel(value: XControlModel => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModel")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

