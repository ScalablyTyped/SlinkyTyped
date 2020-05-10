package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkFontManager extends SkObject[SkFontManager] {
  def MakeTypefaceFromData(data: js.Array[Double]): SkTypeface = js.native
  def MakeTypefaceFromData(data: js.typedarray.ArrayBuffer): SkTypeface = js.native
  def MakeTypefaceFromData(data: js.typedarray.Uint8Array): SkTypeface = js.native
  def countFamilies(): Double = js.native
}

