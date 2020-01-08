package typingsSlinky.poseDashCore

import typingsSlinky.poseDashCore.libTypesMod.AddTransitionDelay
import typingsSlinky.poseDashCore.libTypesMod.ConvertTransitionDefinition
import typingsSlinky.poseDashCore.libTypesMod.GetInstantTransition
import typingsSlinky.poseDashCore.libTypesMod.GetTransitionProps
import typingsSlinky.poseDashCore.libTypesMod.PoseMap
import typingsSlinky.poseDashCore.libTypesMod.PoserState
import typingsSlinky.poseDashCore.libTypesMod.Props
import typingsSlinky.poseDashCore.libTypesMod.ResolveTarget
import typingsSlinky.poseDashCore.libTypesMod.SetValue
import typingsSlinky.poseDashCore.libTypesMod.SetValueNative
import typingsSlinky.poseDashCore.libTypesMod.StartAction
import typingsSlinky.poseDashCore.libTypesMod.StopAction
import typingsSlinky.poseDashCore.libTypesMod.TransformPose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pose-core/lib/factories/setter", JSImport.Namespace)
@js.native
object libFactoriesSetterMod extends js.Object {
  @js.native
  trait SetterFactoryProps[V, A, C, P, TD] extends js.Object {
    @JSName("addActionDelay")
    var addActionDelay_Original: AddTransitionDelay[A] = js.native
    @JSName("convertTransitionDefinition")
    var convertTransitionDefinition_Original: ConvertTransitionDefinition[V, A, TD] = js.native
    var forceRender: js.UndefOr[js.Function1[/* props */ Props, _]] = js.native
    @JSName("getInstantTransition")
    var getInstantTransition_Original: GetInstantTransition[V, A] = js.native
    @JSName("getTransitionProps")
    var getTransitionProps_Original: GetTransitionProps[V] = js.native
    var posePriority: js.UndefOr[js.Array[String]] = js.native
    var poses: PoseMap[A, TD] = js.native
    @JSName("resolveTarget")
    var resolveTarget_Original: ResolveTarget[V] = js.native
    @JSName("setValueNative")
    var setValueNative_Original: SetValueNative = js.native
    @JSName("setValue")
    var setValue_Original: SetValue[V] = js.native
    @JSName("startAction")
    var startAction_Original: StartAction[V, A, C] = js.native
    var state: PoserState[V, A, C, P] = js.native
    @JSName("stopAction")
    var stopAction_Original: StopAction[C] = js.native
    var transformPose: js.UndefOr[TransformPose[V, A, C, P, TD]] = js.native
    def addActionDelay(delay: Double, transition: A): A = js.native
    def convertTransitionDefinition(value: V, transitionDef: A | TD, props: Props): A = js.native
    def getInstantTransition(value: V, props: Props): A = js.native
    def getTransitionProps(value: V, target: Double, props: Props): Props = js.native
    def resolveTarget(value: V, target: js.Any): js.Any = js.native
    def setValue(v: V, value: js.Any): Unit = js.native
    def setValueNative(key: String, value: js.Any, props: Props): Unit = js.native
    def startAction(value: V, action: A, complete: js.Function0[_]): C = js.native
    def stopAction(controls: C): js.Any = js.native
  }
  
  def default[V, A, C, P, TD](setterProps: SetterFactoryProps[V, A, C, P, TD]): js.Function3[
    /* next */ String, 
    /* nextProps */ js.UndefOr[Props], 
    /* propagate */ js.UndefOr[Boolean], 
    js.Promise[js.Array[_]]
  ] = js.native
  def resolveProp(target: js.Any, props: Props): js.Any = js.native
}

