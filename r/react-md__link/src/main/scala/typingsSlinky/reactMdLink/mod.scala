package typingsSlinky.reactMdLink

import org.scalajs.dom.raw.HTMLAnchorElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdLink.linkMod.LinkProps
import typingsSlinky.reactMdLink.linkMod.LinkWithComponentProps
import typingsSlinky.reactMdLink.skipToMainContentMod.SkipToMainContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/link", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Link: ForwardRefExoticComponent[
    (LinkProps with (RefAttributes[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
    ])) | (LinkWithComponentProps with (RefAttributes[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
    ]))
  ] = js.native
  
  val SkipToMainContent: ForwardRefExoticComponent[SkipToMainContentProps with RefAttributes[HTMLAnchorElement]] = js.native
}
