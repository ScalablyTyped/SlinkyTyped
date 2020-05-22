package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.TooltipOptions
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.anon.PartialTooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Tooltip")
@js.native
class Tooltip ()
  extends typingsSlinky.materializeCss.M.Tooltip {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * If tooltip is hovered.
    */
  /* CompleteClass */
  override var isHovered: Boolean = js.native
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: TooltipOptions = js.native
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
@JSImport("materialize-css", "Tooltip")
@js.native
object Tooltip extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Tooltip = js.native
  /**
    * Init Tooltips
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.Tooltip] = js.native
  def init(els: MElements, options: PartialTooltipOptions): js.Array[typingsSlinky.materializeCss.M.Tooltip] = js.native
  /**
    * Init Tooltip
    */
  def init(els: Element): typingsSlinky.materializeCss.M.Tooltip = js.native
  def init(els: Element, options: PartialTooltipOptions): typingsSlinky.materializeCss.M.Tooltip = js.native
}

