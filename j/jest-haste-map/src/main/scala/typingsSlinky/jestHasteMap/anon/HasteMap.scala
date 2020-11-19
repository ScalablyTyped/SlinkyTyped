package typingsSlinky.jestHasteMap.anon

import typingsSlinky.jestHasteMap.jestHasteMapNumbers.`0`
import typingsSlinky.jestHasteMap.jestHasteMapNumbers.`1`
import typingsSlinky.jestHasteMap.typesMod.InternalHasteMap
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HasteMap extends js.Object {
  
  var hasteMap: InternalHasteMap = js.native
  
  var removedFiles: Map[
    String, 
    js.Tuple6[String, Double, Double, `0` | `1`, String, js.UndefOr[String | Null]]
  ] = js.native
}
object HasteMap {
  
  @scala.inline
  def apply(
    hasteMap: InternalHasteMap,
    removedFiles: Map[
      String, 
      js.Tuple6[String, Double, Double, `0` | `1`, String, js.UndefOr[String | Null]]
    ]
  ): HasteMap = {
    val __obj = js.Dynamic.literal(hasteMap = hasteMap.asInstanceOf[js.Any], removedFiles = removedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasteMap]
  }
  
  @scala.inline
  implicit class HasteMapOps[Self <: HasteMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHasteMap(value: InternalHasteMap): Self = this.set("hasteMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedFiles(
      value: Map[
          String, 
          js.Tuple6[String, Double, Double, `0` | `1`, String, js.UndefOr[String | Null]]
        ]
    ): Self = this.set("removedFiles", value.asInstanceOf[js.Any])
  }
}
