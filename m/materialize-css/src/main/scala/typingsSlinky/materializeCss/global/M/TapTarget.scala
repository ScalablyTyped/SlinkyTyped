package typingsSlinky.materializeCss.global.M

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.TapTargetOptions
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.anon.PartialTapTargetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.TapTarget")
@js.native
class TapTarget ()
  extends typingsSlinky.materializeCss.M.TapTarget {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * If the tap target is open
    */
  /* CompleteClass */
  override var isOpen: Boolean = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: TapTargetOptions = js.native
  /**
    * Close Tap Target
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Open Tap Target
    */
  /* CompleteClass */
  override def open(): Unit = js.native
}

/* static members */
@JSGlobal("M.TapTarget")
@js.native
object TapTarget extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.TapTarget = js.native
  /**
    * Init TapTargets
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.TapTarget] = js.native
  def init(els: MElements, options: PartialTapTargetOptions): js.Array[typingsSlinky.materializeCss.M.TapTarget] = js.native
  /**
    * Init TapTarget
    */
  def init(els: Element): typingsSlinky.materializeCss.M.TapTarget = js.native
  def init(els: Element, options: PartialTapTargetOptions): typingsSlinky.materializeCss.M.TapTarget = js.native
}

