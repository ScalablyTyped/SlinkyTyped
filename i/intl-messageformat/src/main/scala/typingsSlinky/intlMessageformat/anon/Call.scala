package typingsSlinky.intlMessageformat.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.Intl.NumberFormat
import typingsSlinky.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call
  extends Instantiable0[NumberFormat]
     with Instantiable1[(/* locales */ js.Array[String]) | (/* locales */ String), NumberFormat]
     with Instantiable2[
      js.UndefOr[(/* locales */ js.Array[String]) | (/* locales */ String)], 
      /* options */ NumberFormatOptions, 
      NumberFormat
    ] {
  
  def apply(): NumberFormat = js.native
  def apply(locales: js.UndefOr[scala.Nothing], options: NumberFormatOptions): NumberFormat = js.native
  def apply(locales: String): NumberFormat = js.native
  def apply(locales: String, options: NumberFormatOptions): NumberFormat = js.native
  def apply(locales: js.Array[String]): NumberFormat = js.native
  def apply(locales: js.Array[String], options: NumberFormatOptions): NumberFormat = js.native
  
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: NumberFormatOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: NumberFormatOptions): js.Array[String] = js.native
}
