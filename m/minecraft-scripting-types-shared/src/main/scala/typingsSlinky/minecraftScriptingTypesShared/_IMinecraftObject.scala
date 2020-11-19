package typingsSlinky.minecraftScriptingTypesShared

import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.block
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.entity
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.entity_ticking_area
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.item_entity
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.item_stack
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.level
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.level_ticking_area
import typingsSlinky.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _IMinecraftObject extends js.Object
object _IMinecraftObject {
  
  @scala.inline
  def ILevel(__type__ : level, level_id: Double): _IMinecraftObject = {
    val __obj = js.Dynamic.literal(__type__ = __type__.asInstanceOf[js.Any], level_id = level_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[_IMinecraftObject]
  }
  
  @scala.inline
  def ILevelTickingArea(__type__ : level_ticking_area, level_ticking_area_id: String): _IMinecraftObject = {
    val __obj = js.Dynamic.literal(__type__ = __type__.asInstanceOf[js.Any], level_ticking_area_id = level_ticking_area_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[_IMinecraftObject]
  }
  
  @scala.inline
  def IBlock(__identifier__ : String, __type__ : block, block_position: VectorXYZ, ticking_area: ITickingArea): _IMinecraftObject = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = __type__.asInstanceOf[js.Any], block_position = block_position.asInstanceOf[js.Any], ticking_area = ticking_area.asInstanceOf[js.Any])
    __obj.asInstanceOf[_IMinecraftObject]
  }
  
  @scala.inline
  def IItemStack(__identifier__ : String, __type__ : item_stack, count: Double, item: String): _IMinecraftObject = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = __type__.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[_IMinecraftObject]
  }
  
  @scala.inline
  def IEntity(__identifier__ : String, __type__ : entity | item_entity, id: Double): _IMinecraftObject = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = __type__.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[_IMinecraftObject]
  }
  
  @scala.inline
  def IEntityTickingArea(__type__ : entity_ticking_area, entity_ticking_area_id: Int64): _IMinecraftObject = {
    val __obj = js.Dynamic.literal(__type__ = __type__.asInstanceOf[js.Any], entity_ticking_area_id = entity_ticking_area_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[_IMinecraftObject]
  }
  
  @scala.inline
  def IQuery(__type__ : query, query_id: Double): _IMinecraftObject = {
    val __obj = js.Dynamic.literal(__type__ = __type__.asInstanceOf[js.Any], query_id = query_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[_IMinecraftObject]
  }
}
