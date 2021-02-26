package typingsSlinky.magnetUri

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.node.Buffer
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("magnet-uri", JSImport.Namespace)
  @js.native
  val ^ : MagnetUri = js.native
  
  @js.native
  trait Instance extends Object {
    
    var announce: js.UndefOr[js.Array[String]] = js.native
    
    var as: js.UndefOr[String | js.Array[String]] = js.native
    
    var dn: js.UndefOr[String | js.Array[String]] = js.native
    
    var infoHash: js.UndefOr[String] = js.native
    
    var infoHashBuffer: js.UndefOr[Buffer] = js.native
    
    var ix: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var keywords: js.UndefOr[String | js.Array[String]] = js.native
    
    var kt: js.UndefOr[js.Array[String]] = js.native
    
    var name: js.UndefOr[String | js.Array[String]] = js.native
    
    var tr: js.UndefOr[String | js.Array[String]] = js.native
    
    var urlList: js.UndefOr[js.Array[String]] = js.native
    
    var ws: js.UndefOr[String | js.Array[String]] = js.native
    
    var xs: js.UndefOr[String | js.Array[String]] = js.native
    
    var xt: js.UndefOr[String | js.Array[String]] = js.native
  }
  object Instance {
    
    @scala.inline
    def apply(
      constructor: js.Function,
      hasOwnProperty: PropertyKey => Boolean,
      propertyIsEnumerable: PropertyKey => Boolean
    ): Instance = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
      __obj.asInstanceOf[Instance]
    }
    
    @scala.inline
    implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnounce(value: js.Array[String]): Self = StObject.set(x, "announce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnounceUndefined: Self = StObject.set(x, "announce", js.undefined)
      
      @scala.inline
      def setAnnounceVarargs(value: String*): Self = StObject.set(x, "announce", js.Array(value :_*))
      
      @scala.inline
      def setAs(value: String | js.Array[String]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAsVarargs(value: String*): Self = StObject.set(x, "as", js.Array(value :_*))
      
      @scala.inline
      def setDn(value: String | js.Array[String]): Self = StObject.set(x, "dn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnUndefined: Self = StObject.set(x, "dn", js.undefined)
      
      @scala.inline
      def setDnVarargs(value: String*): Self = StObject.set(x, "dn", js.Array(value :_*))
      
      @scala.inline
      def setInfoHash(value: String): Self = StObject.set(x, "infoHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoHashBuffer(value: Buffer): Self = StObject.set(x, "infoHashBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoHashBufferUndefined: Self = StObject.set(x, "infoHashBuffer", js.undefined)
      
      @scala.inline
      def setInfoHashUndefined: Self = StObject.set(x, "infoHash", js.undefined)
      
      @scala.inline
      def setIx(value: Double | js.Array[Double]): Self = StObject.set(x, "ix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIxUndefined: Self = StObject.set(x, "ix", js.undefined)
      
      @scala.inline
      def setIxVarargs(value: Double*): Self = StObject.set(x, "ix", js.Array(value :_*))
      
      @scala.inline
      def setKeywords(value: String | js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      @scala.inline
      def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      @scala.inline
      def setKt(value: js.Array[String]): Self = StObject.set(x, "kt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKtUndefined: Self = StObject.set(x, "kt", js.undefined)
      
      @scala.inline
      def setKtVarargs(value: String*): Self = StObject.set(x, "kt", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String | js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
      
      @scala.inline
      def setTr(value: String | js.Array[String]): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
      
      @scala.inline
      def setTrVarargs(value: String*): Self = StObject.set(x, "tr", js.Array(value :_*))
      
      @scala.inline
      def setUrlList(value: js.Array[String]): Self = StObject.set(x, "urlList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlListUndefined: Self = StObject.set(x, "urlList", js.undefined)
      
      @scala.inline
      def setUrlListVarargs(value: String*): Self = StObject.set(x, "urlList", js.Array(value :_*))
      
      @scala.inline
      def setWs(value: String | js.Array[String]): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWsUndefined: Self = StObject.set(x, "ws", js.undefined)
      
      @scala.inline
      def setWsVarargs(value: String*): Self = StObject.set(x, "ws", js.Array(value :_*))
      
      @scala.inline
      def setXs(value: String | js.Array[String]): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      @scala.inline
      def setXsVarargs(value: String*): Self = StObject.set(x, "xs", js.Array(value :_*))
      
      @scala.inline
      def setXt(value: String | js.Array[String]): Self = StObject.set(x, "xt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXtUndefined: Self = StObject.set(x, "xt", js.undefined)
      
      @scala.inline
      def setXtVarargs(value: String*): Self = StObject.set(x, "xt", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MagnetUri extends StObject {
    
    def apply(uri: String): Instance = js.native
    
    def decode(uri: String): Instance = js.native
    
    def encode(parsed: Instance): String = js.native
  }
  
  type _To = MagnetUri
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: MagnetUri = ^
}
