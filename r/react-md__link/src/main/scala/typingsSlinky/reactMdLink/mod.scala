package typingsSlinky.reactMdLink

import org.scalajs.dom.raw.HTMLAnchorElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdLink.linkMod.LinkProps
import typingsSlinky.reactMdLink.linkMod.LinkWithComponentProps
import typingsSlinky.reactMdLink.skipToMainContentMod.SkipToMainContentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/link", "Link")
  @js.native
  val Link: ForwardRefExoticComponent[
    (LinkProps with (RefAttributes[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
    ])) | (LinkWithComponentProps with (RefAttributes[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any
    ]))
  ] = js.native
  
  @JSImport("@react-md/link", "SkipToMainContent")
  @js.native
  val SkipToMainContent: ForwardRefExoticComponent[SkipToMainContentProps with RefAttributes[HTMLAnchorElement]] = js.native
}
