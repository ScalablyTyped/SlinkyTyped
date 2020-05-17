package typingsSlinky.antDesignReactNative.multiPickerMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.antDesignReactNative.anon.Context
import typingsSlinky.antDesignReactNative.anon.OnValueChange
import typingsSlinky.antDesignReactNative.anon.Readonlydefault
import typingsSlinky.antDesignReactNative.multiPickerPropsMod.MultiPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/picker/MultiPicker", JSImport.Default)
@js.native
class default protected () extends Context {
  def this(props: Readonlydefault) = this()
  def this(props: MultiPickerProps) = this()
  def this(props: MultiPickerProps, context: js.Any) = this()
}

@JSImport("@ant-design/react-native/lib/picker/MultiPicker", JSImport.Default)
@js.native
object default
  extends Instantiable1[(/* props */ MultiPickerProps) | (/* props */ Readonlydefault), Context]
     with Instantiable2[/* props */ MultiPickerProps, /* context */ js.Any, Context] {
  var contextType: js.UndefOr[typingsSlinky.react.mod.Context[_]] = js.native
  var defaultProps: OnValueChange = js.native
}

