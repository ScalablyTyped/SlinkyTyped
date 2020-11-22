package typingsSlinky.formatjsEcma402Abstract.anon

import typingsSlinky.formatjsEcma402Abstract.typesDisplaynamesMod.ScriptCode
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongRecordNarrowRecord extends js.Object {
  
  var long: Record[ScriptCode, String] = js.native
  
  var narrow: Record[ScriptCode, String] = js.native
  
  var short: Record[ScriptCode, String] = js.native
}
object LongRecordNarrowRecord {
  
  @scala.inline
  def apply(
    long: Record[ScriptCode, String],
    narrow: Record[ScriptCode, String],
    short: Record[ScriptCode, String]
  ): LongRecordNarrowRecord = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongRecordNarrowRecord]
  }
  
  @scala.inline
  implicit class LongRecordNarrowRecordOps[Self <: LongRecordNarrowRecord] (val x: Self) extends AnyVal {
    
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
    def setLong(value: Record[ScriptCode, String]): Self = this.set("long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNarrow(value: Record[ScriptCode, String]): Self = this.set("narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: Record[ScriptCode, String]): Self = this.set("short", value.asInstanceOf[js.Any])
  }
}
