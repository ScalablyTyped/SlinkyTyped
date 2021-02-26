package typingsSlinky.grommet.anon

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.anchorMod.AnchorProps
import typingsSlinky.grommet.baseMod.ExtendProps
import typingsSlinky.grommet.baseMod.ExtendType
import typingsSlinky.grommet.baseMod.ExtendValue
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.grommet.utilsMod.PropsOf
import typingsSlinky.react.mod.AnchorHTMLAttributes
import typingsSlinky.react.mod.DetailedHTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDecoration extends StObject {
  
  var extend: js.UndefOr[
    ExtendType[
      PropsOf[
        ReactComponentClass[
          AnchorProps with (Omit[
            DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
            color
          ])
        ]
      ]
    ]
  ] = js.native
  
  var textDecoration: js.UndefOr[String] = js.native
}
object TextDecoration {
  
  @scala.inline
  def apply(): TextDecoration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDecoration]
  }
  
  @scala.inline
  implicit class TextDecorationMutableBuilder[Self <: TextDecoration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(
      value: ExtendType[
          PropsOf[
            ReactComponentClass[
              AnchorProps with (Omit[
                DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
                color
              ])
            ]
          ]
        ]
    ): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendFunction1(
      value: /* props */ ExtendProps[
          PropsOf[
            ReactComponentClass[
              AnchorProps with (Omit[
                DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
                color
              ])
            ]
          ]
        ] => ExtendValue[
          PropsOf[
            ReactComponentClass[
              AnchorProps with (Omit[
                DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement], 
                color
              ])
            ]
          ]
        ]
    ): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
  }
}
