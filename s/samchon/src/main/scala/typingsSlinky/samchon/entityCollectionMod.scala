package typingsSlinky.samchon

import typingsSlinky.ecol.arrayCollectionMod.ArrayCollection
import typingsSlinky.ecol.dequeCollectionMod.DequeCollection
import typingsSlinky.ecol.listCollectionMod.ListCollection
import typingsSlinky.samchon.ientityMod.IEntity
import typingsSlinky.sxml.mod.XML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/protocol/entity/EntityCollection", JSImport.Namespace)
@js.native
object entityCollectionMod extends js.Object {
  
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
