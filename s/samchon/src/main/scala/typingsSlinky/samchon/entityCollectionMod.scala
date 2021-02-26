package typingsSlinky.samchon

import typingsSlinky.ecol.mod.ArrayCollection
import typingsSlinky.ecol.mod.DequeCollection
import typingsSlinky.ecol.mod.ListCollection
import typingsSlinky.samchon.ientityMod.IEntity
import typingsSlinky.sxml.mod.XML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityCollectionMod {
  
  @JSImport("samchon/protocol/entity/EntityCollection", "EntityArrayCollection")
  @js.native
  abstract class EntityArrayCollection[T /* <: IEntity */] () extends ArrayCollection[T] {
    
    /**
      * @inheritdoc
      */
    def CHILD_TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    def TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    def construct(xml: XML): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def count(key: js.Any): Double = js.native
    
    /**
      * @inheritdoc
      */
    def createChild(xml: XML): T = js.native
    
    /**
      * @inheritdoc
      */
    def get(key: js.Any): T = js.native
    
    /**
      * @inheritdoc
      */
    def has(key: js.Any): Boolean = js.native
    
    /**
      * @inheritdoc
      */
    def key(): js.Any = js.native
    
    /**
      * @inheritdoc
      */
    def toXML(): XML = js.native
  }
  
  @JSImport("samchon/protocol/entity/EntityCollection", "EntityDequeCollection")
  @js.native
  abstract class EntityDequeCollection[T /* <: IEntity */] () extends DequeCollection[T] {
    
    /**
      * @inheritdoc
      */
    def CHILD_TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    def TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    def construct(xml: XML): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def count(key: js.Any): Double = js.native
    
    /**
      * @inheritdoc
      */
    def createChild(xml: XML): T = js.native
    
    /**
      * @inheritdoc
      */
    def get(key: js.Any): T = js.native
    
    /**
      * @inheritdoc
      */
    def has(key: js.Any): Boolean = js.native
    
    /**
      * @inheritdoc
      */
    def key(): js.Any = js.native
    
    /**
      * @inheritdoc
      */
    def toXML(): XML = js.native
  }
  
  @JSImport("samchon/protocol/entity/EntityCollection", "EntityListCollection")
  @js.native
  abstract class EntityListCollection[T /* <: IEntity */] () extends ListCollection[T] {
    
    /**
      * @inheritdoc
      */
    def CHILD_TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    def TAG(): String = js.native
    
    /**
      * @inheritdoc
      */
    def construct(xml: XML): Unit = js.native
    
    /**
      * @inheritdoc
      */
    def count(key: js.Any): Double = js.native
    
    /**
      * @inheritdoc
      */
    def createChild(xml: XML): T = js.native
    
    /**
      * @inheritdoc
      */
    def get(key: js.Any): T = js.native
    
    /**
      * @inheritdoc
      */
    def has(key: js.Any): Boolean = js.native
    
    /**
      * @inheritdoc
      */
    def key(): js.Any = js.native
    
    /**
      * @inheritdoc
      */
    def toXML(): XML = js.native
  }
}
