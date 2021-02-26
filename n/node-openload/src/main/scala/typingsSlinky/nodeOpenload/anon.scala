package typingsSlinky.nodeOpenload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Added extends StObject {
    
    var added: String = js.native
    
    var bytes_loaded: String = js.native
    
    var bytes_total: String = js.native
    
    var extid: String | Boolean = js.native
    
    var folderid: String = js.native
    
    var id: Double = js.native
    
    var last_update: String = js.native
    
    var remoteurl: String = js.native
    
    var status: String = js.native
    
    var url: String | Boolean = js.native
  }
  object Added {
    
    @scala.inline
    def apply(
      added: String,
      bytes_loaded: String,
      bytes_total: String,
      extid: String | Boolean,
      folderid: String,
      id: Double,
      last_update: String,
      remoteurl: String,
      status: String,
      url: String | Boolean
    ): Added = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], bytes_loaded = bytes_loaded.asInstanceOf[js.Any], bytes_total = bytes_total.asInstanceOf[js.Any], extid = extid.asInstanceOf[js.Any], folderid = folderid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_update = last_update.asInstanceOf[js.Any], remoteurl = remoteurl.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Added]
    }
    
    @scala.inline
    implicit class AddedMutableBuilder[Self <: Added] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdded(value: String): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytes_loaded(value: String): Self = StObject.set(x, "bytes_loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytes_total(value: String): Self = StObject.set(x, "bytes_total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtid(value: String | Boolean): Self = StObject.set(x, "extid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolderid(value: String): Self = StObject.set(x, "folderid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_update(value: String): Self = StObject.set(x, "last_update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteurl(value: String): Self = StObject.set(x, "remoteurl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String | Boolean): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Contenttype extends StObject {
    
    var content_type: String = js.native
    
    var id: String = js.native
    
    var name: String = js.native
    
    var sha1: String = js.native
    
    var size: Double = js.native
    
    var status: Double = js.native
  }
  object Contenttype {
    
    @scala.inline
    def apply(content_type: String, id: String, name: String, sha1: String, size: Double, status: Double): Contenttype = {
      val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contenttype]
    }
    
    @scala.inline
    implicit class ContenttypeMutableBuilder[Self <: Contenttype] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Cstatus extends StObject {
    
    var content_type: String = js.native
    
    var cstatus: String = js.native
    
    var download_count: String = js.native
    
    var folderid: String = js.native
    
    var link: String = js.native
    
    var linkextid: String = js.native
    
    var name: String = js.native
    
    var sha1: String = js.native
    
    var size: String = js.native
    
    var status: String = js.native
    
    var upload_at: String = js.native
  }
  object Cstatus {
    
    @scala.inline
    def apply(
      content_type: String,
      cstatus: String,
      download_count: String,
      folderid: String,
      link: String,
      linkextid: String,
      name: String,
      sha1: String,
      size: String,
      status: String,
      upload_at: String
    ): Cstatus = {
      val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], cstatus = cstatus.asInstanceOf[js.Any], download_count = download_count.asInstanceOf[js.Any], folderid = folderid.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], linkextid = linkextid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], upload_at = upload_at.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cstatus]
    }
    
    @scala.inline
    implicit class CstatusMutableBuilder[Self <: Cstatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCstatus(value: String): Self = StObject.set(x, "cstatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownload_count(value: String): Self = StObject.set(x, "download_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolderid(value: String): Self = StObject.set(x, "folderid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkextid(value: String): Self = StObject.set(x, "linkextid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_at(value: String): Self = StObject.set(x, "upload_at", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
    
    var name: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String, name: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Left extends StObject {
    
    var left: Double = js.native
    
    var used_24h: Double = js.native
  }
  object Left {
    
    @scala.inline
    def apply(left: Double, used_24h: Double): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], used_24h = used_24h.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit class LeftMutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsed_24h(value: Double): Self = StObject.set(x, "used_24h", value.asInstanceOf[js.Any])
    }
  }
}
