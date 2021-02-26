package typingsSlinky.poseCore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.poseCore.typesMod.Pose
import typingsSlinky.poseCore.typesMod.PoseMap
import typingsSlinky.poseCore.typesMod.PoserConfig
import typingsSlinky.poseCore.typesMod.SelectValueToRead
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorsMod {
  
  @JSImport("pose-core/lib/inc/selectors", "getPoseValues")
  @js.native
  def getPoseValues[A, TD](
    hasTransitionFlipDelayDelayChildrenStaggerChildrenStaggerDirectionAfterChildrenBeforeChildrenPreTransitionApplyAtStartApplyAtEndProps: Pose[A, TD]
  ): Pose[A, TD] = js.native
  
  @JSImport("pose-core/lib/inc/selectors", "selectAllValues")
  @js.native
  def selectAllValues[V](values: Map[String, V], selectValue: SelectValueToRead[V]): StringDictionary[js.Any] = js.native
  
  @JSImport("pose-core/lib/inc/selectors", "selectPoses")
  @js.native
  def selectPoses[V, A, TD](hasLabelPropsValuesParentValuesAncestorValuesOnChangePassiveInitialPosePoses: PoserConfig[V]): PoseMap[A, TD] = js.native
}
