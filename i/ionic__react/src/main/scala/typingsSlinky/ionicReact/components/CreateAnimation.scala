package typingsSlinky.ionicReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationDirection
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationFill
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationKeyFrame
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationKeyFrames
import typingsSlinky.ionicReact.anon.Callback
import typingsSlinky.ionicReact.anon.Dur
import typingsSlinky.ionicReact.anon.ForceLinearEasing
import typingsSlinky.ionicReact.anon.Step
import typingsSlinky.ionicReact.createAnimationMod.CreateAnimationProps
import typingsSlinky.ionicReact.createAnimationMod.PartialPropertyValue
import typingsSlinky.ionicReact.createAnimationMod.PropertyValue
import typingsSlinky.ionicReact.mod.CreateAnimation_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CreateAnimation {
  
  @JSImport("@ionic/react", "CreateAnimation")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, CreateAnimation_] {
    
    @scala.inline
    def afterAddClass(value: String | js.Array[String]): this.type = set("afterAddClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def afterAddClassVarargs(value: String*): this.type = set("afterAddClass", js.Array(value :_*))
    
    @scala.inline
    def afterAddRead(value: () => Unit): this.type = set("afterAddRead", js.Any.fromFunction0(value))
    
    @scala.inline
    def afterAddWrite(value: () => Unit): this.type = set("afterAddWrite", js.Any.fromFunction0(value))
    
    @scala.inline
    def afterClearStyles(value: js.Array[String]): this.type = set("afterClearStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def afterClearStylesVarargs(value: String*): this.type = set("afterClearStyles", js.Array(value :_*))
    
    @scala.inline
    def afterRemoveClass(value: String | js.Array[String]): this.type = set("afterRemoveClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def afterRemoveClassVarargs(value: String*): this.type = set("afterRemoveClass", js.Array(value :_*))
    
    @scala.inline
    def beforeAddClass(value: String | js.Array[String]): this.type = set("beforeAddClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def beforeAddClassVarargs(value: String*): this.type = set("beforeAddClass", js.Array(value :_*))
    
    @scala.inline
    def beforeAddRead(value: () => Unit): this.type = set("beforeAddRead", js.Any.fromFunction0(value))
    
    @scala.inline
    def beforeAddWrite(value: () => Unit): this.type = set("beforeAddWrite", js.Any.fromFunction0(value))
    
    @scala.inline
    def beforeClearStyles(value: js.Array[String]): this.type = set("beforeClearStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def beforeClearStylesVarargs(value: String*): this.type = set("beforeClearStyles", js.Array(value :_*))
    
    @scala.inline
    def beforeRemoveClass(value: String | js.Array[String]): this.type = set("beforeRemoveClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def beforeRemoveClassVarargs(value: String*): this.type = set("beforeRemoveClass", js.Array(value :_*))
    
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def destroy(value: Boolean): this.type = set("destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: AnimationDirection): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def easing(value: String): this.type = set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fill(value: AnimationFill): this.type = set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def from(value: js.Array[PartialPropertyValue] | PartialPropertyValue): this.type = set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fromTo(value: js.Array[PropertyValue] | PropertyValue): this.type = set("fromTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fromToVarargs(value: PropertyValue*): this.type = set("fromTo", js.Array(value :_*))
    
    @scala.inline
    def fromVarargs(value: PartialPropertyValue*): this.type = set("from", js.Array(value :_*))
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iterations(value: Double): this.type = set("iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyframes(value: AnimationKeyFrames): this.type = set("keyframes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keyframesVarargs(value: AnimationKeyFrame*): this.type = set("keyframes", js.Array(value :_*))
    
    @scala.inline
    def onFinish(value: Callback): this.type = set("onFinish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def pause(value: Boolean): this.type = set("pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def play(value: Boolean): this.type = set("play", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progressEnd(value: Dur): this.type = set("progressEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progressStart(value: ForceLinearEasing): this.type = set("progressStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def progressStep(value: Step): this.type = set("progressStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stop(value: Boolean): this.type = set("stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def to(value: js.Array[PartialPropertyValue] | PartialPropertyValue): this.type = set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def toVarargs(value: PartialPropertyValue*): this.type = set("to", js.Array(value :_*))
  }
  
  implicit def make(companion: CreateAnimation.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CreateAnimationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
