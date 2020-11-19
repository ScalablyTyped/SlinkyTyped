package typingsSlinky.reflexbox.components

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.emotionStyledBase.helperMod.Omit
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.reflexbox.mod.BoxProps
import typingsSlinky.reflexbox.reflexboxStrings.key
import typingsSlinky.reflexbox.reflexboxStrings.ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Flex {
  
  @JSImport("reflexbox", "Flex")
  @js.native
  object component extends js.Object
  
  def withProps(
    p: PropsWithChildren[
      (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) with (Omit[
        Omit[
          (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) with BoxProps, 
          /* keyof react.react.ClassAttributes<any> */ ref | key
        ], 
        theme
      ]) with `0`[js.Object]
    ]
  ): SharedBuilder_PropsWithChildren920194122[HTMLDivElement] = new SharedBuilder_PropsWithChildren920194122[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Flex.type): SharedBuilder_PropsWithChildren920194122[HTMLDivElement] = new SharedBuilder_PropsWithChildren920194122[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
}
