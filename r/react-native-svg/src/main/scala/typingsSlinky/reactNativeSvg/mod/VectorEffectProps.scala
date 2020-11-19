package typingsSlinky.reactNativeSvg.mod

import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.`non-scaling-stroke`
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.inherit
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.nonScalingStroke
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.none
import typingsSlinky.reactNativeSvg.reactNativeSvgStrings.uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VectorEffectProps extends js.Object {
  
  var vectorEffect: js.UndefOr[
    none | `non-scaling-stroke` | nonScalingStroke | typingsSlinky.reactNativeSvg.reactNativeSvgStrings.default | inherit | uri
  ] = js.native
}
object VectorEffectProps {
  
  @scala.inline
  def apply(): VectorEffectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorEffectProps]
  }
  
  @scala.inline
  implicit class VectorEffectPropsOps[Self <: VectorEffectProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVectorEffect(
      value: none | `non-scaling-stroke` | nonScalingStroke | typingsSlinky.reactNativeSvg.reactNativeSvgStrings.default | inherit | uri
    ): Self = this.set("vectorEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVectorEffect: Self = this.set("vectorEffect", js.undefined)
  }
}
