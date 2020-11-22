package typingsSlinky.popmotionPose.anon

import typingsSlinky.popmotionPose.popmotionPoseStrings.anticipate
import typingsSlinky.popmotionPose.popmotionPoseStrings.backIn
import typingsSlinky.popmotionPose.popmotionPoseStrings.backInOut
import typingsSlinky.popmotionPose.popmotionPoseStrings.backOut
import typingsSlinky.popmotionPose.popmotionPoseStrings.circIn
import typingsSlinky.popmotionPose.popmotionPoseStrings.circInOut
import typingsSlinky.popmotionPose.popmotionPoseStrings.circOut
import typingsSlinky.popmotionPose.popmotionPoseStrings.easeIn
import typingsSlinky.popmotionPose.popmotionPoseStrings.easeInOut
import typingsSlinky.popmotionPose.popmotionPoseStrings.easeOut
import typingsSlinky.popmotionPose.popmotionPoseStrings.linear
import typingsSlinky.popmotionPose.typesMod.CubicBezierArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ease extends js.Object {
  
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
  implicit class EaseOps[Self <: Ease] (val x: Self) extends AnyVal {
    
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
    def setEase(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TweenProps * / any['ease'] */ js.Any) | linear | easeIn | easeOut | easeInOut | circIn | circOut | circInOut | backIn | backOut | backInOut | anticipate | CubicBezierArgs
    ): Self = this.set("ease", value.asInstanceOf[js.Any])
  }
}
