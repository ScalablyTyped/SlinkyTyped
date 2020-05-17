package typingsSlinky.reactTether.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactTether {
  type RenderProp = js.Function1[
    /* ref */ slinky.core.facade.ReactRef[org.scalajs.dom.raw.Element], 
    slinky.core.TagMod[scala.Any]
  ]
}
