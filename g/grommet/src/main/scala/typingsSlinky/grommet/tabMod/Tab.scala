package typingsSlinky.grommet.tabMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.grommetStrings.title
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

@JSImport("grommet/components/Tab", "Tab")
@js.native
class Tab protected ()
  extends Component[
      TabProps with (Omit[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        title
      ]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: TabProps with (Omit[
        DetailedHTMLProps[
          ButtonHTMLAttributes[org.scalajs.dom.raw.HTMLButtonElement], 
          org.scalajs.dom.raw.HTMLButtonElement
        ], 
        title
      ])) = this()
  def this(
    props: TabProps with (Omit[
        DetailedHTMLProps[
          ButtonHTMLAttributes[org.scalajs.dom.raw.HTMLButtonElement], 
          org.scalajs.dom.raw.HTMLButtonElement
        ], 
        title
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/Tab", "Tab")
@js.native
object Tab extends TopLevel[
      ComponentClass[
        TabProps with (Omit[
          DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
          title
        ]), 
        ComponentState
      ]
    ]

