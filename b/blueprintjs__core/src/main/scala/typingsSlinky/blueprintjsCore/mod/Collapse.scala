package typingsSlinky.blueprintjsCore.mod

import typingsSlinky.blueprintjsCore.anon.AnimationState
import typingsSlinky.blueprintjsCore.anon.Height
import typingsSlinky.blueprintjsCore.collapseMod.ICollapseProps
import typingsSlinky.blueprintjsCore.collapseMod.ICollapseState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", "Collapse")
@js.native
class Collapse ()
  extends typingsSlinky.blueprintjsCore.componentsMod.Collapse

/* static members */
@JSImport("@blueprintjs/core", "Collapse")
@js.native
object Collapse extends js.Object {
  var defaultProps: ICollapseProps = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(props: ICollapseProps, state: ICollapseState): AnimationState | Height = js.native
}

