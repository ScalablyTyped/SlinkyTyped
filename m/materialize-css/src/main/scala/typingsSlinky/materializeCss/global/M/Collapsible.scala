package typingsSlinky.materializeCss.global.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.CollapsibleOptions
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.anon.PartialCollapsibleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Collapsible")
@js.native
class Collapsible ()
  extends typingsSlinky.materializeCss.M.Collapsible {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: CollapsibleOptions = js.native
  /**
    * Close collapsible section
    * @param n Nth section to close
    */
  /* CompleteClass */
  override def close(n: Double): Unit = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Open collapsible section
    * @param n Nth section to open
    */
  /* CompleteClass */
  override def open(n: Double): Unit = js.native
}

/* static members */
@JSGlobal("M.Collapsible")
@js.native
object Collapsible extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Collapsible = js.native
  /**
    * Init Collapsibles
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.Collapsible] = js.native
  def init(els: MElements, options: PartialCollapsibleOptions): js.Array[typingsSlinky.materializeCss.M.Collapsible] = js.native
  /**
    * Init Collapsible
    */
  def init(els: Element): typingsSlinky.materializeCss.M.Collapsible = js.native
  def init(els: Element, options: PartialCollapsibleOptions): typingsSlinky.materializeCss.M.Collapsible = js.native
}

