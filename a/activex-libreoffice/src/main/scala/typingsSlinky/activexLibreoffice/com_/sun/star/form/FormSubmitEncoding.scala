package typingsSlinky.activexLibreoffice.com_.sun.star.form

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specify the MIME encoding to be used when form data is submitted. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait FormSubmitEncoding extends StObject
object FormSubmitEncoding {
  
  /**
    * Specifies to use "multipart/form-data" as submit encoding.
    *
    * Usually used when the form contains a file upload element.
    */
  @scala.inline
  def MULTIPART: `1` = 1.asInstanceOf[`1`]
  
  /**
    * specifies to use "text/plain"
    *
    * Usually used if the FormSubmitMethod attribute has the value POST and the content should be reviewed as full text.
    */
  @scala.inline
  def TEXT: `2` = 2.asInstanceOf[`2`]
  
  /**
    * When the button is clicked, an URL set for the button is opened.
    * @see com.sun.star.form.component.CommandButton.TargetURL
    * @see com.sun.star.form.component.CommandButton.TargetFrame Specifies to use "application/x-www-form-urlencoded" as submit encoding.  Usually used if t
    */
  @scala.inline
  def URL: `0` = 0.asInstanceOf[`0`]
}
