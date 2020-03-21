package typingsSlinky.antd

import slinky.core.facade.ReactElement
import typingsSlinky.antd.checkboxCheckboxMod.AbstractCheckboxProps
import typingsSlinky.antd.radioInterfaceMod.RadioChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio/radioButton", JSImport.Namespace)
@js.native
object radioButtonMod extends js.Object {
  def default(props: RadioButtonProps): ReactElement = js.native
  type RadioButtonProps = AbstractCheckboxProps[RadioChangeEvent]
}

