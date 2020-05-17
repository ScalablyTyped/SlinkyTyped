package typingsSlinky.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Uniform group holds uniform map and some ID's for work
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait UniformGroup extends js.Object {
  /**
    * dirty version
    * @protected
    * @member {number} PIXI.UniformGroup#dirtyId
    */
  var dirtyId: Double = js.native
  /**
    * Its a group and not a single uniforms
    * @member {boolean} PIXI.UniformGroup#group
    * @readonly
    * @default true
    */
  val group: Boolean = js.native
  /**
    * unique id
    * @protected
    * @member {number} PIXI.UniformGroup#id
    */
  var id: Double = js.native
  /**
    * Uniforms wont be changed after creation
    * @member {boolean} PIXI.UniformGroup#static
    */
  var static: Boolean = js.native
  /**
    * uniform values
    * @member {object} PIXI.UniformGroup#uniforms
    * @readonly
    */
  val uniforms: js.Any = js.native
}

object UniformGroup {
  @scala.inline
  def apply(dirtyId: Double, group: Boolean, id: Double, static: Boolean, uniforms: js.Any): UniformGroup = {
    val __obj = js.Dynamic.literal(dirtyId = dirtyId.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniformGroup]
  }
  @scala.inline
  implicit class UniformGroupOps[Self <: UniformGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirtyId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirtyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniforms(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

