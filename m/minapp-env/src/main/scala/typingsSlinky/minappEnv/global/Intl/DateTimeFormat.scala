package typingsSlinky.minappEnv.global.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.minappEnv.Array
import typingsSlinky.minappEnv.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.DateTimeFormat")
@js.native
object DateTimeFormat
  extends Instantiable0[typingsSlinky.minappEnv.Intl.DateTimeFormat]
     with Instantiable1[
      (/* locales */ Array[String]) | (/* locales */ String), 
      typingsSlinky.minappEnv.Intl.DateTimeFormat
    ]
     with Instantiable2[
      (/* locales */ Array[String]) | (/* locales */ String), 
      /* options */ DateTimeFormatOptions, 
      typingsSlinky.minappEnv.Intl.DateTimeFormat
    ] {
  def apply(): typingsSlinky.minappEnv.Intl.DateTimeFormat = js.native
  def apply(locales: String): typingsSlinky.minappEnv.Intl.DateTimeFormat = js.native
  def apply(locales: String, options: DateTimeFormatOptions): typingsSlinky.minappEnv.Intl.DateTimeFormat = js.native
  def apply(locales: Array[String]): typingsSlinky.minappEnv.Intl.DateTimeFormat = js.native
  def apply(locales: Array[String], options: DateTimeFormatOptions): typingsSlinky.minappEnv.Intl.DateTimeFormat = js.native
  def supportedLocalesOf(locales: String): Array[String] = js.native
  def supportedLocalesOf(locales: String, options: DateTimeFormatOptions): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String]): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String], options: DateTimeFormatOptions): Array[String] = js.native
}

