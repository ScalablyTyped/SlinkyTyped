package typingsSlinky.activexLibreoffice.com_.sun.star.embed

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.KeyEvent
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Size
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XDispatchProvider
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XLayoutManager
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents common functionality for inplace clients. */
@js.native
trait XInplaceClient extends XInterface {
  /**
    * gets the inplace object clip rectangle.
    *
    * The rectangle is provided in object's parent window coordinates in pixels. The intersection of position and clip rectangles specifies the visible part
    * of the object.
    * @returns specifies a new clip rectangle
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  val ClipRectangle: Rectangle = js.native
  /**
    * allows to retrieve the container's dispatch provider.
    * @returns reference to object implementing the {@link com.sun.star.frame.XDispatchProvider}
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  val InplaceDispatchProvider: XDispatchProvider = js.native
  /**
    * allows to retrieve the {@link com.sun.star.frame.LayoutManager} of the container.
    * @returns reference to object representing the {@link com.sun.star.frame.LayoutManager} of the container
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  val LayoutManager: XLayoutManager = js.native
  /**
    * gets the inplace object position rectangle.
    *
    * The rectangle is provided in object's parent window coordinates in pixels. The intersection of position and clip rectangles specifies the visible part
    * of the object. In case the position window has a size that is bigger than object's size, the object should either scale or deactivate.
    * @returns specifies a new position rectangle
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  val Placement: Rectangle = js.native
  /**
    * notifies container through the client that the object is to be inplace activated.
    * @throws com::sun::star::embed::WrongStateException the container is not ready for activation
    */
  def activatingInplace(): Unit = js.native
  /**
    * notifies container through the client that the object is to be UI-activated.
    * @throws com::sun::star::embed::WrongStateException the container is not ready for activation
    */
  def activatingUI(): Unit = js.native
  /**
    * checks if the container can activate the object inplace.
    * @returns `TRUE` the container can activate the object inplace. `FALSE` otherwise.
    */
  def canInplaceActivate(): Boolean = js.native
  /**
    * notifies the container that the position of the object is changed.
    * @param aPosRect specifies a new position rectangle
    * @throws com::sun::star::embed::WrongStateException the object state is not correct
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def changedPlacement(aPosRect: Rectangle): Unit = js.native
  /**
    * notifies container through the client that the object is deactivated.
    * @throws com::sun::star::embed::WrongStateException the container is not ready for deactivation
    */
  def deactivatedInplace(): Unit = js.native
  /**
    * notifies container through the client that the object is UI-deactivated.
    *
    * After this notification the container can restore it's own UI and take focus.
    * @throws com::sun::star::embed::WrongStateException the container is not ready for deactivation
    */
  def deactivatedUI(): Unit = js.native
  /**
    * gets the inplace object clip rectangle.
    *
    * The rectangle is provided in object's parent window coordinates in pixels. The intersection of position and clip rectangles specifies the visible part
    * of the object.
    * @returns specifies a new clip rectangle
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  def getClipRectangle(): Rectangle = js.native
  /**
    * allows to retrieve the container's dispatch provider.
    * @returns reference to object implementing the {@link com.sun.star.frame.XDispatchProvider}
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  def getInplaceDispatchProvider(): XDispatchProvider = js.native
  /**
    * allows to retrieve the {@link com.sun.star.frame.LayoutManager} of the container.
    * @returns reference to object representing the {@link com.sun.star.frame.LayoutManager} of the container
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  def getLayoutManager(): XLayoutManager = js.native
  /**
    * gets the inplace object position rectangle.
    *
    * The rectangle is provided in object's parent window coordinates in pixels. The intersection of position and clip rectangles specifies the visible part
    * of the object. In case the position window has a size that is bigger than object's size, the object should either scale or deactivate.
    * @returns specifies a new position rectangle
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  def getPlacement(): Rectangle = js.native
  /**
    * scrolls the object.
    * @param aOffset scrolls the object to specified offset in pixels
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state
    */
  def scrollObject(aOffset: Size): Unit = js.native
  /**
    * provides accelerator table the object wants to use while it is inplace active.
    * @param aKeys an accelerator table from object
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state
    */
  def translateAccelerators(aKeys: SeqEquiv[KeyEvent]): Unit = js.native
}

object XInplaceClient {
  @scala.inline
  def apply(
    ClipRectangle: Rectangle,
    InplaceDispatchProvider: XDispatchProvider,
    LayoutManager: XLayoutManager,
    Placement: Rectangle,
    acquire: () => Unit,
    activatingInplace: () => Unit,
    activatingUI: () => Unit,
    canInplaceActivate: () => Boolean,
    changedPlacement: Rectangle => Unit,
    deactivatedInplace: () => Unit,
    deactivatedUI: () => Unit,
    getClipRectangle: () => Rectangle,
    getInplaceDispatchProvider: () => XDispatchProvider,
    getLayoutManager: () => XLayoutManager,
    getPlacement: () => Rectangle,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    scrollObject: Size => Unit,
    translateAccelerators: SeqEquiv[KeyEvent] => Unit
  ): XInplaceClient = {
    val __obj = js.Dynamic.literal(ClipRectangle = ClipRectangle.asInstanceOf[js.Any], InplaceDispatchProvider = InplaceDispatchProvider.asInstanceOf[js.Any], LayoutManager = LayoutManager.asInstanceOf[js.Any], Placement = Placement.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), activatingInplace = js.Any.fromFunction0(activatingInplace), activatingUI = js.Any.fromFunction0(activatingUI), canInplaceActivate = js.Any.fromFunction0(canInplaceActivate), changedPlacement = js.Any.fromFunction1(changedPlacement), deactivatedInplace = js.Any.fromFunction0(deactivatedInplace), deactivatedUI = js.Any.fromFunction0(deactivatedUI), getClipRectangle = js.Any.fromFunction0(getClipRectangle), getInplaceDispatchProvider = js.Any.fromFunction0(getInplaceDispatchProvider), getLayoutManager = js.Any.fromFunction0(getLayoutManager), getPlacement = js.Any.fromFunction0(getPlacement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), scrollObject = js.Any.fromFunction1(scrollObject), translateAccelerators = js.Any.fromFunction1(translateAccelerators))
    __obj.asInstanceOf[XInplaceClient]
  }
  @scala.inline
  implicit class XInplaceClientOps[Self <: XInplaceClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClipRectangle(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClipRectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInplaceDispatchProvider(value: XDispatchProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InplaceDispatchProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayoutManager(value: XLayoutManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayoutManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacement(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivatingInplace(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activatingInplace")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withActivatingUI(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activatingUI")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCanInplaceActivate(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canInplaceActivate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChangedPlacement(value: Rectangle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changedPlacement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeactivatedInplace(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivatedInplace")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeactivatedUI(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivatedUI")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetClipRectangle(value: () => Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClipRectangle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInplaceDispatchProvider(value: () => XDispatchProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInplaceDispatchProvider")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLayoutManager(value: () => XLayoutManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLayoutManager")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPlacement(value: () => Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPlacement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScrollObject(value: Size => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollObject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTranslateAccelerators(value: SeqEquiv[KeyEvent] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translateAccelerators")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

