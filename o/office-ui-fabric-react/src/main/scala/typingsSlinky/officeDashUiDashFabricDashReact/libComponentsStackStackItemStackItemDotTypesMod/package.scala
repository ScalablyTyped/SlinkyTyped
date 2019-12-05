package typingsSlinky.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsStackStackItemStackItemDotTypesMod {
  import typingsSlinky.atUifabricFoundation.libIComponentMod.IComponent
  import typingsSlinky.atUifabricFoundation.libIComponentMod.IComponentStyles
  import typingsSlinky.atUifabricFoundation.libIComponentMod.IStylesFunctionOrObject
  import typingsSlinky.atUifabricFoundation.libIComponentMod.ITokenFunctionOrObject
  import typingsSlinky.atUifabricFoundation.libISlotsMod.ISlotProp
  import typingsSlinky.std.Extract
  import typingsSlinky.std.ReturnType

  type IStackItemComponent = IComponent[IStackItemProps, IStackItemTokens, IStackItemStyles, IStackItemProps, js.Object]
  type IStackItemSlot = ISlotProp[IStackItemProps, scala.Nothing]
  type IStackItemStyles = IComponentStyles[IStackItemSlots]
  type IStackItemStylesReturnType = ReturnType[
    Extract[
      IStylesFunctionOrObject[IStackItemProps, IStackItemTokens, IStackItemStyles], 
      js.Function
    ]
  ]
  type IStackItemTokenReturnType = ReturnType[Extract[ITokenFunctionOrObject[IStackItemProps, IStackItemTokens], js.Function]]
}
