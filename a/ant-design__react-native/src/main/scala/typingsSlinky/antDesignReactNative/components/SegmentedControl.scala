package typingsSlinky.antDesignReactNative.components

import typingsSlinky.antDesignReactNative.segmentedControlMod.default
import typingsSlinky.antDesignReactNative.segmentedIosMod.SegmentedControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SegmentedControl {
  @JSImport("@ant-design/react-native/lib/segmented-control", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SegmentedControlProps): SharedBuilder_SegmentedControlProps526044729[default] = new SharedBuilder_SegmentedControlProps526044729[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SegmentedControl.type): SharedBuilder_SegmentedControlProps526044729[default] = new SharedBuilder_SegmentedControlProps526044729[default](js.Array(this.component, js.Dictionary.empty))()
}

