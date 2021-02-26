package typingsSlinky.loglevelPluginPrefix

import typingsSlinky.loglevel.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("loglevel-plugin-prefix", "apply")
  @js.native
  def apply(logger: Logger): Logger = js.native
  @JSImport("loglevel-plugin-prefix", "apply")
  @js.native
  def apply(logger: Logger, options: LoglevelPluginPrefixOptions): Logger = js.native
  
  @JSImport("loglevel-plugin-prefix", "reg")
  @js.native
  def reg(loglevel: Logger): Unit = js.native
  
  @js.native
  trait LoglevelPluginPrefixOptions extends StObject {
    
    var format: js.UndefOr[
        js.Function3[
          /* level */ String, 
          /* name */ js.UndefOr[String], 
          /* timestamp */ js.Date, 
          js.UndefOr[String]
        ]
      ] = js.native
    
    var levelFormatter: js.UndefOr[js.Function1[/* level */ String, String]] = js.native
    
    var nameFormatter: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], String]] = js.native
    
    var template: js.UndefOr[String] = js.native
    
    var timestampFormatter: js.UndefOr[js.Function1[/* date */ js.Date, String]] = js.native
  }
  object LoglevelPluginPrefixOptions {
    
    @scala.inline
    def apply(): LoglevelPluginPrefixOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoglevelPluginPrefixOptions]
    }
    
    @scala.inline
    implicit class LoglevelPluginPrefixOptionsMutableBuilder[Self <: LoglevelPluginPrefixOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(
        value: (/* level */ String, /* name */ js.UndefOr[String], /* timestamp */ js.Date) => js.UndefOr[String]
      ): Self = StObject.set(x, "format", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setLevelFormatter(value: /* level */ String => String): Self = StObject.set(x, "levelFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLevelFormatterUndefined: Self = StObject.set(x, "levelFormatter", js.undefined)
      
      @scala.inline
      def setNameFormatter(value: /* name */ js.UndefOr[String] => String): Self = StObject.set(x, "nameFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNameFormatterUndefined: Self = StObject.set(x, "nameFormatter", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTimestampFormatter(value: /* date */ js.Date => String): Self = StObject.set(x, "timestampFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTimestampFormatterUndefined: Self = StObject.set(x, "timestampFormatter", js.undefined)
    }
  }
}
