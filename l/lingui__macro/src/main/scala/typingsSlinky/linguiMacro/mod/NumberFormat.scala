package typingsSlinky.linguiMacro.mod

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.linguiMacro.createFormatMod.FormatPropsWithoutI18n
import typingsSlinky.react.mod.Component
import typingsSlinky.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/macro", "NumberFormat")
@js.native
class NumberFormat protected ()
  extends Component[FormatPropsWithoutI18n[Double, NumberFormatOptions], js.Object, js.Any] {
  def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions]) = this()
  def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions], context: js.Any) = this()
}

@JSImport("@lingui/macro", "NumberFormat")
@js.native
object NumberFormat extends TopLevel[ReactComponentClass[FormatPropsWithoutI18n[Double, NumberFormatOptions]]]

