package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Text conversion result to be used with {@link XTextConversion} .
  * @since OOo 1.1.2
  */
@js.native
trait TextConversionResult extends StObject {
  
  /**
    * The boundary of the first convertible word in the given text.
    *
    * If there is no convertible word found in the text, **startPos** and **endPos** for {@link Boundary} equal 0.
    */
  var Boundary: typingsSlinky.activexLibreoffice.com_.sun.star.i18n.Boundary = js.native
  
  /** A list of replacement candidates for the first convertible word found in the given text. */
  var Candidates: SafeArray[String] = js.native
}
object TextConversionResult {
  
  @scala.inline
  def apply(Boundary: Boundary, Candidates: SafeArray[String]): TextConversionResult = {
    val __obj = js.Dynamic.literal(Boundary = Boundary.asInstanceOf[js.Any], Candidates = Candidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextConversionResult]
  }
  
  @scala.inline
  implicit class TextConversionResultMutableBuilder[Self <: TextConversionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundary(value: Boundary): Self = StObject.set(x, "Boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandidates(value: SafeArray[String]): Self = StObject.set(x, "Candidates", value.asInstanceOf[js.Any])
  }
}
