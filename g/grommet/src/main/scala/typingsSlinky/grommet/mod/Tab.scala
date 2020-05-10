package typingsSlinky.grommet.mod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.grommetStrings.title
import typingsSlinky.grommet.tabMod.TabProps
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.ButtonHTMLAttributes
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "Tab")
@js.native
class Tab protected ()
  extends Component[
      TabProps with (Omit[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        title
      ]), 
      js.Object, 
      js.Any
    ] {
  def this(props: TabProps with (Omit[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        title
      ])) = this()
  def this(
    props: TabProps with (Omit[
        DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
        title
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet", "Tab")
@js.native
object Tab extends TopLevel[
      ReactComponentClass[
        TabProps with (Omit[
          DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
          title
        ])
      ]
    ]

