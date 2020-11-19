package typingsSlinky.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object stackTypesMod {
  
  type IStackComponent = typingsSlinky.uifabricFoundation.libIcomponentMod.IComponent[
    typingsSlinky.officeUiFabricReact.stackTypesMod.IStackProps, 
    typingsSlinky.officeUiFabricReact.stackTypesMod.IStackTokens, 
    typingsSlinky.officeUiFabricReact.stackTypesMod.IStackStyles, 
    typingsSlinky.officeUiFabricReact.stackTypesMod.IStackProps, 
    js.Object
  ]
  
  type IStackSlot = typingsSlinky.uifabricFoundation.libIslotsMod.ISlotProp[typingsSlinky.officeUiFabricReact.stackTypesMod.IStackProps, scala.Nothing]
  
  type IStackStylesReturnType = typingsSlinky.std.ReturnType[
    typingsSlinky.std.Extract[
      typingsSlinky.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject[
        typingsSlinky.officeUiFabricReact.stackTypesMod.IStackProps, 
        typingsSlinky.officeUiFabricReact.stackTypesMod.IStackTokens, 
        typingsSlinky.officeUiFabricReact.stackTypesMod.IStackStyles
      ], 
      js.Function
    ]
  ]
  
  type IStackTokenReturnType = typingsSlinky.std.ReturnType[
    typingsSlinky.std.Extract[
      typingsSlinky.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject[
        typingsSlinky.officeUiFabricReact.stackTypesMod.IStackProps, 
        typingsSlinky.officeUiFabricReact.stackTypesMod.IStackTokens
      ], 
      js.Function
    ]
  ]
}
