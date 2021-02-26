package typingsSlinky.draftJs.mod.Draft.Model

import typingsSlinky.draftJs.mod.Draft.Model.Constants.DraftEntityMutability
import typingsSlinky.draftJs.mod.Draft.Model.Constants.DraftEntityType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Entity {
  
  /**
    * A "document entity" is an object containing metadata associated with a
    * piece of text in a ContentBlock.
    *
    * For example, a `link` entity might include a `uri` property. When a
    * ContentBlock is rendered in the browser, text that refers to that link
    * entity may be rendered as an anchor, with the `uri` as the href value.
    *
    * In a ContentBlock, every position in the text may correspond to zero
    * or one entities. This correspondence is tracked using a key string,
    * generated via DraftEntity.create() and used to obtain entity metadata
    * via DraftEntity.get().
    */
  @js.native
  trait DraftEntity extends StObject
  
  /**
    * An instance of a document entity, consisting of a `type` and relevant
    * `data`, metadata about the entity.
    *
    * For instance, a "link" entity might provide a URI, and a "mention"
    * entity might provide the mentioned user's ID. These pieces of data
    * may be used when rendering the entity as part of a ContentBlock DOM
    * representation. For a link, the data would be used as an href for
    * the rendered anchor. For a mention, the ID could be used to retrieve
    * a hovercard.
    */
  @js.native
  trait DraftEntityInstance extends StObject {
    
    def getData(): js.Any = js.native
    
    def getMutability(): DraftEntityMutability = js.native
    
    def getType(): DraftEntityType = js.native
  }
  object DraftEntityInstance {
    
    @scala.inline
    def apply(getData: () => js.Any, getMutability: () => DraftEntityMutability, getType: () => DraftEntityType): DraftEntityInstance = {
      val __obj = js.Dynamic.literal(getData = js.Any.fromFunction0(getData), getMutability = js.Any.fromFunction0(getMutability), getType = js.Any.fromFunction0(getType))
      __obj.asInstanceOf[DraftEntityInstance]
    }
    
    @scala.inline
    implicit class DraftEntityInstanceMutableBuilder[Self <: DraftEntityInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetData(value: () => js.Any): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMutability(value: () => DraftEntityMutability): Self = StObject.set(x, "getMutability", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetType(value: () => DraftEntityType): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    }
  }
}
