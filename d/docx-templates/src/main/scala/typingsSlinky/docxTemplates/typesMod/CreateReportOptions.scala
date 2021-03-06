package typingsSlinky.docxTemplates.typesMod

import typingsSlinky.docxTemplates.anon.Ctx
import typingsSlinky.docxTemplates.anon.ModifiedSandbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReportOptions extends StObject {
  
  var additionalJsContext: js.Object = js.native
  
  var cmdDelimiter: js.Tuple2[String, String] = js.native
  
  var errorHandler: ErrorHandler | Null = js.native
  
  var failFast: Boolean = js.native
  
  var fixSmartQuotes: Boolean = js.native
  
  var literalXmlDelimiter: String = js.native
  
  var noSandbox: Boolean = js.native
  
  var processLineBreaks: Boolean = js.native
  
  var rejectNullish: Boolean = js.native
  
  var runJs: js.UndefOr[RunJSFunc] = js.native
}
object CreateReportOptions {
  
  @scala.inline
  def apply(
    additionalJsContext: js.Object,
    cmdDelimiter: js.Tuple2[String, String],
    failFast: Boolean,
    fixSmartQuotes: Boolean,
    literalXmlDelimiter: String,
    noSandbox: Boolean,
    processLineBreaks: Boolean,
    rejectNullish: Boolean
  ): CreateReportOptions = {
    val __obj = js.Dynamic.literal(additionalJsContext = additionalJsContext.asInstanceOf[js.Any], cmdDelimiter = cmdDelimiter.asInstanceOf[js.Any], failFast = failFast.asInstanceOf[js.Any], fixSmartQuotes = fixSmartQuotes.asInstanceOf[js.Any], literalXmlDelimiter = literalXmlDelimiter.asInstanceOf[js.Any], noSandbox = noSandbox.asInstanceOf[js.Any], processLineBreaks = processLineBreaks.asInstanceOf[js.Any], rejectNullish = rejectNullish.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReportOptions]
  }
  
  @scala.inline
  implicit class CreateReportOptionsMutableBuilder[Self <: CreateReportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalJsContext(value: js.Object): Self = StObject.set(x, "additionalJsContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmdDelimiter(value: js.Tuple2[String, String]): Self = StObject.set(x, "cmdDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorHandler(value: (/* e */ js.Error, /* raw_code */ js.UndefOr[String]) => js.Any): Self = StObject.set(x, "errorHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setErrorHandlerNull: Self = StObject.set(x, "errorHandler", null)
    
    @scala.inline
    def setFailFast(value: Boolean): Self = StObject.set(x, "failFast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixSmartQuotes(value: Boolean): Self = StObject.set(x, "fixSmartQuotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiteralXmlDelimiter(value: String): Self = StObject.set(x, "literalXmlDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoSandbox(value: Boolean): Self = StObject.set(x, "noSandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessLineBreaks(value: Boolean): Self = StObject.set(x, "processLineBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectNullish(value: Boolean): Self = StObject.set(x, "rejectNullish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunJs(value: /* o */ Ctx => ModifiedSandbox): Self = StObject.set(x, "runJs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRunJsUndefined: Self = StObject.set(x, "runJs", js.undefined)
  }
}
