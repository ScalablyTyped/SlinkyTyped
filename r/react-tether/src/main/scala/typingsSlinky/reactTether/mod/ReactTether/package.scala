package typingsSlinky.reactTether.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactTether {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.reactTether.reactTetherStrings.window
    - typingsSlinky.reactTether.reactTetherStrings.scrollParent
    - typingsSlinky.std.HTMLElement
  */
  type ContraintsTo = typingsSlinky.reactTether.mod.ReactTether._ContraintsTo | java.lang.String | org.scalajs.dom.raw.HTMLElement
  type RenderProp = js.Function1[
    /* ref */ slinky.core.facade.ReactRef[org.scalajs.dom.raw.Element], 
    slinky.core.TagMod[scala.Any]
  ]
}
