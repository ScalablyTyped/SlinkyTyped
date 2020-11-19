package typingsSlinky.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object textTypesMod {
  
  type ITextComponent = typingsSlinky.uifabricFoundation.libIcomponentMod.IComponent[
    typingsSlinky.officeUiFabricReact.textTypesMod.ITextProps, 
    typingsSlinky.officeUiFabricReact.textTypesMod.ITextTokens, 
    typingsSlinky.officeUiFabricReact.textTypesMod.ITextStyles, 
    typingsSlinky.officeUiFabricReact.textTypesMod.ITextProps, 
    js.Object
  ]
  
  type ITextSlot = typingsSlinky.uifabricFoundation.libIslotsMod.ISlotProp[typingsSlinky.officeUiFabricReact.textTypesMod.ITextProps, java.lang.String]
  
  type ITextStylesReturnType = typingsSlinky.std.ReturnType[
    typingsSlinky.std.Extract[
      typingsSlinky.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject[
        typingsSlinky.officeUiFabricReact.textTypesMod.ITextProps, 
        typingsSlinky.officeUiFabricReact.textTypesMod.ITextTokens, 
        typingsSlinky.officeUiFabricReact.textTypesMod.ITextStyles
      ], 
      js.Function
    ]
  ]
  
  type ITextTokenReturnType = typingsSlinky.std.ReturnType[
    typingsSlinky.std.Extract[
      typingsSlinky.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject[
        typingsSlinky.officeUiFabricReact.textTypesMod.ITextProps, 
        typingsSlinky.officeUiFabricReact.textTypesMod.ITextTokens
      ], 
      js.Function
    ]
  ]
}
