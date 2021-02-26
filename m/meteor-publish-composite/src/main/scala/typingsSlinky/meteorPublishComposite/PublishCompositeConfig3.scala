package typingsSlinky.meteorPublishComposite

import typingsSlinky.meteor.Mongo.Cursor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishCompositeConfig3[InLevel1, InLevel2, InLevel3, OutLevel] extends StObject {
  
  var children: js.UndefOr[js.Array[PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, OutLevel, _]]] = js.native
  
  var collectionName: js.UndefOr[String] = js.native
  
  def find(arg3: InLevel3, arg2: InLevel2, arg1: InLevel1): Cursor[OutLevel, OutLevel] = js.native
}
object PublishCompositeConfig3 {
  
  @scala.inline
  def apply[InLevel1, InLevel2, InLevel3, OutLevel](find: (InLevel3, InLevel2, InLevel1) => Cursor[OutLevel, OutLevel]): PublishCompositeConfig3[InLevel1, InLevel2, InLevel3, OutLevel] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction3(find))
    __obj.asInstanceOf[PublishCompositeConfig3[InLevel1, InLevel2, InLevel3, OutLevel]]
  }
  
  @scala.inline
  implicit class PublishCompositeConfig3MutableBuilder[Self <: PublishCompositeConfig3[_, _, _, _], InLevel1, InLevel2, InLevel3, OutLevel] (val x: Self with (PublishCompositeConfig3[InLevel1, InLevel2, InLevel3, OutLevel])) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, OutLevel, _]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: (PublishCompositeConfig4[InLevel1, InLevel2, InLevel3, OutLevel, js.Any])*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setCollectionName(value: String): Self = StObject.set(x, "collectionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionNameUndefined: Self = StObject.set(x, "collectionName", js.undefined)
    
    @scala.inline
    def setFind(value: (InLevel3, InLevel2, InLevel1) => Cursor[OutLevel, OutLevel]): Self = StObject.set(x, "find", js.Any.fromFunction3(value))
  }
}
