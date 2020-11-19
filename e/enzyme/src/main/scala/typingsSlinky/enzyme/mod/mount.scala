package typingsSlinky.enzyme.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("enzyme", "mount")
@js.native
object mount extends js.Object {
  
  def apply[P](node: ReactElement): ReactWrapper[P, _, ReactComponentClass[js.Object]] = js.native
  def apply[P](node: ReactElement, options: MountRendererProps): ReactWrapper[P, _, ReactComponentClass[js.Object]] = js.native
}
