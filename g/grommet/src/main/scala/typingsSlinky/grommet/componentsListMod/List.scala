package typingsSlinky.grommet.componentsListMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.DetailedHTMLProps
import typingsSlinky.react.reactMod.HTMLAttributes
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

