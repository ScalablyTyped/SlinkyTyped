package typingsSlinky.emotionReact.anon

import typingsSlinky.emotionSerialize.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Css extends StObject {
  
  var css: js.UndefOr[Interpolation[typingsSlinky.emotionReact.emotionReactMod.Theme]] = js.native
}
object Css {
  
  @scala.inline
  def apply(): Css = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Css]
  }
  
  @scala.inline
  implicit class CssMutableBuilder[Self <: Css] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCss(value: Interpolation[typingsSlinky.emotionReact.emotionReactMod.Theme]): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssNull: Self = StObject.set(x, "css", null)
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
  }
}
