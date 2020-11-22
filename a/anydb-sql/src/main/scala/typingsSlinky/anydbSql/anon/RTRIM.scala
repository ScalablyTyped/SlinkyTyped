package typingsSlinky.anydbSql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTRIM extends js.Object {
  
  def LOWER(name: typingsSlinky.anydbSql.mod.Column[String]): typingsSlinky.anydbSql.mod.Column[String] = js.native
  
  def RTRIM(name: typingsSlinky.anydbSql.mod.Column[String]): typingsSlinky.anydbSql.mod.Column[String] = js.native
}
object RTRIM {
  
  @scala.inline
  def apply(
    LOWER: typingsSlinky.anydbSql.mod.Column[String] => typingsSlinky.anydbSql.mod.Column[String],
    RTRIM: typingsSlinky.anydbSql.mod.Column[String] => typingsSlinky.anydbSql.mod.Column[String]
  ): RTRIM = {
    val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER), RTRIM = js.Any.fromFunction1(RTRIM))
    __obj.asInstanceOf[RTRIM]
  }
  
  @scala.inline
  implicit class RTRIMOps[Self <: RTRIM] (val x: Self) extends AnyVal {
    
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
    def setLOWER(value: typingsSlinky.anydbSql.mod.Column[String] => typingsSlinky.anydbSql.mod.Column[String]): Self = this.set("LOWER", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRTRIM(value: typingsSlinky.anydbSql.mod.Column[String] => typingsSlinky.anydbSql.mod.Column[String]): Self = this.set("RTRIM", js.Any.fromFunction1(value))
  }
}
