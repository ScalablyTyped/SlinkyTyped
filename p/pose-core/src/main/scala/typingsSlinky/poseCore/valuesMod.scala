package typingsSlinky.poseCore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.poseCore.typesMod.ActivePoses
import typingsSlinky.poseCore.typesMod.AncestorValueList
import typingsSlinky.poseCore.typesMod.ConvertValue
import typingsSlinky.poseCore.typesMod.CreateValue
import typingsSlinky.poseCore.typesMod.CreateValueProps
import typingsSlinky.poseCore.typesMod.PassiveValueMap
import typingsSlinky.poseCore.typesMod.PoseMap
import typingsSlinky.poseCore.typesMod.Props
import typingsSlinky.poseCore.typesMod.ReadValue
import typingsSlinky.poseCore.typesMod.ReadValueFromSource
import typingsSlinky.poseCore.typesMod.SetValueNative
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valuesMod {
  
  @JSImport("pose-core/lib/factories/values", JSImport.Default)
  @js.native
  def default[V, A, TD](props: ValueFactoryProps[V, A, TD]): Map[String, V] = js.native
  
  @JSImport("pose-core/lib/factories/values", "DEFAULT_INITIAL_POSE")
  @js.native
  val DEFAULT_INITIAL_POSE: /* "init" */ String = js.native
  
  @js.native
  trait ValueFactoryProps[V, A, TD] extends StObject {
    
    var activePoses: ActivePoses = js.native
    
    var ancestorValues: AncestorValueList[V] = js.native
    
    def convertValue(value: js.Any, key: String, props: Props): V = js.native
    @JSName("convertValue")
    var convertValue_Original: ConvertValue[V] = js.native
    
    def createValue(init: js.Any, key: String, props: Props): V = js.native
    def createValue(init: js.Any, key: String, props: Props, createValueProps: CreateValueProps): V = js.native
    @JSName("createValue")
    var createValue_Original: CreateValue[V] = js.native
    
    var initialPose: js.UndefOr[String | js.Array[String]] = js.native
    
    var passive: js.UndefOr[PassiveValueMap] = js.native
    
    var poses: PoseMap[A, TD] = js.native
    
    var props: Props = js.native
    
    def readValue(value: V): js.Any = js.native
    
    var readValueFromSource: js.UndefOr[ReadValueFromSource] = js.native
    
    @JSName("readValue")
    var readValue_Original: ReadValue[V] = js.native
    
    def setValueNative(key: String, value: js.Any, props: Props): Unit = js.native
    @JSName("setValueNative")
    var setValueNative_Original: SetValueNative = js.native
    
    var userSetValues: StringDictionary[V] = js.native
  }
}
