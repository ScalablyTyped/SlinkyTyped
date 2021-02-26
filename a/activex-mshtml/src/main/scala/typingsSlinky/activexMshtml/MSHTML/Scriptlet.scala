package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scriptlet extends StObject {
  
  def AboutBox(): Unit = js.native
  
  @JSName("MSHTML.Scriptlet_typekey")
  var MSHTMLDotScriptlet_typekey: Scriptlet = js.native
  
  var Scrollbar: Boolean = js.native
  
  var embed: Boolean = js.native
  
  val event: js.Any = js.native
  
  val readyState: Double = js.native
  
  var url: String = js.native
}
object Scriptlet {
  
  @scala.inline
  def apply(
    AboutBox: () => Unit,
    MSHTMLDotScriptlet_typekey: Scriptlet,
    Scrollbar: Boolean,
    embed: Boolean,
    event: js.Any,
    readyState: Double,
    url: String
  ): Scriptlet = {
    val __obj = js.Dynamic.literal(AboutBox = js.Any.fromFunction0(AboutBox), Scrollbar = Scrollbar.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.Scriptlet_typekey")(MSHTMLDotScriptlet_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scriptlet]
  }
  
  @scala.inline
  implicit class ScriptletMutableBuilder[Self <: Scriptlet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAboutBox(value: () => Unit): Self = StObject.set(x, "AboutBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmbed(value: Boolean): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotScriptlet_typekey(value: Scriptlet): Self = StObject.set(x, "MSHTML.Scriptlet_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyState(value: Double): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbar(value: Boolean): Self = StObject.set(x, "Scrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
