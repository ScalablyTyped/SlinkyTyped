package typingsSlinky.antDesignProLayout

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.`en-US`
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.`it-IT`
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.`zh-CN`
import typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.`zh-TW`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout/lib/locales", JSImport.Namespace)
@js.native
object localesMod extends js.Object {
  /* keyof @ant-design/pro-layout.anon.EnUS */ /* Rewritten from type alias, can be one of: 
    - typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.`zh-CN`
    - typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.`zh-TW`
    - typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.`en-US`
    - typingsSlinky.antDesignProLayout.antDesignProLayoutStrings.`it-IT`
  */
  trait LocaleType extends js.Object
  
  def default(): StringDictionary[String] = js.native
  @JSName("default")
  def default_enUS(locale: `en-US`): StringDictionary[String] = js.native
  @JSName("default")
  def default_itIT(locale: `it-IT`): StringDictionary[String] = js.native
  @JSName("default")
  def default_zhCN(locale: `zh-CN`): StringDictionary[String] = js.native
  @JSName("default")
  def default_zhTW(locale: `zh-TW`): StringDictionary[String] = js.native
  def getLanguage(): String = js.native
}

