package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeCallPropertyKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeIndexerKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeInternalSlotKind
import typingsSlinky.astTypes.kindsMod.ObjectTypePropertyKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeSpreadPropertyKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallProperties extends StObject {
  
  var callProperties: js.UndefOr[js.Array[ObjectTypeCallPropertyKind]] = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var exact: js.UndefOr[Boolean] = js.native
  
  var indexers: js.UndefOr[js.Array[ObjectTypeIndexerKind]] = js.native
  
  var inexact: js.UndefOr[Boolean] = js.native
  
  var internalSlots: js.UndefOr[js.Array[ObjectTypeInternalSlotKind]] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind] = js.native
}
object CallProperties {
  
  @scala.inline
  def apply(properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]): CallProperties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallProperties]
  }
  
  @scala.inline
  implicit class CallPropertiesMutableBuilder[Self <: CallProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallProperties(value: js.Array[ObjectTypeCallPropertyKind]): Self = StObject.set(x, "callProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallPropertiesUndefined: Self = StObject.set(x, "callProperties", js.undefined)
    
    @scala.inline
    def setCallPropertiesVarargs(value: ObjectTypeCallPropertyKind*): Self = StObject.set(x, "callProperties", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    @scala.inline
    def setIndexers(value: js.Array[ObjectTypeIndexerKind]): Self = StObject.set(x, "indexers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexersUndefined: Self = StObject.set(x, "indexers", js.undefined)
    
    @scala.inline
    def setIndexersVarargs(value: ObjectTypeIndexerKind*): Self = StObject.set(x, "indexers", js.Array(value :_*))
    
    @scala.inline
    def setInexact(value: Boolean): Self = StObject.set(x, "inexact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInexactUndefined: Self = StObject.set(x, "inexact", js.undefined)
    
    @scala.inline
    def setInternalSlots(value: js.Array[ObjectTypeInternalSlotKind]): Self = StObject.set(x, "internalSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalSlotsUndefined: Self = StObject.set(x, "internalSlots", js.undefined)
    
    @scala.inline
    def setInternalSlotsVarargs(value: ObjectTypeInternalSlotKind*): Self = StObject.set(x, "internalSlots", js.Array(value :_*))
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: (ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind)*): Self = StObject.set(x, "properties", js.Array(value :_*))
  }
}
