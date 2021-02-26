package typingsSlinky.rcTreeSelect

import slinky.core.facade.ReactElement
import typingsSlinky.rcSelect.generatorMod.DefaultValueType
import typingsSlinky.rcTree.interfaceMod.DataEntity
import typingsSlinky.rcTreeSelect.interfaceMod.DataNode
import typingsSlinky.rcTreeSelect.interfaceMod.FlattenDataNode
import typingsSlinky.rcTreeSelect.interfaceMod.Key
import typingsSlinky.rcTreeSelect.interfaceMod.LabelValueType
import typingsSlinky.rcTreeSelect.interfaceMod.RawValueType
import typingsSlinky.rcTreeSelect.strategyUtilMod.CheckedStrategy
import typingsSlinky.rcTreeSelect.useKeyValueMappingMod.SkipType
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSelectValuesMod {
  
  @JSImport("rc-tree-select/es/hooks/useSelectValues", JSImport.Default)
  @js.native
  def default(
    rawValues: js.Array[RawValueType],
    hasValueGetEntityByValueGetEntityByKeyTreeConductionShowCheckedStrategyConductKeyEntitiesGetLabelProp: Config
  ): js.Array[LabelValueType] = js.native
  
  @js.native
  trait Config extends StObject {
    
    var conductKeyEntities: Record[Key, DataEntity] = js.native
    
    def getEntityByKey(key: Key): FlattenDataNode = js.native
    def getEntityByKey(key: Key, skipType: js.UndefOr[SkipType], ignoreDisabledCheck: Boolean): FlattenDataNode = js.native
    def getEntityByKey(key: Key, skipType: SkipType): FlattenDataNode = js.native
    
    def getEntityByValue(value: RawValueType): FlattenDataNode = js.native
    def getEntityByValue(value: RawValueType, skipType: js.UndefOr[SkipType], ignoreDisabledCheck: Boolean): FlattenDataNode = js.native
    def getEntityByValue(value: RawValueType, skipType: SkipType): FlattenDataNode = js.native
    
    def getLabelProp(node: DataNode): ReactElement = js.native
    
    var showCheckedStrategy: CheckedStrategy = js.native
    
    var treeConduction: Boolean = js.native
    
    /** Current `value` of TreeSelect */
    var value: DefaultValueType = js.native
  }
}
