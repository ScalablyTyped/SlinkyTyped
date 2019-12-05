package typingsSlinky.atAntDashDesignReactDashNative.libPickerNativePickerDotAndroidMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.atAntDashDesignReactDashNative.Anon_CallBackCallback
import typingsSlinky.atAntDashDesignReactDashNative.Anon_ValueAny
import typingsSlinky.atAntDashDesignReactDashNative.ReadonlyPickerProps
import typingsSlinky.atAntDashDesignReactDashNative.libPickerPickerTypesMod.PickerProps
import typingsSlinky.react.reactMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/picker/NativePicker.android", JSImport.Default)
@js.native
class default protected () extends Anon_CallBackCallback {
  def this(props: ReadonlyPickerProps) = this()
  def this(props: PickerProps) = this()
  def this(props: PickerProps, context: js.Any) = this()
}

@JSImport("@ant-design/react-native/lib/picker/NativePicker.android", JSImport.Default)
@js.native
object default
  extends Instantiable2[/* props */ PickerProps, /* context */ js.Any, Anon_CallBackCallback]
     with Instantiable1[
      (/* props */ PickerProps) | (/* props */ ReadonlyPickerProps), 
      Anon_CallBackCallback
    ] {
  var contextType: js.UndefOr[Context[_]] = js.native
  def Item(_props: Anon_ValueAny): Null = js.native
}

