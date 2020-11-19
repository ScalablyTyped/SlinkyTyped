package typingsSlinky.miniprogramWxs.global.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.miniprogramWxs.Array
import typingsSlinky.miniprogramWxs.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Intl.NumberFormat")
@js.native
object NumberFormat
  extends Instantiable0[typingsSlinky.miniprogramWxs.Intl.NumberFormat]
     with Instantiable1[
      (/* locales */ Array[String]) | (/* locales */ String), 
      typingsSlinky.miniprogramWxs.Intl.NumberFormat
    ]
     with Instantiable2[
      js.UndefOr[(/* locales */ Array[String]) | (/* locales */ String)], 
      /* options */ NumberFormatOptions, 
      typingsSlinky.miniprogramWxs.Intl.NumberFormat
    ] {
  
  def apply(): typingsSlinky.miniprogramWxs.Intl.NumberFormat = js.native
  def apply(locales: js.UndefOr[scala.Nothing], options: NumberFormatOptions): typingsSlinky.miniprogramWxs.Intl.NumberFormat = js.native
  def apply(locales: String): typingsSlinky.miniprogramWxs.Intl.NumberFormat = js.native
  def apply(locales: String, options: NumberFormatOptions): typingsSlinky.miniprogramWxs.Intl.NumberFormat = js.native
  def apply(locales: Array[String]): typingsSlinky.miniprogramWxs.Intl.NumberFormat = js.native
  def apply(locales: Array[String], options: NumberFormatOptions): typingsSlinky.miniprogramWxs.Intl.NumberFormat = js.native
  
  def supportedLocalesOf(locales: String): Array[String] = js.native
  def supportedLocalesOf(locales: String, options: NumberFormatOptions): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String]): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String], options: NumberFormatOptions): Array[String] = js.native
}
