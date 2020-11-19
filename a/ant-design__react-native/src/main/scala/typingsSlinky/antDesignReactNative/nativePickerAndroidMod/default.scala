package typingsSlinky.antDesignReactNative.nativePickerAndroidMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.antDesignReactNative.anon.ComponentDidMount
import typingsSlinky.antDesignReactNative.anon.ReadonlyPickerProps
import typingsSlinky.antDesignReactNative.anon.ValueAny
import typingsSlinky.antDesignReactNative.pickerTypesMod.PickerProps
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native/lib/picker/NativePicker.android", JSImport.Default)
@js.native
class default protected () extends ComponentDidMount {
  def this(props: ReadonlyPickerProps) = this()
  def this(props: PickerProps) = this()
  def this(props: PickerProps, context: js.Any) = this()
}
@JSImport("@ant-design/react-native/lib/picker/NativePicker.android", JSImport.Default)
@js.native
object default
  extends Instantiable1[(/* props */ PickerProps) | (/* props */ ReadonlyPickerProps), ComponentDidMount]
     with Instantiable2[/* props */ PickerProps, /* context */ js.Any, ComponentDidMount] {
  
  def Item(_props: ValueAny): Null = js.native
  
  var contextType: js.UndefOr[Context[_]] = js.native
}
