package typingsSlinky.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait actionTypes extends StObject
@JSImport("instabug-reactnative", "actionTypes")
@js.native
object actionTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[actionTypes with Double] = js.native
  
  @js.native
  sealed trait addCommentToFeature extends actionTypes
  /* 3 */ val addCommentToFeature: typingsSlinky.instabugReactnative.mod.actionTypes.addCommentToFeature with Double = js.native
  
  @js.native
  sealed trait allActions extends actionTypes
  /* 0 */ val allActions: typingsSlinky.instabugReactnative.mod.actionTypes.allActions with Double = js.native
  
  @js.native
  sealed trait reportBug extends actionTypes
  /* 1 */ val reportBug: typingsSlinky.instabugReactnative.mod.actionTypes.reportBug with Double = js.native
  
  @js.native
  sealed trait requestNewFeature extends actionTypes
  /* 2 */ val requestNewFeature: typingsSlinky.instabugReactnative.mod.actionTypes.requestNewFeature with Double = js.native
}
