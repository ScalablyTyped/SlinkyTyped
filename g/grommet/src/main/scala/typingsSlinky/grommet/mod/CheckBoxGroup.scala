package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.boxMod.BoxProps
import typingsSlinky.grommet.checkBoxGroupMod.CheckBoxGroupProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grommet/es6", "CheckBoxGroup")
@js.native
class CheckBoxGroup protected ()
  extends Component[
      CheckBoxGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
      js.Object, 
      js.Any
    ] {
  def this(props: CheckBoxGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
  def this(
    props: CheckBoxGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
    context: js.Any
  ) = this()
}
@JSImport("grommet/es6", "CheckBoxGroup")
@js.native
object CheckBoxGroup extends TopLevel[
      ReactComponentClass[
        CheckBoxGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
      ]
    ]
