package typingsSlinky.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefineGlobals extends js.Object {
  /** The userScript global */
  var global: js.Any = js.native
  /** The userScript metadata (as set in userScripts.register) */
  var metadata: js.Any = js.native
  /**
    * Exports all the properties of a given plain object as userScript globals
    * @param sourceObject A plain object whose properties are exported as userScript globals
    */
  def defineGlobals(sourceObject: js.Object): Unit = js.native
  /**
    * Convert a given value to make it accessible to the userScript code
    * @param value A value to convert into an object accessible to the userScript
    */
  def export(value: js.Any): js.Any = js.native
}

object AnonDefineGlobals {
  @scala.inline
  def apply(defineGlobals: js.Object => Unit, export: js.Any => js.Any, global: js.Any, metadata: js.Any): AnonDefineGlobals = {
    val __obj = js.Dynamic.literal(defineGlobals = js.Any.fromFunction1(defineGlobals), export = js.Any.fromFunction1(export), global = global.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefineGlobals]
  }
  @scala.inline
  implicit class AnonDefineGlobalsOps[Self <: AnonDefineGlobals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefineGlobals(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defineGlobals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExport(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("export")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGlobal(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

