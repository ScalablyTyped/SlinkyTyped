package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.MaterialboxOptions
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.anon.PartialMaterialboxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Materialbox")
@js.native
class Materialbox ()
  extends typingsSlinky.materializeCss.M.Materialbox {
  /**
    * Caption if specified
    */
  /* CompleteClass */
  override var caption: String = js.native
  /**
    * If the materialbox is no longer being animated
    */
  /* CompleteClass */
  override var doneAnimating: Boolean = js.native
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  override var el: Element = js.native
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  override var options: MaterialboxOptions = js.native
  /**
    * Original height of image
    */
  /* CompleteClass */
  override var originalHeight: Double = js.native
  /**
    * Original width of image
    */
  /* CompleteClass */
  override var originalWidth: Double = js.native
  /**
    * If the materialbox overlay is showing
    */
  /* CompleteClass */
  override var overlayActive: Boolean = js.native
  /**
    * Close materialbox
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Open materialbox
    */
  /* CompleteClass */
  override def open(): Unit = js.native
}

/* static members */
@JSImport("materialize-css", "Materialbox")
@js.native
object Materialbox extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Materialbox = js.native
  /**
    * Init Materialboxes
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.Materialbox] = js.native
  def init(els: MElements, options: PartialMaterialboxOptions): js.Array[typingsSlinky.materializeCss.M.Materialbox] = js.native
  /**
    * Init Materialbox
    */
  def init(els: Element): typingsSlinky.materializeCss.M.Materialbox = js.native
  def init(els: Element, options: PartialMaterialboxOptions): typingsSlinky.materializeCss.M.Materialbox = js.native
}

