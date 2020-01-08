package typingsSlinky.riot.riotMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.riot.Anon_AttributesSlots
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot", "component")
@js.native
object component extends js.Object {
  def apply[Props, State](shell: RiotComponentShell[Props, State]): js.Function3[
    /* el */ HTMLElement, 
    /* initialProps */ js.UndefOr[Props], 
    /* meta */ js.UndefOr[Anon_AttributesSlots], 
    RiotComponent[Props, State]
  ] = js.native
}

