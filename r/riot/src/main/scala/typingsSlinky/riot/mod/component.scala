package typingsSlinky.riot.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.riot.anon.ParentScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("riot", "component")
@js.native
object component extends js.Object {
  
  def apply[Props, State](shell: RiotComponentShell[Props, State]): js.Function3[
    /* el */ HTMLElement, 
    /* initialProps */ js.UndefOr[Props], 
    /* meta */ js.UndefOr[ParentScope], 
    RiotComponent[Props, State]
  ] = js.native
}
