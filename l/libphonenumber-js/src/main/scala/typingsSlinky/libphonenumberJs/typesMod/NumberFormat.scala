package typingsSlinky.libphonenumberJs.typesMod

import typingsSlinky.libphonenumberJs.libphonenumberJsStrings.International_
import typingsSlinky.libphonenumberJs.libphonenumberJsStrings.National_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.libphonenumberJs.libphonenumberJsStrings.NATIONAL
  - typingsSlinky.libphonenumberJs.libphonenumberJsStrings.National_
  - typingsSlinky.libphonenumberJs.libphonenumberJsStrings.INTERNATIONAL
  - typingsSlinky.libphonenumberJs.libphonenumberJsStrings.International_
  - typingsSlinky.libphonenumberJs.libphonenumberJsStrings.EDot164
  - typingsSlinky.libphonenumberJs.libphonenumberJsStrings.RFC3966
  - typingsSlinky.libphonenumberJs.libphonenumberJsStrings.IDD
*/
trait NumberFormat extends js.Object

object NumberFormat {
  @scala.inline
  def EDot164: typingsSlinky.libphonenumberJs.libphonenumberJsStrings.EDot164 = this.cast("E.164")
  @scala.inline
  def IDD: typingsSlinky.libphonenumberJs.libphonenumberJsStrings.IDD = this.cast("IDD")
  @scala.inline
  def INTERNATIONAL: typingsSlinky.libphonenumberJs.libphonenumberJsStrings.INTERNATIONAL = this.cast("INTERNATIONAL")
  @scala.inline
  def International: International_ = this.cast("International")
  @scala.inline
  def NATIONAL: typingsSlinky.libphonenumberJs.libphonenumberJsStrings.NATIONAL = this.cast("NATIONAL")
  @scala.inline
  def National: National_ = this.cast("National")
  @scala.inline
  def RFC3966: typingsSlinky.libphonenumberJs.libphonenumberJsStrings.RFC3966 = this.cast("RFC3966")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

