package typingsSlinky.popmotionPose

import typingsSlinky.popmotionEasing.mod.Easing
import typingsSlinky.popmotionPose.popmotionPoseStrings.anticipate
import typingsSlinky.popmotionPose.popmotionPoseStrings.backIn
import typingsSlinky.popmotionPose.popmotionPoseStrings.backInOut
import typingsSlinky.popmotionPose.popmotionPoseStrings.backOut
import typingsSlinky.popmotionPose.popmotionPoseStrings.circIn
import typingsSlinky.popmotionPose.popmotionPoseStrings.circInOut
import typingsSlinky.popmotionPose.popmotionPoseStrings.circOut
import typingsSlinky.popmotionPose.popmotionPoseStrings.decay
import typingsSlinky.popmotionPose.popmotionPoseStrings.easeIn
import typingsSlinky.popmotionPose.popmotionPoseStrings.easeInOut
import typingsSlinky.popmotionPose.popmotionPoseStrings.easeOut
import typingsSlinky.popmotionPose.popmotionPoseStrings.keyframes
import typingsSlinky.popmotionPose.popmotionPoseStrings.linear
import typingsSlinky.popmotionPose.popmotionPoseStrings.physics
import typingsSlinky.popmotionPose.popmotionPoseStrings.spring
import typingsSlinky.popmotionPose.popmotionPoseStrings.tween
import typingsSlinky.popmotionPose.typesMod.CubicBezierArgs
import typingsSlinky.stylefire.typesMod.Styler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var `type`: keyframes = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(`type`: keyframes): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: keyframes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `1` extends StObject {
    
    var `type`: physics = js.native
  }
  object `1` {
    
    @scala.inline
    def apply(`type`: physics): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: physics): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `2` extends StObject {
    
    var `type`: spring = js.native
  }
  object `2` {
    
    @scala.inline
    def apply(`type`: spring): `2` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`2`]
    }
    
    @scala.inline
    implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: spring): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `3` extends StObject {
    
    var `type`: tween = js.native
  }
  object `3` {
    
    @scala.inline
    def apply(`type`: tween): `3` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`3`]
    }
    
    @scala.inline
    implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: tween): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Anticipate extends StObject {
    
    def anticipate(v: Double): Double = js.native
    @JSName("anticipate")
    var anticipate_Original: Easing = js.native
    
    def backIn(v: Double): Double = js.native
    
    def backInOut(v: Double): Double = js.native
    @JSName("backInOut")
    var backInOut_Original: Easing = js.native
    
    @JSName("backIn")
    var backIn_Original: Easing = js.native
    
    def backOut(v: Double): Double = js.native
    @JSName("backOut")
    var backOut_Original: Easing = js.native
    
    def circIn(v: Double): Double = js.native
    
    def circInOut(v: Double): Double = js.native
    @JSName("circInOut")
    var circInOut_Original: Easing = js.native
    
    @JSName("circIn")
    var circIn_Original: Easing = js.native
    
    def circOut(v: Double): Double = js.native
    @JSName("circOut")
    var circOut_Original: Easing = js.native
    
    def easeIn(v: Double): Double = js.native
    
    def easeInOut(v: Double): Double = js.native
    @JSName("easeInOut")
    var easeInOut_Original: Easing = js.native
    
    @JSName("easeIn")
    var easeIn_Original: Easing = js.native
    
    def easeOut(v: Double): Double = js.native
    @JSName("easeOut")
    var easeOut_Original: Easing = js.native
    
    def linear(v: Double): Double = js.native
    @JSName("linear")
    var linear_Original: Easing = js.native
  }
  
  @js.native
  trait Ease extends StObject {
    
    var ease: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TweenProps * / any['ease'] */ js.Any) | linear | easeIn | easeOut | easeInOut | circIn | circOut | circInOut | backIn | backOut | backInOut | anticipate | CubicBezierArgs = js.native
  }
  object Ease {
    
    @scala.inline
    def apply(
      ease: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TweenProps * / any['ease'] */ js.Any) | linear | easeIn | easeOut | easeInOut | circIn | circOut | circInOut | backIn | backOut | backInOut | anticipate | CubicBezierArgs
    ): Ease = {
      val __obj = js.Dynamic.literal(ease = ease.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ease]
    }
    
    @scala.inline
    implicit class EaseMutableBuilder[Self <: Ease] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEase(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TweenProps * / any['ease'] */ js.Any) | linear | easeIn | easeOut | easeInOut | circIn | circOut | circInOut | backIn | backOut | backInOut | anticipate | CubicBezierArgs
      ): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ElementStyler extends StObject {
    
    var elementStyler: Styler = js.native
  }
  object ElementStyler {
    
    @scala.inline
    def apply(elementStyler: Styler): ElementStyler = {
      val __obj = js.Dynamic.literal(elementStyler = elementStyler.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementStyler]
    }
    
    @scala.inline
    implicit class ElementStylerMutableBuilder[Self <: ElementStyler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElementStyler(value: Styler): Self = StObject.set(x, "elementStyler", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var `type`: decay = js.native
  }
  object Type {
    
    @scala.inline
    def apply(`type`: decay): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: decay): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
