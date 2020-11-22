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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDecoration extends js.Object {
  
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
  implicit class TextDecorationOps[Self <: TextDecoration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
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
    ): Self = this.set("extend", js.Any.fromFunction1(value))
    
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
    ): Self = this.set("extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
  }
}
