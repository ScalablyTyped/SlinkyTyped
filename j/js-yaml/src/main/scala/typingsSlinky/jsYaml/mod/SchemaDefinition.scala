package typingsSlinky.jsYaml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDefinition extends js.Object {
  var explicit: js.UndefOr[js.Array[Type]] = js.native
  var `implicit`: js.UndefOr[js.Array[_]] = js.native
  var include: js.UndefOr[js.Array[Schema]] = js.native
}

object SchemaDefinition {
  @scala.inline
  def apply(): SchemaDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDefinition]
  }
  @scala.inline
  implicit class SchemaDefinitionOps[Self <: SchemaDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExplicit(value: js.Array[Type]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExplicit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explicit")(js.undefined)
        ret
    }
    @scala.inline
    def withImplicit(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplicit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicit")(js.undefined)
        ret
    }
    @scala.inline
    def withInclude(value: js.Array[Schema]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
  }
  
}

