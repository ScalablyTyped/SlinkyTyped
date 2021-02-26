package typingsSlinky.logkitty

import typingsSlinky.logkitty.typesMod.Entry
import typingsSlinky.logkitty.typesMod.IParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iosParserMod {
  
  @JSImport("logkitty/build/ios/IosParser", JSImport.Default)
  @js.native
  class default () extends IosParser
  /* static members */
  object default {
    
    @JSImport("logkitty/build/ios/IosParser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("logkitty/build/ios/IosParser", "default.headerRegex")
    @js.native
    def headerRegex: js.RegExp = js.native
    @scala.inline
    def headerRegex_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headerRegex")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/ios/IosParser", "default.timeRegex")
    @js.native
    def timeRegex: js.RegExp = js.native
    @scala.inline
    def timeRegex_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeRegex")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IosParser extends IParser
  object IosParser {
    
    @scala.inline
    def apply(parseMessages: js.Array[String] => js.Array[Entry], splitMessages: String => js.Array[String]): IosParser = {
      val __obj = js.Dynamic.literal(parseMessages = js.Any.fromFunction1(parseMessages), splitMessages = js.Any.fromFunction1(splitMessages))
      __obj.asInstanceOf[IosParser]
    }
  }
}
