package typingsSlinky.minappEnv.global.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.minappEnv.Array
import typingsSlinky.minappEnv.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Intl.NumberFormat")
@js.native
object NumberFormat
  extends Instantiable0[typingsSlinky.minappEnv.Intl.NumberFormat]
     with Instantiable1[
      (/* locales */ Array[String]) | (/* locales */ String), 
      typingsSlinky.minappEnv.Intl.NumberFormat
    ]
     with Instantiable2[
      js.UndefOr[(/* locales */ Array[String]) | (/* locales */ String)], 
      /* options */ NumberFormatOptions, 
      typingsSlinky.minappEnv.Intl.NumberFormat
    ] {
  
  def apply(): typingsSlinky.minappEnv.Intl.NumberFormat = js.native
  def apply(locales: js.UndefOr[scala.Nothing], options: NumberFormatOptions): typingsSlinky.minappEnv.Intl.NumberFormat = js.native
  def apply(locales: String): typingsSlinky.minappEnv.Intl.NumberFormat = js.native
  def apply(locales: String, options: NumberFormatOptions): typingsSlinky.minappEnv.Intl.NumberFormat = js.native
  def apply(locales: Array[String]): typingsSlinky.minappEnv.Intl.NumberFormat = js.native
  def apply(locales: Array[String], options: NumberFormatOptions): typingsSlinky.minappEnv.Intl.NumberFormat = js.native
  
  def supportedLocalesOf(locales: String): Array[String] = js.native
  def supportedLocalesOf(locales: String, options: NumberFormatOptions): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String]): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String], options: NumberFormatOptions): Array[String] = js.native
}
