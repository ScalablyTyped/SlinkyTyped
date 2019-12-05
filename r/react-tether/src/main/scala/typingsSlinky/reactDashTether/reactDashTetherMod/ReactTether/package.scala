package typingsSlinky.reactDashTether.reactDashTetherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactTether {
  import org.scalajs.dom.raw.HTMLElement
  import slinky.core.TagMod
  import slinky.core.facade.ReactRef

  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.reactDashTether.reactDashTetherStrings.window
    - typings.reactDashTether.reactDashTetherStrings.scrollParent
    - typings.std.HTMLElement
  */
  type ContraintsTo = _ContraintsTo | String | HTMLElement
  type RenderProp = js.Function1[/* ref */ ReactRef[HTMLElement], TagMod[Any]]
}
