package typingsSlinky.blueprintjsCore.componentsMod

import typingsSlinky.blueprintjsCore.anon.AnimationState
import typingsSlinky.blueprintjsCore.anon.Height
import typingsSlinky.blueprintjsCore.collapseMod.ICollapseProps
import typingsSlinky.blueprintjsCore.collapseMod.ICollapseState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Collapse")
@js.native
class Collapse protected ()
  extends typingsSlinky.blueprintjsCore.collapseMod.Collapse {
  def this(props: ICollapseProps) = this()
  def this(props: ICollapseProps, context: js.Any) = this()
}
/* static members */
object Collapse {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Collapse")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Collapse.defaultProps")
  @js.native
  def defaultProps: ICollapseProps = js.native
  @scala.inline
  def defaultProps_=(x: ICollapseProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Collapse.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Collapse.getDerivedStateFromProps")
  @js.native
  def getDerivedStateFromProps(props: ICollapseProps, state: ICollapseState): AnimationState | Height | Null = js.native
}
