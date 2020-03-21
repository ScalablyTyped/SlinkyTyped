package typingsSlinky.rcFieldForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formMod {
  type RenderProps = js.Function2[
    /* values */ typingsSlinky.rcFieldForm.interfaceMod.Store, 
    /* form */ typingsSlinky.rcFieldForm.interfaceMod.FormInstance, 
    slinky.core.facade.ReactElement | slinky.core.TagMod[scala.Any]
  ]
}
