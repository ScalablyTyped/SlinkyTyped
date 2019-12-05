package typingsSlinky.grommet.grommetMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.grommet.componentsRangeSelectorMod.RangeSelectorProps
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.DetailedHTMLProps
import typingsSlinky.react.reactMod.HTMLAttributes
import typingsSlinky.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "RangeSelector")
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

@JSImport("grommet", "RangeSelector")
@js.native
object RangeSelector extends TopLevel[
      ComponentClass[
        RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color]), 
        ComponentState
      ]
    ]

