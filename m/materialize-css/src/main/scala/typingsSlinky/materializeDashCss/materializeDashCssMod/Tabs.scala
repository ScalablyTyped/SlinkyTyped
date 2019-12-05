package typingsSlinky.materializeDashCss.materializeDashCssMod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeDashCss.M.TabsOptions
import typingsSlinky.materializeDashCss.MElements
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Tabs")
@js.native
class Tabs ()
  extends typingsSlinky.materializeDashCss.M.Tabs

/* static members */
@JSImport("materialize-css", "Tabs")
@js.native
object Tabs extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeDashCss.M.Tabs = js.native
  /**
    * Init Tabses
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeDashCss.M.Tabs] = js.native
  def init(els: MElements, options: Partial[TabsOptions]): js.Array[typingsSlinky.materializeDashCss.M.Tabs] = js.native
  /**
    * Init Tabs
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeDashCss.M.Tabs = js.native
  def init(els: typingsSlinky.std.Element, options: Partial[TabsOptions]): typingsSlinky.materializeDashCss.M.Tabs = js.native
}

