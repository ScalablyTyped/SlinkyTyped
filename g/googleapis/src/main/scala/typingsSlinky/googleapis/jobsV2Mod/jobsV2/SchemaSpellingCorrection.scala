package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Spell check result.
  */
@js.native
trait SchemaSpellingCorrection extends StObject {
  
  /**
    * Indicates if the query was corrected by the spell checker.
    */
  var corrected: js.UndefOr[Boolean] = js.native
  
  /**
    * Correction output consisting of the corrected keyword string.
    */
  var correctedText: js.UndefOr[String] = js.native
}
object SchemaSpellingCorrection {
  
  @scala.inline
  def apply(): SchemaSpellingCorrection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpellingCorrection]
  }
  
  @scala.inline
  implicit class SchemaSpellingCorrectionMutableBuilder[Self <: SchemaSpellingCorrection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorrected(value: Boolean): Self = StObject.set(x, "corrected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectedText(value: String): Self = StObject.set(x, "correctedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectedTextUndefined: Self = StObject.set(x, "correctedText", js.undefined)
    
    @scala.inline
    def setCorrectedUndefined: Self = StObject.set(x, "corrected", js.undefined)
  }
}
