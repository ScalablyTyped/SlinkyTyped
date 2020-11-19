package typingsSlinky.samchon

import typingsSlinky.samchon.ientityMod.IEntity
import typingsSlinky.sxml.mod.XML
import typingsSlinky.tstl.mod.Deque
import typingsSlinky.tstl.mod.List
import typingsSlinky.tstl.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon/protocol/entity/EntityArray", JSImport.Namespace)
@js.native
object entityArrayMod extends js.Object {
  
  @js.native
  abstract class EntityArray[T /* <: IEntity */] () extends Vector[T] {
    
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
  abstract class EntityDeque[T /* <: IEntity */] () extends Deque[T] {
    
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
  abstract class EntityList[T /* <: IEntity */] () extends List[T] {
    
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
