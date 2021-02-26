package typingsSlinky.blueprintjsCore.componentsMod

import typingsSlinky.blueprintjsCore.anon.PartialICollapsibleListPr
import typingsSlinky.blueprintjsCore.collapsibleListMod.ICollapsibleListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "CollapsibleList")
@js.native
class CollapsibleList protected ()
  extends typingsSlinky.blueprintjsCore.collapsibleListMod.CollapsibleList {
  def this(props: ICollapsibleListProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: ICollapsibleListProps, context: js.Any) = this()
}
/* static members */
object CollapsibleList {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "CollapsibleList")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "CollapsibleList.defaultProps")
  @js.native
  def defaultProps: PartialICollapsibleListPr = js.native
  @scala.inline
  def defaultProps_=(x: PartialICollapsibleListPr): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "CollapsibleList.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
