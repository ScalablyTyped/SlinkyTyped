package typingsSlinky.applicationinsightsJs.AI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DependencyKind extends js.Object
@JSGlobal("AI.DependencyKind")
@js.native
object DependencyKind extends js.Object {
  
  @js.native
  sealed trait Http extends DependencyKind
  
  @js.native
  sealed trait Other extends DependencyKind
  
  @js.native
  sealed trait SQL extends DependencyKind
}
