package typingsSlinky.mobxReactLite

import typingsSlinky.mobx.mod.Reaction_
import typingsSlinky.mobxReactLite.reactionCleanupTrackingCommonMod.IReactionTracking
import typingsSlinky.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactionCleanupTrackingMod {
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(recordReactionAsCommitted, resetCleanupScheduleForTests, forceCleanupTimerToRunNowForTests) */ @JSImport("mobx-react-lite/dist/utils/reactionCleanupTracking", "addReactionToTrack")
  @js.native
  def addReactionToTrack(
    reactionTrackingRef: MutableRefObject[IReactionTracking | Null],
    reaction: Reaction_,
    objectRetainedByReact: js.Object
  ): IReactionTracking = js.native
}
