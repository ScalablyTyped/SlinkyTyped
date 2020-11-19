package typingsSlinky.argon2.anon

import typingsSlinky.argon2.argon2Booleans.`false`
import typingsSlinky.argon2.argon2Numbers.`0`
import typingsSlinky.argon2.argon2Numbers.`1`
import typingsSlinky.argon2.argon2Numbers.`2`
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined argon2.argon2.Options & {  raw :false | undefined} */
@js.native
trait Optionsrawfalseundefined extends js.Object {
  
  var associatedData: js.UndefOr[Buffer] = js.native
  
  var hashLength: js.UndefOr[Double] = js.native
  
  var memoryCost: js.UndefOr[Double] = js.native
  
  var parallelism: js.UndefOr[Double] = js.native
  
  var raw: js.UndefOr[Boolean] with js.UndefOr[`false`] = js.native
  
  var salt: js.UndefOr[Buffer] = js.native
  
  var saltLength: js.UndefOr[Double] = js.native
  
  var secret: js.UndefOr[Buffer] = js.native
  
  var timeCost: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[`0` | `1` | `2`] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object Optionsrawfalseundefined {
  
  @scala.inline
  def apply(raw: js.UndefOr[Boolean] with js.UndefOr[`false`]): Optionsrawfalseundefined = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsrawfalseundefined]
  }
  
  @scala.inline
  implicit class OptionsrawfalseundefinedOps[Self <: Optionsrawfalseundefined] (val x: Self) extends AnyVal {
    
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
    def setRaw(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedData(value: Buffer): Self = this.set("associatedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedData: Self = this.set("associatedData", js.undefined)
    
    @scala.inline
    def setHashLength(value: Double): Self = this.set("hashLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashLength: Self = this.set("hashLength", js.undefined)
    
    @scala.inline
    def setMemoryCost(value: Double): Self = this.set("memoryCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryCost: Self = this.set("memoryCost", js.undefined)
    
    @scala.inline
    def setParallelism(value: Double): Self = this.set("parallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelism: Self = this.set("parallelism", js.undefined)
    
    @scala.inline
    def setSalt(value: Buffer): Self = this.set("salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalt: Self = this.set("salt", js.undefined)
    
    @scala.inline
    def setSaltLength(value: Double): Self = this.set("saltLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaltLength: Self = this.set("saltLength", js.undefined)
    
    @scala.inline
    def setSecret(value: Buffer): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
    
    @scala.inline
    def setTimeCost(value: Double): Self = this.set("timeCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeCost: Self = this.set("timeCost", js.undefined)
    
    @scala.inline
    def setType(value: `0` | `1` | `2`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
