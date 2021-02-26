package typingsSlinky.nano

import typingsSlinky.nano.mod.Callback
import typingsSlinky.nano.mod.DatabaseCreateResponse
import typingsSlinky.nano.mod.DatabaseGetResponse
import typingsSlinky.nano.mod.Document
import typingsSlinky.nano.mod.MangoSelector
import typingsSlinky.nano.mod.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Active extends StObject {
    
    // The size of live data inside the database, in bytes.
    var active: Double = js.native
    
    // The uncompressed size of database contents in bytes.
    var external: Double = js.native
    
    // The size of the database file on disk in bytes. Views indexes
    var file: Double = js.native
  }
  object Active {
    
    @scala.inline
    def apply(active: Double, external: Double, file: Double): Active = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[Active]
    }
    
    @scala.inline
    implicit class ActiveMutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal(value: Double): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: Double): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Disable extends StObject {
    
    def disable(id: String, rev: String, opts0: js.Object): js.Promise[DatabaseCreateResponse] = js.native
    def disable(id: String, rev: String, opts0: js.Object, callback0: Callback[DatabaseCreateResponse]): js.Promise[DatabaseCreateResponse] = js.native
    
    def enable(source: String, target: String, opts0: js.Object): js.Promise[DatabaseCreateResponse] = js.native
    def enable(source: String, target: String, opts0: js.Object, callback0: Callback[DatabaseCreateResponse]): js.Promise[DatabaseCreateResponse] = js.native
    
    def query(id: String, opts0: js.Object): js.Promise[DatabaseGetResponse] = js.native
    def query(id: String, opts0: js.Object, callback0: Callback[DatabaseGetResponse]): js.Promise[DatabaseGetResponse] = js.native
  }
  
  @js.native
  trait Doc[V] extends StObject {
    
    var doc: js.UndefOr[V] = js.native
    
    var fields: js.Object = js.native
    
    var id: String = js.native
    
    var key: String = js.native
    
    var order: js.Array[Double] = js.native
  }
  object Doc {
    
    @scala.inline
    def apply[V](fields: js.Object, id: String, key: String, order: js.Array[Double]): Doc[V] = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
      __obj.asInstanceOf[Doc[V]]
    }
    
    @scala.inline
    implicit class DocMutableBuilder[Self <: Doc[_], V] (val x: Self with Doc[V]) extends AnyVal {
      
      @scala.inline
      def setDoc(value: V): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
      
      @scala.inline
      def setFields(value: js.Object): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: js.Array[Double]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderVarargs(value: Double*): Self = StObject.set(x, "order", js.Array(value :_*))
    }
  }
  
  @js.native
  trait External extends StObject {
    
    var active: Double = js.native
    
    var external: Double = js.native
  }
  object External {
    
    @scala.inline
    def apply(active: Double, external: Double): External = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any])
      __obj.asInstanceOf[External]
    }
    
    @scala.inline
    implicit class ExternalMutableBuilder[Self <: External] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal(value: Double): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fields extends StObject {
    
    // Array of field names following the sort syntax.
    var fields: js.Array[SortOrder] = js.native
    
    // A selector to apply to documents at indexing time, creating a partial index.
    var partial_filter_selector: js.UndefOr[MangoSelector] = js.native
  }
  object Fields {
    
    @scala.inline
    def apply(fields: js.Array[SortOrder]): Fields = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: js.Array[SortOrder]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsVarargs(value: SortOrder*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setPartial_filter_selector(value: MangoSelector): Self = StObject.set(x, "partial_filter_selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartial_filter_selectorUndefined: Self = StObject.set(x, "partial_filter_selector", js.undefined)
    }
  }
  
  @js.native
  trait Id[V, D] extends StObject {
    
    var doc: js.UndefOr[D with Document] = js.native
    
    var id: String = js.native
    
    var key: String = js.native
    
    var value: V = js.native
  }
  object Id {
    
    @scala.inline
    def apply[V, D](id: String, key: String, value: V): Id[V, D] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id[V, D]]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id[_, _], V, D] (val x: Self with (Id[V, D])) extends AnyVal {
      
      @scala.inline
      def setDoc(value: D with Document): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IdRev extends StObject {
    
    var _id: String = js.native
    
    var _rev: String = js.native
  }
  object IdRev {
    
    @scala.inline
    def apply(_id: String, _rev: String): IdRev = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _rev = _rev.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdRev]
    }
    
    @scala.inline
    implicit class IdRevMutableBuilder[Self <: IdRev] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_rev(value: String): Self = StObject.set(x, "_rev", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Rev extends StObject {
    
    var rev: String = js.native
  }
  object Rev {
    
    @scala.inline
    def apply(rev: String): Rev = {
      val __obj = js.Dynamic.literal(rev = rev.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rev]
    }
    
    @scala.inline
    implicit class RevMutableBuilder[Self <: Rev] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    }
  }
}
