package typingsSlinky.grommet.listMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/List", "List")
@js.native
class List protected ()
  extends Component[
      ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: ListProps with (DetailedHTMLProps[
        HTMLAttributes[org.scalajs.dom.raw.HTMLUListElement], 
        org.scalajs.dom.raw.HTMLUListElement
      ])) = this()
  def this(
    props: ListProps with (DetailedHTMLProps[
        HTMLAttributes[org.scalajs.dom.raw.HTMLUListElement], 
        org.scalajs.dom.raw.HTMLUListElement
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/List", "List")
@js.native
object List extends TopLevel[
      ComponentClass[
        ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]), 
        ComponentState
      ]
    ]

