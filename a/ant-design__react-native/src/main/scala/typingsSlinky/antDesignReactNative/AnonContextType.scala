package typingsSlinky.antDesignReactNative

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.antDesignReactNative.pickerMixinMod.ItemProps
import typingsSlinky.antDesignReactNative.pickerTypesMod.PickerProps
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContextType
  extends Instantiable1[
      (/* props */ PickerProps) | (/* props */ ReadonlyPickerProps), 
      AnonComputeChildIndex
    ]
     with Instantiable2[/* props */ PickerProps, /* context */ js.Any, AnonComputeChildIndex] {
  var contextType: js.UndefOr[Context[_]] = js.native
  def Item(_props: ItemProps): Null = js.native
}

