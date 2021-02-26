package typingsSlinky.reflexbox.components

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.emotionStyledBase.anon.`0`
import typingsSlinky.emotionStyledBase.emotionStyledBaseStrings.theme
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reflexbox.mod.BoxProps
import typingsSlinky.reflexbox.reflexboxStrings.key
import typingsSlinky.reflexbox.reflexboxStrings.ref
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Box {
  
  @JSImport("reflexbox", "Box")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Box.type): SharedBuilder_DetailedHTMLPropsOmit0_272721071[HTMLDivElement] = new SharedBuilder_DetailedHTMLPropsOmit0_272721071[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) with (typingsSlinky.emotionStyledBase.helperMod.Omit[
      Omit[
        (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) with BoxProps, 
        /* keyof react.react.ClassAttributes<any> */ ref | key
      ], 
      theme
    ]) with `0`[js.Object]
  ): SharedBuilder_DetailedHTMLPropsOmit0_272721071[HTMLDivElement] = new SharedBuilder_DetailedHTMLPropsOmit0_272721071[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
