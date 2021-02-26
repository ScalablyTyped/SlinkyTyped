package typingsSlinky.grommet.anon

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.boxMod.BoxProps
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.textMod.TextProps
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.grommet.utilsMod.PropsOf
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerText extends StObject {
  
  var container: js.UndefOr[
    PropsOf[
      ReactComponentClass[
        BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
      ]
    ]
  ] = js.native
  
  var text: js.UndefOr[
    PropsOf[
      ReactComponentClass[
        TextProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], color])
      ]
    ]
  ] = js.native
}
object ContainerText {
  
  @scala.inline
  def apply(): ContainerText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerText]
  }
  
  @scala.inline
  implicit class ContainerTextMutableBuilder[Self <: ContainerText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(
      value: PropsOf[
          ReactComponentClass[
            BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
          ]
        ]
    ): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setText(
      value: PropsOf[
          ReactComponentClass[
            TextProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement], color])
          ]
        ]
    ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
