package typingsSlinky.minappEnv.global.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.minappEnv.Array
import typingsSlinky.minappEnv.Intl.CollatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl.Collator")
@js.native
object Collator
  extends Instantiable0[typingsSlinky.minappEnv.Intl.Collator]
     with Instantiable1[
      (/* locales */ Array[String]) | (/* locales */ String), 
      typingsSlinky.minappEnv.Intl.Collator
    ]
     with Instantiable2[
      js.UndefOr[(/* locales */ Array[String]) | (/* locales */ String)], 
      /* options */ CollatorOptions, 
      typingsSlinky.minappEnv.Intl.Collator
    ] {
  def apply(): typingsSlinky.minappEnv.Intl.Collator = js.native
  def apply(locales: js.UndefOr[scala.Nothing], options: CollatorOptions): typingsSlinky.minappEnv.Intl.Collator = js.native
  def apply(locales: String): typingsSlinky.minappEnv.Intl.Collator = js.native
  def apply(locales: String, options: CollatorOptions): typingsSlinky.minappEnv.Intl.Collator = js.native
  def apply(locales: Array[String]): typingsSlinky.minappEnv.Intl.Collator = js.native
  def apply(locales: Array[String], options: CollatorOptions): typingsSlinky.minappEnv.Intl.Collator = js.native
  def supportedLocalesOf(locales: String): Array[String] = js.native
  def supportedLocalesOf(locales: String, options: CollatorOptions): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String]): Array[String] = js.native
  def supportedLocalesOf(locales: Array[String], options: CollatorOptions): Array[String] = js.native
}

