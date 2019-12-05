package typingsSlinky.grommet.componentsMenuMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.react.reactMod.ButtonHTMLAttributes
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.DetailedHTMLProps
import typingsSlinky.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Menu", "Menu")
@js.native
class Menu protected ()
  extends Component[
      MenuProps with (DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: MenuProps with (DetailedHTMLProps[
        ButtonHTMLAttributes[org.scalajs.dom.raw.HTMLButtonElement], 
        org.scalajs.dom.raw.HTMLButtonElement
      ])) = this()
  def this(
    props: MenuProps with (DetailedHTMLProps[
        ButtonHTMLAttributes[org.scalajs.dom.raw.HTMLButtonElement], 
        org.scalajs.dom.raw.HTMLButtonElement
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/Menu", "Menu")
@js.native
object Menu extends TopLevel[
      ComponentClass[
        MenuProps with (DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]), 
        ComponentState
      ]
    ]

