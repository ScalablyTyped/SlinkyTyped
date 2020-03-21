package typingsSlinky.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stackItemTypesMod {
  type IStackItemComponent = typingsSlinky.uifabricFoundation.libIcomponentMod.IComponent[
    typingsSlinky.officeUiFabricReact.stackItemTypesMod.IStackItemProps, 
    typingsSlinky.officeUiFabricReact.stackItemTypesMod.IStackItemTokens, 
    typingsSlinky.officeUiFabricReact.stackItemTypesMod.IStackItemStyles, 
    typingsSlinky.officeUiFabricReact.stackItemTypesMod.IStackItemProps, 
    js.Object
  ]
  type IStackItemSlot = typingsSlinky.uifabricFoundation.libIslotsMod.ISlotProp[typingsSlinky.officeUiFabricReact.stackItemTypesMod.IStackItemProps, scala.Nothing]
  type IStackItemStylesReturnType = typingsSlinky.std.ReturnType[
    typingsSlinky.std.Extract[
      typingsSlinky.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject[
        typingsSlinky.officeUiFabricReact.stackItemTypesMod.IStackItemProps, 
        typingsSlinky.officeUiFabricReact.stackItemTypesMod.IStackItemTokens, 
        typingsSlinky.officeUiFabricReact.stackItemTypesMod.IStackItemStyles
      ], 
      js.Function
    ]
  ]
  type IStackItemTokenReturnType = typingsSlinky.std.ReturnType[
    typingsSlinky.std.Extract[
      typingsSlinky.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject[
        typingsSlinky.officeUiFabricReact.stackItemTypesMod.IStackItemProps, 
        typingsSlinky.officeUiFabricReact.stackItemTypesMod.IStackItemTokens
      ], 
      js.Function
    ]
  ]
}
