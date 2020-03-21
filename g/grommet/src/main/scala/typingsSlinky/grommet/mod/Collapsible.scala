package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.collapsibleMod.CollapsibleProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Collapsible")
@js.native
class Collapsible protected ()
  extends Component[
      CollapsibleProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: CollapsibleProps with (DetailedHTMLProps[
        HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement], 
        org.scalajs.dom.raw.HTMLDivElement
      ])) = this()
  def this(
    props: CollapsibleProps with (DetailedHTMLProps[
        HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement], 
        org.scalajs.dom.raw.HTMLDivElement
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet", "Collapsible")
@js.native
object Collapsible extends TopLevel[
      ComponentClass[
        CollapsibleProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
        ComponentState
      ]
    ]

