package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.PartialTapTargetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "TapTarget")
@js.native
class TapTarget ()
  extends typingsSlinky.materializeCss.M.TapTarget

/* static members */
@JSImport("materialize-css", "TapTarget")
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

