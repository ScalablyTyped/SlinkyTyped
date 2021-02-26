package typingsSlinky.rcTrigger

import typingsSlinky.rcMotion.cssmotionMod.CSSMotionProps
import typingsSlinky.rcTrigger.interfaceMod.AnimationType
import typingsSlinky.rcTrigger.interfaceMod.TransitionNameType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legacyUtilMod {
  
  @JSImport("rc-trigger/es/utils/legacyUtil", "getMotion")
  @js.native
  def getMotion(hasPrefixClsMotionAnimationTransitionName: GetMotionProps): CSSMotionProps = js.native
  
  @js.native
  trait GetMotionProps extends StObject {
    
    var animation: AnimationType = js.native
    
    var motion: CSSMotionProps = js.native
    
    var prefixCls: String = js.native
    
    var transitionName: TransitionNameType = js.native
  }
  object GetMotionProps {
    
    @scala.inline
    def apply(
      animation: AnimationType,
      motion: CSSMotionProps,
      prefixCls: String,
      transitionName: TransitionNameType
    ): GetMotionProps = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], motion = motion.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetMotionProps]
    }
    
    @scala.inline
    implicit class GetMotionPropsMutableBuilder[Self <: GetMotionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: AnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotion(value: CSSMotionProps): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionName(value: TransitionNameType): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
    }
  }
}
