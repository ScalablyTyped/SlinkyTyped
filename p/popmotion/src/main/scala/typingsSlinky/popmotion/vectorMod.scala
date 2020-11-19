package typingsSlinky.popmotion

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.popmotion.actionMod.Action
import typingsSlinky.popmotion.actionTypesMod.ColdSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/action/vector", JSImport.Namespace)
@js.native
object vectorMod extends js.Object {
  
  val default: VectorActionFactory = js.native
  
  type ActionFactory = js.Function1[/* props */ Props, Action[ColdSubscription]]
  
  type ActionMap = StringDictionary[Action[ColdSubscription]]
  
  type Props = StringDictionary[js.Any]
  
  type TypeTest = js.Function1[/* v */ js.Any, Boolean]
  
  type TypeTestMap = StringDictionary[TypeTest]
  
  type VectorActionFactory = js.Function2[/* init */ ActionFactory, /* typeTests */ TypeTestMap, ActionFactory]
}
