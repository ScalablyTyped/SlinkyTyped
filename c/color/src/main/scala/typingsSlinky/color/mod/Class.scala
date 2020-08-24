package typingsSlinky.color.mod

import typingsSlinky.color.colorStrings.ansi16
import typingsSlinky.color.colorStrings.ansi256
import typingsSlinky.color.colorStrings.apple
import typingsSlinky.color.colorStrings.cmyk
import typingsSlinky.color.colorStrings.gray
import typingsSlinky.color.colorStrings.hcg
import typingsSlinky.color.colorStrings.hex
import typingsSlinky.color.colorStrings.hsl
import typingsSlinky.color.colorStrings.hsv
import typingsSlinky.color.colorStrings.hwb
import typingsSlinky.color.colorStrings.keyword
import typingsSlinky.color.colorStrings.lab
import typingsSlinky.color.colorStrings.lch
import typingsSlinky.color.colorStrings.rgb
import typingsSlinky.color.colorStrings.xyz
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color", JSImport.Namespace)
@js.native
class Class[T /* <: ColorParam */] () extends Color[T] {
  def this(obj: T) = this()
  def this(
    obj: T,
    model: /* keyof color.anon.Typeofconvert */ rgb | xyz | hcg | ansi256 | ansi16 | hex | lch | cmyk | hsl | keyword | gray | hsv | apple | hwb | lab
  ) = this()
  def this(
    obj: js.UndefOr[scala.Nothing],
    model: /* keyof color.anon.Typeofconvert */ rgb | xyz | hcg | ansi256 | ansi16 | hex | lch | cmyk | hsl | keyword | gray | hsv | apple | hwb | lab
  ) = this()
}

