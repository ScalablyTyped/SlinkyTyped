package typingsSlinky.fluxStandardAction.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fluxStandardAction.mod.FluxStandardActionAuto because Already inherited */ @js.native
trait FluxStandardActionWithMeta[Type /* <: String */, Payload, Meta] extends FluxStandardAction[Type, Payload, Meta] {
  /**
    * The required `meta` property MAY be any type of value.
    * It is intended for any extra information that is not part of the payload.
    */
  @JSName("meta")
  var meta_FluxStandardActionWithMeta: Meta = js.native
}

object FluxStandardActionWithMeta {
  @scala.inline
  def apply[Type, Payload, Meta](meta: Meta, `type`: Type): FluxStandardActionWithMeta[Type, Payload, Meta] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FluxStandardActionWithMeta[Type, Payload, Meta]]
  }
  @scala.inline
  implicit class FluxStandardActionWithMetaOps[Self[`type`, payload, meta] <: FluxStandardActionWithMeta[`type`, payload, meta], Type, Payload, Meta] (val x: Self[Type, Payload, Meta]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Type, Payload, Meta] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Type, Payload, Meta]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Type, Payload, Meta]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Type, Payload, Meta]) with Other]
    @scala.inline
    def withMeta(value: Meta): Self[Type, Payload, Meta] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

