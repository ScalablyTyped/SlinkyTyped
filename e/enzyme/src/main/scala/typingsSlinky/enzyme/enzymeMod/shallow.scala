package typingsSlinky.enzyme.enzymeMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme", "shallow")
@js.native
object shallow extends js.Object {
  def apply[P](node: ReactElement): ShallowWrapper[P, _, ReactComponentClass[js.Object]] = js.native
  def apply[P](node: ReactElement, options: ShallowRendererProps): ShallowWrapper[P, _, ReactComponentClass[js.Object]] = js.native
}

