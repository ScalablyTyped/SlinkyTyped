package typingsSlinky.mongodb.anon

import typingsSlinky.mongodb.mod.ExtractIdType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2`[TSchema /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  _id :any | undefined} */ js.Any */] extends StObject {
  
  var _id: js.UndefOr[ExtractIdType[TSchema]] = js.native
}
object `2` {
  
  @scala.inline
  def apply[TSchema /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  _id :any | undefined} */ js.Any */](): `2`[TSchema] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`[TSchema]]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`[_], TSchema /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  _id :any | undefined} */ js.Any */] (val x: Self with `2`[TSchema]) extends AnyVal {
    
    @scala.inline
    def set_id(value: ExtractIdType[TSchema]): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
  }
}
