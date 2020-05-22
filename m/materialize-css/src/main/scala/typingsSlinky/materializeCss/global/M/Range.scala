package typingsSlinky.materializeCss.global.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.MElements
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Range")
@js.native
class Range ()
  extends typingsSlinky.materializeCss.M.Component[js.UndefOr[scala.Nothing]] {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: js.UndefOr[scala.Nothing] = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
}

/* static members */
@JSGlobal("M.Range")
@js.native
object Range extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Range = js.native
  /**
    * Init Ranges
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.Range] = js.native
  def init(els: MElements, options: Partial[js.UndefOr[scala.Nothing]]): js.Array[typingsSlinky.materializeCss.M.Range] = js.native
  /**
    * Init Range
    */
  def init(els: Element): typingsSlinky.materializeCss.M.Range = js.native
  def init(els: Element, options: Partial[js.UndefOr[scala.Nothing]]): typingsSlinky.materializeCss.M.Range = js.native
}

