package typingsSlinky.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ElementType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/Button/Button.types", "ElementType")
@js.native
object ElementType extends js.Object {
  /** <a> element. */
  @js.native
  sealed trait anchor extends ElementType
  
  /** <button> element. */
  @js.native
  sealed trait button extends ElementType
  
  /* 1 */ val anchor: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ElementType.anchor with Double = js.native
  /* 0 */ val button: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.ElementType.button with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ElementType with Double] = js.native
}

