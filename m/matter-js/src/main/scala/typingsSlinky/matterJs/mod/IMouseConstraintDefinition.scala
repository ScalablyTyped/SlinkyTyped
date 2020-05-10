package typingsSlinky.matterJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMouseConstraintDefinition extends js.Object {
  /**
    * The `Body` that is currently being moved by the user, or `null` if no body.
    *
    * @property body
    * @type body
    * @default null
    */
  var body: js.UndefOr[Body] = js.native
  /**
    * An `Object` that specifies the collision filter properties.
    * The collision filter allows the user to define which types of body this mouse constraint can interact with.
    * See `body.collisionFilter` for more information.
    *
    * @property collisionFilter
    * @type object
    */
  var collisionFilter: js.UndefOr[ICollisionFilter] = js.native
  /**
    * The `Constraint` object that is used to move the body during interaction.
    *
    * @property constraint
    * @type constraint
    */
  var constraint: js.UndefOr[Constraint] = js.native
  /**
    * The `Mouse` instance in use. If not supplied in `MouseConstraint.create`, one will be created.
    *
    * @property mouse
    * @type mouse
    * @default mouse
    */
  var mouse: js.UndefOr[Mouse] = js.native
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "constraint"
    */
  var `type`: js.UndefOr[String] = js.native
}

object IMouseConstraintDefinition {
  @scala.inline
  def apply(): IMouseConstraintDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMouseConstraintDefinition]
  }
  @scala.inline
  implicit class IMouseConstraintDefinitionOps[Self <: IMouseConstraintDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: Body): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withCollisionFilter(value: ICollisionFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollisionFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collisionFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withConstraint(value: Constraint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraint")(js.undefined)
        ret
    }
    @scala.inline
    def withMouse(value: Mouse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouse")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

