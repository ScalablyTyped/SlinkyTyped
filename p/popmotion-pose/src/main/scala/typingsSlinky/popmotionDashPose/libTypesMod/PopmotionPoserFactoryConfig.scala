package typingsSlinky.popmotionDashPose.libTypesMod

import typingsSlinky.popmotion.libActionTypesMod.ColdSubscription
import typingsSlinky.popmotion.popmotionMod.Action
import typingsSlinky.popmotionDashPose.Anon_ElementStyler
import typingsSlinky.poseDashCore.libTypesMod.ExtendAPI
import typingsSlinky.poseDashCore.libTypesMod.Poser
import typingsSlinky.poseDashCore.libTypesMod.PoserConfig
import typingsSlinky.poseDashCore.libTypesMod.ReadValueFromSource
import typingsSlinky.poseDashCore.libTypesMod.TransformPose
import typingsSlinky.stylefire.libStylerTypesMod.Styler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopmotionPoserFactoryConfig[P, TD] extends js.Object {
  @JSName("extendAPI")
  var extendAPI_Original: ExtendAPI[Value, Action, ColdSubscription, P] = js.native
  var posePriority: js.UndefOr[js.Array[String]] = js.native
  var readValueFromSource: js.UndefOr[ReadValueFromSource] = js.native
  @JSName("transformPose")
  var transformPose_Original: TransformPose[Value, Action, ColdSubscription, P, TD] = js.native
  def addListenerToValue(key: String, styler: Styler): js.Function1[/* v */ js.Any, Unit] = js.native
  def extendAPI(
    api: Poser[Value, Action, ColdSubscription, P],
    state: typingsSlinky.poseDashCore.libTypesMod.PoserState[Value, Action, ColdSubscription, P],
    config: PoserConfig[Value]
  ): Poser[Value, Action, ColdSubscription, P] = js.native
  def forceRender(props: Anon_ElementStyler): Unit = js.native
  def setValueNative(key: String, to: js.Any, props: Anon_ElementStyler): Unit = js.native
  def transformPose(
    pose: typingsSlinky.poseDashCore.libTypesMod.Pose[Action, TD],
    key: String,
    state: typingsSlinky.poseDashCore.libTypesMod.PoserState[Value, Action, ColdSubscription, P]
  ): typingsSlinky.poseDashCore.libTypesMod.Pose[Action, TD] = js.native
}

