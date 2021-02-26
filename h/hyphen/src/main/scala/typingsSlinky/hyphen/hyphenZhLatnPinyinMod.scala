package typingsSlinky.hyphen

import typingsSlinky.hyphen.mod.HyphenationFunctionAsync
import typingsSlinky.hyphen.mod.HyphenationFunctionSync
import typingsSlinky.hyphen.mod.PatternsDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hyphenZhLatnPinyinMod {
  
  @JSImport("hyphen/zh-latn-pinyin", "hyphenate")
  @js.native
  val hyphenate: HyphenationFunctionAsync = js.native
  
  @JSImport("hyphen/zh-latn-pinyin", "hyphenateHTML")
  @js.native
  val hyphenateHTML: HyphenationFunctionAsync = js.native
  
  @JSImport("hyphen/zh-latn-pinyin", "hyphenateHTMLSync")
  @js.native
  val hyphenateHTMLSync: HyphenationFunctionSync = js.native
  
  @JSImport("hyphen/zh-latn-pinyin", "hyphenateSync")
  @js.native
  val hyphenateSync: HyphenationFunctionSync = js.native
  
  @JSImport("hyphen/zh-latn-pinyin", "patterns")
  @js.native
  val patterns: PatternsDefinition = js.native
}
