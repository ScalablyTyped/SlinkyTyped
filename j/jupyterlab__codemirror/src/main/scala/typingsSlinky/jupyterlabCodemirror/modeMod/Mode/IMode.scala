package typingsSlinky.jupyterlabCodemirror.modeMod.Mode

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.phosphorCoreutils.jsonMod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface of a codemirror mode spec.
  */
@js.native
trait IMode extends /* key */ StringDictionary[JSONValue] {
  var name: String = js.native
}

object IMode {
  @scala.inline
  def apply(name: String): IMode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMode]
  }
  @scala.inline
  implicit class IModeOps[Self <: IMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

