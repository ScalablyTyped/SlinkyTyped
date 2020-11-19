package typingsSlinky.grommet.dropButtonMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.buttonMod.ButtonProps
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.ButtonHTMLAttributes
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grommet/es6/components/DropButton", "DropButton")
@js.native
class DropButton protected ()
  extends Component[
      DropButtonProps with ButtonProps with (Omit[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        color
      ]), 
      js.Object, 
      js.Any
    ] {
  def this(props: DropButtonProps with ButtonProps with (Omit[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        color
      ])) = this()
  def this(
    props: DropButtonProps with ButtonProps with (Omit[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        color
      ]),
    context: js.Any
  ) = this()
}
@JSImport("grommet/es6/components/DropButton", "DropButton")
@js.native
object DropButton extends TopLevel[
      ReactComponentClass[
        DropButtonProps with ButtonProps with (Omit[
          DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
          color
        ])
      ]
    ]
