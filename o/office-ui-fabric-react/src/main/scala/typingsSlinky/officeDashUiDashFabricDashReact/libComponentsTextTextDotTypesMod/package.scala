package typingsSlinky.officeDashUiDashFabricDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsTextTextDotTypesMod {
  import typingsSlinky.atUifabricFoundation.libIComponentMod.IComponent
  import typingsSlinky.atUifabricFoundation.libIComponentMod.IComponentStyles
  import typingsSlinky.atUifabricFoundation.libIComponentMod.IStylesFunctionOrObject
  import typingsSlinky.atUifabricFoundation.libIComponentMod.ITokenFunctionOrObject
  import typingsSlinky.atUifabricFoundation.libISlotsMod.ISlotProp
  import typingsSlinky.std.Extract
  import typingsSlinky.std.ReturnType

  type ITextComponent = IComponent[ITextProps, ITextTokens, ITextStyles, ITextProps, js.Object]
  type ITextSlot = ISlotProp[ITextProps, String]
  type ITextStyles = IComponentStyles[ITextSlots]
  type ITextStylesReturnType = ReturnType[
    Extract[IStylesFunctionOrObject[ITextProps, ITextTokens, ITextStyles], js.Function]
  ]
  type ITextTokenReturnType = ReturnType[Extract[ITokenFunctionOrObject[ITextProps, ITextTokens], js.Function]]
}
