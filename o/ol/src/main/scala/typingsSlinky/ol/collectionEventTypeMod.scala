package typingsSlinky.ol

import typingsSlinky.ol.collectionEventTypeMod.CollectionEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/CollectionEventType", JSImport.Namespace)
@js.native
object collectionEventTypeMod extends js.Object {
  @js.native
  sealed trait CollectionEventType extends js.Object
  
  @js.native
  object CollectionEventType extends js.Object {
    @js.native
    sealed trait ADD extends CollectionEventType
    
    @js.native
    sealed trait REMOVE extends CollectionEventType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "add" */ val ADD: typingsSlinky.ol.collectionEventTypeMod.CollectionEventType.ADD with String = js.native
    /* "remove" */ val REMOVE: typingsSlinky.ol.collectionEventTypeMod.CollectionEventType.REMOVE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CollectionEventType with String] = js.native
  }
  
}

