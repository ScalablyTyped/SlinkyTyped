package typingsSlinky.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Term extends StObject {
  
  /**
    * The source text of the term being translated by the custom terminology.
    */
  var SourceText: js.UndefOr[String] = js.native
  
  /**
    * The target text of the term being translated by the custom terminology.
    */
  var TargetText: js.UndefOr[String] = js.native
}
object Term {
  
  @scala.inline
  def apply(): Term = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Term]
  }
  
  @scala.inline
  implicit class TermMutableBuilder[Self <: Term] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceText(value: String): Self = StObject.set(x, "SourceText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTextUndefined: Self = StObject.set(x, "SourceText", js.undefined)
    
    @scala.inline
    def setTargetText(value: String): Self = StObject.set(x, "TargetText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTextUndefined: Self = StObject.set(x, "TargetText", js.undefined)
  }
}
