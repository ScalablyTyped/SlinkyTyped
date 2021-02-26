package typingsSlinky.officeUiFabricReact.detailsListTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CheckboxVisibility extends StObject
@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.types", "CheckboxVisibility")
@js.native
object CheckboxVisibility extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CheckboxVisibility with Double] = js.native
  
  /** Visible always. */
  @js.native
  sealed trait always extends CheckboxVisibility
  /* 1 */ val always: typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.always with Double = js.native
  
  /** Hide checkboxes. */
  @js.native
  sealed trait hidden extends CheckboxVisibility
  /* 2 */ val hidden: typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.hidden with Double = js.native
  
  /** Visible on hover. */
  @js.native
  sealed trait onHover extends CheckboxVisibility
  /* 0 */ val onHover: typingsSlinky.officeUiFabricReact.detailsListTypesMod.CheckboxVisibility.onHover with Double = js.native
}
