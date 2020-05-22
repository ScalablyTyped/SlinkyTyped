package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.PushpinOptions
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.anon.PartialPushpinOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Pushpin")
@js.native
class Pushpin ()
  extends typingsSlinky.materializeCss.M.Pushpin {
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: PushpinOptions = js.native
  /**
    * Original offsetTop of element
    */
  /* CompleteClass */
  override var originalOffset: Double = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
}

/* static members */
@JSImport("materialize-css", "Pushpin")
@js.native
object Pushpin extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Pushpin = js.native
  /**
    * Init Pushpins
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.Pushpin] = js.native
  def init(els: MElements, options: PartialPushpinOptions): js.Array[typingsSlinky.materializeCss.M.Pushpin] = js.native
  /**
    * Init Pushpin
    */
  def init(els: Element): typingsSlinky.materializeCss.M.Pushpin = js.native
  def init(els: Element, options: PartialPushpinOptions): typingsSlinky.materializeCss.M.Pushpin = js.native
}

