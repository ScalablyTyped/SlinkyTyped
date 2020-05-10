package typingsSlinky.matterJs.mod

import typingsSlinky.matterJs.matterJsStrings.line
import typingsSlinky.matterJs.matterJsStrings.pin
import typingsSlinky.matterJs.matterJsStrings.spring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConstraintRenderDefinition extends js.Object {
  /**
    * A `Boolean` that defines if the constraint's anchor points should be rendered.
    *
    * @property render.anchors
    * @type boolean
    * @default true
    */
  var anchors: js.UndefOr[Boolean] = js.native
  /**
    * A `Number` that defines the line width to use when rendering the constraint outline.
    * A value of `0` means no outline will be rendered.
    *
    * @property render.lineWidth
    * @type number
    * @default 2
    */
  var lineWidth: js.UndefOr[Double] = js.native
  /**
    * A `String` that defines the stroke style to use when rendering the constraint outline.
    * It is the same as when using a canvas, so it accepts CSS style property values.
    *
    * @property render.strokeStyle
    * @type string
    * @default a random colour
    */
  var strokeStyle: js.UndefOr[String] = js.native
  /**
    * A String that defines the constraint rendering type. The possible values are
    * 'line', 'pin', 'spring'. An appropriate render type will be automatically
    * chosen unless one is given in options.
    *
    * @property render.type
    * @type string
    * @default 'line'
    */
  var `type`: js.UndefOr[line | pin | spring] = js.native
  /**
    * A flag that indicates if the constraint should be rendered.
    *
    * @property render.visible
    * @type boolean
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object IConstraintRenderDefinition {
  @scala.inline
  def apply(): IConstraintRenderDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConstraintRenderDefinition]
  }
  @scala.inline
  implicit class IConstraintRenderDefinitionOps[Self <: IConstraintRenderDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchors")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: line | pin | spring): Self = {
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
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

