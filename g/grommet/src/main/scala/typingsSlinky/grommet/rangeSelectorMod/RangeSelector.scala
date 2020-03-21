package typingsSlinky.grommet.rangeSelectorMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/RangeSelector", "RangeSelector")
@js.native
class RangeSelector protected ()
  extends Component[
      RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: RangeSelectorProps with (Omit[
        DetailedHTMLProps[
          HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement], 
          org.scalajs.dom.raw.HTMLDivElement
        ], 
        color
      ])) = this()
  def this(
    props: RangeSelectorProps with (Omit[
        DetailedHTMLProps[
          HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement], 
          org.scalajs.dom.raw.HTMLDivElement
        ], 
        color
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/RangeSelector", "RangeSelector")
@js.native
object RangeSelector extends TopLevel[
      ComponentClass[
        RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color]), 
        ComponentState
      ]
    ]

