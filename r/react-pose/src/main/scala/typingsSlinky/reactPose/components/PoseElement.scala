package typingsSlinky.reactPose.components

import org.scalajs.dom.raw.Element
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.popmotionPose.typesMod.DomPopmotionConfig
import typingsSlinky.popmotionPose.typesMod.DomPopmotionPoser
import typingsSlinky.reactPose.anon.Current
import typingsSlinky.reactPose.typesMod.ChildRegistration
import typingsSlinky.reactPose.typesMod.ConfigFactory
import typingsSlinky.reactPose.typesMod.CurrentPose
import typingsSlinky.reactPose.typesMod.PoseElementInternalProps
import typingsSlinky.reactPose.typesMod.RefFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PoseElement {
  
  @scala.inline
  def apply(elementType: js.Any, poseConfig: DomPopmotionConfig | ConfigFactory): Builder = {
    val __props = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], poseConfig = poseConfig.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PoseElementInternalProps]))
  }
  
  @JSImport("react-pose/lib/components/PoseElement", "PoseElement")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactPose.poseElementMod.PoseElement] {
    
    @scala.inline
    def _pose(value: CurrentPose): this.type = set("_pose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def _poseVarargs(value: String*): this.type = set("_pose", js.Array(value :_*))
    
    @scala.inline
    def children(value: js.Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def getInitialPoseFromParent(value: () => CurrentPose | Unit): this.type = set("getInitialPoseFromParent", js.Any.fromFunction0(value))
    
    @scala.inline
    def getParentPoseConfig(value: () => DomPopmotionConfig): this.type = set("getParentPoseConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def initialPose(value: CurrentPose): this.type = set("initialPose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialPoseVarargs(value: String*): this.type = set("initialPose", js.Array(value :_*))
    
    @scala.inline
    def innerRef(value: Current | RefFunc): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerRefFunction1(value: /* el */ Element => js.Any): this.type = set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPoseComplete(value: /* pose */ CurrentPose => _): this.type = set("onPoseComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def onUnmount(value: /* child */ DomPopmotionPoser => _): this.type = set("onUnmount", js.Any.fromFunction1(value))
    
    @scala.inline
    def pose(value: CurrentPose): this.type = set("pose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def poseVarargs(value: String*): this.type = set("pose", js.Array(value :_*))
    
    @scala.inline
    def registerChild(value: /* props */ ChildRegistration => Unit): this.type = set("registerChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def withParent(value: Boolean): this.type = set("withParent", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PoseElementInternalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
