package typingsSlinky.reactPose

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import slinky.core.ReactComponentClass
import typingsSlinky.popmotionPose.typesMod.DomPopmotionConfig
import typingsSlinky.popmotionPose.typesMod.DomPopmotionPoser
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reactPose.anon.Dictkey
import typingsSlinky.reactPose.typesMod.ChildRegistration
import typingsSlinky.reactPose.typesMod.CurrentPose
import typingsSlinky.reactPose.typesMod.PopStyle
import typingsSlinky.reactPose.typesMod.PoseElementInternalProps
import typingsSlinky.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object poseElementMod {
  
  @JSImport("react-pose/lib/components/PoseElement", "PoseElement")
  @js.native
  class PoseElement protected ()
    extends PureComponent[PoseElementInternalProps, js.Object, js.Any] {
    def this(props: PoseElementInternalProps) = this()
    
    var children: Set[ChildRegistration] = js.native
    
    var childrenHandlers: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPoseElement(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPoseElement(prevProps: PoseElementInternalProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPoseElement(): Unit = js.native
    
    def flushChildren(): Unit = js.native
    
    def getFirstPose(): CurrentPose | Unit = js.native
    
    def getInitialPose(): CurrentPose | Unit = js.native
    
    def getSetProps(): Dictkey = js.native
    
    @JSName("getSnapshotBeforeUpdate")
    def getSnapshotBeforeUpdate_MPoseElement(): Null = js.native
    
    def initPoser(poser: DomPopmotionPoser): Unit = js.native
    
    var popStyle: js.UndefOr[PopStyle] = js.native
    
    var poseConfig: DomPopmotionConfig = js.native
    
    var poser: DomPopmotionPoser = js.native
    
    @JSName("props")
    var props_PoseElement: PoseElementInternalProps = js.native
    
    var ref: Element = js.native
    
    def setPose(pose: CurrentPose): Unit = js.native
    
    def setRef(ref: Element): Unit = js.native
    
    def shouldForwardProp(key: String): Boolean = js.native
    
    var styleProps: StringDictionary[js.Any] = js.native
  }
  
  @JSImport("react-pose/lib/components/PoseElement", "PoseParentConsumer")
  @js.native
  val PoseParentConsumer: ReactComponentClass[ConsumerProps[js.Object]] = js.native
}
