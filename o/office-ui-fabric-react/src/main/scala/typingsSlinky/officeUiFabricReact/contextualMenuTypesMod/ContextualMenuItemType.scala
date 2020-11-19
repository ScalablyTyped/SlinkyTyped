package typingsSlinky.officeUiFabricReact.contextualMenuTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContextualMenuItemType extends js.Object
@JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.types", "ContextualMenuItemType")
@js.native
object ContextualMenuItemType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContextualMenuItemType with Double] = js.native
  
  @js.native
  sealed trait Divider extends ContextualMenuItemType
  /* 1 */ @js.native
  object Divider extends TopLevel[Divider with Double]
  
  @js.native
  sealed trait Header extends ContextualMenuItemType
  /* 2 */ @js.native
  object Header extends TopLevel[Header with Double]
  
  @js.native
  sealed trait Normal extends ContextualMenuItemType
  /* 0 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
  @js.native
  sealed trait Section extends ContextualMenuItemType
  /* 3 */ @js.native
  object Section extends TopLevel[Section with Double]
}
