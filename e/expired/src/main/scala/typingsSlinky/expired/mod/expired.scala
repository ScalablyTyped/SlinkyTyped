package typingsSlinky.expired.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait expired extends js.Object {
  
  /**
    * @returns A boolean relating to whether the resource has expired or not.
    * `true` means it's expired, `false` means it's fresh.
    */
  def apply(headers: Headers): Boolean = js.native
  def apply(headers: Headers, compareWith: js.Date): Boolean = js.native
  
  /**
    * @returns The amount of milliseconds from the current date until the resource will expire.
    * If the resource has already expired it will return a negative integer.
    */
  def in(headers: Headers): Double = js.native
  def in(headers: Headers, compareWith: js.Date): Double = js.native
  
  /**
    * @returns A JavaScript `Date` object for the date the resource will expire.
    */
  def on(headers: Headers): js.Date = js.native
}
