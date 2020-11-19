package typingsSlinky.grommet.listMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLUListElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grommet/es6/components/List", "List")
@js.native
class List protected ()
  extends Component[
      ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]), 
      js.Object, 
      js.Any
    ] {
  def this(props: ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement])) = this()
  def this(
    props: ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]),
    context: js.Any
  ) = this()
}
@JSImport("grommet/es6/components/List", "List")
@js.native
object List extends TopLevel[
      ReactComponentClass[
        ListProps with (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement])
      ]
    ]
