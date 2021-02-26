package typingsSlinky.nodeMysqlWrapper

import typingsSlinky.nodeMysqlWrapper.Mongo.Collection
import typingsSlinky.nodeMysqlWrapper.Mongo.CollectionStatic
import typingsSlinky.nodeMysqlWrapper.Mongo.Cursor
import typingsSlinky.nodeMysqlWrapper.Mongo.CursorStatic
import typingsSlinky.nodeMysqlWrapper.Mongo.ObjectID
import typingsSlinky.nodeMysqlWrapper.Mongo.ObjectIDStatic
import typingsSlinky.nodeMysqlWrapper.anon.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Meteor {
    
    @JSGlobal("Meteor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Meteor.isClient")
    @js.native
    def isClient: Boolean = js.native
    @scala.inline
    def isClient_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isClient")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Meteor.isServer")
    @js.native
    def isServer: Boolean = js.native
    @scala.inline
    def isServer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isServer")(x.asInstanceOf[js.Any])
  }
  
  object Mongo {
    
    @JSGlobal("Mongo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Mongo.Collection")
    @js.native
    def Collection: CollectionStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Mongo.Collection")
    @js.native
    class CollectionCls[T] protected () extends Collection[T] {
      def this(name: String) = this()
      def this(name: String, options: Connection) = this()
    }
    
    @scala.inline
    def Collection_=(x: CollectionStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Collection")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Mongo.Cursor")
    @js.native
    def Cursor: CursorStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Mongo.Cursor")
    @js.native
    class CursorCls[T] () extends Cursor[T]
    
    @scala.inline
    def Cursor_=(x: CursorStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cursor")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Mongo.ObjectID")
    @js.native
    def ObjectID: ObjectIDStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Mongo.ObjectID")
    @js.native
    class ObjectIDCls protected () extends ObjectID {
      def this(hexString: String) = this()
    }
    
    @scala.inline
    def ObjectID_=(x: ObjectIDStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectID")(x.asInstanceOf[js.Any])
  }
}
