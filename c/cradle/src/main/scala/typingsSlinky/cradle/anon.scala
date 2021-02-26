package typingsSlinky.cradle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cancel extends StObject {
    
    var cancel: js.UndefOr[Boolean] = js.native
    
    var continuous: js.UndefOr[Boolean] = js.native
    
    var create_target: js.UndefOr[Boolean] = js.native
    
    var doc_ids: js.UndefOr[js.Array[String]] = js.native
    
    var filter: js.UndefOr[String] = js.native
    
    var proxy: js.UndefOr[String] = js.native
    
    var query_params: js.UndefOr[js.Any] = js.native
    
    var source: String | Url = js.native
    
    var target: String | Url = js.native
  }
  object Cancel {
    
    @scala.inline
    def apply(source: String | Url, target: String | Url): Cancel = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cancel]
    }
    
    @scala.inline
    implicit class CancelMutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
      
      @scala.inline
      def setCreate_target(value: Boolean): Self = StObject.set(x, "create_target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreate_targetUndefined: Self = StObject.set(x, "create_target", js.undefined)
      
      @scala.inline
      def setDoc_ids(value: js.Array[String]): Self = StObject.set(x, "doc_ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoc_idsUndefined: Self = StObject.set(x, "doc_ids", js.undefined)
      
      @scala.inline
      def setDoc_idsVarargs(value: String*): Self = StObject.set(x, "doc_ids", js.Array(value :_*))
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setQuery_params(value: js.Any): Self = StObject.set(x, "query_params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery_paramsUndefined: Self = StObject.set(x, "query_params", js.undefined)
      
      @scala.inline
      def setSource(value: String | Url): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: String | Url): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Descending extends StObject {
    
    var descending: js.UndefOr[Boolean] = js.native
    
    var endkey: js.UndefOr[js.Any] = js.native
    
    var group: js.UndefOr[Boolean] = js.native
    
    var include_docs: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var reduce: js.UndefOr[Boolean] = js.native
    
    var startkey: js.UndefOr[js.Any] = js.native
  }
  object Descending {
    
    @scala.inline
    def apply(): Descending = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Descending]
    }
    
    @scala.inline
    implicit class DescendingMutableBuilder[Self <: Descending] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescending(value: Boolean): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescendingUndefined: Self = StObject.set(x, "descending", js.undefined)
      
      @scala.inline
      def setEndkey(value: js.Any): Self = StObject.set(x, "endkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndkeyUndefined: Self = StObject.set(x, "endkey", js.undefined)
      
      @scala.inline
      def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setInclude_docs(value: Boolean): Self = StObject.set(x, "include_docs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInclude_docsUndefined: Self = StObject.set(x, "include_docs", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setReduce(value: Boolean): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
      
      @scala.inline
      def setStartkey(value: js.Any): Self = StObject.set(x, "startkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartkeyUndefined: Self = StObject.set(x, "startkey", js.undefined)
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
    
    var rev: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String, rev: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Password extends StObject {
    
    var password: String = js.native
    
    var username: String = js.native
  }
  object Password {
    
    @scala.inline
    def apply(password: String, username: String): Password = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Password]
    }
    
    @scala.inline
    implicit class PasswordMutableBuilder[Self <: Password] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Url extends StObject {
    
    var url: String = js.native
  }
  object Url {
    
    @scala.inline
    def apply(url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
