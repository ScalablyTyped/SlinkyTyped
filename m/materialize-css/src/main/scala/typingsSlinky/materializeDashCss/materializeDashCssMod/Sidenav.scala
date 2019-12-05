package typingsSlinky.materializeDashCss.materializeDashCssMod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeDashCss.M.SidenavOptions
import typingsSlinky.materializeDashCss.MElements
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Sidenav")
@js.native
class Sidenav ()
  extends typingsSlinky.materializeDashCss.M.Sidenav

/* static members */
@JSImport("materialize-css", "Sidenav")
@js.native
object Sidenav extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeDashCss.M.Sidenav = js.native
  /**
    * Init Sidenavs
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeDashCss.M.Sidenav] = js.native
  def init(els: MElements, options: Partial[SidenavOptions]): js.Array[typingsSlinky.materializeDashCss.M.Sidenav] = js.native
  /**
    * Init Sidenav
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeDashCss.M.Sidenav = js.native
  def init(els: typingsSlinky.std.Element, options: Partial[SidenavOptions]): typingsSlinky.materializeDashCss.M.Sidenav = js.native
}

