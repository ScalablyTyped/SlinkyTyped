package typingsSlinky.formatjsIntlGetcanonicallocales.mod

import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.a
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.b
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.c
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.d
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.e
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.f
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.g
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.h
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.i
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.j
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.k
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.l
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.m
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.n
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.o
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.p
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.q
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.r
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.s
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.v
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.w
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.y
import typingsSlinky.formatjsIntlGetcanonicallocales.formatjsIntlGetcanonicallocalesStrings.z
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OtherExtension extends Extension {
  
  @JSName("type")
  var type_OtherExtension: a | b | c | d | e | f | g | h | i | j | k | l | m | n | o | p | q | r | s | v | w | y | z = js.native
  
  var value: String = js.native
}
object OtherExtension {
  
  @scala.inline
  def apply(
    `type`: a | b | c | d | e | f | g | h | i | j | k | l | m | n | o | p | q | r | s | v | w | y | z,
    value: String
  ): OtherExtension = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherExtension]
  }
  
  @scala.inline
  implicit class OtherExtensionOps[Self <: OtherExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: a | b | c | d | e | f | g | h | i | j | k | l | m | n | o | p | q | r | s | v | w | y | z): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
