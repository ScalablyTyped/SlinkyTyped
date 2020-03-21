package typingsSlinky.grommet.dropButtonMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.buttonMod.ButtonProps
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.ButtonHTMLAttributes
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/DropButton", "DropButton")
@js.native
class DropButton protected ()
  extends Component[
      DropButtonProps with ButtonProps with (Omit[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        color
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: DropButtonProps with ButtonProps with (Omit[
        DetailedHTMLProps[
          ButtonHTMLAttributes[org.scalajs.dom.raw.HTMLButtonElement], 
          org.scalajs.dom.raw.HTMLButtonElement
        ], 
        color
      ])) = this()
  def this(
    props: DropButtonProps with ButtonProps with (Omit[
        DetailedHTMLProps[
          ButtonHTMLAttributes[org.scalajs.dom.raw.HTMLButtonElement], 
          org.scalajs.dom.raw.HTMLButtonElement
        ], 
        color
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/DropButton", "DropButton")
@js.native
object DropButton extends TopLevel[
      ComponentClass[
        DropButtonProps with ButtonProps with (Omit[
          DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
          color
        ]), 
        ComponentState
      ]
    ]

