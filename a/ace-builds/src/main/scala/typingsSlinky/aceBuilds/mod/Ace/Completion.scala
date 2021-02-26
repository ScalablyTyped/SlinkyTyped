package typingsSlinky.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Completion extends StObject {
  
  var caption: js.UndefOr[String] = js.native
  
  var meta: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var score: Double = js.native
  
  var value: String = js.native
}
object Completion {
  
  @scala.inline
  def apply(score: Double, value: String): Completion = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Completion]
  }
  
  @scala.inline
  implicit class CompletionMutableBuilder[Self <: Completion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
