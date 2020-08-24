package typingsSlinky.color.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
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

@js.native
trait ColorConstructor
  extends Instantiable0[Color[ColorParam]]
     with Instantiable1[/* obj */ ColorParam, Color[ColorParam]]
     with Instantiable2[
      js.UndefOr[/* obj */ ColorParam], 
      rgb | xyz | hcg | ansi256 | ansi16 | hex | lch | cmyk | hsl | keyword | gray | hsv | apple | hwb | lab, 
      Color[ColorParam]
    ] {
  def apply[T /* <: ColorParam */](): Color[T] = js.native
  def apply[T /* <: ColorParam */](obj: T): Color[T] = js.native
  def apply[T /* <: ColorParam */](
    obj: T,
    model: /* keyof color.anon.Typeofconvert */ rgb | xyz | hcg | ansi256 | ansi16 | hex | lch | cmyk | hsl | keyword | gray | hsv | apple | hwb | lab
  ): Color[T] = js.native
  def apply[T /* <: ColorParam */](
    obj: js.UndefOr[scala.Nothing],
    model: /* keyof color.anon.Typeofconvert */ rgb | xyz | hcg | ansi256 | ansi16 | hex | lch | cmyk | hsl | keyword | gray | hsv | apple | hwb | lab
  ): Color[T] = js.native
  def ansi16(color: ColorParam): Color[ColorParam] = js.native
  def ansi16(`val`: Double*): Color[ColorParam] = js.native
  def ansi256(color: ColorParam): Color[ColorParam] = js.native
  def ansi256(`val`: Double*): Color[ColorParam] = js.native
  def apple(color: ColorParam): Color[ColorParam] = js.native
  def apple(`val`: Double*): Color[ColorParam] = js.native
  def cmyk(color: ColorParam): Color[ColorParam] = js.native
  def cmyk(`val`: Double*): Color[ColorParam] = js.native
  def hcg(color: ColorParam): Color[ColorParam] = js.native
  def hcg(`val`: Double*): Color[ColorParam] = js.native
  def hsl(color: ColorParam): Color[ColorParam] = js.native
  def hsl(`val`: Double*): Color[ColorParam] = js.native
  def hsv(color: ColorParam): Color[ColorParam] = js.native
  def hsv(`val`: Double*): Color[ColorParam] = js.native
  def hwb(color: ColorParam): Color[ColorParam] = js.native
  def hwb(`val`: Double*): Color[ColorParam] = js.native
  def lab(color: ColorParam): Color[ColorParam] = js.native
  def lab(`val`: Double*): Color[ColorParam] = js.native
  def lch(color: ColorParam): Color[ColorParam] = js.native
  def lch(`val`: Double*): Color[ColorParam] = js.native
  def rgb(color: ColorParam): Color[ColorParam] = js.native
  def rgb(`val`: Double*): Color[ColorParam] = js.native
  def xyz(color: ColorParam): Color[ColorParam] = js.native
  def xyz(`val`: Double*): Color[ColorParam] = js.native
}

