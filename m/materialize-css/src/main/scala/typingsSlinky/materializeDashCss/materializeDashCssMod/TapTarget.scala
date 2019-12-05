package typingsSlinky.materializeDashCss.materializeDashCssMod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeDashCss.M.TapTargetOptions
import typingsSlinky.materializeDashCss.MElements
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "TapTarget")
@js.native
class TapTarget ()
  extends typingsSlinky.materializeDashCss.M.TapTarget

/* static members */
@JSImport("materialize-css", "TapTarget")
@js.native
object TapTarget extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeDashCss.M.TapTarget = js.native
  /**
    * Init TapTargets
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeDashCss.M.TapTarget] = js.native
  def init(els: MElements, options: Partial[TapTargetOptions]): js.Array[typingsSlinky.materializeDashCss.M.TapTarget] = js.native
  /**
    * Init TapTarget
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeDashCss.M.TapTarget = js.native
  def init(els: typingsSlinky.std.Element, options: Partial[TapTargetOptions]): typingsSlinky.materializeDashCss.M.TapTarget = js.native
}

