package typingsSlinky.rcTreeSelect.useKeyValueMappingMod

import typingsSlinky.rcTreeSelect.interfaceMod.FlattenDataNode
import typingsSlinky.rcTreeSelect.interfaceMod.Key
import typingsSlinky.rcTreeSelect.interfaceMod.RawValueType
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree-select/lib/hooks/useKeyValueMapping", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(cacheKeyMap: Map[Key, FlattenDataNode], cacheValueMap: Map[RawValueType, FlattenDataNode]): js.Tuple2[
    js.Function2[/* key */ Key, /* skipType */ js.UndefOr[SkipType], FlattenDataNode], 
    js.Function2[/* value */ RawValueType, /* skipType */ js.UndefOr[SkipType], FlattenDataNode]
  ] = js.native
}

