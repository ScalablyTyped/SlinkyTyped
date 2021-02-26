package typingsSlinky.intlMessageformatParser.srcTypesMod

import typingsSlinky.intlMessageformatParser.intlMessageformatParserNumbers.`0`
import typingsSlinky.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberSkeleton extends Skeleton {
  
  var location: js.UndefOr[Location] = js.native
  
  var parsedOptions: NumberFormatOptions = js.native
  
  var tokens: js.Array[NumberSkeletonToken] = js.native
  
  var `type`: `0` = js.native
}
object NumberSkeleton {
  
  @scala.inline
  def apply(parsedOptions: NumberFormatOptions, tokens: js.Array[NumberSkeletonToken], `type`: `0`): NumberSkeleton = {
    val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberSkeleton]
  }
  
  @scala.inline
  implicit class NumberSkeletonMutableBuilder[Self <: NumberSkeleton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setParsedOptions(value: NumberFormatOptions): Self = StObject.set(x, "parsedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokens(value: js.Array[NumberSkeletonToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensVarargs(value: NumberSkeletonToken*): Self = StObject.set(x, "tokens", js.Array(value :_*))
    
    @scala.inline
    def setType(value: `0`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
