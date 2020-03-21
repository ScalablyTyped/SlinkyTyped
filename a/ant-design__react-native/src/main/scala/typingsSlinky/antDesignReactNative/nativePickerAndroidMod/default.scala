package typingsSlinky.antDesignReactNative.nativePickerAndroidMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.antDesignReactNative.AnonComputeChildIndex
import typingsSlinky.antDesignReactNative.AnonValueAny
import typingsSlinky.antDesignReactNative.ReadonlyPickerProps
import typingsSlinky.antDesignReactNative.pickerTypesMod.PickerProps
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/picker/NativePicker.android", JSImport.Default)
@js.native
class default protected () extends AnonComputeChildIndex {
  def this(props: ReadonlyPickerProps) = this()
  def this(props: PickerProps) = this()
  def this(props: PickerProps, context: js.Any) = this()
}

@JSImport("@ant-design/react-native/lib/picker/NativePicker.android", JSImport.Default)
@js.native
object default
  extends Instantiable1[
      (/* props */ PickerProps) | (/* props */ ReadonlyPickerProps), 
      AnonComputeChildIndex
    ]
     with Instantiable2[/* props */ PickerProps, /* context */ js.Any, AnonComputeChildIndex] {
  var contextType: js.UndefOr[Context[_]] = js.native
  def Item(_props: AnonValueAny): Null = js.native
}

