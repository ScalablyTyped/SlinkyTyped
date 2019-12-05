package typingsSlinky.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsStackStackDotTypesMod {
  import typingsSlinky.atUifabricFoundation.libIComponentMod.IComponent
  import typingsSlinky.atUifabricFoundation.libIComponentMod.IComponentStyles
  import typingsSlinky.atUifabricFoundation.libIComponentMod.IStylesFunctionOrObject
  import typingsSlinky.atUifabricFoundation.libIComponentMod.ITokenFunctionOrObject
  import typingsSlinky.atUifabricFoundation.libISlotsMod.ISlotProp
  import typingsSlinky.std.Extract
  import typingsSlinky.std.ReturnType

  type IStackComponent = IComponent[IStackProps, IStackTokens, IStackStyles, IStackProps, js.Object]
  type IStackSlot = ISlotProp[IStackProps, scala.Nothing]
  type IStackStyles = IComponentStyles[IStackSlots]
  type IStackStylesReturnType = ReturnType[
    Extract[IStylesFunctionOrObject[IStackProps, IStackTokens, IStackStyles], js.Function]
  ]
  type IStackTokenReturnType = ReturnType[Extract[ITokenFunctionOrObject[IStackProps, IStackTokens], js.Function]]
}
