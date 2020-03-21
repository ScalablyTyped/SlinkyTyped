package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.PartialTabsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Tabs")
@js.native
class Tabs ()
  extends typingsSlinky.materializeCss.M.Tabs

/* static members */
@JSImport("materialize-css", "Tabs")
@js.native
object Tabs extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Tabs = js.native
  /**
    * Init Tabses
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.Tabs] = js.native
  def init(els: MElements, options: PartialTabsOptions): js.Array[typingsSlinky.materializeCss.M.Tabs] = js.native
  /**
    * Init Tabs
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeCss.M.Tabs = js.native
  def init(els: typingsSlinky.std.Element, options: PartialTabsOptions): typingsSlinky.materializeCss.M.Tabs = js.native
}

