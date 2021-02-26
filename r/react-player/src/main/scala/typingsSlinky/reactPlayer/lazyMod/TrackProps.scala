package typingsSlinky.reactPlayer.lazyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackProps extends StObject {
  
  var default: js.UndefOr[Boolean] = js.native
  
  var kind: String = js.native
  
  var label: String = js.native
  
  var src: String = js.native
  
  var srcLang: String = js.native
}
object TrackProps {
  
  @scala.inline
  def apply(kind: String, label: String, src: String, srcLang: String): TrackProps = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], srcLang = srcLang.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackProps]
  }
  
  @scala.inline
  implicit class TrackPropsMutableBuilder[Self <: TrackProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
  }
}
