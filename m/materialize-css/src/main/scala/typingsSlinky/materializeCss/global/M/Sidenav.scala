package typingsSlinky.materializeCss.global.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.SidenavOptions
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.anon.PartialSidenavOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Sidenav")
@js.native
class Sidenav ()
  extends typingsSlinky.materializeCss.M.Sidenav {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * Describes if Sidenav is being dragged
    */
  /* CompleteClass */
  override var isDragged: Boolean = js.native
  /**
    * Describes if sidenav is fixed
    */
  /* CompleteClass */
  override var isFixed: Boolean = js.native
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: SidenavOptions = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def open(): Unit = js.native
}

/* static members */
@JSGlobal("M.Sidenav")
@js.native
object Sidenav extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Sidenav = js.native
  /**
    * Init Sidenavs
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.Sidenav] = js.native
  def init(els: MElements, options: PartialSidenavOptions): js.Array[typingsSlinky.materializeCss.M.Sidenav] = js.native
  /**
    * Init Sidenav
    */
  def init(els: Element): typingsSlinky.materializeCss.M.Sidenav = js.native
  def init(els: Element, options: PartialSidenavOptions): typingsSlinky.materializeCss.M.Sidenav = js.native
}

