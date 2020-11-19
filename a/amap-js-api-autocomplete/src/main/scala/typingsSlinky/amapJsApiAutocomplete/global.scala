package typingsSlinky.amapJsApiAutocomplete

import typingsSlinky.amapJsApiAutocomplete.AMap.Autocomplete.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object AMap extends js.Object {
    
    @js.native
    /**
      * 输入提示，根据输入关键字提示匹配信息
      * @param options 选项
      */
    class Autocomplete ()
      extends typingsSlinky.amapJsApiAutocomplete.AMap.Autocomplete {
      def this(options: Options) = this()
    }
  }
}
