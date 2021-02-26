package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLStyleMedia extends StObject {
  
  @JSName("MSHTML.IHTMLStyleMedia_typekey")
  var MSHTMLDotIHTMLStyleMedia_typekey: IHTMLStyleMedia = js.native
  
  def matchMedium(mediaQuery: String): Boolean = js.native
  
  val `type`: String = js.native
}
object IHTMLStyleMedia {
  
  @scala.inline
  def apply(MSHTMLDotIHTMLStyleMedia_typekey: IHTMLStyleMedia, matchMedium: String => Boolean, `type`: String): IHTMLStyleMedia = {
    val __obj = js.Dynamic.literal(matchMedium = js.Any.fromFunction1(matchMedium))
    __obj.updateDynamic("MSHTML.IHTMLStyleMedia_typekey")(MSHTMLDotIHTMLStyleMedia_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLStyleMedia]
  }
  
  @scala.inline
  implicit class IHTMLStyleMediaMutableBuilder[Self <: IHTMLStyleMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotIHTMLStyleMedia_typekey(value: IHTMLStyleMedia): Self = StObject.set(x, "MSHTML.IHTMLStyleMedia_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchMedium(value: String => Boolean): Self = StObject.set(x, "matchMedium", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
