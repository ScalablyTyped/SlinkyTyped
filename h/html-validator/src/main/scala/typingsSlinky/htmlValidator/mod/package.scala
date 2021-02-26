package typingsSlinky.htmlValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(options: typingsSlinky.htmlValidator.mod.OptionsForExternalUrlAsValidationTargetAndObjectAsResult): js.Promise[typingsSlinky.htmlValidator.mod.ParsedJsonAsValidationResults] = typingsSlinky.htmlValidator.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.htmlValidator.mod.ParsedJsonAsValidationResults]]
  @scala.inline
  def apply(options: typingsSlinky.htmlValidator.mod.OptionsForExternalUrlAsValidationTargetAndTextAsResults): js.Promise[java.lang.String] = typingsSlinky.htmlValidator.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def apply(options: typingsSlinky.htmlValidator.mod.OptionsForHtmlFileAsValidationTargetAndObjectAsResult): js.Promise[typingsSlinky.htmlValidator.mod.ParsedJsonAsValidationResults] = typingsSlinky.htmlValidator.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.htmlValidator.mod.ParsedJsonAsValidationResults]]
  @scala.inline
  def apply(options: typingsSlinky.htmlValidator.mod.OptionsForHtmlFileAsValidationTargetAndTextAsResults): js.Promise[java.lang.String] = typingsSlinky.htmlValidator.mod.^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
  
  type ValidationMessageLocationObject = typingsSlinky.htmlValidator.mod.ValidationMessageSimpleObject with typingsSlinky.htmlValidator.mod.ValidationMessageBasicLocationObject
  
  type ValidationMessageObject = typingsSlinky.htmlValidator.mod.ValidationMessageSimpleObject | typingsSlinky.htmlValidator.mod.ValidationMessageLocationObject
  
  type ValidationMessageSimpleObject = (typingsSlinky.htmlValidator.mod.ValidationMessageBasicErrorObject | typingsSlinky.htmlValidator.mod.ValidationMessageBasicInfoObject | typingsSlinky.htmlValidator.mod.ValidationMessageBasicNonDocumentErrorObject) with typingsSlinky.htmlValidator.mod.ValidationMessageBasicObject
}
