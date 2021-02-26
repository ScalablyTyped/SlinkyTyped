package typingsSlinky.reactIntl

import slinky.core.facade.ReactElement
import typingsSlinky.formatjsIntl.srcTypesMod.Formatters
import typingsSlinky.formatjsIntl.srcTypesMod.IntlFormatters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTypesMod {
  
  @js.native
  trait IntlConfig
    extends typingsSlinky.formatjsIntl.srcTypesMod.IntlConfig[ReactElement] {
    
    var textComponent: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
      ] = js.native
    
    var wrapRichTextChunksInFragment: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait IntlShape
    extends IntlConfig
       with IntlFormatters[ReactElement, ReactElement] {
    
    var formatters: Formatters = js.native
  }
}
