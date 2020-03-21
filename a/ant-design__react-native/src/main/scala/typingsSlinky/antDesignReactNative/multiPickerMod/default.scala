package typingsSlinky.antDesignReactNative.multiPickerMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.antDesignReactNative.AnonContext
import typingsSlinky.antDesignReactNative.AnonOnValueChange
import typingsSlinky.antDesignReactNative.Readonlydefault
import typingsSlinky.antDesignReactNative.multiPickerPropsMod.MultiPickerProps
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/picker/MultiPicker", JSImport.Default)
@js.native
class default protected () extends AnonContext {
  def this(props: Readonlydefault) = this()
  def this(props: MultiPickerProps) = this()
  def this(props: MultiPickerProps, context: js.Any) = this()
}

@JSImport("@ant-design/react-native/lib/picker/MultiPicker", JSImport.Default)
@js.native
object default
  extends Instantiable1[(/* props */ MultiPickerProps) | (/* props */ Readonlydefault), AnonContext]
     with Instantiable2[/* props */ MultiPickerProps, /* context */ js.Any, AnonContext] {
  var contextType: js.UndefOr[Context[_]] = js.native
  var defaultProps: AnonOnValueChange = js.native
}

