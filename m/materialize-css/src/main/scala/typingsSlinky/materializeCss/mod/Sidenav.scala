package typingsSlinky.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.MElements
import typingsSlinky.materializeCss.PartialSidenavOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Sidenav")
@js.native
class Sidenav ()
  extends typingsSlinky.materializeCss.M.Sidenav

/* static members */
@JSImport("materialize-css", "Sidenav")
@js.native
object Sidenav extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsSlinky.materializeCss.M.Sidenav = js.native
  /**
    * Init Sidenavs
    */
  def init(els: MElements): js.Array[typingsSlinky.materializeCss.M.Sidenav] = js.native
  def init(els: MElements, options: PartialSidenavOptions): js.Array[typingsSlinky.materializeCss.M.Sidenav] = js.native
  /**
    * Init Sidenav
    */
  def init(els: typingsSlinky.std.Element): typingsSlinky.materializeCss.M.Sidenav = js.native
  def init(els: typingsSlinky.std.Element, options: PartialSidenavOptions): typingsSlinky.materializeCss.M.Sidenav = js.native
}

