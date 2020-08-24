package typingsSlinky.miniprogramWxs.global.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.miniprogramWxs.Array
import typingsSlinky.miniprogramWxs.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.DateTimeFormat")
@js.native
object DateTimeFormat
  extends Instantiable0[typingsSlinky.miniprogramWxs.Intl.DateTimeFormat]
     with Instantiable1[
      (/* locales */ Array[String]) | (/* locales */ String), 
      typingsSlinky.miniprogramWxs.Intl.DateTimeFormat
    ]
     with Instantiable2[
      js.UndefOr[(/* locales */ Array[String]) | (/* locales */ String)], 
      /* options */ DateTimeFormatOptions, 
      typingsSlinky.miniprogramWxs.Intl.DateTimeFormat
    ] {
  def apply(): typingsSlinky.miniprogramWxs.Intl.DateTimeFormat = js.native
  def apply(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): typingsSlinky.miniprogramWxs.Intl.DateTimeFormat = js.native
  def apply(locales: String): typingsSlinky.miniprogramWxs.Intl.DateTimeFormat = js.native
  def apply(locales: String, options: DateTimeFormatOptions): typingsSlinky.miniprogramWxs.Intl.DateTimeFormat = js.native
  def apply(locales: Array[String]): typingsSlinky.miniprogramWxs.Intl.DateTimeFormat = js.native
  def apply(locales: Array[String], options: DateTimeFormatOptions): typingsSlinky.miniprogramWxs.Intl.DateTimeFormat = js.native
  def supportedLocalesOf(locales: String): Array[String] = js.native
  def supportedLocalesOf(locales: String, options: DateTimeFormatOptions): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String]): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String], options: DateTimeFormatOptions): Array[String] = js.native
}

