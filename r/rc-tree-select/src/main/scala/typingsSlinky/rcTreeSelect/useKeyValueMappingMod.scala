package typingsSlinky.rcTreeSelect

import typingsSlinky.rcTreeSelect.interfaceMod.FlattenDataNode
import typingsSlinky.rcTreeSelect.interfaceMod.Key
import typingsSlinky.rcTreeSelect.interfaceMod.RawValueType
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useKeyValueMappingMod {
  
  @JSImport("rc-tree-select/es/hooks/useKeyValueMapping", JSImport.Default)
  @js.native
  def default(cacheKeyMap: Map[Key, FlattenDataNode], cacheValueMap: Map[RawValueType, FlattenDataNode]): js.Tuple2[
    js.Function3[
      /* key */ Key, 
      /* skipType */ js.UndefOr[SkipType], 
      /* ignoreDisabledCheck */ js.UndefOr[Boolean], 
      FlattenDataNode
    ], 
    js.Function3[
      /* value */ RawValueType, 
      /* skipType */ js.UndefOr[SkipType], 
      /* ignoreDisabledCheck */ js.UndefOr[Boolean], 
      FlattenDataNode
    ]
  ] = js.native
  
  @JSImport("rc-tree-select/es/hooks/useKeyValueMapping", "isDisabled")
  @js.native
  def isDisabled(dataNode: FlattenDataNode, skipType: SkipType): Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typingsSlinky.rcTreeSelect.rcTreeSelectStrings.select
    - typingsSlinky.rcTreeSelect.rcTreeSelectStrings.checkbox
  */
  type SkipType = _SkipType | Null
  
  trait _SkipType extends StObject
}
