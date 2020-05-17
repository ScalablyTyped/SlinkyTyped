package typingsSlinky.popmotionPose.typesMod

import typingsSlinky.popmotion.mod.Action_
import typingsSlinky.popmotion.typesMod.ColdSubscription
import typingsSlinky.popmotionPose.anon.ElementStyler
import typingsSlinky.poseCore.typesMod.ExtendAPI
import typingsSlinky.poseCore.typesMod.Poser
import typingsSlinky.poseCore.typesMod.PoserConfig
import typingsSlinky.poseCore.typesMod.ReadValueFromSource
import typingsSlinky.poseCore.typesMod.TransformPose
import typingsSlinky.stylefire.typesMod.Styler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopmotionPoserFactoryConfig[P, TD] extends js.Object {
  @JSName("extendAPI")
  var extendAPI_Original: ExtendAPI[Value, Action_, ColdSubscription, P] = js.native
  var posePriority: js.UndefOr[js.Array[String]] = js.native
  var readValueFromSource: js.UndefOr[ReadValueFromSource] = js.native
  @JSName("transformPose")
  var transformPose_Original: TransformPose[Value, Action_, ColdSubscription, P, TD] = js.native
  def addListenerToValue(key: String, styler: Styler): js.Function1[/* v */ js.Any, Unit] = js.native
  def extendAPI(
    api: Poser[Value, Action_, ColdSubscription, P],
    state: typingsSlinky.poseCore.typesMod.PoserState[Value, Action_, ColdSubscription, P],
    config: PoserConfig[Value]
  ): Poser[Value, Action_, ColdSubscription, P] = js.native
  def forceRender(props: ElementStyler): Unit = js.native
  def setValueNative(key: String, to: js.Any, props: ElementStyler): Unit = js.native
  def transformPose(
    pose: typingsSlinky.poseCore.typesMod.Pose[Action_, TD],
    key: String,
    state: typingsSlinky.poseCore.typesMod.PoserState[Value, Action_, ColdSubscription, P]
  ): typingsSlinky.poseCore.typesMod.Pose[Action_, TD] = js.native
}

