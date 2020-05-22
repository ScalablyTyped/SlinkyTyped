package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.ChipsOptions
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.anon.PartialChipsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Chips")
@js.native
class Chips ()
  extends typingsSlinky.materializeCss.M.Chips {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: ChipsOptions = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
}

/* static members */
@JSImport("materialize-css", "Chips")
@js.native
object Chips extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Chips = js.native
  /**
    * Init Chipses
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.Chips] = js.native
  def init(els: MElements, options: PartialChipsOptions): js.Array[typingsSlinky.materializeCss.M.Chips] = js.native
  /**
    * Init Chips
    */
  def init(els: Element): typingsSlinky.materializeCss.M.Chips = js.native
  def init(els: Element, options: PartialChipsOptions): typingsSlinky.materializeCss.M.Chips = js.native
}

