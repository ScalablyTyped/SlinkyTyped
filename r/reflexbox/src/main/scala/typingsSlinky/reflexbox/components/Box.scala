package typingsSlinky.reflexbox.components

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.reflexbox.mod.BoxProps
import typingsSlinky.reflexbox.reflexboxStrings.key
import typingsSlinky.reflexbox.reflexboxStrings.ref
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Box {
  
  @JSImport("reflexbox", "Box")
  @js.native
  object component extends js.Object
  
  def withProps(
    p: PropsWithChildren[
      (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) with (typingsSlinky.emotionStyledBase.helperMod.Omit[
        Omit[
          (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) with BoxProps, 
          /* keyof react.react.ClassAttributes<any> */ ref | key
        ], 
        theme
      ]) with `0`[js.Object]
    ]
  ): SharedBuilder_PropsWithChildren_246298044[HTMLDivElement] = new SharedBuilder_PropsWithChildren_246298044[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Box.type): SharedBuilder_PropsWithChildren_246298044[HTMLDivElement] = new SharedBuilder_PropsWithChildren_246298044[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
}
