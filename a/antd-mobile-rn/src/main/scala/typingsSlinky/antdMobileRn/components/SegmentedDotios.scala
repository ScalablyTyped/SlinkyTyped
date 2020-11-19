package typingsSlinky.antdMobileRn.components

import typingsSlinky.antdMobileRn.segmentedIosMod.SegmentedControlProps
import typingsSlinky.antdMobileRn.segmentedIosMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SegmentedDotios {
  
  @JSImport("antd-mobile-rn/lib/segmented-control/segmented.ios", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SegmentedControlProps): SharedBuilder_SegmentedControlProps_1587899794[default] = new SharedBuilder_SegmentedControlProps_1587899794[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SegmentedDotios.type): SharedBuilder_SegmentedControlProps_1587899794[default] = new SharedBuilder_SegmentedControlProps_1587899794[default](js.Array(this.component, js.Dictionary.empty))()
}
