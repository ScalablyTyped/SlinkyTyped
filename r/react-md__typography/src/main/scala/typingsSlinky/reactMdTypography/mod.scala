package typingsSlinky.reactMdTypography

import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdTypography.srOnlyMod.SrOnlyProps
import typingsSlinky.reactMdTypography.textContainerMod.TextContainerProps
import typingsSlinky.reactMdTypography.textMod.TextElement
import typingsSlinky.reactMdTypography.textMod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/typography", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val SrOnly: ForwardRefExoticComponent[SrOnlyProps with RefAttributes[TextElement]] = js.native
  
  val Text: ForwardRefExoticComponent[TextProps with RefAttributes[TextElement]] = js.native
  
  val TextContainer: ForwardRefExoticComponent[
    TextContainerProps with (RefAttributes[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
    ])
  ] = js.native
}
