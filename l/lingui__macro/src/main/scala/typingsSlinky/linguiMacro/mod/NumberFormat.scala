package typingsSlinky.linguiMacro.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.linguiMacro.createFormatMod.FormatPropsWithoutI18n
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentState
import typingsSlinky.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/macro", "NumberFormat")
@js.native
class NumberFormat protected ()
  extends Component[FormatPropsWithoutI18n[Double, NumberFormatOptions], ComponentState, js.Any] {
  def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions]) = this()
  def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions], context: js.Any) = this()
}

@JSImport("@lingui/macro", "NumberFormat")
@js.native
object NumberFormat extends TopLevel[
      ComponentClass[FormatPropsWithoutI18n[Double, NumberFormatOptions], ComponentState]
    ]

