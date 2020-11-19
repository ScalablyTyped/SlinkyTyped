package typingsSlinky.jimpPluginPrint.anon

import typingsSlinky.jimpCore.etcMod.GenericCallback
import typingsSlinky.jimpPluginPrint.mod.Font
import typingsSlinky.jimpPluginPrint.mod.PrintableText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FONTSANS10BLACK extends js.Object {
  
  var FONT_SANS_10_BLACK: String = js.native
  
  var FONT_SANS_128_BLACK: String = js.native
  
  var FONT_SANS_128_WHITE: String = js.native
  
  var FONT_SANS_12_BLACK: String = js.native
  
  var FONT_SANS_14_BLACK: String = js.native
  
  var FONT_SANS_16_BLACK: String = js.native
  
  var FONT_SANS_16_WHITE: String = js.native
  
  var FONT_SANS_32_BLACK: String = js.native
  
  var FONT_SANS_32_WHITE: String = js.native
  
  var FONT_SANS_64_BLACK: String = js.native
  
  var FONT_SANS_64_WHITE: String = js.native
  
  // Font locations
  var FONT_SANS_8_BLACK: String = js.native
  
  var FONT_SANS_8_WHITE: String = js.native
  
  def loadFont(file: String): js.Promise[Font] = js.native
  def loadFont(file: String, cb: GenericCallback[Font, _, _]): js.Promise[scala.Nothing] = js.native
  
  def measureText(font: Font, text: PrintableText): Double = js.native
  
  def measureTextHeight(font: Font, text: PrintableText, maxWidth: Double): Double = js.native
}
